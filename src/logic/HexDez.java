package logic;

public class HexDez implements Calculation {

	public String getoutput(String input) {
		return Integer.toString(Integer.valueOf(input, 16));
	}
}
