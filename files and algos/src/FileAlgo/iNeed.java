package FileAlgo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class iNeed {

	public static ArrayList<String> returnArray(String s) throws IOException {
		ArrayList<String> result = new ArrayList<String>();
		for (String line : Files.readAllLines(Paths.get(s))) {
			result.add(line);
		}
		return result;
	}

	public static void writeMinInt(int i, String s) throws IOException {
		String result = i + "";
		Files.write(Paths.get(s), result.getBytes());

	}

}
