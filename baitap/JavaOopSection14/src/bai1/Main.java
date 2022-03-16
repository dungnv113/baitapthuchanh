package bai1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
   		// TODO Auto-generated method stub
		String txt = "Hello Trung Tâm Java - File";
		writeFile(txt);
		readFile();
	}

	public static void writeFile(String s) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
			
			byte[] bArr = s.getBytes();
			
			fileOutputStream.write(bArr);

			fileOutputStream.close();

			// TODO Auto-generated catch block

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readFile() {
		File file = new File("test.txt");
		if (file.exists()) {
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				int c = fileInputStream.read();

				while (c != -1) {
					System.out.println((char) c);
					c = fileInputStream.read();
				}
				fileInputStream.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else
			System.out.println("file ko ton tai");
	}
}
