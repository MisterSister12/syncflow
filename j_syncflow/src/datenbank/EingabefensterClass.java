package datenbank;
import javax.swing.JOptionPane;

public class EingabefensterClass 
{

    public static void main(String[] args) 
    {
        

        String[] obj={"Mitarbeiter","Kunden","Lieferungen","Rezepte","Zutaten","Rezepte_Zutaten","Bestellungen"}; 
        
        Object antwort = JOptionPane.showInputDialog(null, "Eingabemöglichkeiten", "Eingabefenster",
                JOptionPane.INFORMATION_MESSAGE, null, obj,"Kunden");
        
        
        if (antwort.equals("Mitarbeiter")) 
        {
        	String MA_Vorname=JOptionPane.showInputDialog("Vorname max 25 Zeichen",JOptionPane.OK_CANCEL_OPTION);
            String MA_nachnahme=JOptionPane.showInputDialog("Nachname max 35 Zeichen",JOptionPane.OK_CANCEL_OPTION);
            String MA_Rang=JOptionPane.showInputDialog("Rang des Mitarbeiter von 1 bis 10",JOptionPane.OK_CANCEL_OPTION);
            int MA_Rangint = Integer.parseInt(MA_Rang);
        }
        else if (antwort.equals("Kunden")) 
        {            
            String K_Vorname=JOptionPane.showInputDialog("Vorname max 25 Zeichen",JOptionPane.OK_CANCEL_OPTION);
            String K_Nachname=JOptionPane.showInputDialog("Nachname max 35 Zeichen",JOptionPane.OK_CANCEL_OPTION);
            String K_Handynummer=JOptionPane.showInputDialog("Handynummer nur ganzzahlig",JOptionPane.OK_CANCEL_OPTION);
            int Handynummerint = Integer.parseInt(K_Handynummer);
            String xG_Nachweis=JOptionPane.showInputDialog("ja oder nein",JOptionPane.OK_CANCEL_OPTION);
        } 
        else if (antwort.equals("Lieferungen")) 
        {
        	String Lieferant=JOptionPane.showInputDialog("Lieferant max 50 Zeichen",JOptionPane.OK_CANCEL_OPTION);
            String Datetime=JOptionPane.showInputDialog("Tag und Uhrzeit",JOptionPane.OK_CANCEL_OPTION);
            String Produkt=JOptionPane.showInputDialog("Produkt max 35 Zeichen",JOptionPane.OK_CANCEL_OPTION);
            String Menge=JOptionPane.showInputDialog("Menge Ganzzahl.Kommaanteil kein ',' sonden '.'",JOptionPane.OK_CANCEL_OPTION);
            double Mengedouble = Double.parseDouble(Menge);
            System.out.println(Mengedouble*2);
        } 
        else if (antwort.equals("Rezepte")) 
        {
        	String Rezeptname=JOptionPane.showInputDialog("Rezeptname max 35 Zeichen",JOptionPane.OK_CANCEL_OPTION);
            String Zubereitung=JOptionPane.showInputDialog("Tag und Uhrzeit",JOptionPane.OK_CANCEL_OPTION);
            String Preis=JOptionPane.showInputDialog("Preis Ganzzahl.Kommaanteil kein ',' sonden '.'",JOptionPane.OK_CANCEL_OPTION);
            double Mengedouble = Double.parseDouble(Preis);
        }
        else if (antwort.equals("Zutaten")) 
        {
        	String Zutatenname=JOptionPane.showInputDialog("Zutatenname max 35 Zeichen",JOptionPane.OK_CANCEL_OPTION);
        }
        else if (antwort.equals("Rezepte_Zutaten")) 
        {
        	String RezeptID=JOptionPane.showInputDialog("RezeptID des geünschten Rezepts",JOptionPane.OK_CANCEL_OPTION);
            String ZutatID=JOptionPane.showInputDialog("ZutatID der geünschten Zutat",JOptionPane.OK_CANCEL_OPTION);
            String Menge=JOptionPane.showInputDialog("Menge Ganzzahl.Kommaanteil kein ',' sonden '.'",JOptionPane.OK_CANCEL_OPTION);
            double Mengedouble = Double.parseDouble(Menge);
            String Einheit=JOptionPane.showInputDialog("Metrische Einheiten wie kg, gr, ...",JOptionPane.OK_CANCEL_OPTION);
        }
        else if (antwort.equals("Bestellungen")) 
        {
        	String Kundennummer=JOptionPane.showInputDialog("Kundennummer des zu bedienenden Kunden",JOptionPane.OK_CANCEL_OPTION);
            String RezeptID=JOptionPane.showInputDialog("RezeptID des geünschten Rezepts",JOptionPane.OK_CANCEL_OPTION);
            String MA_ID=JOptionPane.showInputDialog("MA_ID des bedienenden Mitarbeiter",JOptionPane.OK_CANCEL_OPTION);
            String Menge=JOptionPane.showInputDialog("Menge Ganzzahl",JOptionPane.OK_CANCEL_OPTION);
            int Mengeint = Integer.parseInt(Menge);
            String Bestellurzeit=JOptionPane.showInputDialog("Tag und Uhrzeit",JOptionPane.OK_CANCEL_OPTION);
        }
    }
}