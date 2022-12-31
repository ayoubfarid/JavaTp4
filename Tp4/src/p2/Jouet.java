package p2;

public class Jouet {
	private int nombre;
	//public static int autoNbr;
	public Jouet(int nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;		
	}
	/*
	void tuEsVerifiePar(VerificateurJouet v1){
		System.out.println(" \t"+v1.getNom()+" commance jouet "+nombre);
		int min=0;
		int max=1000;
		int b=(int)(Math.random()*(max-min+1)+min);
		//int b = (int)(Math.random()*(max-min+1)+min);  
		try {
			Thread.sleep(b);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" \t"+v1.getNom()+" fini jouet "+nombre);
		
	}*/
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}


}
