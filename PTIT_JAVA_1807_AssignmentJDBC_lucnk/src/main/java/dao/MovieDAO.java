/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Aug 1, 2018.
	* @version 1.0
	*/
package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Movie;
import utils.DbUtils;

public class MovieDAO {
	public boolean createMovie(Movie movie) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = new DbUtils().getConnection();
		String query = "INSERT INTO Users VALUES(?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, movie.getTitle());
		preparedStatement.setInt(2, movie.getMovieYear());
		preparedStatement.setString(3, movie.getDirector());
		preparedStatement.setString(4, movie.getRanking());

		try {
			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				System.out.println("So tin bi anh huong la: " + row);
				return true;
			}

			return false;
		} finally {
			DbUtils.closeConnection(connection);
		}
	}

	public List<Movie> retrieveMovie() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "Select * from Movie";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		List<Movie> listMovie = new ArrayList<>();
		while (resultSet.next()) {
			Movie movie = new Movie();
			movie.setMovieID(resultSet.getInt(1));
			movie.setTitle(resultSet.getString(2));
			movie.setMovieYear(resultSet.getInt(3));
			movie.setDirector(resultSet.getString(4));
			movie.setRanking(resultSet.getString(5));
			listMovie.add(movie);
		}
		return listMovie;
	}

	public List<Movie> findMovie() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "SELECT Movie.*\r\n" + "FROM  Movie\r\n" + "WHERE MovieId IN(\r\n"
				+ "		SELECT Movie_Rating_ID\r\n" + "		FROM Rating\r\n"
				+ "		WHERE	  (Rating.Stars= 4 OR Rating.Stars=5)\r\n" + "		GROUP BY Movie_Rating_ID\r\n"
				+ "		HAVING COUNT(Movie_Rating_ID) >= 3)";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		List<Movie> listMovie = new ArrayList<>();
		while (resultSet.next()) {
			Movie movie = new Movie();
			movie.setMovieID(resultSet.getInt(1));
			movie.setTitle(resultSet.getString(2));
			movie.setMovieYear(resultSet.getInt(3));
			movie.setDirector(resultSet.getString(4));
			movie.setRanking(resultSet.getString(5));
			listMovie.add(movie);
		}
		return listMovie;
	}

	/*
	 * Q2
	 * */
	public List<Movie> findTitleMovie() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "Select Movie.Title, SUM(Stars) AS Sum_stars\r\n" + "From Movie,Rating\r\n"
				+ "WHERE Movie.MovieId = Rating.Movie_Rating_ID \r\n" + "GROUP BY   Movie.Title\r\n"
				+ "HAVING  SUM(Stars)=		  \r\n" + " ( SELECT MAX(SUM_stars) \r\n" + "   FROM \r\n"
				+ "     ( SELECT Movie_Rating_ID, Sum(stars) AS Sum_stars\r\n" + "       FROM Rating\r\n"
				+ "       GROUP BY Movie_Rating_ID\r\n" + "     ) T\r\n" + ")";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		List<Movie> listMovie = new ArrayList<>();
		while (resultSet.next()) {
			Movie movie = new Movie();

			movie.setTitle(resultSet.getString(1));

			listMovie.add(movie);
		}
		return listMovie;
	}

	 /*
	  * Q3
	  * */
	public List<Movie> findAvg() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "SELECT Movie.Title, Movie.MovieYear , AVG(Rating.Stars) AS AVG_Stars\r\n"
				+ "		FROM Rating,Movie \r\n"
				+ "		WHERE Movie.MovieId = Rating.Movie_Rating_ID AND Movie.MovieYear < 2000\r\n"
				+ "		GROUP BY Movie.Title ,Movie.MovieYear		\r\n" + "		UNION\r\n"
				+ "		SELECT Movie.Title, Movie.MovieYear , AVG(Rating.Stars) AS AVG_Stars\r\n"
				+ "		FROM Rating,Movie \r\n"
				+ "		WHERE Movie.MovieId = Rating.Movie_Rating_ID AND Movie.MovieYear > 2000\r\n"
				+ "		GROUP BY Movie.Title ,Movie.MovieYear	";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		List<Integer> avgStar = new ArrayList();
		List<Movie> listMovie = new ArrayList<>();
		while (resultSet.next()) {
			Movie movie = new Movie();

			movie.setTitle(resultSet.getString(1));
			movie.setMovieYear(resultSet.getInt(2));
			int star = resultSet.getInt(3);
			avgStar.add(star);
			listMovie.add(movie);
		}

		for (int i = 0; i < avgStar.size(); i++) {
			System.out.println("Title: " + listMovie.get(i).getTitle() + ", " + " Year: "
					+ listMovie.get(i).getMovieYear() + ", " + "AVG_Star: " + avgStar.get(i));
		}
		return listMovie;
	}
	

	/* 
	 * Q5
	 * */
	public List<Movie> findDirector() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "SELECT Movie.Director\r\n" + "FROM Movie\r\n" + "WHERE Movie.Director LIKE 'A%' 	OR 	 \r\n"
				+ "Movie.Director LIKE 'B%'  \r\n" + "OR Movie.Director LIKE 'C%'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		List<Movie> listMovie = new ArrayList<>();
		while (resultSet.next()) {
			Movie movie = new Movie();
			movie.setDirector(resultSet.getString(1));

			listMovie.add(movie);
		}
		return listMovie;
	}


	 /*
	  * Q8
	  * */
	public void updateMovie() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "UPDATE Movie_Rank\r\n" + "SET Movie_Rank.Ranking='hot' \r\n"
				+ "WHERE Movie_Rank.Ranking='normal' ";
		Statement statement = connection.createStatement();
		statement.executeUpdate(query);
		System.out.println("Update Successfull");
		DbUtils.closeConnection(connection);
		return;
	}

}
