package locker.operations;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RetrieveFile {
	
	final static File folder= new File ("src/locker/Root");
	static File[] listOfFiles = null;
	static List<String> fileList=null;
	
	public static void retrieveFiles()
	{	
		listOfFiles = folder.listFiles();
		fileList = new ArrayList<String>();
				
		for (int i = 0; i < listOfFiles.length; i++) {
			  
			  fileList.add(listOfFiles[i].getName());
		  }
		
		Collections.sort(fileList,String.CASE_INSENSITIVE_ORDER);
		
		Iterator<String> itr = fileList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
	   }
	
	public static List<String> returnfileList()
	{
		listOfFiles = folder.listFiles();
		fileList = new ArrayList<String>();
		
		for (int i = 0; i < listOfFiles.length; i++) {
			  
			  fileList.add(listOfFiles[i].getName());
		  }
		return fileList;
		
	}
		
	}
	

	

