package tn.Hozier.nawar.gestionBanque.utile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Cnx {
	private static final String login = "root";
	private static final String pwd = "";
	private static final String host = "jdbc:mysql://localhost/banque";
	private static final String driver = "com.mysql.jdbc.Driver";
	private static Connection con;

	private Cnx() {

	}

	public Connection connection() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(host, login, pwd);
			System.out.println("connexion établie");

		} catch (SQLException e) {
			System.out.println("connexion non établie"+e.getMessage());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Class Not Found");
		}
		return con;
	}

	public static Connection getInstance() {
		if (con == null) {
			return new Cnx().connection();
		} else {
			return con;
		}

	}
}
