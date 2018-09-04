/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Aug 1, 2018.
	* @version 1.0
	*/
package entities;

public class Movie {
	private int movieID;
	private String title;
	private int movieYear;
	private String director;
	private String ranking;

	public Movie(int movieID, String title, int movieYear, String director, String ranking) {
		super();
		this.movieID = movieID;
		this.title = title;
		this.movieYear = movieYear;
		this.director = director;
		this.ranking = ranking;
	}

	public Movie() {
		super();
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Movie [movieID=" + movieID + ", title=" + title + ", movieYear=" + movieYear + ", director=" + director
				+ ", ranking=" + ranking + "]";
	}

	public void displaymovie() {
		System.out.println(this.toString());
	}

}
