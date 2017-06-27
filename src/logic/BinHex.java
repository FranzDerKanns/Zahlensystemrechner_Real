package logic;

public class BinHex implements Calculation {

	public String getoutput(String input) {
		int decimal = Integer.parseInt(input, 2);
		return Integer.toString(decimal, 16);
	}
}
