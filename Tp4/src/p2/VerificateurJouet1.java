package p2;

public class VerificateurJouet1 implements Runnable{
	private String nom;
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public VerificateurJouet1(String nom) {
		this.nom = nom;
	}
	  void tuEsVerifiePar(VerificateurJouet1 v1){
		for (int i = 0; i < Simulation1.lesJouets.size(); i++) {
			synchronized (Simulation1.lesJouets.get(i)) {
				int nombre=Simulation1.lesJouets.get(i).getNombre();
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
			}
			
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		tuEsVerifiePar(this);
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
