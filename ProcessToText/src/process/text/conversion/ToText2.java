package process.text.conversion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ToText2 {
	public static void main(String args[]) throws IOException {
		final long RECORD_LENGTH = 200;
		String line;

		// Construct the file object from existing file.
		File file = new File("D:\\XmlAndXsds\\PublishMsg_RV.txt");
		
//		// Rename it
//		file.renameTo(new File("D:\\XmlAndXsds\\PublishMsg_RV.txt"));
		
		RandomAccessFile file1 = new RandomAccessFile(new File("D:\\XmlAndXsds\\PublishMsg_RV.txt"), "rw");
		
		System.out.println("file1 is: " + file1);
		System.out.println("file is: " + file);
		
		
	    while((line = file1.readLine()) != null)
	    {
	    	//System.out.println(line);
	    	if(line.startsWith("	<pd:name>") && line.endsWith("</pd:name>")) {
	    		System.out.println(line);
	    		int linelength = line.length();
	    		System.out.println("length is " + linelength);
	    		System.out.println("filepointer " + file1.getFilePointer());
	    		System.out.println(line.replace(line,"    <pd:name>Processes\\" + file.getName() + "</pd:name>"));
	    		line = line.replace(line,"    <pd:name>Processes\\" + file.getName() + "</pd:name>");
	    		
	 //   		System.out.println(file1.getFilePointer() - linelength -1);
	    		file1.seek(file1.getFilePointer() - linelength -1);
	    		System.out.println("inside if" + line);
	    		System.out.println("######" );
	    		file1.writeBytes(line);
	    		

	    	}
	    	System.out.println(line);
	    	

	    }
	    System.out.println("**");
	    file1.close();
	    
	    
	}

}
