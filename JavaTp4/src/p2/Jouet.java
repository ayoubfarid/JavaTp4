package p2;

import java.util.Random;

public class Jouet {
	private int nombre;
	//public static int autoNbr;
	public Jouet(int nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;	
	}
	
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	   public synchronized void tuEsVerifiePar(VerificateurJouet1 v1){
		
		 System.out.println(" \t"+v1.getNom()+" commance jouet "+nombre);
		 try {
				Thread.sleep((new Random()).nextInt(1001));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 System.out.println(" \t"+v1.getNom()+" fini jouet "+nombre);
			
			
			
			
		}


}
