package tn.Hozier.nawar.gestionBanque.entity;

public class CompteEpargne extends Compte {
	private final int TVA =5;
	
	public CompteEpargne(){
		super();
	}
	
	public CompteEpargne(int id, int RIB, Client client){
		super(id, RIB, client);
		this.client.addCompte(this);
	}

	@Override
	protected void retrait(float somme) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void versement(float somme) {
		// TODO Auto-generated method stub
		
	}
}
