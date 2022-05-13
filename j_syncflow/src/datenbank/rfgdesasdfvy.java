package datenbank;

import javax.swing.JOptionPane;

public class rfgdesasdfvy {
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
        
        JOptionPane.showInputDialog(null, "Eingabemöglichkeiten", "Eingabefenster",
                JOptionPane.INFORMATION_MESSAGE, null, obj,"Kunden");
        System.out.println(JOptionPane.INFORMATION_MESSAGE);
    }
}
        
        