package logic;
/**
 * Klasse in der Logic-Schicht
 * Stellt ZahlZS-Objekte dar
 * @author Champion
 *
 */
public class ZahlZS {

	private String input;
	private int format;
	private String description;

	public ZahlZS() {

	}
/**
 * //Konstruktor mit Input, Format und Beschreibung als Parameter
 * @param input
 * @param format
 * @param description
 */
	public ZahlZS(String input, int format, String description) {
		super();
		this.input = input;
		this.format = format;
		this.description = description;
	}
/**
 * Input-Getter
 * @return
 */
	public String getInput() {
		return input;
	}
/**
 * Input-Setter
 * @param input
 */
	public void setInput(String input) {
		this.input = input;
	}
/**
 * Format-Getter
 * @return
 */
	public int getFormat() {
		return format;
	}
/**
 * Format-Setter
 * @param format
 */
	public void setFormat(int format) {
		this.format = format;
	}
/**
 * Beschreibungs-Getter
 * @return
 */
	public String getDescription() {
		return description;
	}
/**
 * Beschreibungs-Setter
 * @param description
 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * //Gibt Beschreibung zurueck
	 */
	public String toString() {
		return description;
	}
}
