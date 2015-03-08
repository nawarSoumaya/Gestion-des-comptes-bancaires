package tn.Hozier.nawar.gestionBanque.entity;

public class Test {

	public static void main(String[] args) {
		Client moi = new Client(01,"soumaya");
		Compte c = new CompteCourant(01, 215,moi);
		Compte c2 = new CompteEpargne(01, 326,moi);
		
		moi.affiche();
			

	}

}
