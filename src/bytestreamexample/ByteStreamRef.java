package bytestreamexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreamRef {

	public static void main(String[] args) {
		char[] c = new char[128];

		try (FileReader fr = new FileReader("file1.txt"); 
				FileWriter fw = new FileWriter("file2")){
			int count = 0;
		    @SuppressWarnings("unused")
			int read = 0;
			
			while ((read = fr.read(c)) != -1) {
				fw.write(count);
				count += 1;
			}
			System.out.println("Wrote: " + count + " Character");
		} catch (FileNotFoundException x) {
			System.out.println("File not found: " + x);
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
	}

}
