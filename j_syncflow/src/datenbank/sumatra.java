package datenbank;
import java.sql.*;

public class sumatra
{
	

	public static void main(String[] args)
	{
		
		connection();
		
	}
	public static void connection() 
	{
		
	String url = "jdbc:mysql://localhost:3306/sumatra_restaurant?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Berlin";
    String user = "root";
    String pass = "!20Mysql03!*";

    	try (Connection conn = DriverManager.getConnection(url, user, pass))
    	{
    		Statement stmt = conn.createStatement();
	    	System.out.println("Erfolgreich mit Datenbank verbunden.");
	    	System.out.println("Inserting records into the table...");          
	        String sql = "INSERT INTO kunden (K_Vorname,K_Nachname,K_Handynummer,xG_Nachweis) VALUES ('david', 'second', 651651651 , 'ja')";
	        stmt.executeUpdate(sql);
	        System.out.println("Done");
    	
    	}
    		catch(SQLException ex)
    			{
    				System.err.println(ex.getMessage());
    			}
	}
}
