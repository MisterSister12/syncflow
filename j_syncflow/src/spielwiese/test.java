package spielwiese;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class test {
	static void show() {
		try {
			var reader = new FileReader("file.txt");
			var value = reader.read();
			new SimpleDateFormat().parse("");
		} catch (IOException | ParseException e) {
			// TODO: handle exception
		}
	}
}
