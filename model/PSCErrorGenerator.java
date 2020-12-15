package model;

public class PSCErrorGenerator {

    // default ANTLR template messages
    private static final String EXTRANEOUS_ERR = "extraneous input";
    private static final String MISSING_ERR = "missing";
    private static final String MISMATCHED_ERR = "mismatched input";
    private static final String NO_VIABLE_ERR = "no viable alternative at input";
    private static final String TOKEN_RECOGNITION_ERR = "token recognition error";

    private static final String INT_CONST_TOK = "INTEGERCONSTANT";
    private static final String FLOAT_CONST_TOK = "FLOATINGCONSTANT";
    private static final String BOOL_CONST_TOK = "BOOLCONSTANT";
    private static final String STRING_TOK = "StringLiteral";
    private static final String IDENTIFIER_TOK = "IDENTIFIER";

    public String generateMsg(int line, int charPositionInLine, String msg) {

        PSCError err = new PSCError(line, charPositionInLine);

        if (msg.contains(NO_VIABLE_ERR)) { 
            String strList[] = msg.split(NO_VIABLE_ERR);
            err.setMsg("Could not resolve the token " + strList[1] + ".");
        } else if (msg.contains(MISMATCHED_ERR)) {

            String strList[] = msg.split(MISMATCHED_ERR);
            String tokList[] = splitTokens(strList[1]);
            String offending = tokList[0];
            String alts = tokList[1];

            if (alts.contains(INT_CONST_TOK) && alts.contains(FLOAT_CONST_TOK) && alts.contains(BOOL_CONST_TOK) && alts.contains(STRING_TOK) && alts.contains(IDENTIFIER_TOK)) {
                err.setMsg("Mismatched input " + offending + ". Try replacing it with an expression.");
            } else if (alts.contains(IDENTIFIER_TOK)) {
                err.setMsg("Expecting an identifier");
            } else {
                err.setMsg("Mismatched input " + offending + " Try replacing it with " + alts);
            }

        } else if (msg.contains(MISSING_ERR)) {
            String strList[] = msg.split(MISSING_ERR);
            String tokens[] = strList[1].split("at");

            err.setMsg("There is a token " + tokens[0] + " missing before " + tokens[1] + "." + " Consider inserting " + tokens[0] + " before " + tokens[1] + ".");
        } else if (msg.contains(EXTRANEOUS_ERR)) {

            String strList[] = msg.split(EXTRANEOUS_ERR);
            String tokList[] = new String[1];

            for (int i = 0; i < strList.length; i++) { 
                tokList = splitTokens(strList[i].trim());
            }
            String offending = tokList[0];
            String alts = tokList[1];

            if (alts.contains(INT_CONST_TOK) && alts.contains(FLOAT_CONST_TOK) && alts.contains(BOOL_CONST_TOK) && alts.contains(STRING_TOK) && alts.contains(IDENTIFIER_TOK)) {
                err.setMsg("Extraneous Input : Consider removing " + offending + " and replacing it with an expression.");
            } 
            else if (alts.contains(IDENTIFIER_TOK) && alts.contains("}")) {
                err.setMsg("Extraneous Input : Consider matching all previous bracket pairs.");
            }else if (alts.contains(IDENTIFIER_TOK))  {
                err.setMsg("Extraneous Input : Consider removing " + offending + " and replacing it with an identifier.");
            } else {
                err.setMsg("Extraneous Input : Consider removing " + offending + " and replacing it with " + alts + ".");
            }

        } else if (msg.contains(TOKEN_RECOGNITION_ERR)) {
            err.setMsg("Token recognition error at ");
        }

        return err.getFullError();
    }


    private String[] splitTokens(String str) {
        String list[] = new String[1];

        if (str.contains("expecting")) {
            list = str.split("expecting");
        }

        return list;
    }

}