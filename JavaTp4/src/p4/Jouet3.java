package p4;

import java.util.Random;

public class Jouet3 {
	private final int nombre;
	// public static int autoNbr;
	private boolean dejaVerifier;

	public Jouet3(int nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		dejaVerifier = false;
	}

	public int getNombre() {
		return nombre;
	}

	public synchronized void tuEsVerifiePar(VerificateurJouet3 v1) {

		if (dejaVerifier && v1.getNiveaux()==1)
			return;
		try {
			while (!dejaVerifier && v1.getNiveaux() == 2)
				wait();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(" \t" + v1.getNom() + " commance jouet " + nombre);
	
		try {
			Thread.sleep(v1.getVitesse());
		} catch (InterruptedException e) {
		}

		System.out.println(" \t" + v1.getNom() + " fini jouet " + nombre);
		
		dejaVerifier = true;
		if(v1.getNiveaux()==1)
		notifyAll();
		
	}

}
