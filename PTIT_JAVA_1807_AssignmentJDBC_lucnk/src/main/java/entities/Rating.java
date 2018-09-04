/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Aug 1, 2018.
	* @version 1.0
	*/
package entities;

public class Rating {
	private int reviewerRatingID;
	private int movieRatingID;
	private int stars;
	private int ratingDate;

	public Rating(int reviewerRatingID, int movieRatingID, int stars, int ratingDate) {
		super();
		
		this.reviewerRatingID = reviewerRatingID;
		this.movieRatingID = movieRatingID;
		this.stars = stars;
		this.ratingDate = ratingDate;
	}

	public Rating() {
		super();
	}

	

	public int getReviewerRatingID() {
		return reviewerRatingID;
	}

	public void setReviewerRatingID(int reviewerRatingID) {
		this.reviewerRatingID = reviewerRatingID;
	}

	public int getMovieRatingID() {
		return movieRatingID;
	}

	public void setMovieRatingID(int movieRatingID) {
		this.movieRatingID = movieRatingID;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public int getRatingDate() {
		return ratingDate;
	}

	public void setRatingDate(int ratingDate) {
		this.ratingDate = ratingDate;
	}

	@Override
	public String toString() {
		return "Rating [reviewerRatingID=" + reviewerRatingID + ", movieRatingID="
				+ movieRatingID + ", stars=" + stars + ", ratingDate=" + ratingDate + "]";
	}

	public void displayrating() {
		System.out.println(this.toString());
	}

}
