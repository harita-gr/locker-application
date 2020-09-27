package locker.operations;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	
	final static File folder= new File ("src/phase1/Root");
	static Scanner s=new Scanner(System.in);
	
	
	public static void deleteFile() {
		
		System.out.println("Enter the file name to be deleted (without extension) : ");
		String fileName=s.nextLine();
		
		try  
		{  
			String filePath = folder.getPath() + "\\" + fileName+ ".txt";
			File file = new File(filePath);
			
			boolean result;
			
			result=file.delete();
			
			if(result){
				System.out.println("File deleted successfully");
			}
			else { System.out.println("File Not Found!!");
			}
		
		}
		catch(Exception e)  
		{  
			e.printStackTrace();  
		}  
			

}

}