package data;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 * Datainterface (Data-Schicht)
 * @author Schwinn
 *
 */
public class DataInterface {
	String history;

	/**
	 * F¸gt Input und Format 
	 * @param input
	 * @param format
	 */
	public void add(String input, String format) {
		try {
			PrintWriter writer = new PrintWriter("file.txt", "UTF-8");
			history = input.concat("_________");
			for (int i = 10 - input.length(); i > 0; i--) {
				history = history.concat("_");
			}
			history = history.concat(format);
			history = ">    ".concat(history);

			writer.println(history);

			writer.close();
		} catch (IOException e) {
			// hier k√∂nnte Fehlermeldung stehen
		}
	}
	
	/**
	 * Textfile wird ausgelesen, damit die Benutzereingabe ausgelesen werden kann
	 * @return
	 */
	public static String gethistory() {
		String text = "";
		try {
			text = new String(Files.readAllBytes(Paths.get("file.txt")));
		} catch (IOException e) {
			// hier koennte Fehlermeldung stehen
		}

		File file = new File("file.txt");
		return text;
	}
}
