package logic;

public class DezBin implements Calculation {
//Verwendet das Interface "Calculation"
	public String getoutput(String input) {
//Gibt das Resultat der Rechnung als Rueckgabe zurueck
		return Integer.toString(Integer.parseInt(input), 2); // decimal to
																// binary

	}

}
