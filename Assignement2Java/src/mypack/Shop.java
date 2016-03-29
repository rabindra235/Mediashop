package mypack;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author messenger :Author-Rabindra Sah S.ID-4963571.
 * 
 * This class is defined to for the implemenation of logic for each functionality
 *
 */
public class Shop {
	/**
	 * Creating a Shop class;
	 * @author messenger
	 *
	 *Defining the variables for the Shop class.
	 */

		static List<Book> bookList=Warehouse.getBooks();
		static List<CD>cdList=Warehouse.getCDs();
		static List<Movie> movieList=Warehouse.getMovies();
		 
		Movie movie=new Movie();
		CD cd=new CD();
		Book book=new Book();
		Rating ratingClassObj;
		/**
		  * defining methods for Shop Class
		  * 
		  */
		 
		 /**
		  * defining methods to display the list of media to sell i.e Movie/Book/Cd
		  * @param userInput
		 * @return displaySale
		  */
		 
		public String  displaySaleItem(int userInput)
		
		{
			
			String displaySale="";
			if(userInput==1)
			{
				
				for(int index=0;index<=movieList.size()-1;index++)
				{
					int numebrAvailable=movieList.get(index).getAvailble();
					if(numebrAvailable==0)
					{
						
						movieList.remove(index);
					}
				}
					//Movie movie=new Movie();
					displaySale=movie.toString(movieList);
				
			}
			else if(userInput==2)
			{
				//CD cd=new CD();
				displaySale=cd.toString(cdList);
			}
			
			else if(userInput==3)
			{
				//Book book=new Book();
				displaySale=book.toString(bookList);
			}
			return displaySale;
		}
		
		
		/**
		 * this function returns the number of options  for each type of media selected .
		 * 
		 * @param media
		 * @return choiceNumbers ie the number of option for a specific media
		 */
		public int getChoiceNumber(int media)
		
		{
			int choiceNumbers=0;
			if(media==1)
			{
				choiceNumbers=movieList.size();
			}
			
			else if(media==2)
			{
				choiceNumbers=cdList.size();
			}
			
			else if(media==3)
			{
				choiceNumbers=bookList.size();
			}
			return choiceNumbers;
			
		}
		/**
		 * this function returns the number of choices for each type of media.
		 * 
		 * @param media
		 * @param choice
		 * @param numberOfcopies
		 * @return display
		 */
		
		public String purchaseItem(int media,int choice,int numberOfcopies)
		{
			String display="";
			int indexOfArray=choice-1;
			int price=0;
				if(media==1)
				{	
					price=movieList.get(indexOfArray).getPrice();
					//Movie movie=new Movie();
					
					if(numberOfcopies <= movieList.get(indexOfArray).getAvailble())
						{
							//System.out.println();
							display=movie.sellcopies(numberOfcopies,price);
							int available=movieList.get(indexOfArray).getAvailble();
							movieList.get(indexOfArray).setAvailble(available-numberOfcopies);
							int soldcopies=movieList.get(indexOfArray).getSold();
							movieList.get(indexOfArray).setSold(soldcopies+numberOfcopies);
						
	
								if(movieList.get(indexOfArray).getAvailble()==0)
								{
									movieList.remove(indexOfArray);
									List<Movie> newmovieList=movieList;
									setMovieList(newmovieList);
								}
						}
					else
						{
							display="Sorry no sufficient copies left";
						}
					
					
					
				}
				else if(media==2)
				{	
					price=cdList.get(indexOfArray).getPrice();
					//CD cd=new CD();
					if(numberOfcopies <= cdList.get(indexOfArray).getAvailble())
						{
							display=cd.sellcopies(numberOfcopies,price);
							int available=cdList.get(indexOfArray).getAvailble();
							cdList.get(indexOfArray).setAvailble(available-numberOfcopies);
							int soldcopies=cdList.get(indexOfArray).getSold();
							cdList.get(indexOfArray).setSold(soldcopies+numberOfcopies);
						
	
								if(available==0)
								{
									cdList.remove(indexOfArray);
								}
						}
					else
						{
							display="Sorry no sufficient copies left";
						}
					
					
					
				}
				else
				{	
					price=bookList.get(indexOfArray).getPrice();
					//Book book=new Book();
					if(numberOfcopies <= bookList.get(indexOfArray).getAvailble())
						{
							display=book.sellcopies(numberOfcopies,price);
							int available=bookList.get(indexOfArray).getAvailble();
							bookList.get(indexOfArray).setAvailble(available-numberOfcopies);
							int soldcopies=bookList.get(indexOfArray).getSold();
							bookList.get(indexOfArray).setSold(soldcopies+numberOfcopies);
						
	
								if(available==0)
								{
									bookList.remove(indexOfArray);
								}
						}
					else
						{
							display="Sorry no sufficient copies left";
						}
					
					
					
				}
					
			return display;		
		}
		
		/**
		 * Craeting a method to know the rating for specific media.
		 * @param media
		 * @param choice
		 * @param ratingval
		 * @return String thaking about the rating being updated.
		 */
		
		public String updateRating(int media,int choice, int ratingval)
		{
			
			if(media==1)
			{
					
					movie=movieList.get(choice-1);
					movie.updateRating(ratingval);
					ratingClassObj=movie.getRatingClass();
					ratingClassObj.setNumberOfRating(movie.getRatingClass().getNumberOfRating());
					ratingClassObj.setScore(movie.getRatingClass().getScore());
					
			}
			else if(media==2)
			{
				//CD cd=new CD();
				cd=cdList.get(choice-1);
				cd.updateRating(ratingval);
				ratingClassObj=cd.getRatingClass();
				ratingClassObj.setNumberOfRating(cd.getRatingClass().getNumberOfRating());
				ratingClassObj.setScore(cd.getRatingClass().getScore());
			}
			
			else if(media==3)
			{
				//Book book=new Book();
				book=bookList.get(choice-1);
				book.updateRating(ratingval);
				ratingClassObj=book.getRatingClass();
				ratingClassObj.setNumberOfRating(book.getRatingClass().getNumberOfRating());
				ratingClassObj.setScore(book.getRatingClass().getScore());
			}
			return "Thank you Your Rating has been stored";
			
		}
		
		/**
		 * Craeting a method to know the number of books sold.
		 * @return bookSold
		 */
				
		static int getBooksSold()
		{
			int booksold=0;
			for(Book book:bookList)
			{
				booksold+=book.getSold();
			}
				
			return booksold;
		}
		
		/**
		 * Craeting a method to know the number of cds sold.
		 * @return cdSold
		 */
		static int getCDsSold()
		{
			int cdsold=0;
			for(CD cd:cdList)
			{
			cdsold+=cd.getSold();
			}
			return cdsold;
		}
		
		/**
		 * Craeting a method to know the number of novies sold.
		 * @return movieSold
		 */
		
		static int getMoviesSold()
		{
			int moviesold=0;
			for(Movie movie:movieList)
			{
				moviesold+=movie.getSold();
			}
			return moviesold;
		}
		
		/**
		 * Creating a function to generate the revenue for total media sold.
		 * @return  totalRevenue
		 */
		
		static int calculateRevenue()
		{
			int totalRevenue=0;
			int moviesold=0;
			int moviePrice=0;
			int totalMovieRevenue=0;
			for(Movie movie:movieList)
			{
				moviesold=movie.getSold();
				moviePrice=movie.getPrice();
				totalMovieRevenue+=moviesold*moviePrice;
			}
			int cdsold=0;
			int cdPrice=0;
			int totalCdRevenue=0;
			for(CD cd:cdList)
			{
				cdsold=cd.getSold();
				cdPrice=cd.getPrice();
				totalCdRevenue+=cdsold*cdPrice;
			}
			
			int booksold=0;
			int bookPrice=0;
			int totalBookRevenue=0;
			for(Book book:bookList)
			{
				booksold=book.getSold();
				bookPrice=book.getPrice();
				totalBookRevenue+=booksold*bookPrice;
			}
			totalRevenue=totalMovieRevenue+totalCdRevenue+totalBookRevenue;
			
			return totalRevenue;
		}
				 /**
		  * Generating Getter and Setter for the Shop Attributes
		  */
		public List<Book> getBookList() {
			return bookList;
		}
		public void setBookList(List<Book> bookList) {
			this.bookList = bookList;
		} 
		public List<CD> getCdList() {
			return cdList;
		}
		public void setCdList(List<CD> cdList) {
			this.cdList = cdList;
		}
		public List<Movie> getMovieList() {
			return movieList;
		}
		public void setMovieList(List<Movie> movieList) {
			this.movieList = movieList;
		}
				
		
}
