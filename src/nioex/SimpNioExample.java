package nioex;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class SimpNioExample {

	public static void main(String[] args) throws IOException {
		try {
			try (FileInputStream fin = new FileInputStream("file.txt")) {
				FileChannel readChannel = fin.getChannel();
				ByteBuffer readBuffer = ByteBuffer.allocate(1023);
				int result = readChannel.read(readBuffer);
				System.out.println("file read successfule "+ result);
			}
			try (FileOutputStream fout = new FileOutputStream("file2.txt")) {
				FileChannel writeChannel = fout.getChannel();
				ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
				String message = " this is a test";
				writeBuffer.put(message.getBytes());
				
				writeBuffer.put(message.getBytes());
				writeBuffer.flip();
				writeChannel.write(writeBuffer);
				System.out.println("File written successfully");
			}
		}
		catch(Exception iox) {
			System.out.println("Exception " + iox);
		}
	

	}

}
