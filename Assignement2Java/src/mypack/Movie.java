package mypack;
import java.util.List;


/**
 * 
 * @author messenger :Author-Rabindra Sah S.ID-4963571.
 * 
 * This class is defined as movie class.
 *
 */
public class Movie  extends Media{
	/**
	 * 
	 *Defining the variables for the Movie class.
	 */ 

	
	 private String director;
	 private String producer;
	// private String title;
	// private int availble;
	// private int price;
	// private int rating;
	 private String fileType;
	// private  int sold;
	 private Rating ratingClass;
	 
	 /**
	  * defining methods to sell the number of copies for Movie
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
	  * defining methods to update the rating for each movie
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
	  * defining methods to display the list of movies present
	  * @param movieList
	  * @return stringBuilder
	  */
	 
	 public String toString(List<Movie> movieList)
	  {
		 
		 
		 StringBuilder stringBuilder=new StringBuilder();
		 int i=1; //defining to shows the Movie with option number
			int size=movieList.size();
			if(!(i>size))
			{
				
			
					if(movieList.size()!=0)
						{
							
														
							for(Movie movie:movieList)
							{
								stringBuilder.append(i);
								stringBuilder.append(".");
								stringBuilder.append(" ");
								stringBuilder.append(movie.getTitle());
								stringBuilder.append(",");
								stringBuilder.append(movie.getDirector());
								stringBuilder.append(",");
								stringBuilder.append(movie.getProducer());
								stringBuilder.append(",");
								stringBuilder.append("$"+movie.getPrice());
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
	  * Generating Getter and Setter for the Movie's Attributes
	  */
	 
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	
	
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	public Rating getRatingClass() {
		return ratingClass;
	}
	public void setRatingClass(Rating ratingClass) {
		this.ratingClass = ratingClass;
	}
	 
	 
	 
	 
	
}
