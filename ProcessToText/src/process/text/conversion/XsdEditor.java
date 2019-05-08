package process.text.conversion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class XsdEditor {
	public static void main(String args[]) throws IOException {
		String line;

		// Construct the file object from existing file.
		File file = new File("D:\\XmlAndXsds\\newXML.txt");

		RandomAccessFile file1 = new RandomAccessFile(new File("D:\\XmlAndXsds\\newXML.txt"), "rw");

		StringBuffer inputBuffer = new StringBuffer();

		while ((line = file1.readLine()) != null) {
			// System.out.println(line);
			if (!line.trim().contains("<xs:schema")) {
				// file1.writeBytes(line);
				inputBuffer.append(System.lineSeparator()).append(line);
			} else {
				inputBuffer.append(System.lineSeparator())
						.append("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"\r"
								+ "	 elementFormDefault=\"qualified\"\r"
								+ "	 attributeFormDefault=\"unqualified\">");
			}
		}
		FileOutputStream fileOut = new FileOutputStream("D:\\XmlAndXsds\\newXML.txt");
		fileOut.write(inputBuffer.toString().getBytes());
		file1.close();

	}

}
