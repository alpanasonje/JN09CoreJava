package com.tnsif.daytwentythree;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded successfully..");
		Connection cn;
		cn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Admin@123");
		System.out.println("Connection established successfully...");
		Statement st=cn.createStatement();
		int n;
		Scanner scan = new Scanner(System.in);
		int rno;
		String name;
		float per;
		do {
			System.out.println("Welcome to the Application.");
		
			
			System.out.println("""
					1. Insert the Record.
					2. Delete the Record.
					3. Retrive the Record.
					4. Update the Record.
					5. Exit.
					""");
			System.out.println("Enter Your Choice : ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter roll number  : ");
				rno=scan.nextInt();
				scan.nextLine();
				System.out.println("Enter the name : ");
				name=scan.nextLine();
				System.out.println("Enter the per : ");
				per=scan.nextFloat();
				n=st.executeUpdate("INSERT INTO student VALUES("+rno+",'"+name+"',"+per+")");
				System.out.println(n+" rows inserted..");
				break;
			case 2:
				System.out.println("Enter the per to delete records");
				per=scan.nextFloat();
				n=st.executeUpdate("DELETE FROM student WHERE per<="+per);
				System.out.println(n+" rows deleted..");
				
				
				break;
			case 3:
				
				ResultSet rs;
				rs=st.executeQuery("SELECT * FROM student");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
				}
				
				System.out.println("-----------------------------");
				
				break;
			case 4:
				System.out.println("Enter the rollno  ");
				rno=scan.nextInt();
				System.out.println("Enter the new percentage ");
				per=scan.nextFloat();
				n=st.executeUpdate("UPDATE student SET per="+per+" WHERE rno="+rno);
				System.out.println(n+" rows updated..");
				break;
			case 5:
				System.out.println("You have exited from the System.");
				cn.close();
				System.exit(0);
				break;
			default:
				System.out.println("You have Entered Wrong Choice.");
			}
		}while(true);
	}

}
