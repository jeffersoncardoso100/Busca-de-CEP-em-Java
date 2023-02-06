package cep;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Tela de Login");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/img/check.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Busca CEP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblNewLabel.setBounds(126, 11, 158, 71);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bem vindo ao Sistema!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(136, 76, 137, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("login");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(115, 119, 47, 30);
		contentPane.add(lblNewLabel_2);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(172, 117, 86, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Senha");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(115, 156, 47, 30);
		contentPane.add(lblNewLabel_2_1);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(172, 156, 86, 20);
		contentPane.add(txtSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBackground(Color.CYAN);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// condicional de cadastro
				
				if(txtLogin.getText().equals("admin")&& txtSenha.getText().equals("admin")) {
					JOptionPane.showMessageDialog(null, "Usuario Cadastrado");
				
				Cep loginCep = new Cep();
				loginCep.setVisible(true);
			
			} else {
				JOptionPane.showMessageDialog(null, "Usuario não Cadastrado");
			}
		}});
		btnEntrar.setBounds(172, 214, 89, 23);
		contentPane.add(btnEntrar);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(login.class.getResource("/img/login.png")));
		lblNewLabel_3.setBounds(273, 22, 47, 41);
		contentPane.add(lblNewLabel_3);
	}

}
