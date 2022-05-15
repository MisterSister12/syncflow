package spielwiese;

import java.util.Random;

public class Mathfuntions {
	public  void random(int Iletarale) {
		Random rand=new Random();
		int[]samlung=new int[Iletarale];
		
		int Laufzeit=0;
		for( int j=0;j!=Iletarale;j++) {
		int i=rand.nextInt(10);
		int b;
		System.out.println("This is i: "+i);
		do {
			b=rand.nextInt(10);
			System.out.println("b ist kein treffer da b: "+b);
			Laufzeit++;
		}while(i!=b);
		samlung[j]=Laufzeit;
		
		
		}
		double av_Laufzeit;
		System.out.println("Fertig: \n"+av_Laufzeit );
		
	}
	public static void main(String[]args) {
		Mathfuntions a=new Mathfuntions();
		a.random(2);
		
		
		
	}
}
