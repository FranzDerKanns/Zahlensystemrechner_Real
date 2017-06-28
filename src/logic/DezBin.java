package logic;
/**
 * Verwendet das Interface "Calculation"
 * @author Schwinn
 */
public class DezBin implements Calculation {
	/**
	 * Gibt das Resultat der Rechnung als Rueckgabe zurueck
	 */
	public String getoutput(String input) {
		return Integer.toString(Integer.parseInt(input), 2); // decimal to
																// binary

	}

}
