package datenbank;
import java.sql.*;
import javax.swing.JOptionPane;

public class sumatra_test {

public static void main(String[] args)
	{
		
		Eingabefenster();
		
	}
	
	
	public static void Eingabefenster()
    {
		String url = "jdbc:mysql://localhost:3306/sumatra_restaurant?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Berlin";
	    String user = "root";
	    String pass = "!20Mysql03!*";
	    //bei xammp ohne Passwort bei MySQL das entsprechende Passwort
       
	    String[] obj={"Mitarbeiter","Kunden","Lieferungen","Rezepte","Zutaten","Rezepte_Zutaten","Bestellungen"}; 
        
        Object antwort = JOptionPane.showInputDialog(null, "Eingabemöglichkeiten", "Eingabefenster",
                JOptionPane.INFORMATION_MESSAGE, null, obj,"Kunden");
        
        
        
        if (antwort.equals("Mitarbeiter")) 
	        {
	        	String MA_Vorname=JOptionPane.showInputDialog("Vorname max 25 Zeichen",JOptionPane.OK_CANCEL_OPTION);
	            String MA_nachnahme=JOptionPane.showInputDialog("Nachname max 35 Zeichen",JOptionPane.OK_CANCEL_OPTION);
	            String MA_Rang=JOptionPane.showInputDialog("Rang des Mitarbeiter von 1 bis 10",JOptionPane.OK_CANCEL_OPTION);
	            int MA_Rangint = Integer.parseInt(MA_Rang);
	            try (Connection conn = DriverManager.getConnection(url, user, pass))
	        	{
	        		System.out.println("Erfolgreich mit Datenbank verbunden.");
	    	    	System.out.println("Inserting records into the table..."); 
	    	    	PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `Mitabeiter`(MA_Vorname,MA_nachnahme,MA_Rang) VALUES (?, ?, ?)");
	        		pstmt.setString(1,MA_Vorname);
	        		pstmt.setString(2,MA_nachnahme);
	        		pstmt.setInt(3,MA_Rangint);
	    	    	pstmt.executeUpdate();
	    	    	information_succsess();	        	
	        	}
	        		catch(SQLException ex)
	        			{
	        				System.err.println(ex.getMessage());
	        			}
	        }
        else if (antwort.equals("Kunden")) 
	        {            
        		
        		String K_Vorname=JOptionPane.showInputDialog("Vorname max 25 Zeichen",JOptionPane.OK_CANCEL_OPTION);
	            String K_Nachname=JOptionPane.showInputDialog("Nachname max 35 Zeichen",JOptionPane.OK_CANCEL_OPTION);
	            String K_Handynummer=JOptionPane.showInputDialog("Handynummer nur ganzzahlig",JOptionPane.OK_CANCEL_OPTION);
	            int K_Handynummerint = Integer.parseInt(K_Handynummer);
	            String xG_Nachweis=JOptionPane.showInputDialog("xG_Nachweis ja oder nein",JOptionPane.OK_CANCEL_OPTION);
	            try (Connection conn = DriverManager.getConnection(url, user, pass))
	        	{
	            	System.out.println("Erfolgreich mit Datenbank verbunden.");
	    	    	System.out.println("Inserting records into the table..."); 
	    	    	PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `kunden`(K_Vorname,K_Nachname,K_Handynummer,xG_Nachweis) VALUES (?, ?, ?, ?)");
	        		pstmt.setString(1,K_Vorname);
	        		pstmt.setString(2,K_Nachname);
	        		pstmt.setInt(3,K_Handynummerint);
	        		pstmt.setString(4,xG_Nachweis);
	    	    	pstmt.executeUpdate();
	    	    	information_succsess();	        	
	        	}
	        		catch(SQLException ex)
	        			{
	        				System.err.println(ex.getMessage());
	        			}
	        } 
        else if (antwort.equals("Lieferungen")) 
	        {
	        	java.util.Date javaDate = new java.util.Date();
	        	long javaTime = javaDate.getTime();
	        	java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(javaTime);
	        	
        		String Lieferant=JOptionPane.showInputDialog("Lieferant max 50 Zeichen",JOptionPane.OK_CANCEL_OPTION);
	            String Produkt=JOptionPane.showInputDialog("Produkt max 35 Zeichen",JOptionPane.OK_CANCEL_OPTION);
	            String Menge=JOptionPane.showInputDialog("Menge Ganzzahl.Kommaanteil kein ',' sonden '.'",JOptionPane.OK_CANCEL_OPTION);
	            double Mengedouble = Double.parseDouble(Menge);
	            System.out.println(Mengedouble*2);
	            try (Connection conn = DriverManager.getConnection(url, user, pass))
	        	{
	        		System.out.println("Erfolgreich mit Datenbank verbunden.");
	    	    	System.out.println("Inserting records into the table..."); 
	    	    	PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `Lieferung`(Lieferant,Liefereingang,Produkt,Menge) VALUES (?, ?, ?, ?)");
	        		pstmt.setString(1,Lieferant);
	        		pstmt.setTimestamp(2, sqlTimestamp);
	        		pstmt.setString(3,Produkt);
	        		pstmt.setDouble(4,Mengedouble);
	    	    	pstmt.executeUpdate();
	    	    	information_succsess();	        	
	        	}
	        		catch(SQLException ex)
	        			{
	        				System.err.println(ex.getMessage());
	        			}
	        } 
        else if (antwort.equals("Rezepte")) 
	        {
	        	String Rezeptname=JOptionPane.showInputDialog("Rezeptname max 35 Zeichen",JOptionPane.OK_CANCEL_OPTION);
	            String Zubereitung=JOptionPane.showInputDialog("Anmerkung zur Zubereitung",JOptionPane.OK_CANCEL_OPTION);
	            String Preis=JOptionPane.showInputDialog("Preis in € Ganzzahl.Kommaanteil kein ',' sonden '.'",JOptionPane.OK_CANCEL_OPTION);
	            try (Connection conn = DriverManager.getConnection(url, user, pass))
	        	{
	        		System.out.println("Erfolgreich mit Datenbank verbunden.");
	    	    	System.out.println("Inserting records into the table..."); 
	    	    	PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `Rezepte`(Rezeptname,Zubereitung,Preis) VALUES (?, ?, ?)");
	        		pstmt.setString(1,Rezeptname);
	        		pstmt.setString(2, Zubereitung);
	        		pstmt.setString(3,Preis);
	    	    	pstmt.executeUpdate();
	    	    	information_succsess();	        	
	        	}
	        		catch(SQLException ex)
	        			{
	        				System.err.println(ex.getMessage());
	        			}
	        }
        else if (antwort.equals("Zutaten")) 
	        {
	        	String Zutatenname=JOptionPane.showInputDialog("Zutatenname max 35 Zeichen",JOptionPane.OK_CANCEL_OPTION);
	        	try (Connection conn = DriverManager.getConnection(url, user, pass))
	        	{
	        		System.out.println("Erfolgreich mit Datenbank verbunden.");
	    	    	System.out.println("Inserting records into the table..."); 
	    	    	PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `Zutaten`(Zutat_Name) VALUES (?)");
	        		pstmt.setString(1,Zutatenname);
	    	    	pstmt.executeUpdate();
	    	    	information_succsess();	        	
	        	}
	        		catch(SQLException ex)
	        			{
	        				System.err.println(ex.getMessage());
	        			}
	        }
        else if (antwort.equals("Rezepte_Zutaten"))
	        {
	        	String RezeptID=JOptionPane.showInputDialog("RezeptID des geünschten Rezepts",JOptionPane.OK_CANCEL_OPTION);
	        	int RezeptIDint=Integer.parseInt(RezeptID);
	            String ZutatID=JOptionPane.showInputDialog("ZutatID der geünschten Zutat",JOptionPane.OK_CANCEL_OPTION);
	            int ZutatIDint=Integer.parseInt(ZutatID);
	            String Menge=JOptionPane.showInputDialog("Menge Ganzzahl.Kommaanteil kein ',' sonden '.'",JOptionPane.OK_CANCEL_OPTION);
	            double Mengedouble = Double.parseDouble(Menge);
	            String Einheit=JOptionPane.showInputDialog("Metrische Einheiten wie kg, gr, ...",JOptionPane.OK_CANCEL_OPTION);
	            try (Connection conn = DriverManager.getConnection(url, user, pass))
	        	{
	        		System.out.println("Erfolgreich mit Datenbank verbunden.");
	    	    	System.out.println("Inserting records into the table..."); 
	    	    	PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `Rezepte_Zutaten`(RezeptID,ZutatID,Menge,Einheit) VALUES (?,?,?,?)");
	        		pstmt.setInt(1,RezeptIDint);
	        		pstmt.setInt(2,ZutatIDint);
	        		pstmt.setDouble(3,Mengedouble);
	        		pstmt.setString(4,Einheit);
	    	    	pstmt.executeUpdate();
	    	    	information_succsess();	        	
	        	}
	        		catch(SQLException ex)
	        			{
	        				System.err.println(ex.getMessage());
	        			}
	        }
        else if (antwort.equals("Bestellungen")) 
	        {
	        	java.util.Date javaDate = new java.util.Date();
	        	long javaTime = javaDate.getTime();
	        	java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(javaTime);
	        	
        		String Kundennummer=JOptionPane.showInputDialog("Kundennummer des zu bedienenden Kunden",JOptionPane.OK_CANCEL_OPTION);
	        	int Kundennummerint=Integer.parseInt(Kundennummer);
	            String RezeptID=JOptionPane.showInputDialog("RezeptID des geünschten Rezepts",JOptionPane.OK_CANCEL_OPTION);
	            int RezeptIDint=Integer.parseInt(RezeptID);
	            String MA_ID=JOptionPane.showInputDialog("MA_ID des bedienenden Mitarbeiter",JOptionPane.OK_CANCEL_OPTION);
	            int MA_IDint=Integer.parseInt(MA_ID);
	            String Menge=JOptionPane.showInputDialog("Menge Ganzzahl",JOptionPane.OK_CANCEL_OPTION);
	            int Mengeint = Integer.parseInt(Menge);
	            try (Connection conn = DriverManager.getConnection(url, user, pass))
	        	{
	        		System.out.println("Erfolgreich mit Datenbank verbunden.");
	    	    	System.out.println("Inserting records into the table..."); 
	    	    	PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `Bestellungen`(Kundennummer,RezeptID,MA_ID,Menge,Bestellurzeit) VALUES (?,?,?,?,?)");
	        		pstmt.setInt(1,Kundennummerint);
	        		pstmt.setInt(2,RezeptIDint);
	        		pstmt.setInt(3,MA_IDint);
	        		pstmt.setInt(4,Mengeint);
	        		pstmt.setTimestamp(5,sqlTimestamp);
	    	    	pstmt.executeUpdate();
	    	    	information_succsess();
	        	
	        	}
	        		catch(SQLException ex)
	        			{
	        				System.err.println(ex.getMessage());
	        			}
	        }
    }
	public static void information_succsess() {
		JOptionPane.showMessageDialog(null, "Die Daten wurden in die Datenbank eingetragen");
	}
	public static void information_fail() {
		JOptionPane.showMessageDialog(null, "Fehler keine Daten wurden gespeichert");
	}
}