package org.pnml.tools.epnk.datatypes.pnmldatatypes;

// generated NOT
public class PositiveInteger {

	private int value;
	
	public PositiveInteger(String value) {
		try {
			this.value =  Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Positive integer expected!");			
		} 
		
		if (!(this.value > 0)) {
			throw new NumberFormatException("Positive integer expected!");
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
