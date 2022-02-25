package nioex;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioMakeNewFile {

	public static void main(String[] args) {
		try {
			Path path =  Paths.get("DataSet/poem.txt");
			if (Files.exists(path)) {
				System.out.println("File already exist");
			}
			else {
				Path donePath = Files.createFile(path);
				System.out.println("File is created : " + donePath.toString());
			}
		}
		catch(Exception iox) {
			System.out.println("Exception: " + iox);
		}
	}

}
