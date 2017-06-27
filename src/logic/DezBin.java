package logic;

public class DezBin implements Calculation {

	public String getoutput(String input) {

		return Integer.toString(Integer.parseInt(input), 2); // decimal to
																// binary

	}

}
