package nioex;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioReadFile {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("DataSet/poems.txt");
			List <String> data = Files.readAllLines(path);
			
			for (String line: data) {
				System.out.println(line);
			}
		}
		catch(Exception iox) {
			System.out.println("Exception iox" + iox);
		}

	}

}
