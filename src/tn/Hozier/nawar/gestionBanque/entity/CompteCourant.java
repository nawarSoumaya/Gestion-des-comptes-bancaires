package tn.Hozier.nawar.gestionBanque.entity;

import java.text.DateFormat;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtProcessing;

public class CompteCourant extends Compte {
	private final int TVA = 2;

	public CompteCourant() {
		super();
	}

	public CompteCourant(int id, int RIB, Client client) {
		super(id, RIB, client);
		this.client.addCompte(this);
	}
	
	

	private float formule(float somme) {
		// Date d = new Date("");
		// System.out.println(d);
		// if (new Date().equals("28-02-2015"))
		// System.out.println("foooormluse");
		return somme = somme - somme * TVA / 100;
	}

	@Override
	protected void retrait(float somme) {
		if (this.solde <= -300)
			this.solde = this.solde - somme;
		else
			System.out.println("Impossible de retirer de l'argent: solde insuffisant");

	}

	@Override
	protected void versement(float somme) {
		this.solde = this.solde + formule(somme);
		System.out.println("votre solde est " + getSolde() + "");
	}
}
