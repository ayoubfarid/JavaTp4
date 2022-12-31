
package p2;

import java.util.ArrayList;
import java.util.List;

import p3.Jouet2;


public class Simulation1 {
	//private int autoNbr;
	public static Jouet[] lesJouets=new Jouet[10];
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10 ;i++) 
			lesJouets[i]=new Jouet(i+1);
		
		VerificateurJouet1 v1=new VerificateurJouet1("Ahmed");
		VerificateurJouet1 v2=new VerificateurJouet1("Amine");
		Thread t1=new Thread(v1);
		Thread t2=new Thread(v2);
		t1.start();
		t2.start();
		
		

	}

}
