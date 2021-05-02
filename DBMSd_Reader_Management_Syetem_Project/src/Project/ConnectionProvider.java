package Project;
import java.sql.*;

public class ConnectionProvider {
	public static Connection getCon()
	{
		try {
			String url="jdbc:mysql://localhost:3306/reader";
			Class.forName("com.mysql.cj.jdbc.Driver"); //Mentioning the driver
			Connection con=DriverManager.getConnection(url, "root", "helloaadarsh");
			System.out.println("Connection successful.");
			return con;
		}catch(Exception e)
		{
			System.out.println("Connection failed: ");
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}
}
