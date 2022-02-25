package nioex;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioAppendToFile {

	public static void main(String[] args) {
try {
			
			Path path = Paths.get("DataSet/newFile1.txt");
			
			String content = "Hey coding is fun, why not do it more often";
			
			Files.write(path, content.getBytes(), StandardOpenOption.APPEND);
			Files.write(path, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
			System.out.println("Data is appended to the array");
			
		}
		catch (Exception iox) {
			System.out.println("Exception " + iox);
		}
	}

}
