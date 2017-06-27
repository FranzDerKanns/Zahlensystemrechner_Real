package logic;

import java.math.BigInteger;

public class HexBin implements Calculation {

	public String getoutput(String input) {
		return new BigInteger(input, 16).toString(2);
	}

}
