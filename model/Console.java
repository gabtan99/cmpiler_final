
package model;
import java.util.*;

public class Console {

    private static Console instance = null;
    private static List<String> errorList;
    
    public static void init() {
        if (instance == null) {
            instance = new Console();
        }
        errorList = new ArrayList<>();
    }

    public static void reset() {
        if (errorList != null) {
            errorList.clear();
        }
    }

    public static void log(String msg) {
        errorList.add(msg);
    }

    public static List<String> getErrorList() {
        return errorList;
    }

}