package logic;
//Verwendet das Interface "Calculation"
public class DezHex implements Calculation {
//Gibt Resultat der Rechnung als Rueckgabewert zurueck
	public String getoutput(String input) {
		return Integer.toString(Integer.parseInt(input), 16);
	}
}
