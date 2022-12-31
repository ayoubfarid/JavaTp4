
package p2;

import java.util.ArrayList;
import java.util.List;


public class Simulation1 {
	//private int autoNbr;
	public static List<Jouet> lesJouets=new ArrayList<>();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 11 ;i++) 
				lesJouets.add(new Jouet(i));
		
		VerificateurJouet1 v1=new VerificateurJouet1("Ahmed");
		VerificateurJouet1 v2=new VerificateurJouet1("Amine");
		Thread t1=new Thread(v1);
		Thread t2=new Thread(v2);
		t1.start();
		t2.start();
		
		

	}

}
