package bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

	public static void main(String[] args) {
		String s ="";
		
		try (BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Type xyz to Exit:  ");
			s = systemIn.readLine();
			while (s != null) {
				System.out.println("Read: " +s.trim());
				if (s.equals("xyz")) {
					System.exit(0);
				}
				else {
					System.out.println("Type xyz to Exit:  ");
					System.out.println("Please make another entry");
					s = systemIn.readLine();
				}
			}
			
			}
		catch(IOException e) {
			System.out.println("Exception: " + e);
		}

	}

}
