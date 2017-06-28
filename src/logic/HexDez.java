package logic;
/**
 * Verwendet das Interface "Calculation"
 * @author Schwinn
 *
 */
public class HexDez implements Calculation {
	/**
	 * Gibt Resultat der Rechnung als Rueckgabewert zurueck
	 */
	public String getoutput(String input) {
		return Integer.toString(Integer.valueOf(input, 16));
	}
}
