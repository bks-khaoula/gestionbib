package gestion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Authentification extends JFrame{

	private JFrame frame;
	private JTextField usernamefield;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordfield;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification window = new Authentification();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Authentification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel_3 = new JLabel("GESTION DE BIBLIOEIOTHEQUE");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(185, 60, 318, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.DARK_GRAY);
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(98, 90, 469, 2);
		frame.getContentPane().add(separator);
		
		usernamefield = new JTextField();
		usernamefield.setBounds(251, 135, 181, 20);
		frame.getContentPane().add(usernamefield);
		usernamefield.setColumns(10);
		
		lblNewLabel_1 = new JLabel("User name:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(154, 138, 87, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(154, 167, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordfield = new JPasswordField();
		passwordfield.setBounds(251, 164, 181, 20);
		frame.getContentPane().add(passwordfield);
		
		JButton btnNewButton = new JButton("Se Connecter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = usernamefield.getText().toString();
				String password = passwordfield.getText().toString();
				
				if (!username.equals("") || !password.equals("")) {
				if(username.equals("admin") && password.equals("admin")) {
					JOptionPane.showMessageDialog(null, "Connexion réussite!");
					MenuAdmin menu = new MenuAdmin();//interface menu administrateur 
					menu.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Connexion échouée!");
				}
			}
	        }
		});
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		btnNewButton.setBounds(251, 195, 181, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\anonème\\Downloads\\831613.jpg"));
		lblNewLabel.setBounds(0, 0, 684, 361);
		frame.getContentPane().add(lblNewLabel);
		
	
		
		
	}
}
