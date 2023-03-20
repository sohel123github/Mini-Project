package com.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;


public class StudentDetail {
	public static void fetchRecords(int Id) {
		try {
			Connection connection=CommonConnection.getConnection();
			PreparedStatement stmt=connection.prepareStatement("select * from student where studId=?");
			stmt.setInt(1, Id);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println("studId:"+rs.getInt(1));
				System.out.println("studName:"+rs.getString(2));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter Id:");
		int Id=sc.nextInt();
		fetchRecords(Id);
	}

}
