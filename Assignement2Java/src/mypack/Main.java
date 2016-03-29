package mypack;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author messenger :Author-Rabindra Sah S.ID-4963571.
 * 
 * This class is defined to execute the program and to display the output using a system.out.printl
 *
 */

public class Main {
	
	
	public static void main(String args[])
	{
	
		/**
		 * checking whether the argument passed is for sell or show option.
		 */
		if(args[0].equalsIgnoreCase("sell"))
				{
					boolean continueFlag=false;
					do
							{
									 Shop shop =new Shop();
									String media="";
									
									System.out.println("================================\n");
									System.out.println("Welcome to the media shop\n");
									System.out.println("================================\n");
									System.out.println("Please choose from the following");
									System.out.println("1. Movie, Enter 1");
									System.out.println("2. CD's, Enter 2");
									System.out.println("3. Book, Enter 3");
									/**
									 * Getting the user input and validating the same .
									 * 
									 */
									
									int inputitem = -1;
									Scanner userinput = new Scanner(System.in);
							
									do {
									    System.out.println("Enter integer value between 1-3");
							
									    while (!userinput.hasNextInt()) 
									    {  // check if the valid input is passed
									        System.out.println("Enter a valid integer!");
									        userinput.next();   
									    }
									    inputitem = userinput.nextInt(); 
							
									} while (inputitem <= 0 || inputitem >=4);
									//userinput.close();
									
									/**
									 * check what is the option selected either movie,book or cd and store in the string
									 */
											if(inputitem==1)
											{
												media="Movie";
												 
											}
											
											else if(inputitem==2)
											{
											media="CD";
											 
											}
											else
											{
												media="Book";
												 
											}
									
									System.out.printf(shop.displaySaleItem(inputitem));
									  int choiceNumber=shop.getChoiceNumber(inputitem);
									 /**
									 * check what  option from media menu is selected if the option selected is out of range user is prompted again
									 */
									int choice = -1;
								    do {
									    System.out.println("\nPlease enter vlaid integer to choose from the menu");
									  
									    while (!userinput.hasNextInt()) 
									    {  // check if the valid input is passed
									        System.out.println("Enter a valid integer!");
									        userinput.next();   
									    }
									    choice=userinput.nextInt();
							
									} while (choice <= 0 || choice>choiceNumber);
							
								    
									//choice=userinput.nextInt();
									System.out.println("Please provide the number of copies you want to buy:");
									int numberOfCopies=userinput.nextInt();
								
									System.out.println("your choice :"+choice+ " and number of copies:"+numberOfCopies);
									String availableInformation=shop.purchaseItem(inputitem,choice,numberOfCopies);
									if(availableInformation.contains("Sorry"))
									{
									System.out.println(availableInformation);
									}
									/**
									 * Prompting user for Rating and updating the rating for media.If the copies available 
									 * and the media is sold.
									 * 
									 */
									else if (!availableInformation.contains("Sorry"))
									{
										System.out.println(availableInformation);
										//shop.purchaseItem(inputitem,choice,numberOfCopies);
									System.out.println("\nKindly rate the  "+media+ " you have selected on a scale of 1 to 10.  1 indiactes very intresting while 10 indicates absolutely uninteresting");
									
									
									/**
									 * check for valid rating
									 */
									int ratingval=-1;
									do {
									    System.out.println("Enter rating value between 1-10");
							
									    while (!userinput.hasNextInt()) 
									    {  // check if the valid input is passed
									        System.out.println("Enter a rating!");
									        userinput.next();   
									    }
									    ratingval = userinput.nextInt(); 
							
									} while (ratingval < 1 || ratingval > 10);
									
												
									shop.updateRating(inputitem,choice,ratingval);
									int [] scoreArray=shop.ratingClassObj.getScore();
																
									System.out.println(shop.ratingClassObj.getAverageRating(scoreArray));
									
									}
									/**
									 * Asking user if he/she wants to continue the program.
									 */
									System.out.println("\nWould you like to continue Press Y for Yes, N for No and exit the program");
									String response=null;
									response=userinput.next();
									if(response.equalsIgnoreCase("y"))
									{
										continueFlag=true;
									}
									else
									{
										continueFlag=false;
										System.out.println("\nThank you for using Media Program");
										System.exit(1);
									}
									
							
							}while(continueFlag);
					
				}
		
		/**
		 * Check if the argument passed in main function is for show option.
		 */
		if(args[0].equalsIgnoreCase("show"))
		{ 
			int movieSold=Shop.getMoviesSold();
			int cdSold=Shop.getCDsSold();
			int bookSold=Shop.getBooksSold();
			int totalRevenue=Shop.calculateRevenue();
			String soldItems="Sold; "+ movieSold+" Movies, "+cdSold+" CDs,and "+bookSold+ " Books, "+"total revenue is: $"+totalRevenue;
			System.out.println(soldItems);
		}
		
	}

		
		
}


















