package p3;

public class VerificateurJouet2 implements Runnable{
	private String nom;
	public Thread p1;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public VerificateurJouet2(String nom) {
		this.nom = nom;
		p1=new Thread(this);
	}
	 

	@Override
	public void run() {
		for(Jouet2 j: Simulation2.lesJouets) j.tuEsVerifiePar(this);
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
