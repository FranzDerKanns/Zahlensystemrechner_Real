package logic;
//Klasse in der Logic-Schicht
//Stellt ZahlZS-Objekte dar
public class ZahlZS {

	private String input;
	private int format;
	private String description;

	public ZahlZS() {

	}
//Konstruktor mit Input, Format und Beschreibung als Parameter
	public ZahlZS(String input, int format, String description) {
		super();
		this.input = input;
		this.format = format;
		this.description = description;
	}
//Input-Getter
	public String getInput() {
		return input;
	}
//Input-Setter
	public void setInput(String input) {
		this.input = input;
	}
//Format-Getter
	public int getFormat() {
		return format;
	}
//Format-Setter
	public void setFormat(int format) {
		this.format = format;
	}
//Beschreibungs-Getter
	public String getDescription() {
		return description;
	}
//Beschreibungs-Setter
	public void setDescription(String description) {
		this.description = description;
	}
//Gibt Beschreibung zurueck
	@Override
	public String toString() {
		return description;
	}
}
