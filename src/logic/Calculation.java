package logic;
//Interface fuer die Klassen "BinDez", "BinHex", "DezBin", "DezHex", "HexBin", "HexDez"
public interface Calculation {
	//Abstrakte Methode, die durch Klassen ueberschrieben wird
	public String getoutput(String input);
}
