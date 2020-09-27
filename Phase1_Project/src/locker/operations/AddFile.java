package locker.operations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	
	final static File folder= new File ("src/phase1/Root");
	static Scanner s=new Scanner(System.in);
	
	public static void addFile() {
		
		System.out.println("Enter the file name (without extension) : ");
		String fileName=s.nextLine();
		
		String filePath = folder.getPath() + "\\" + fileName+ ".txt";
		
		File file = new File(filePath);
		
		boolean result;
		
		try {
			result = file.createNewFile();
			

			if(result) {
				System.out.println("File created successfully!!");
				System.out.println("Please find the file at location - " + filePath);
			}
			else {
				System.out.println("File name is duplicate!! Please try again with unique name!");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
	}
}
