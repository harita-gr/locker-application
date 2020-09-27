package locker.operations;

import java.util.List;
import java.util.Scanner;

public class SearchFile {
	
	static Scanner s=new Scanner(System.in);
	
	public static void searchFile()
	{
		System.out.println("Enter the file name to be searched (without extension) : ");
		String fileName=s.nextLine();
		fileName=fileName+".txt";
		
		List<String> fileList = RetrieveFile.returnfileList();
		if (fileList.contains(fileName))
		{
			System.out.println("File found in the Root directory");
		}
		else
		{
			System.out.println("File does not exist!");
		}		
	}
		

}
