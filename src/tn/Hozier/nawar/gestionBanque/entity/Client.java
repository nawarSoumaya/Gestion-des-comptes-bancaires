package tn.Hozier.nawar.gestionBanque.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
	private int id;
	private String name;
	private String login;
	private String pwd;
	private List<Compte> comptes = new ArrayList<Compte>();
	private Map<Integer, Compte> comptesMap = new HashMap<Integer, Compte>();

	public Client(int id, String name) {
		this.id = id;
		this.name = name;

	}
	public  Client() {
		
	}

	public int getId() {
		return id;
	}

	public void affiche() {
		for (Compte compte : comptesMap.values()) {
			System.out.println(compte.RIB);
		}
	}

	public void addCompte(Compte compte) {
		this.comptes.add(compte);
		this.comptesMap.put(compte.getRIB(), compte);
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

}
