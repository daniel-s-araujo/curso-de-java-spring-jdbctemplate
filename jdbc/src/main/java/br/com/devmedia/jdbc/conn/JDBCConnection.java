package br.com.devmedia.jdbc.conn;

import java.sql.Connection;

public class JDBCConnection {

	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jdbcdb";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "root";
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	public static Connection getConnection() {
		return null;
	}
}
