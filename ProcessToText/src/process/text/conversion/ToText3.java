package process.text.conversion;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ToText3 {
	public static void main(String args[]) throws IOException {
		String line, directorypath, filename ;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter directory path and filename");
		directorypath = scanner.nextLine();
		filename = scanner.nextLine();

		filename = filename.replaceFirst("[.][^.]+$", "");

		ProcessToText.ProcessToTextConverter(directorypath, filename);

		String txtFilePath = directorypath + "//" + filename + ".txt";
		
		// Construct the file object from existing file.
		File file = new File(txtFilePath);

		ChangingProcessReference.ProcessReferenceEditor(txtFilePath, filename);

		System.out.println("filename is " + filename + " directory is " + directorypath);
		System.out.println(directorypath + "\\" + filename + ".txt");
		System.out.println(file.getAbsolutePath());

		file.renameTo(new File(directorypath + "\\" + filename + ".process"));
		System.out.println(file.renameTo(new File("D:\\XmlAndXsds\\Newfolder\\Onboarding.process")));

	}

}