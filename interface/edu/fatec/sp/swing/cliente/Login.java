package edu.fatec.sp.swing.cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Button;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblSistemaDeLeilo;
	private JTextField txtUser;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 358);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(51, 204, 102));
		panel.setBounds(199, 0, 390, 319);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblSistemaDeLeilo = new JLabel("Sistema de leil\u00E3o");
		lblSistemaDeLeilo.setBounds(12, 12, 362, 35);
		panel.add(lblSistemaDeLeilo);
		lblSistemaDeLeilo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemaDeLeilo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSistemaDeLeilo.setFont(new Font("Arial", Font.BOLD, 30));
		
		txtUser = new JTextField();
		txtUser.setName("User");
		txtUser.setHorizontalAlignment(SwingConstants.CENTER);
		txtUser.setBorder(null);
		txtUser.setBounds(65, 97, 256, 35);
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBorder(null);
		textField_1.setColumns(10);
		textField_1.setBounds(65, 162, 256, 35);
		panel.add(textField_1);
		
		btnNewButton = new JButton("Logar");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.setBounds(214, 217, 107, 35);
		panel.add(btnNewButton);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 16));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(65, 80, 114, 16);
		panel.add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		lblPassword.setBounds(65, 144, 114, 16);
		panel.add(lblPassword);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel.setIconTextGap(6);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Gustavo\\Documents\\workspace\\java\\Projeto_Leilao\\interface\\imgs\\profile (1).png"));
		lblNewLabel.setBounds(0, 0, 199, 307);
		contentPane.add(lblNewLabel);
	}
}
