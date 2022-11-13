
package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DatabaseUtility {

	/**
	 * @param args
	 */

	public static Connection provideConnection() {

		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/bluebus";

		try {
			connection = DriverManager.getConnection(url, "root", "Qaz@12345");

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return connection;

	}

	public static void main(String[] args) {

	}

}
