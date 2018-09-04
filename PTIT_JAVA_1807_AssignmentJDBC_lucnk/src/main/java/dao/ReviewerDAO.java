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

import entities.Reviewer;
import utils.DbUtils;

public class ReviewerDAO {
	public boolean createReviwer(Reviewer reviewer) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = new DbUtils().getConnection();
		String query = "INSERT INTO Users VALUES(?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1, reviewer.getReviewerName());

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

	public List<Reviewer> retrieveReviwer() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "Select * from Reviewer";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		List<Reviewer> listReviwer = new ArrayList<>();
		while (resultSet.next()) {
			Reviewer reviewer = new Reviewer();
			reviewer.setReviewerID(resultSet.getInt(1));
			reviewer.setReviewerName(resultSet.getString(2));

			listReviwer.add(reviewer);
		}
		return listReviwer;
	}

	public List<Reviewer> findReviwer() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "SELECT Reviewer.ReviewerName\r\n" + "FROM Reviewer, Rating\r\n"
				+ "WHERE Reviewer.ReviewerId = Rating.Reviewer_Rating_ID\r\n" + "GROUP BY Reviewer.ReviewerName\r\n"
				+ "HAVING COUNT(Rating.Reviewer_Rating_ID) >= 3";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		List<Reviewer> listReviwer = new ArrayList<>();
		while (resultSet.next()) {
			Reviewer reviewer = new Reviewer();
			reviewer.setReviewerName(resultSet.getString(1));

			listReviwer.add(reviewer);
		}
		return listReviwer;
	}

	/*
	 * Q7
	 * */
	public void deleteReviwer() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "DELETE FROM  Review\r\n" + "WHERE Review.ReviewerName LIKE 'John%'";
		Statement statement = connection.createStatement();
		statement.executeUpdate(query);
		System.out.println("Delete Success");
		DbUtils.closeConnection(connection);
		return;
	}

}
