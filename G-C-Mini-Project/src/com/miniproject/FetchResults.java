package com.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchResults {
	public static void fetchResults(int ansId) {
		try {
			Connection connection=CommonConnection.getConnection();
			PreparedStatement stmt=connection.prepareStatement("Select * from answers where ansId=?");
			stmt.setInt(1, ansId);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println("ansId:"+rs.getInt(1) );
				System.out.println("answers:"+rs.getString(2));
			}
			}catch(Exception e) {
				System.out.println(e);
			}
		
	}
	public static void main(String[] args) {
		for(int i=1; i<=10;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter ansId:");
			int ansId=sc.nextInt();
			fetchResults(ansId);
		}
		
	}

}
