package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Ver 1.0");
		lblNewLabel.setBounds(30, 23, 267, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Author Jefferson Cardoso");
		lblNewLabel_1.setBounds(28, 52, 216, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Web Service:");
		lblNewLabel_2.setBounds(30, 87, 82, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("viacep.com.br/");
		lblNewLabel_3.setForeground(SystemColor.textHighlight);
		lblNewLabel_3.setBounds(123, 87, 249, 14);
		getContentPane().add(lblNewLabel_3);
		
		JButton Github = new JButton("");
		Github.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/jeffersoncardoso100");
			}
		});
		Github.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		Github.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Github.setBorder(null);
		Github.setBackground(SystemColor.control);
		Github.setBounds(30, 128, 64, 48);
		getContentPane().add(Github);
	}
	// metodo criado respo abrir link
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		} catch  (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	

}
