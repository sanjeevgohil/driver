import java.sql.*;
import java.io.*;
class A1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection cn = DriverManager.getConnection("jdbc:ucanaccess://F:/SY21/Database1.accdb");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from stud");
			while(rs.next())
			{
				System.out.println(" ID : "+rs.getInt(1));
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