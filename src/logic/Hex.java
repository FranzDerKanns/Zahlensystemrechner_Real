package logic;
//Unterklasse von "Calculator"
//Ueberschreibt die Methode checkinput() (return ist ein Integer mit dem Errorlevel, der im Actionlistener im GUI analysiert wird)
public class Hex extends Calculator {

	public int checkinput(String inputt) {
		int errorlevel = 0;
		String input = inputt.toUpperCase();
		if (input.equals("")) {
			errorlevel = 1;
		} else if (input.length() > 5) {
			errorlevel = 2;
		} else {
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4'
						&& c != '5' && c != '6' && c != '7' && c != '8'
						&& c != '9' && c != 'A' && c != 'B' && c != 'C'
						&& c != 'D' && c != 'E' && c != 'F') {
					errorlevel = 3;
				}
			}
		}
		return errorlevel;
	}
}
