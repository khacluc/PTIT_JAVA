/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 27, 2018.
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

	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		java.util.Properties properties = new Properties();
		properties.load(DbUtils.class.getResourceAsStream(FILE_NAME));
		String driver = properties.getProperty("driver");
		String server = properties.getProperty("server");
		String dbName = properties.getProperty("dbname");
		String user = properties.getProperty("user");
		String pass = properties.getProperty("pass");

		Class.forName(driver);
		return DriverManager.getConnection(server + ";databaseName = " + dbName, user, pass);
	}

	public static void closeConnection(Connection connection) throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}
	
}
