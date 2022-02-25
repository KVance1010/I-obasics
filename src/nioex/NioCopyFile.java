package nioex;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyFile {

	public static void main(String[] args) {
		try {
			
			Path source = Paths.get("file.txt");
			Path destination =Paths.get("DataSet/copiedFile.txt");
			
	//		Files.move(source, destination); this will copy and move the file
			Files.copy(source, destination);
			System.out.println("File copied");
		}
		catch(Exception iox) {
			System.out.println("Exception " + iox);
		}

	}

}
