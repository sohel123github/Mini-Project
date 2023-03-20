package com.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Questions {
	Scanner scanner=new Scanner(System.in);
	public void getQuestion()
	{
		try 
		{
			Connection connection=CommonConnection.getConnection();
			
			String query1="select * from question";
			
			PreparedStatement ps=connection.prepareStatement(query1);
			ResultSet rs=ps.executeQuery();               
			//ps=con.prepareStatement("insert into student(result)values(?)");
			
			//ResultSet rs=ps.executeQuery();
						
			while(rs.next())
			{
				int questionid=rs.getInt("QuestionId");
				String Question=rs.getString("Question");
				String a=rs.getString("a");
				String b=rs.getString("b");
				String c=rs.getString("c");
			    String d=rs.getString("d");
			    System.out.println("  ");
			    
			    System.out.println(questionid +"."+Question);
			    
			    System.out.println("    ");
			    
			    System.out.println(" a)"+a);
			    System.out.println(" b)"+b);
			    System.out.println(" c)"+c);
			    System.out.println(" d)"+d);
			    
			    System.out.println("Enter your answer>>");
			    String answer=scanner.nextLine();
			    int result=0;
			    if(answer.equals(a))
			    {
			    	System.out.println("Answer is correct..");
			        result++;
			        break;
			    }
			    else if(answer.equals(b))
			    {
		            System.out.println("Answer is correct");
                    result++;
                    break;
			    }
			    else if(answer.equals(c))
			    {
			    	System.out.println("Answer is correct");
                    result++;
                    break;
			    }
			    else if(answer.equals(d))
			    {
			    	System.out.println("Answer is correct");
                    result++;
                    break;
			    }
			    else
			    {
			    	System.out.println("Answer is incorrect");
			    }
			    System.out.println("your result is:"+result);
			}
		} 

		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
