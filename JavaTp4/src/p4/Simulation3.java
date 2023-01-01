
package p4;
public class Simulation3 {
	public static Jouet3[] lesJouets=new Jouet3[10];
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10 ;i++) 
				lesJouets[i]=new Jouet3(i+1);
		
		VerificateurJouet3 v1=new VerificateurJouet3("Ahmed",1,Thread.MIN_PRIORITY);
		VerificateurJouet3 v2=new VerificateurJouet3("Amine",1,Thread.MIN_PRIORITY);
		VerificateurJouet3 v3=new VerificateurJouet3("Bachir",2,Thread.MAX_PRIORITY);
		
		v2.p1.start();
		v1.p1.start();
		v3.p1.start();

	}

}
