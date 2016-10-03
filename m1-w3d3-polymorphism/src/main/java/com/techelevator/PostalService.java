package com.techelevator;

public class PostalService extends DeliveryDriver {
	
	public PostalService(double rate, double charges) {
		super(rate, charges);
		this.weight = 0;
	}

	@Override
	public double getRate() {
		return rate = rate * getCharges();
	}
	
	public void firstClass() {
		if (weight > 144)
			charges *= 0.5;
		if (weight > 64)
			charges *= 0.45;
		if (weight > 16)
			charges *= 0.195;
		if (weight > 0.5624)
			charges *= 0.047;
		if (weight > 0.1874);
			charges *= 0.040;
		if (weight > 0.125)
			charges *= 0.035;
	}
	public void secondClass() {
		if (weight > 144)
			charges *= 0.05;
		if (weight > 64)
			charges *= 0.045;
		if (weight > 16)
			charges *= 0.0195;
		if (weight > 0.5624)
			charges *= 0.047;
		if (weight > 0.1874);
			charges *= 0.040;
		if (weight > 0.125)
			charges *= 0.035;
	}
	public void thirdClass() {
		if (weight > 144)
			charges *= 0.017;
		if (weight > 64)
			charges *= 0.016;
		if (weight > 16)
			charges *= 0.015;
		if (weight > 0.5624)
			charges *= 0.0024;
		if (weight > 0.1874);
			charges *= 0.0022;
		if (weight > 0.125)
			charges *= 0.0020;
	}
//	
//	|--------|-----------|-----------|-----------|
//	|        | 1st Class | 2nd Class | 3rd Class |
//	| Ounces | Per Mile  | Per Mile  | Per Mile  |
//	|--------|-----------|-----------|-----------|
//	| 0 - 2  |   0.035   |   0.0035  |   0.0020  |
//	| 3 - 8  |   0.040   |   0.0040  |   0.0022  |
//	| 9 - 15 |   0.047   |   0.0047  |   0.0024  |
//	| Pounds |           |           |           |
//	| 1 - 3  |   0.195   |   0.0195  |   0.0150  |
//	| 4 - 8  |   0.450   |   0.0450  |   0.0160  |
//	| 9+     |   0.500   |   0.0500  |   0.0170  |
//	|--------|-----------|-----------|-----------|
//
//
//	rate = per mile rate * distance
}
