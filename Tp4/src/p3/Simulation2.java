
package p3;
public class Simulation2 {
	//private int autoNbr;
	public static Jouet2[] lesJouets=new Jouet2[10];
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10 ;i++) 
				lesJouets[i]=new Jouet2(i+1);
		
		VerificateurJouet2 v1=new VerificateurJouet2("Ahmed");
		VerificateurJouet2 v2=new VerificateurJouet2("Amine");
		
		
		v2.p1.start();
		v1.p1.start();
		

	}

}
