package com.studentinfo.jdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {
	
	Connection connection;

	public static void main(String[] args) throws SQLException {

		System.out.println("******************  Student Information ************************ ");
		
		int no;
		do {
		System.out.println("Choose which operation you want to do:");
		System.out.println("1.Insert student information\n2.View Student inforamtion Table\n3.Delete student information\n4.Update Student information ");
		System.out.print(" Please Enter option number from 1,2,3,4  ===> : ");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
	
		switch(no) {
		case 1:
		       InsertStudentInfo is=new InsertStudentInfo();
		       is.insert();
		       break;
			
		case 2:
  			SelectStudentInfo si=new SelectStudentInfo();
			si.select();
		     break;
		     
		case 3:
			DeleteStudentInfo di=new DeleteStudentInfo();
			di.delete();
		     break;
		     
		case 4:
			UpdateStudentInfo ui=new UpdateStudentInfo();
			ui.update();
		     break;
		     
		default:
			System.out.println("Please select option from 1,2,3,4 only..!!!");
		     
		
		}
		System.out.println("Press 0 to stop , else select from 1,2,3,4");
		no=sc.nextInt();
		if(no==0) {
			System.out.println("Thank You :) !!!");
		}
		}while(no!=0);

	}

}

