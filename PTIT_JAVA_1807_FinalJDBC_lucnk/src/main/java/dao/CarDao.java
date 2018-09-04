/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 31, 2018.
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

import entities.Car;
import utils.DbUtils;

public class CarDao {
	/**
	 * This is method to create a Maker
	 * 
	 * @param car
	 * @return boolean
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws SQLException
	 */
	public static boolean create(Car car) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = DbUtils.getConnection();
		String query = "INSERT INTO FinalJDBC.Maker VALUES(?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1, car.getCarModel());
		preparedStatement.setInt(2, car.getModelYear());
		preparedStatement.setString(3, car.getPrice());
		preparedStatement.setString(4, car.getMileage());

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
	public static List<Car> retrieve(String where) throws ClassNotFoundException, IOException, SQLException {
		List<Car> liCar = new ArrayList<Car>();
		if (where == null) {
			return liCar;
		}
		Connection connection = DbUtils.getConnection();
		String query = "SELECT * FROM FinalJDBC.Car " + where;
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();
		Car car = null;
		try {
			while (resultSet.next()) {
				car = new Car(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
				liCar.add(car);
			}
		} finally {
			DbUtils.closeConnection(connection);
		}
		return liCar;
	}

	/**
	 * This is method to update a Car to set with where correct
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
	 * This is method to delete Car with where correct
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
			System.out.print("Are you sure to delete all data about Car (Press Y to continue): ");
			Scanner sc = new Scanner(System.in);
			String i;
			try {
				i = sc.nextLine();
			} finally {
				sc.close();
			}
			if ("Y".equals(i)) {
				query = "TRUNCATE TABLE FinalJDBC.Car";
			} else {
				return true;
			}
		} else {
			query = "DELETE FROM FinalJDBC.Car " + where;
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


