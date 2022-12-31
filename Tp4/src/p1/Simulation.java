
package p1;

 class Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerificateurJouet v1=new VerificateurJouet("Ahmed");
		VerificateurJouet v2=new VerificateurJouet("Amine");
		Thread t1=new Thread(v1);
		Thread t2=new Thread(v2);
		t1.start();
		t2.start();
		
		
		
		

	}

}
