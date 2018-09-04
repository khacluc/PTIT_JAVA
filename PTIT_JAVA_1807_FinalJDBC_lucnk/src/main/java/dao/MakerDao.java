/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 27, 2018.
	* @version 1.0
	*/
package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Maker;
import utils.DbUtils;

public class MakerDao {
	/**
	 * This is method to create a Maker
	 * 
	 * @param maker
	 * @return boolean
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws SQLException
	 */
	public static boolean create(Maker maker) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = DbUtils.getConnection();
		String query = "INSERT INTO FinalJDBC.Maker VALUES(?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1, maker.getMakerName());
		preparedStatement.setString(2, maker.getCountry());

		try {
			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				return true;
			}
		} finally {
			DbUtils.closeConnection(connection);
		}
		return false;
	}
	
	/**
	 * This is method to retrieve a list of Maker with where correct
	 * 
	 * @param where
	 * @return List<Maker>
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws SQLException
	 */
	public static List<Maker> retrieve(String where) throws ClassNotFoundException, IOException, SQLException {
		List<Maker> liMaker = new ArrayList<Maker>();
		if (where == null) {
			return liMaker;
		}
		Connection connection = DbUtils.getConnection();
		String query = "SELECT * FROM FinalJDBC.Maker " + where;
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();
		Maker maker = null;
		try {
			while (resultSet.next()) {
				maker = new Maker(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
				liMaker.add(maker);
			}
		} finally {
			DbUtils.closeConnection(connection);
		}
		return liMaker;
	}
	/**
	 * This is method to update a Maker to set with where correct
	 * 
	 * @param set
	 * @param where
	 * @return boolean
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws SQLException
	 */
	public static boolean update(String set, String where) throws ClassNotFoundException, IOException, SQLException {
		if (set == null && where == null) {
			return true;
		}
		Connection connection = DbUtils.getConnection();
		String query = "UPDATE FinalJDBC.Maker " + set + where;
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		try {
			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				return true;
			}
		} finally {
			DbUtils.closeConnection(connection);
		}
		return false;
	}
	/**
	 * This is method to delete Maker with where correct
	 * 
	 * @param where
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static boolean delete(String where) throws ClassNotFoundException, IOException, SQLException {
		if (where == null) {
			return false;
		}

		Connection connection = DbUtils.getConnection();
		String query;

		if ("".equals(where)) {
			System.out.print("Are you sure to delete all data about Maker (Press Y to continue): ");
			Scanner sc = new Scanner(System.in);
			String i;
			try {
				i = sc.nextLine();
			} finally {
				sc.close();
			}
			if ("Y".equals(i)) {
				query = "TRUNCATE TABLE FinalJDBC.Maker";
			} else {
				return true;
			}
		} else {
			query = "DELETE FROM FinalJDBC.Maker " + where;
		}
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		try {
			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				return true;
			}
		} finally {
			DbUtils.closeConnection(connection);
		}
		return false;
	}
	

}
