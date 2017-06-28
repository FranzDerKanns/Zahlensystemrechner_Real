package logic;
/**
 * Verwendet das Interface "Calculation"
 * @author Schwinn
 *
 */
public class BinHex implements Calculation {
	/**
	 * Gibt das Resultat der Rechnung als Rueckgabewert zurueck
	 */
	public String getoutput(String input) {
		int decimal = Integer.parseInt(input, 2);
		return Integer.toString(decimal, 16);
	}
}
