package pathtest;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:\\Users\\vance\\Desktop\\Workspace2\\io-basics\\file1.txt");
		
		System.out.format("getFileName: %s%n", p1.getFileName());
		System.out.format("getParent: %s%n", p1.getParent());
		System.out.format("getNameCount: %s%n", p1.getNameCount());
		System.out.format("getRoot: %s%n", p1.getRoot());
		System.out.format("isAbsulute: %s%n", p1.isAbsolute());
		System.out.format("toAbsulute path: %s%n", p1.toAbsolutePath());
		System.out.format("toURI: %s%n", p1.toUri());
	}

}
