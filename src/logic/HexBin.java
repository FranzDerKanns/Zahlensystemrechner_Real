package logic;

import java.math.BigInteger;
//Verwendet das Interface "Calculation"
public class HexBin implements Calculation {
//Gibt Resultat der Rechnung als Rueckgabewert zurueck
	public String getoutput(String input) {
		return new BigInteger(input, 16).toString(2);
	}

}
