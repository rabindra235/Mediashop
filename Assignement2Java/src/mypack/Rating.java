package mypack;

/**
 * 
 * @author messenger :Author-Rabindra Sah S.ID-4963571.
 * 
 * This class is defined as Rating class.
 *
 */
public class Rating {
	/**
	 * Creating a Rating class;
	 * @author messenger
	 *
	 *Defining the variables for the Rating class.
	 */
 private  int[]  score=new int[100];
 private int numberOfRating;
  
 
 /**
  * defining methods for getting the average rating for the media choosen
  * @param score
  * @return displayrating
  */
 
 public String getAverageRating(int[]  score)
 
 {
	 String displayrating="";
	 double sum=0;
	 	double avg=0; 
	 for(int index=0;index<=score.length-1;index++)
	 {
		 int temp;
		  
			temp= score[index];
		
		 sum=sum + temp;
		
		 
	 }
	 avg=sum/getNumberOfRating();
	 displayrating="The average rating is: "+avg;
	 return displayrating;
 }
 
 
/**
	  * defining methods to update the rating for each type of media
	  * @param newRating
	  * 
	  */
 
 public void updateRating(int newRating)
 {
	 
	 /**
	  * get the new rating from user,check if the score array size is 100 remove the earlier one and add the new one
	  */
	 
	 int arraySize=score.length;
	 
	 for(int k=0;k<=arraySize-1;k++)
		 
	 {
				 if(score[k]==0)
				 {
					 score[k]=newRating;
					 break;
				 }
				 else if(!(score[99]==0))
				 {
					 for(int i=0;i<score.length-1;i++)
					 {
						 score[i]=score[i+1];
					 }
					 int length=score.length;
					 score[length]=newRating;
				 }
	 }
	 
	 numberOfRating=numberOfRating+1;
	 setScore(score);
	 setNumberOfRating(numberOfRating);
	 
 }     
 
 
 
 /**
  * Generating Getter and Setter for the Rating Attributes
  */

public int[] getScore() {
	return score;
}

public void setScore(int[] score) {
	this.score = score;
}

public int getNumberOfRating() {
	return numberOfRating;
}

public void setNumberOfRating(int numberOfRating) {
	this.numberOfRating = numberOfRating;
}
  
 
}
