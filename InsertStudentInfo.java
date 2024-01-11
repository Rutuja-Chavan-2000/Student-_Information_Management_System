package com.studentinfo.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudentInfo {
	
	public void insert() throws SQLException {
		
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");	
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student(RollNo,Name,marks,email,city) values(?,?,?,?,?)");
		Scanner scanner=new Scanner(System.in);
		System.out.print("How many Student information you want to add : ");
		int noOfStudent=scanner.nextInt();
		
		
		for (int i = 0; i < noOfStudent; i++) {
			
			System.out.println("Please Enter following Information !!");
			System.out.print("Enter Student RollNo :");
			int RollNo=scanner.nextInt();
			System.out.print("Enter Student Name :");
			String Name=scanner.next();
			System.out.print("Enter Student Marks :");
			int marks = scanner.nextInt();
			System.out.print("Enter Student Email :");
			String email=scanner.next();
			System.out.print("Enter Student City :");
			String city=scanner.next();
			
			preparedStatement.setInt(1,RollNo);
			preparedStatement.setString(2, Name);
			preparedStatement.setInt(3,marks);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, city);
			preparedStatement.executeUpdate();
			System.out.println(noOfStudent+" Student(s) information is added succesfully !!");
			
		}
		scanner.close();		
	}	
}
