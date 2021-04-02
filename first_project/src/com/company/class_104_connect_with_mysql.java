package com.company;

/*
 * 1. import -- java.sql
 * 2. load and register the driver -- com.mysql.jdbc.Driver
 * 3. Create connection -- Object of connection interface
 * 4. Create a statement -- Object of statement interface
 * 5. Execute the query
 * 6. Process the result
 * 7. Close
 *  
 * */

import java.sql.*;

public class class_104_connect_with_mysql {
	public static void main(String[] args) throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/database3";
		String query="select * from info";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //Mentioning the driver
			Connection con=DriverManager.getConnection(url, "root", "helloaadarsh");
			
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery(query);
			
			while(rs.next()) {
				String name=rs.getString(1)+" : "+rs.getInt(2)+" : "+rs.getString(3)+" : "+rs.getString(4);
				System.out.println(name);
			}
			
			//Inserting into data
			String query2="insert into info values('Rohan',5,'Badminton','Indian')";
			int count=st.executeUpdate(query2);
			System.out.println(count+" row/s affected.");
			
				
			st.close();
			con.close(); 
		}catch(Exception e)
		{
			System.out.println("An error occured.");
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}
}
