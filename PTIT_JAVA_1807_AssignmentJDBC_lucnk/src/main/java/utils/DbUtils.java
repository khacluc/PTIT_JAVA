/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Aug 1, 2018.
	* @version 1.0
	*/
package utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtils {
	static final String FILE_NAME = "/DBConfig.properties";

	public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(DbUtils.class.getResourceAsStream(FILE_NAME));
		String driver = properties.getProperty("driver");
		String server = properties.getProperty("server");
		String dbName = properties.getProperty("dbname");
		String user = properties.getProperty("user");
		String pass = properties.getProperty("pass");

		Class.forName(driver);
		return DriverManager.getConnection(server + ";databaseName=" + dbName, user, pass);

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		if (getConnection() != null) {
			System.out.println("Success");
		}
	}

	public static void closeConnection(Connection connection) throws SQLException {
		// TODO Auto-generated method stub

		if (connection != null) {
			connection.close();
		}
	}

}
