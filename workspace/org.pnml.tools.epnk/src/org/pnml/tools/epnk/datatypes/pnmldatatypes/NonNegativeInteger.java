package org.pnml.tools.epnk.datatypes.pnmldatatypes;

// generated NOT
public class NonNegativeInteger {

	private int value;
	
	public NonNegativeInteger(String value) {
		try {
			this.value =  Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Non-negative integer expected!");			
		} 
		
		if (!(this.value >= 0)) {
			throw new NumberFormatException("Non-negative integer expected!");
		}
	}

	@Override
	public String toString() {
		return "" + value;
	}

	public int getValue() {
		return value;
	}

}
