/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Aug 1, 2018.
	* @version 1.0
	*/
package app;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import dao.MovieDAO;
import dao.RatingDAO;
import dao.ReviewerDAO;
import entities.Movie;
import entities.Rating;
import entities.Reviewer;

public class ApplicationLayer {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Scanner sc = new Scanner(System.in);
		MovieDAO movieDao = new MovieDAO();
		ReviewerDAO reviewerDao = new ReviewerDAO();
		RatingDAO ratingDao = new RatingDAO();
		System.out.println("===================================================================");
		while (true) {
			System.out.println("----------------------------------------------------------");
			System.out.println(
					"1. Find all movies that received a rating of 4 or 5 stars from more than three reviewers.");
			System.out.println("2. Find the title of movie(s) that received the largest total number of stars.");
			System.out.println("3. Find the difference between the average rating of movies released before\r\n"
					+ "2000 and the average rating of movies released after 2000.");
			System.out.println("4. Find all reviewers who have contributed three or more ratings");
			System.out.println("5. Find all movies directed by a director, whose name begins from letter â€˜Aâ€™ to â€˜Câ€™.");
			System.out.println("6. A method to insert a rating into database");
			System.out.println("7. A method to delete reviewer(s), whose name contains John word");
			System.out.println("8. Update rank of the movie from Normal to Hot if that movie has the average rating\r\n"
					+ "greater than 4 stars");
			System.out.print("You choose: ");

			String s = sc.nextLine();
			int choose;
			while (true) {
				try {
					choose = Integer.parseInt(s);
					if (choose > 0 && choose <= 8) {
						break;
					}
				} catch (NullPointerException e) {

					System.out.println("Please again: ");
					s = sc.nextLine();

				}
			}

			switch (choose) {
			case 1:
				for (Movie moive2 : movieDao.findMovie()) {
					moive2.displaymovie();
				}
				break;
			case 2:

				for (Movie movie : movieDao.findTitleMovie()) {
					System.out.println("Title: " + movie.getTitle());
				}
				break;
			case 3:

				movieDao.findAvg();

				break;
			case 4:
				for (Reviewer reviewer : reviewerDao.findReviwer()) {
					reviewer.displayreviewer();
				}

				break;
			case 5:

				for (Movie movie3 : movieDao.findDirector()) {
					System.out.println("Director: " + movie3.getDirector());
				}
				break;
			case 6:

				Rating rt = new Rating(3, 2, 5, 2008);
				if (ratingDao.createRating(rt)) {
					System.out.println("Insert successfully!");
				} else {
					System.out.println("Insert fail!");
				}

			case 7:
				reviewerDao.deleteReviwer();

				break;
			case 8:
				movieDao.updateMovie();
				break;
			case 9:
				System.out.println("Output");
				return;

			}
		}
	}

}
