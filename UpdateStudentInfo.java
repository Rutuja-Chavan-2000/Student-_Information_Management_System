package com.studentinfo.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudentInfo {
	
    
	
	
	public void update() throws SQLException {
		
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");	
		PreparedStatement preparedStatement=connection.prepareStatement("update student set Name=?,marks=?,email=?,city=? where RollNo=?");
		Scanner scanner=new Scanner(System.in);
		System.out.print("How many Student information you want to Update : ");
		int noOfStudent=scanner.nextInt();
		
		
		for (int i = 0; i < noOfStudent; i++) {
			
			System.out.println("Please Enter following Information !!");
			System.out.print("Enter Student RollNo  :");
			int RollNo=scanner.nextInt();
			System.out.print("Enter Student Updated Name :");
			String Name=scanner.next();
			System.out.print("Enter Student Updated Marks :");
			int marks = scanner.nextInt();
			System.out.print("Enter Student Updated Email :");
			String email=scanner.next();
			System.out.print("Enter Student Updated City :");
			String city=scanner.next();
			
			
			preparedStatement.setString(1, Name);
			preparedStatement.setInt(2,marks);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, city);
			preparedStatement.setInt(5,RollNo);
			preparedStatement.executeUpdate();
			System.out.println(noOfStudent+" Student(s) information is updated succesfully !!");
			
		}	
		scanner.close();	
	}	
}
