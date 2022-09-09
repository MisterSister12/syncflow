package spielwiese;

import java.util.ArrayList;
import java.util.Random;

public class Mathfuntions {
	Random rand=new Random();
	int[][][] ar=new int[5][6][7];
	Random r=new Random();
	public  void random(int Iletarale,int datasets) {
		
		int[][]samlung=new int[datasets][Iletarale];
		
		
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
		
		
		
		}
	
		
		System.out.println("Fertig: \n" );
		
	}
	public void random_string(int Ileterale) {
		for(int i=0;i<=Ileterale;i++) {
			double RandomString=rand.nextGaussian();
			System.out.println(RandomString);
		}
		
		
	}
	public void array(){
		int i,j,k,l = 0;
		for(i=0;i<ar.length;i++){
		for(j=0;j<ar[i].length;j++){
		for(k=0;k<ar[i][j].length;k++){
			l++;
	        	ar[i][j][k]=r.nextInt();
	            	System.out.println(ar[i][j][k]+"werte");
			
				}
			}
		}
	}
	private int Randomintfromxtoy(int x,int y) {
		int a;
		a=rand.nextInt(x, y);
		return a;
	}
	public double t(int i) {
		
		double p=0;
		int j=0;
		do {
			p+=i;
			j++;
		}
		while(j<10000);
		p/=10000;
		return p;
	}
	private void prime_filler(int arraylenth) {
		ArrayList<Integer>Primenummbers=new ArrayList<Integer>();
		ArrayList<Integer>samplenummber=new ArrayList<Integer>();
		samplenummber.add(2);
		for() {
			
		}
		//samplenummber.remove(1);
		System.out.println(samplenummber);
	}
		
	public static void main(String[]args) {
		Mathfuntions a=new Mathfuntions();
		a.prime_filler(0);
		
		//System.out.println(String.CASE_INSENSITIVE_ORDER);
		//System.out.println("1   "+a.t(a.Randomintfromxtoy(1,9)));
		//System.out.println("1   "+a.Randomintfromxtoy(1,9)));
	}
}
