package org.guvi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App 
{
	 private static final String JDBC_URL = "jdbc:mysql://localhost:3307/database";
	 private static final String USERNAME = "testuser";
	 private static final String PASSWORD = "#####";
	 
    public static void main( String[] args )
    {
        try{
        	Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (Exception e) {
			System.out.println(e.getMessage());
		}
        
        try{
        	Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        	PreparedStatement stmt = conn.prepareStatement("insert into Employees(empname, empage, esalary) values(?,?,?)");
        	stmt.setString(1, "abhi");
        	stmt.setString(2, "25");
        	stmt.setString(3, "35000");
        	stmt.executeUpdate();
        	System.out.println("Data inserted successfully");
        }
        catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    }
}
