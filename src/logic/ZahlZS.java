package logic;

public class ZahlZS {

	private String input;
	private int format;
	private String description;

	public ZahlZS() {

	}

	public ZahlZS(String input, int format, String description) {
		super();
		this.input = input;
		this.format = format;
		this.description = description;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getFormat() {
		return format;
	}

	public void setFormat(int format) {
		this.format = format;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return description;
	}
}
