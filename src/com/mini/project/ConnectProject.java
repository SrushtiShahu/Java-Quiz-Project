package com.mini.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectProject {
	Connection connection = null;

	public Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://LocalHost: 3306/mcq", "root", "Justdoit@0405");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
