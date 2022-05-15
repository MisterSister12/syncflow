//test26581
package school;

public class Auto2
{
	double kmStand;
    double tankInhalt;
    double tankVolumen;
    double durchschnittsVerbrauch;
    double verbrauch;
    double aussentemperaturInGrad;
    double motortemperaturInGrad;

    public void Auto_set(double kmStand, double tankVolumen, double durchschnittsVerbrauch, double aussentemperaturInGrad)
    {

       this.kmStand = kmStand;
       this.tankVolumen = tankVolumen;
       this.durchschnittsVerbrauch = durchschnittsVerbrauch;
       this.aussentemperaturInGrad=aussentemperaturInGrad;
       //Wir gehen davon aus, dass die Motortemperatur zu Beginn gleich der Außentemperatur ist!
       motortemperaturInGrad = aussentemperaturInGrad;
       //Wir gehen davon aus, dass der Wagen zu Beginn vollgetankt ist!
       tankInhalt=tankVolumen;

    }

    public void fahren(double km)
    {
        verbrauch = durchschnittsVerbrauch*km/100;

        if(tankInhalt>verbrauch)
        {
            kmStand+=km;
            tankInhalt = tankInhalt - verbrauch;

                if(motortemperaturInGrad+km <=100)
                {
                    motortemperaturInGrad +=km;
                }
                else
                {
                    motortemperaturInGrad = 100;
                }

        }
        else
        {
          kmStand = kmStand + tankInhalt/durchschnittsVerbrauch*100;
          tankInhalt = 0;
        }
        //kmStand += km;
        //verbrauch = durchschnittsVerbrauch*km/100;
        //tankInhalt = tankInhalt - verbrauch;
    }
 
    public void tanken(double tankMenge)
    {
        if(tankMenge<=tankVolumen-tankInhalt)
        {
            tankInhalt = tankInhalt + tankMenge;

        }
        else if(tankMenge>tankVolumen-tankInhalt)
        {
            tankMenge=tankVolumen - tankInhalt;
            tankInhalt = tankVolumen;
        }

    }


    public void anzeigen()
    {
        System.out.printf("Kilometerstand = %10.2f\n", kmStand);
        System.out.printf("Sie verbrauchen im Schnitt :%10.2f\n", durchschnittsVerbrauch);
        System.out.printf("Ihr Verbrauch in Litern beträgt %10.2f\n", verbrauch);
        System.out.printf("Die Motortemperatur beträgt momentan %10.2f\n", motortemperaturInGrad);
        System.out.printf("Im Tank sind noch %10.2f\n", tankInhalt);
    }
    public static void main(String[]args)
    {
    	Auto2 porsche=new Auto2();
    	porsche.Auto_set(1,1,1,1);
    	Auto2 fahren=new Auto2();
    	fahren.fahren(1);
    	Auto2 tanken=new Auto2();
    	tanken.tanken(1);
    	Auto2 Daten=new Auto2();
    	Daten.anzeigen();

    }


}
