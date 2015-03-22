package tn.Hozier.nawar.gestionBanque.entity;

import java.util.ArrayList;
import java.util.List;

import tn.Hozier.nawar.gestionBanque.DAO.UserDAO;
import tn.Hozier.nawar.gestionBanque.utile.Cnx;

public class Test {

	public static void main(String[] args) {
	 UserDAO dao= new UserDAO();
	 List<Object> clients = new ArrayList<Object>();
	 clients =  dao.findAll();
	 for (Object object : clients) {
		 Client client = (Client)object;
		 System.out.println(client.getLogin()+"    "+client.getName());
		
	}
	 

	}

}
