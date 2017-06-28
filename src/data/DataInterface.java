package data;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
//Datainterface (Data-Schicht)
public class DataInterface {
	String history;
//Fügt Input und Format des Inputs in ein Textfile
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
			// hier könnte Fehlermeldung stehen
		}
	}
//Textfile wird ausgelesen, damit die Benutzereingabe ausgelesen werden kann
	public static String gethistory() {
		String text = "";
		try {
			text = new String(Files.readAllBytes(Paths.get("file.txt")));
		} catch (IOException e) {
			// hier könnte Fehlermeldung stehen
		}

		File file = new File("file.txt");
		return text;
	}
}
