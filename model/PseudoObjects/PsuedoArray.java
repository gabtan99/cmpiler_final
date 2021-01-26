public class PseudoArray {
	
	private PseudoValue[] pseudoValueArray;
	private PrimitiveType arrayPrimitiveType;
	private String arrayIdentifier;
	private boolean constFlag = false;
	
	public PseudoArray(PrimitiveType primitiveType, String identifier) {
		this.arrayPrimitiveType = primitiveType;
		this.arrayIdentifier = identifier;
	}
	
	public void setPrimitiveType(PrimitiveType primitiveType) {
		this.arrayPrimitiveType = primitiveType;
	}
	
	public PrimitiveType getPrimitiveType() {
		return this.arrayPrimitiveType;
	}
	
	public void markConst() {
		this.constFlag = true;
	}
	
	public boolean isConst() {
		return this.constFlag;
	}

    public int getSize() {
		return this.pseudoValueArray.length;
	}
	
	public void initializeSize(int size) {
		this.pseudoValueArray = new PseudoValue[size];
	}
	
	public void updateValueAt(PseudoValue PseudoValue, int index) {
		if(index >= this.pseudoValueArray.length) {
			// Console.log(LogType.ERROR, String.format(ErrorRepository.getErrorMessage(ErrorRepository.RUNTIME_ARRAY_OUT_OF_BOUNDS), this.arrayIdentifier));
			return;
		}
		this.pseudoValueArray[index] = PseudoValue;
	}
	
	public PseudoValue getValueAt(int index) {
		if(index >= this.pseudoValueArray.length) {
			// Console.log(LogType.ERROR, String.format(ErrorRepository.getErrorMessage(ErrorRepository.RUNTIME_ARRAY_OUT_OF_BOUNDS), this.arrayIdentifier));
			return this.pseudoValueArray[this.pseudoValueArray.length - 1];
		}
		else {
			return this.pseudoValueArray[index];
		}
	}
	
	/*
	 * Utility function that returns an arary of specified primitive type.
	 */
	public static PseudoArray createArray(String primitiveTypeString, String arrayIdentifier) {
        
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
		
		PseudoArray pseudoArray = new PseudoArray(primitiveType, arrayIdentifier);
		
		return PseudoArray;
	}
}