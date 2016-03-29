package mypack;
import java.util.List;


/**
 * 
 * @author messenger :Author-Rabindra Sah S.ID-4963571.
 * 
 * This class is defined as CD class.
 *
 */
public class CD extends Media{
	/**
	 * 
	 *Defining the variables for the CD class.
	 */ 
	
	 private String performer;
	// private String title;
	// private int availble;
	// private int price;
	// private int rating;
	 private String fileType;
	// private  int sold;
	 private Rating ratingClass;
	 
	 
	 /**
	  * defining methods to sell the number of copies for CD
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
	  * defining methods to update the rating for each CD
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
	  * defining methods to display the list of CD present
	  * @param movieList
	  * @return stringBuilder
	  */

	 public String toString(List<CD> cdList)
	 
	 {
		 
		 
		 StringBuilder stringBuilder=new StringBuilder();
		 int i=1;//defining to shows the CD with option number
			int size=cdList.size();
			if(!(i>size))
			{
				
					if(cdList.size()!=0)
						{
						
							for(CD cd:cdList)
							{

								stringBuilder.append(i);
								stringBuilder.append(".");
								stringBuilder.append(" ");
								stringBuilder.append(cd.getTitle());
								stringBuilder.append(",");
								stringBuilder.append(cd.getFileType());
								stringBuilder.append(",");
								stringBuilder.append(cd.getPerformer());
								stringBuilder.append(",");
								stringBuilder.append("$"+cd.getPrice());
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
	 
	 
	 
	public String getPerformer() {
		return performer;
	}
	public void setPerformer(String performer) {
		this.performer = performer;
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
	 
	 /**
	  * Generating Getter and Setter for the CD's Attributes
	  */
	 
}
