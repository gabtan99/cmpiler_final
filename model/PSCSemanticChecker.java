package model;

import java.util.*;

public class PSCSemanticChecker {

    private static PSCSemanticChecker instance = null;
    private static List<String> errorList;

    private PSCSemanticChecker() { }
    
    public static PSCSemanticChecker getInstance() {
        return instance;
    }

    public static void init() {

        if (instance == null) {
            instance = new PSCSemanticChecker();
        }
        
        errorList = new ArrayList<>();
    }

    public static void reset() {
        errorList.clear();
    }

    public static boolean canExec() {
        if (errorList.size() > 0) {
            return false;
        }

        return true;
    }

    public static void semanticError(int line, ErrorType code) {

        // from code get decent message

        errorList.add("error");
        // put in console
    }


}