package bytestreamexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharStreamTest {

	public static void main(String[] args) {
		byte[] b = new byte[128];

		try (FileInputStream fis = new FileInputStream("file1.txt");
				FileOutputStream fos = new FileOutputStream("file2.txt")) {

			System.out.println("Bytes available: " + fis.available());
			int count = 0;
			int read = 0;
			while ((read = fis.read(b)) != -1) {
				fos.write(b);
				count += read;
			}
			System.out.println("Wrote: " + count);
		} catch (FileNotFoundException x) {
			System.out.println("File not found: " + x);
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
	}

}
