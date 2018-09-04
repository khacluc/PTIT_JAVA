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

import entities.Rating;
import utils.DbUtils;

public class RatingDAO {
	public boolean createRating(Rating rating) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = new DbUtils().getConnection();
		String query = "INSERT INTO Users VALUES(?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, rating.getReviewerRatingID());
		preparedStatement.setInt(2, rating.getMovieRatingID());
		preparedStatement.setInt(3, rating.getStars());
		preparedStatement.setInt(4, rating.getRatingDate());

		try {
			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				return true;
			}

			return false;
		} finally {
			DbUtils.closeConnection(connection);
		}
	}

	public List<Rating> retrieveRating() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "Select * from Rating";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		List<Rating> listRating = new ArrayList<>();
		while (resultSet.next()) {
			Rating rating = new Rating();
			
			rating.setReviewerRatingID(resultSet.getInt(1));
			rating.setMovieRatingID(resultSet.getInt(2));
			rating.setStars(resultSet.getInt(3));
			rating.setRatingDate(resultSet.getInt(4));

			listRating.add(rating);
		}
		return listRating;
	}

}
