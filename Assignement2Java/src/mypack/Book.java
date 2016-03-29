package mypack;
import java.util.List;


/**
 * 
 * @author messenger :Author-Rabindra Sah S.ID-4963571.
 * 
 * This class is defined as Book class.
 *
 */

public class Book extends Media {
	/**
	 * 
	 *Defining the variables for the Book class.
	 */ 

	private String author;
	//private  String title;
	// private int availble;
	// private int price;
	// private int rating;
	// private  int sold;
	 private Rating ratingClass;
	 /**
	  * defining methods to sell the number of copies for Book
	  * @param howMany,newRating
	  * @return returnString
	  */
public String sellcopies(int howMany,int price)
	 
	 {
		 String returnString="";
		 int copies=howMany;
		 int total=copies*price;
		 setAvailble(getAvailble()-copies);
		 returnString ="You are charged  " + "$ " + total;
		 
		 return returnString;
		  	 
	 }
	 /**
	  * defining methods to update the rating for each book
	  * @param newRating
	  * 
	  */
public void updateRating(int newRating)
{
	 setRating(newRating);//setting the current rating provided by the user.
	 //Rating ratingCls=new Rating();
	 ratingClass=new Rating();
	 ratingClass.updateRating(newRating);
	 
}



/**
	  * defining methods to display the list of book present
	  * @param movieList
	  * @return stringBuilder
	  */
	 public String toString(List<Book> bookList)
	 {
		 
		 StringBuilder stringBuilder=new StringBuilder();
		 int i=1;//defining to shows the Book with option number
			int size=bookList.size();
			if(!(i>size))
			{
			//System.out.println("inside movie");
				if(bookList.size()!=0)
					{
												
						for(Book book:bookList)
						{
							stringBuilder.append(i);
							stringBuilder.append(".");
							stringBuilder.append(" ");
							stringBuilder.append(book.getTitle());
							stringBuilder.append(",");
							stringBuilder.append(book.getAuthor());
							stringBuilder.append(",");
							stringBuilder.append("$"+book.getPrice());
							stringBuilder.append("\n");
							i++;
						}
					}
				
				else
					{
					stringBuilder.append("Sorry no items in this category for sale");
					
					}
			}
		return stringBuilder.toString();
	 }
	 
	 
	 /**
	  * Generating Getter and Setter for the Book's Attributes
	  */
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Rating getRatingClass() {
		return ratingClass;
	}
	public void setRatingClass(Rating ratingClass) {
		this.ratingClass = ratingClass;
	}
	 
	 	 
}
