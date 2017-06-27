package logic;

public class DezHex implements Calculation {

	public String getoutput(String input) {
		return Integer.toString(Integer.parseInt(input), 16);
	}
}
