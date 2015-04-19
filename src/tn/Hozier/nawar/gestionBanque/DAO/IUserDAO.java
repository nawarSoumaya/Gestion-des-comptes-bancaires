package tn.Hozier.nawar.gestionBanque.DAO;

import java.util.List;

import tn.Hozier.nawar.gestionBanque.entity.Client;

public interface IUserDAO {
	public List<Client> findAll();

	public Client authentification(String login, String password);
	
	public void add(Client client);
}
