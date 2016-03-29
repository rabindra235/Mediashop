package mypack;

import java.util.List;

public abstract class Media {
	
	
	//definig variables/attribute common to all media class.
	
	 private String title;
	 private int availble;
	 private int price;
	 private int rating;
	 private  int sold;
	 
	 
	 //creating a abstract method common to all media class
	 public abstract String sellcopies(int howMany,int price);
	 public abstract void updateRating(int newRating);
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAvailble() {
		return availble;
	}
	public void setAvailble(int availble) {
		this.availble = availble;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}

}
