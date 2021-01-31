package model;

import model.objects.*;
import model.*;
import java.math.BigDecimal;


public class Util {

    public static void assignValue(PseudoValue value, BigDecimal evaluated) {

        if(value.getPrimitiveType() == PrimitiveType.INT) {
			value.setValue(Integer.toString(evaluated.intValue()));
		}
		else if(value.getPrimitiveType() == PrimitiveType.FLOAT) {
			value.setValue(Float.toString(evaluated.floatValue()));
		}
		else if(value.getPrimitiveType() == PrimitiveType.BOOLEAN) {
			if(evaluated.intValue() == 1) {
				value.setValue(true);
			} else {
				value.setValue(false);
			}
		}
    }
}