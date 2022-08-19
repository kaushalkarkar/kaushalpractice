package com.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.model.employ;
import com.jdbc.util.QueryUtil;
import com.jdbc.util.databaseutil;

public class databaseservice {

	databaseutil databaseUtill = new databaseutil();
	
	public void insertEmployee(employ employee) throws SQLException
	{
	    
		try(Connection connection = databaseUtill.getConnection(); 
				
				
				PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.insertemployeeQuery());)
		{
		
		
	 
		preparedStatement.setString(1, employee.getEmployeeName());
		preparedStatement.setString(2, employee.getEmployeeAddress());
		preparedStatement.setDouble(3, employee.getEmployeeSalary());
		
		int row =preparedStatement.executeUpdate();
		if(row>0)
		{
			System.out.println("success");
		}else
			System.out.println("failed");
	}
	    
	}
	

 public void getAllEmployees() throws SQLException
 {
	
	try(Connection connection = databaseUtill.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QueryUtil.selectAllEmployeeQuery());
			){
		while(resultSet.next())
		{
			
			printemploy(new employ(
					resultSet.getInt("EMPLOYEE_ID"),
					resultSet.getString("EMPLOYEE_NAME"),
					resultSet.getString("EMPLOYEE_ADDRESS"),
					resultSet.getDouble("EMPLOYEE_SALARY")
					));
		}
 }
	}

private static void printemploy(employ employee)
{
	System.out.println("Employee id: "+employee.getEmployeeId());
	System.out.println("Employee name:"+employee.getEmployeeName());
	System.out.println("Employee address:"+employee.getEmployeeAddress());
	System.out.println("Employee salary:"+employee.getEmployeeSalary());
	System.out.println("____________________________________________________");
}
 
public  boolean getEmployeeById(int id) throws SQLException
{
	try(Connection connection = databaseutil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QueryUtil.selectEmployeeById(id));
			){
		if(resultSet.next())
		{
			printemploy(new employ(
					resultSet.getInt("EMPLOYEE_ID"),
					resultSet.getString("EMPLOYEE_NAME"),
					resultSet.getString("EMPLOYEE_ADDRESS"),
					resultSet.getDouble("EMPLOYEE_SALARY")
					));
		}else {
			System.out.println("record not found");
		}
	}
			
			

}



public void deleteEmployeeBuId(Object object) throws SQLException
{
	try( Connection connection =  databaseutil.getConnection();
			Statement statement = connection.createStatement();)
	{
	    int row = statement.executeUpdate(QueryUtil.deleteEmployeeById(object));
	    
	    if(row>0)
	    {
	    	System.out.println("record deleted");
	    }else {
	    	System.out.println("wrong");
	    }
	}
}


public void updateEmployee(Object employeeById)throws SQLException
{
	try(Connection connection = databaseUtill.getConnection();
		PreparedStatement	preparStatement = connection.prepareStatement(QueryUtil.updateEmployeeId(employ.getEmployeeId())))
{	
	Object employee;
	preparStatement.setString(1, employ.getEmployeeName());
	preparStatement.setString(2, employ.getEmployeeAddress());
	preparStatement.setDouble(3, employ.getEmployeeSalary());
	 int rows = preparStatement.executeUpdate();
	 if(rows > 0)
	 {
		 System.out.println("success");
	 }
	 else
	 {
		 System.out.println("fauil");
	 }
	}
	
}



}





 
 
 
 
 
 
 