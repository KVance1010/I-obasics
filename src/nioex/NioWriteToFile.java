package nioex;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioWriteToFile {

	public static void main(String[] args) {
		try {
			
			Path path = Paths.get("DataSet/newFile1.txt");
			Path donePath = Files.createFile(path);
			
			String content = "Hey coding is fun";
			
			Files.write(donePath, content.getBytes());
			System.out.println("Data written as byte array");
			
			Path path2 = Paths.get("DataSet/newFile2.txt");
			Path donePath2 = Files.createFile(path2);
			
			Path path3 = Paths.get("DataSet/poems.txt");
			List<String> data = Files.readAllLines(path3);
			
			Files.write(donePath2, data);
			System.out.println("Data written in file using list of strings");
			
			
			
		}
		catch (Exception iox) {
			System.out.println("Exception " + iox);
		}
	}

}
