package tn.Hozier.nawar.gestionBanque.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.Hozier.nawar.gestionBanque.entity.Client;
import tn.Hozier.nawar.gestionBanque.utile.Cnx;

public class UserDAO implements IUserDAO {

	@Override
	public List<Client> findAll() {
		List<Client> LstClient = new ArrayList<Client>();

		String requete = "select * from client";

		try {
			Statement statement = Cnx.getInstance().createStatement();
			ResultSet resultSet = statement.executeQuery(requete);

			while (resultSet.next()) {
				Client client = new Client();
				client.setId(resultSet.getInt(1));
				client.setName(resultSet.getString(2));
				client.setLogin(resultSet.getString(3));
				client.setPwd(resultSet.getString(4));
				LstClient.add(client);
			}
			return LstClient;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}

	@Override
	public Client authentification(String login, String password) {

		String req = "SELECT * FROM client WHERE login='" + login
				+ "' AND passwd='" + password + "'";

		try {
			Client client = null;
			Statement statement = Cnx.getInstance().createStatement();
			ResultSet resultSet = statement.executeQuery(req);
			while (resultSet.next()) {
				client = new Client();
				client.setId(resultSet.getInt(1));
				client.setName(resultSet.getString(2));
				client.setLogin(resultSet.getString(3));
				client.setPwd(resultSet.getString(4));
			}
			if (client == null) {
				return null;
			} else {
				return client;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public void add(Client client) {
		String req = "INSERT into client (name,login,passwd ) VALUES ('"
				+ client.getName() + "','" + client.getLogin() + "','"
				+ client.getPwd() + "') ";
		try {
			Statement statement = Cnx.getInstance().createStatement();
			statement.execute(req);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
