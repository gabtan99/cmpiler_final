package model;

public class PSCErrorGenerator {

    // default ANTLR template messages
    public static final String EXTRANEOUS_ERR = "extraneous input";
    public static final String MISSING_ERR = "missing";
    public static final String MISMATCHED_ERR = "mismatched input";
    public static final String NO_VIABLE_ERR = "no viable alternative at input";
    public static final String TOKEN_RECOGNITION_ERR = "token recognition error";

    public String generateMsg(int line, int charPositionInLine, String msg) {

        PSCError err = new PSCError(line, charPositionInLine);

        if (msg.contains(NO_VIABLE_ERR)) { 

            String strList[] = msg.split(NO_VIABLE_ERR);
            err.setMsg("Could not resolve the token " + strList[1] + ".");

        } else if (msg.contains(MISMATCHED_ERR)) {

            String strList[] = msg.split(MISMATCHED_ERR);
            String message[] = new String[1];

            if (strList[1].contains("expecting")) {
                message = strList[1].split("expecting");
            }

            if (message[1].contains("INTEGERCONSTANT") && message[1].contains("FLOATINGCONSTANT") && message[1].contains("BOOLCONSTANT") && message[1].contains("StringLiteral") && message[1].contains("IDENTIFIER")) {
                err.setMsg("Mismatched input " + message[0] + ". Try replacing it with an expression.");
            } else if (message[1].contains("IDENTIFIER")) {
                err.setMsg("Expecting an identifier");
            } else {
                err.setMsg("Mismatched input " + message[0] + " Try replacing it with " + message[1]);
            }


        } else if (msg.contains(MISSING_ERR)) {

            String strList[] = msg.split(MISSING_ERR);
            String tokens[] = strList[1].split("at");

            err.setMsg("There is a token " + tokens[0] + " missing before " + tokens[1] + "." + " Consider inserting " + tokens[0] + " before " + tokens[1] + ".");
        } else if (msg.contains(EXTRANEOUS_ERR)) {

            String strList[] = msg.split(EXTRANEOUS_ERR);
            String message[] = new String[1];


            for (int i = 0; i < strList.length; i++) { 
                strList[i] = strList[i].trim();

                if (strList[i].contains("expecting")) {
                    message = strList[i].split("expecting");
                }
            }
            
            if (message[1].contains("INTEGERCONSTANT") && message[1].contains("FLOATINGCONSTANT") && message[1].contains("BOOLCONSTANT") && message[1].contains("StringLiteral") && message[1].contains("IDENTIFIER")) {
                err.setMsg("Extraneous Input : Consider removing " + message[0] + " and replacing it with an expression.");

            } 
            else if (message[1].contains("IDENTIFIER") && message[1].contains("}")) {
                err.setMsg("Extraneous Input : Consider matching all previous bracket pairs.");
            }else if (message[1].contains("IDENTIFIER"))  {
                err.setMsg("Extraneous Input : Consider removing " + message[0] + " and replacing it with an identifier.");
            } else {
                err.setMsg("Extraneous Input : Consider removing " + message[0] + " and replacing it with " + message[1] + ".");
            }

        } else if (msg.contains(TOKEN_RECOGNITION_ERR)) {
            err.setMsg("Token recognition error at ");
        }

        return err.getFullError();
    }

}