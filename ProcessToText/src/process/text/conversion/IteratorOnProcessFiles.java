package process.text.conversion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorOnProcessFiles {
	public static void ProcessIterator(String directorypath) throws IOException {

		Path pathToBeMovedTo = Paths.get(directorypath);
		List<Path> files = Files.walk(pathToBeMovedTo).filter(Files::isRegularFile).collect(Collectors.toList());

		forEach(){
			
		}
		
		
		for (int i = 0; i < files.size(); i++) {
			if (files.get(i).toString().endsWith(".process")) {
				String filename = file

			}

		}
	}
}
