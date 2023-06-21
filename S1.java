import java.sql.*;
import java.io.*;
class S1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url ="jdbc:sqlserver://LACTUREROOM;databaseName=ty22;integratedSecurity=true";
			Connection cn = DriverManager.getConnection(url);


			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from stud");
			while(rs.next())
			{
				System.out.print(" ID : "+rs.getInt(1));
				System.out.print(" Name : "+rs.getString(2));
				System.out.print(" City : "+rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
	}
}