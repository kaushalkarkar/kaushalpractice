package com.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class databaseutil {
  
	private static final String DRIVER_PATH="com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/jdbckk";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	public databaseutil()
	{
		try{
		Class.forName(DRIVER_PATH);
		}
		catch (Exception e)
		{
			throw new RuntimeException("somtinh wronge"+ e);
		}
	}
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	}
}
