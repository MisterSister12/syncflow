package spielwiese;

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
	        	ar[i][j][k]=r.nextInt(10);
	            	System.out.println(ar[i][j][k]+"werte");
			
				}
			}
		}
	}
		
	public static void main(String[]args) {
		Mathfuntions a=new Mathfuntions();
		int[][]samlung=new int[1][2];
		System.out.println(Integer.MAX_VALUE);
		
		
	}
}
