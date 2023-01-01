package p4;

public class VerificateurJouet3 implements Runnable{
	private String nom;
	private int niveaux;
	
	public Thread p1;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNiveaux() {
		return niveaux;
	}

	public void setNiveaux(int niveaux) {
		this.niveaux = niveaux;
	}

	public VerificateurJouet3(String nom,int niveaux,int vitesse) {
		this.nom = nom;
		p1=new Thread(this);
		this.niveaux=niveaux;
		p1.setPriority(vitesse);
	}
	 

	@Override
	public void run() {
		for(Jouet3 j: Simulation3.lesJouets) j.tuEsVerifiePar(this);
	}

	
		
		
		

	
	/*
	synchronized void verifieJouet(int j) {
		System.out.println(" \t"+nom+" commance jouet "+j);
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
		System.out.println(" \t"+nom+" fini jouet "+j);
		
	}*/

}
