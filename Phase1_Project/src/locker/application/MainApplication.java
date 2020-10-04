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
		String choice= " ";
		int option,choiceIntValue = 0;		
				
		System.out.println("\t===================");
		System.out.println("\tWELCOME TO LOCKEDME");
		System.out.println("\t===================");
		System.out.println("   A product of CompanyLockers Pvt Ltd.");
		System.out.println("--------------------------------------------");
		
		
			  do {
					displayMainMenu();
					
					try {
								
					choice=s.nextLine();
                    choiceIntValue=Integer.parseInt(choice);
					
				
					switch(choiceIntValue) {
					
						case 1:
							   System.out.println(" Retrieving your files and folders in ascending order..\n");
							   System.out.println("MY LOCKER");
							   System.out.println("*********");
							   RetrieveFile.retrieveFiles();
							   System.out.println("-----------------------------------------------------------");
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
					    	   System.out.println(" Please enter a valid numeric choice(1-3)!! \n");
					    	   System.out.println("------------------------------------------------------------");
					    	   break;
					      } 
					}
					
					 catch(NumberFormatException e) {
							System.out.println(" Please enter a valid numeric choice(1-3)!! \n");
						}
					
				} while (choiceIntValue!=3);	 
	     
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
		    	    System.out.println("-----------------------------------------------------------------");
		    	    break;
		    case 2:
		    	   DeleteFile.deleteFile();
		    	   System.out.println("------------------------------------------------------------------");
		    	   break;
		    case 3 :
	    	       SearchFile.searchFile();
	    	       System.out.println("------------------------------------------------------------------");
		    	   break;
		    	    
		    case 4:
		    	   System.out.println("Navigating back to main menu..");
		    	   System.out.println("------------------------------------------------------------------");  		    	   
		    	   break;
		    default:
		    	     System.out.println("Please enter a valid option (1-4)");
		    	     displayOptionMenu();
		    	     break;		    	    
		    	    
		 }
			
		}
}
