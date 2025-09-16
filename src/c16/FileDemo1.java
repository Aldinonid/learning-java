package c16;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) {
		String pathname = "2.txt";
		File file1 = new File(pathname); // it doesn't really create the file on my hard drive. It likes, it say: I'm going to create a file called "2.txt"
		
		System.out.println(file1.exists());
		
		// create the file
		try {
			file1.createNewFile(); // this line is creating a file
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// firstly need to find out what's the default folder?
//		String currentDir = System.getProperty("user.dir");
//		System.out.println("Current working folder: " + currentDir);
		
	}
}
