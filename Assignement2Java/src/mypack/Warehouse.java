package mypack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author messenger :Author-Rabindra Sah S.ID-4963571.
 * 
 * This class is defined to intialized all the class objects with a default value
 *
 */
public class Warehouse {
	
	
	
	 /**
	  * defining methods for Warehouse Class and inserting hard coded values for each type of Media.
	  * 
	  */
	
	 
	 /**
	  * 
	  * Populating data for a Book class
	  */
	static ArrayList<Book> getBooks(){
		ArrayList<Book>bookList=new ArrayList<Book>();
		
		 /** Initializing the variables for Book class*/
		 Book book1=new Book();
		 book1.setAuthor("Chetan Bhagat");
		 book1.setTitle("Five Point SomeOne");
		 book1.setAvailble(5);
		 book1.setPrice(15);
		 book1.setSold(1);
		 
		 Book book2=new Book();
		 book2.setAuthor("Chetan Bhagat");
		 book2.setTitle("One Night at call Center");
		 book2.setAvailble(5);
		 book2.setPrice(25);
		 book2.setSold(1);
		 
		 Book book3=new Book();
		 book3.setAuthor("Chetan Bhagat");
		 book3.setTitle("Two States");
		 book3.setAvailble(4);
		 book3.setPrice(10);
		 book3.setSold(3);
		 
		 Book book4=new Book();
		 book4.setAuthor("Chetan Bhagat");
		 book4.setTitle("The Three Mistakes of my life");
		 book4.setAvailble(5);
		 book4.setPrice(30);
		 book4.setSold(3);
		 
		 Book book5=new Book();
		 book5.setAuthor("Amish Tripathi");
		 book5.setTitle("The Immortals of Meluha");
		 book5.setAvailble(5);
		 book5.setPrice(75);
		 book5.setSold(4);
		 
		  /**Insert the initialized value in  arraylist*/
		 bookList.add(book1);
		 bookList.add(book2);
		 bookList.add(book3);
		 bookList.add(book4);
		 bookList.add(book5);
		return bookList;
		}
	

	 /**
	  * 
	  * Populating data for a CD class
	  */
static ArrayList<CD> getCDs()
	{
	 /** Initializing the variables for Book class*/
		ArrayList<CD>cdList=new ArrayList<CD>();
		
		CD cd1=new CD();
		cd1.setPerformer("Henry Oloso");
		cd1.setTitle("Mummy returns");
		cd1.setAvailble(5);
		cd1.setPrice(35);
		cd1.setFileType("movie");
		cd1.setSold(1);
		 

		CD cd2=new CD();
		cd2.setPerformer("system");
		cd2.setTitle("Ms Office");
		cd2.setAvailble(4);
		cd2.setPrice(45);
		cd2.setFileType("software");
		cd2.setSold(2);
		 
		CD cd3=new CD();
		cd3.setPerformer("Ninja Turtle");
		cd3.setTitle("Mutant Ninja");
		cd3.setAvailble(6);
		cd3.setPrice(25);
		cd3.setFileType("game");
		cd3.setSold(2);
		 
		CD cd4=new CD();
		cd4.setPerformer("Alex");
		cd4.setTitle("Youtube Downloader ");
		cd4.setAvailble(4);
		cd4.setPrice(65);
		cd4.setFileType("installation pack");
		cd4.setSold(4);
		 
		CD cd5=new CD();
		cd5.setPerformer("windows medai player");
		cd5.setTitle("hollyhood remix 14");
		cd5.setAvailble(8);
		cd5.setPrice(25);
		cd5.setFileType("songs mp3");
		cd5.setSold(2);
		 
		  /**Insert the initialized value in  arraylist */
			cdList.add(cd1);
			cdList.add(cd2);
			cdList.add(cd3);
			cdList.add(cd4);
			cdList.add(cd5);
		return cdList;
	}
	
	 /**
	  * 
	  * Populating data for a Book class
	  */
static ArrayList<Movie> getMovies()
{
	ArrayList<Movie>movieList=new ArrayList<Movie>();
	Movie movie1=new Movie();
	movie1.setDirector("Vipul Sharma");
	movie1.setProducer("Vipul Sah");
	movie1.setTitle("Laughter Challenge");
	movie1.setAvailble(3);
	movie1.setPrice(15);
	movie1.setFileType(".mp4");
	movie1.setSold(1);
	
	Movie movie2=new Movie();
	movie2.setDirector("Nicholas cage");
	movie2.setProducer("Harry Osbone");
	movie2.setTitle("Spiderman");
	movie2.setAvailble(3);
	movie2.setPrice(15);
	movie2.setFileType(".mp4");
	movie2.setSold(2);
	
	Movie movie3=new Movie();
	movie3.setDirector("Rock jio");
	movie3.setProducer("Henery Miller");
	movie3.setTitle("Fast n Furious");
	movie3.setAvailble(3);
	movie3.setPrice(15);
	movie3.setFileType(".mp4");
	movie3.setSold(1);
	
	Movie movie4=new Movie();
	movie4.setDirector("Satish Kaushik");
	movie4.setProducer("Hritik Roshan");
	movie4.setTitle("Jodha Akbar");
	movie4.setAvailble(7);
	movie4.setPrice(15);
	movie4.setFileType(".avi");
	movie4.setSold(6);
	
	Movie movie5=new Movie();
	movie5.setDirector("Olga par");
	movie5.setProducer("Clive Oman");
	movie5.setTitle("Shoot em up");
	movie5.setAvailble(7);
	movie5.setPrice(25);
	movie5.setFileType(".avi");
	movie5.setSold(6);
	 
 /**Insert the initialized value in  arraylist */
	movieList.add(movie1);
	movieList.add(movie2);
	movieList.add(movie3);
	movieList.add(movie4);
	movieList.add(movie5);
	return movieList;
	
	
}

}
