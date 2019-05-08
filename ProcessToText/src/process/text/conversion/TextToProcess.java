package process.text.conversion;

import java.io.File;

public class TextToProcess {
	public static void TextToProcessConverter(String directorypath, String filename) {

		System.out.println("*******");
		
		System.out.println(directorypath);
		System.out.println(filename);
		System.out.println(directorypath + "\\" + filename + ".txt");

		// Construct the file object from existing file.
		File file = new File(directorypath + "\\" + filename + ".txt");

		// Rename it
		file.renameTo(new File(directorypath + "\\" + filename + ".process"));

	}

}
