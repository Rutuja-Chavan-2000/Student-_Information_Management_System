package com.studentinfo.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStudentInfo {

	public void select() throws SQLException {
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");	
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from student");
		
		
		System.out.println();
		System.out.println("-----------------Student Table-------------------------------");
		System.out.println("RollNo"+"\t"+"Name"+"\t"+"Marks"+"\t"+"Email"+"\t"+"\t"+"\t"+"City");
		System.out.println("------------------------------------------------------------------------------------");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("RollNo")+"\t"+ resultSet.getString("name")+"\t"+resultSet.getInt("marks")+"\t"+resultSet.getString("email")+"\t"+"\t"+resultSet.getString("city"));
		}
	}

}
