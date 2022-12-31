package p1;

public class VerificateurJouet implements Runnable {
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public VerificateurJouet(String nom) {
		this.nom = nom;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			verifieJouet(i);
		}

	}

	void verifieJouet(int j) {
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
		
	}

}
