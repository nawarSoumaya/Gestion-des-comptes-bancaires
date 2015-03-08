package tn.Hozier.nawar.gestionBanque.entity;

public abstract  class Compte {
	protected int id;
	protected int RIB;
	protected float solde;
	protected Client client;

	protected Compte() {

	}

	protected Compte(int id, int RIB, Client client) {
		this.id = id;
		this.RIB = RIB;
		this.client = client;

	}

	protected abstract void retrait(float somme);

	protected abstract void versement(float somme);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRIB() {
		return RIB;
	}

	public void setRIB(int rIB) {
		RIB = rIB;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
