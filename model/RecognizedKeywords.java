public class RecognizedKeywords {

	public static String CLASS_MODIFIER_PRIVATE = "private";
	public static String CLASS_MODIFIER_PUBLIC = "public";
	
	public static String PRIMITIVE_TYPE_BOOLEAN = "boolean";
	public static String PRIMITIVE_TYPE_INT = "int";
	public static String PRIMITIVE_TYPE_FLOAT = "float";
	public static String PRIMITIVE_TYPE_STRING = "String";
	
	public static String BOOLEAN_TRUE = "T";
	public static String BOOLEAN_FALSE = "F";
	
	
	/*
	 * Returns true if the keywords match. This is case-sensitive
	 */
	public static boolean matchesKeyword(String keyword, String textToMatch) {
		if(textToMatch.contains(keyword)) {
			return true;
		}
		else {
			return false;
		}
	}
}