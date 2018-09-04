/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 27, 2018.
	* @version 1.0
	*/

package function;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Car;
import entities.Maker;
import utils.DbUtils;

public class Function {
	
	// Q1
	public static boolean insertCar(Car car) throws ClassNotFoundException, IOException, SQLException {
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
	
	// Q2
	public static void deleteMaker() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "DELETE FROM Make\r\n" + "WHERE Make.MakerName='Ford'";
		Statement statement = connection.createStatement();
		statement.executeUpdate(query);
		System.out.println("Delete Success");
		DbUtils.closeConnection(connection);
		return;
	}

	//Q3
	public static void updateCar() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "UPDATE Car_Maker\r\n" + "SET Car_Maker.Price = 0.05\r\n" + "WHERE Car_Maker.Mileage >100 ";
		Statement statement = connection.createStatement();
		statement.executeUpdate(query);
		System.out.println("Update Successfull");
		DbUtils.closeConnection(connection);
		return;
	}

	//Q4
	public static List<Maker> findMakerMaxPrice() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "SELECT Maker.MakerName,MAX(Car.Price) AS Max_price\r\n" + "FROM Maker,Car\r\n"
				+ "WHERE Maker.MakerID =Car.Car_MakerID \r\n" + "GROUP BY  Maker.MakerName \r\n" + "";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		List<Maker> listMaker1 = new ArrayList<>();
		while (resultSet.next()) {
			Maker maker1 = new Maker();
			maker1.setMakerName(resultSet.getString(1));

			listMaker1.add(maker1);
		}
		return listMaker1;
	}

	//Q5
	public static List<Car> findCar() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "SELECT Car.CarModel\r\n" + "FROM Maker, Car\r\n"
				+ "WHERE Maker.MakerID=Car_MakerID	 AND Maker.MakerName='Toyota' AND Car.ModelYear=2015\r\n"
				+ "GROUP BY  Car.CarModel";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		List<Car> listCar = new ArrayList<>();
		while (resultSet.next()) {
			Car car = new Car();

			car.setCarModel(resultSet.getString(1));

			listCar.add(car);
		}
		return listCar;
	}

	//Q6
	public static List<Maker> findMaker() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = DbUtils.getConnection();
		String query = "SELECT Maker.MakerName\r\n" + "FROM Maker\r\n" + "WHERE Maker.MakerID = ANY	(\r\n"
				+ "	SELECT Car.CarID\r\n" + "	FROM Car\r\n" + "	WHERE Car.ModelYear = 2015	)";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		List<Maker> listMaker = new ArrayList<>();
		while (resultSet.next()) {
			Maker maker = new Maker();

			maker.setMakerName(resultSet.getString(1));

			listMaker.add(maker);
		}
		return listMaker;
	}

}
