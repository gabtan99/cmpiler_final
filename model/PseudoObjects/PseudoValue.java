public class PseudoValue {

	private Object value;
	private PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;
	private boolean constFlag = false;
	
	public PseudoValue(Object value, PrimitiveType primitiveType) {

		if (value == null || checkValueType(value, primitiveType)) {
			this.value = value;
			this.primitiveType = primitiveType;
		}
		else {
            Console.log("Value is not suitable for  " + primitiveType + "!");
		}
	}
	
	public void setPrimitiveType(PrimitiveType primitiveType) {
		this.primitiveType = primitiveType;
	}
	
	public void reset() {
		this.value = null;
	}

	public void markConst() {
		this.constFlag = true;
	}
	
	public boolean isConst() {
		return this.constFlag;
	}

	public PrimitiveType getPrimitiveType() {
		return this.primitiveType;
	}
	
    public Object getValue() {
		return this.value;
	}
	
	public void setValue(String value) {
		
		if(this.primitiveType == PrimitiveType.NOT_YET_IDENTIFIED) {
			Console.log("Primitive type not yet identified!");
		}
		else if(this.primitiveType == PrimitiveType.STRING) {
			this.value = value.replace("\"", "");
		}
		else if(this.primitiveType == PrimitiveType.ARRAY) {
			Console.log(this.primitiveType + " is an array. Cannot directly change value.");
        }
	}
	
	public static boolean checkValueType(Object value, PrimitiveType primitiveType) {

		switch(primitiveType) {
			case BOOLEAN:
				return value instanceof Boolean;
			case INT:
				return value instanceof Integer;
			case FLOAT:
				return value instanceof Float;
			case STRING:
				return value instanceof String;
			case ARRAY:
				return value instanceof Object;
			default:
				return false;
		}
	}
	
	public static PseudoValue createEmptyVariableFromKeywords(String primitiveTypeString) {
		
		PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;
		
		if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeString)) {
			primitiveType = PrimitiveType.BOOLEAN;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_FLOAT, primitiveTypeString)) {
			primitiveType = PrimitiveType.FLOAT;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_INT, primitiveTypeString)) {
			primitiveType = PrimitiveType.INT;
		}
		else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_STRING, primitiveTypeString)) {
			primitiveType = PrimitiveType.STRING;
		}
		
		PseudoValue value = new PseudoValue(null, primitiveType);
	
		return value;
	}
	
}