package p3;

import java.util.Random;

public class Jouet2 {
	private final int nombre;
	//public static int autoNbr;
	private boolean dejaVerifier;
	public Jouet2(int nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		dejaVerifier=false;
	}
	
	public int getNombre() {
		return nombre;
	}
	
	public synchronized void tuEsVerifiePar(VerificateurJouet2 v1){
		   
		
		if(dejaVerifier) return;
		
		dejaVerifier=true;
		System.out.println(" \t"+v1.getNom()+" commance jouet "+nombre);
		 Random r=new Random();
		try {Thread.sleep(r.nextLong(0,1001));} catch (InterruptedException e) {}
		 
		 System.out.println(" \t"+v1.getNom()+" fini jouet "+nombre);
			
			
			
			
		}


}
