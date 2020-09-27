package locker.application;

import java.io.IOException;
import java.util.Scanner;

import locker.operations.AddFile;
import locker.operations.DeleteFile;
import locker.operations.RetrieveFile;
import locker.operations.SearchFile;


public class MainApplication {

	public static void main(String[] args) throws IOException {
	
		Scanner s=new Scanner(System.in);
		int choice = 0,option;
		
		System.out.println("\t===================");
		System.out.println("\tWELCOME TO LOCKEDME");
		System.out.println("\t===================");
		System.out.println("   A product of CompanyLockers Pvt Ltd.");
		System.out.println("--------------------------------------------");
	
		
	    try{
			  do {
					displayMainMenu();
					choice=Integer.parseInt(s.nextLine());

					switch(choice) {
					
						case 1:
							   System.out.println(" Retrieving your files and folders in ascending order..\n");
							   RetrieveFile.retrieveFiles();
							   System.out.println("-----------------");
				               break;
			            case 2:
							   displayOptionMenu();
							   option=Integer.parseInt(s.nextLine());
							   performOption(option);
							   break;			   
			            case 3:
							   System.out.println("Thank you for using our application! Exiting...");
							   break;	
		                default:
					    	   System.out.println("Please enter a valid choice(1-3)!!");
					    	   displayMainMenu();
					  } 
				}while (choice!=3);
	       }
	                    				
				catch(NumberFormatException e)
				{
					System.out.println("Retry again with a valid choice (1-3)!! Exiting...");	
					
				}	      
	
       s.close();
    }

	
	 private static void displayMainMenu()
	  {
		    System.out.println("\n MAIN MENU");
			System.out.println(" 1. View Files");  
			System.out.println(" 2. Edit Files");
			System.out.println(" 3. Exit");
			System.out.println("\n Enter your choice (1-3): ");
	  }
	  
	 private static void displayOptionMenu()
	  {
		  System.out.println("\n OPTION MENU") ;
		   System.out.println(" 1. Add file");
		   System.out.println(" 2. Delete file");
		   System.out.println(" 3. Search file");
		   System.out.println(" 4. Return to Main Menu");
		   System.out.println(" \n Select any operation to continue: ");
	  }
	 
	 private static void performOption(int option) {
			
		 switch(option)
		 {
		    case 1:
		    	    AddFile.addFile();
		    	    System.out.println("-----------------");
		    	    break;
		    case 2:
		    	   DeleteFile.deleteFile();
		    	   System.out.println("-----------------");
		    	   break;
		    case 3 :
	    	       SearchFile.searchFile();
	    	       System.out.println("-----------------");
		    	   break;
		    	    
		    case 4:
		    	   System.out.println("Navigating back to main menu..");
		    	   System.out.println("-----------------");  		    	   
		    	   break;
		    default:
		    	     System.out.println("Please enter a valid option (1-4)");
		    	     displayOptionMenu();
		    	     break;		    	    
		    	    
		 }
			
		}
}
