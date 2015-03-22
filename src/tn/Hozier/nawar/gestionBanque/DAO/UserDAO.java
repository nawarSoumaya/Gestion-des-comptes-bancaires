package tn.Hozier.nawar.gestionBanque.DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tn.Hozier.nawar.gestionBanque.entity.Client;
import tn.Hozier.nawar.gestionBanque.utile.Cnx;


public class UserDAO implements InterfaceDAO{

	@Override
	public List<Object> findAll() {
		List<Object> LstClient = new ArrayList<Object>();
		
		String requete = "select * from client";
		
		try { 
			Statement statement= Cnx.getInstance().createStatement();
			ResultSet resultSet= statement.executeQuery(requete);
			
			while (resultSet.next()){
				Client client = new Client();
				client.setId(resultSet.getInt(1));
				client.setName(resultSet.getString(2));
				client.setLogin(resultSet.getString(3));
				client.setPwd(resultSet.getString(4));
				LstClient.add(client);
			}
			return LstClient;
			
		} catch (Exception e) {
			System.out.println("ERROR"+e.getMessage());
			return null;
		
		}
		
		
		
	}
	
	// saisi des information d'accée
	// authentification


}
