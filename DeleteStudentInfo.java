package com.studentinfo.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudentInfo {
	
	public void delete() throws SQLException {
	
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");	
	PreparedStatement preparedStatement=connection.prepareStatement("delete from student where RollNo=?");
	Scanner scanner=new Scanner(System.in);
	System.out.print("How many Student information you want to delete : ");
	
	int noOfStudent=scanner.nextInt();
	
	
	for (int i = 0; i < noOfStudent; i++) {
		
		System.out.println("Please Enter following Information !!");
		System.out.print("Enter Student RollNo :");
		int RollNo=scanner.nextInt();
		
		preparedStatement.setInt(1,RollNo);
		System.out.println(noOfStudent+" Student(s) information is delete succesfully !!");
		
	}
	scanner.close();
	}
	
	

}
