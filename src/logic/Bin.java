package logic;
//Unterklasse der Klasse "Calculator"
//Ueberschreibt die Methode checkinput() (return ist ein Integer mit dem Errorlevel, der im Actionlistener im GUI analysiert wird)
public class Bin extends Calculator {

	public int checkinput(String input) {
		int errorlevel = 0;
		if (input.equals("")) {
			errorlevel = 1;
		} else if (input.length() > 5) {
			errorlevel = 2;
		} else {
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (c != '0' && c != '1') {
					errorlevel = 3;
				}
			}
		}
		return errorlevel;
	}
}
