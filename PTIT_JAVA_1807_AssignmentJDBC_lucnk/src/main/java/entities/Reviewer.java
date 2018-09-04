/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Aug 1, 2018.
	* @version 1.0
	*/
package entities;

public class Reviewer {
	private int reviewerID;
	private String reviewerName;

	public Reviewer(int reviewerID, String reviewerName) {
		super();
		this.reviewerID = reviewerID;
		this.reviewerName = reviewerName;
	}

	public Reviewer() {
		super();
	}

	public int getReviewerID() {
		return reviewerID;
	}

	public void setReviewerID(int reviewerID) {
		this.reviewerID = reviewerID;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	@Override
	public String toString() {
		return "Reviewer [ reviewerName=" + reviewerName + "]";
	}

	public void displayreviewer() {
		System.out.println(this.toString());
	}


}
