package tn.Hozier.nawar.gestionBanque.gui;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tn.Hozier.nawar.gestionBanque.DAO.UserDAO;
import tn.Hozier.nawar.gestionBanque.entity.Client;

public class Authentification extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtLogin;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification frame = new Authentification();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Authentification() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 178);

		final JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JLabel lblLogin = new JLabel("Login");
		panel.add(lblLogin);

		txtLogin = new JTextField();
		panel.add(txtLogin);
		txtLogin.setColumns(10);

		JLabel lblPassword = new JLabel("password");
		panel.add(lblPassword);

		txtPassword = new JTextField();
		panel.add(txtPassword);
		txtPassword.setColumns(10);

		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDAO userDAO = new UserDAO();
				Client client = userDAO.authentification(txtLogin.getText(),
						txtPassword.getText());
				if (client == null) {
					JOptionPane.showMessageDialog(panel, "FAiled");
				} else {
					setVisible(false);
					dispose();
					Container container = new Container();
					container.setVisible(true);
					
				}

			}
		});
		panel.add(btnValider);
	}

}
