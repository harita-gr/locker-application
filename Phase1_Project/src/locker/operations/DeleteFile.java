package locker.operations;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class DeleteFile {
	
	final static File folder= new File ("src/locker/Root");
	static Scanner s=new Scanner(System.in);
	
	
	public static void deleteFile() {
		
		int flag=0;
		List<String> fileList = RetrieveFile.returnfileList();
		System.out.println("Enter the file name to be deleted (without extension) : ");
						
		try  
		{  
			String fileName=s.nextLine();
			fileName=fileName+".txt";
	   						
			if (!fileList.contains(fileName))
			{
				System.out.println("File Not Found!! Please try again with correct filename and check for cases!!");
				flag=1;
			}
			
			if (flag==0)
			{
				String filePath = folder.getPath() + "\\" + fileName;
				File file = new File(filePath);
				
				boolean result;
				
				result=file.delete();
				
				if(result){
					System.out.println("File deleted successfully");
				}
				else {
					System.out.println("Unable to delete File!! Please try again later!!");
				}
			}
		  }
		
		catch(Exception e)  
		{  
			e.printStackTrace();  
		}  
			

}

}