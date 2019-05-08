package process.text.conversion;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ToText {
	public static void main(String[] argv) throws IOException {
//		final long RECORD_LENGTH = 200;
//		String line;
//
//		// Construct the file object from existing file.
//		File file = new File("D:\\XmlAndXsds\\Onboarding.txt");
//		
//		String filename = file.getName();
//		
//		filename = filename.replaceFirst("[.][^.]+$", "");
//		
//		System.out.println(filename);
		
		
		String directorypath = "D:\\XmlAndXsds\\Newfolder";
		
		String filename = "Onboarding";
		
		File file = new File(directorypath + "\\" + filename + ".txt");

		// Rename it
		file.renameTo(new File(directorypath + "\\" + filename + ".process"));
		
		
		
		
		
		
		
////		// Rename it
////		file.renameTo(new File("D:\\XmlAndXsds\\Onboarding.txt"));
////		
////		
////		
//		RandomAccessFile file1 = new RandomAccessFile(new File("D:\\XmlAndXsds\\Onboarding.txt"), "rw");
//		
//
//		
//		System.out.println("file1 is: " + file1);
//		System.out.println("file is: " + file);
//		
//		
//	    while((line = file1.readLine()) != null)
//	    {
//	        if(line.startsWith("<pd:name>") && line.endsWith("</pd:name>"))
//	        {
//	            file1.seek(file1.getFilePointer() - RECORD_LENGTH - 1);
//	            file1.writeBytes("Processes//" + file.getName());
//	            
//	        }
//
//	    }
	}
}
