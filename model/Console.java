
package model;
import java.util.*;

public class Console {

    private static Console instance = null;
    private static Map<Integer, String> errorList;
    
    public static void init() {
        if (instance == null) {
            instance = new Console();
        }
        errorList = new TreeMap<>();
    }

    public static void reset() {
        if (errorList != null) {
            errorList.clear();
        }
    }

    public static void log(String msg, int line) {
        errorList.put(line, msg);
    }

    public static List<String> getErrorList() {

        List<String> lis = new ArrayList<>();

        for (Map.Entry<Integer, String> c : errorList.entrySet()) {
            lis.add("[Line " + c.getKey() + "] " + c.getValue());
        }

        return lis;
    }

}
