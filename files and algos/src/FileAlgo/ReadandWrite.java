package FileAlgo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadandWrite {

	public static void main(String args[]) throws IOException {
		int min = Integer.MAX_VALUE;
		ArrayList<String> FileLines = iNeed.returnArray("src/FileAlgo/input.txt");
		ArrayList<Integer> Converted = new ArrayList<Integer>();
		for (int i = 0; i < FileLines.size(); i++) {
			Converted.add(Integer.parseInt(FileLines.get(i)));
		}
		Collections.sort(Converted);
		for (int i = 0; i < Converted.size(); i++) {
			if (min > Converted.get(i)) {
				min = Converted.get(i);
			}
		}
		iNeed.writeMinInt(min, "src/FileAlgo/output.txt");
	}

}
