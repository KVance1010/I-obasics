package nioex;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioMakeDirectory {
	public static void main(String[] args) {
		try {

			Path path = Paths.get("DataSet");

			if (Files.exists(path))
				System.out.println("Directory already Exists");
			else {
				Path donePath = Files.createDirectories(path);
				System.out.println("Directory created at " + donePath.toString());
			}

		} catch (Exception IO) {
			System.out.println("Exception " + IO);
		}
	}

}
