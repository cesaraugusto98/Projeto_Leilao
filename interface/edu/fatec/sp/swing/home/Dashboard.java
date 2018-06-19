package edu.fatec.sp.swing.home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.sp.swing.produto.Carro;
import edu.fatec.sp.swing.produto.Moto;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 530);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 256, 491);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar apartamento");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(51, 102, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(10, 47, 235, 38);
		panel.add(btnNewButton);
		
		JButton btnCadastrarCarro = new JButton("Cadastrar carro");
		btnCadastrarCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carro carro = new Carro();
				carro.setVisible(true);
			}
		});
		btnCadastrarCarro.setForeground(Color.WHITE);
		btnCadastrarCarro.setFont(new Font("Arial", Font.BOLD, 16));
		btnCadastrarCarro.setBorder(null);
		btnCadastrarCarro.setBackground(new Color(51, 102, 255));
		btnCadastrarCarro.setBounds(10, 97, 235, 38);
		panel.add(btnCadastrarCarro);
		
		JButton btnCadastrarCasa = new JButton("Cadastrar casa");
		btnCadastrarCasa.setForeground(Color.WHITE);
		btnCadastrarCasa.setFont(new Font("Arial", Font.BOLD, 16));
		btnCadastrarCasa.setBorder(null);
		btnCadastrarCasa.setBackground(new Color(51, 102, 255));
		btnCadastrarCasa.setBounds(10, 147, 235, 38);
		panel.add(btnCadastrarCasa);
		
		JButton btnCadastrarEdificioComercial = new JButton("Cadastrar edificio comercial");
		btnCadastrarEdificioComercial.setForeground(Color.WHITE);
		btnCadastrarEdificioComercial.setFont(new Font("Arial", Font.BOLD, 16));
		btnCadastrarEdificioComercial.setBorder(null);
		btnCadastrarEdificioComercial.setBackground(new Color(51, 102, 255));
		btnCadastrarEdificioComercial.setBounds(10, 197, 235, 38);
		panel.add(btnCadastrarEdificioComercial);
		
		JButton btnCadastrarMoto = new JButton("Cadastrar moto");
		btnCadastrarMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Moto moto = new Moto();
				moto.setVisible(true);
			}
		});
		btnCadastrarMoto.setForeground(Color.WHITE);
		btnCadastrarMoto.setFont(new Font("Arial", Font.BOLD, 16));
		btnCadastrarMoto.setBorder(null);
		btnCadastrarMoto.setBackground(new Color(51, 102, 255));
		btnCadastrarMoto.setBounds(10, 247, 235, 38);
		panel.add(btnCadastrarMoto);
		
		JButton btnCadastrarTerreno = new JButton("Cadastrar terreno");
		btnCadastrarTerreno.setForeground(Color.WHITE);
		btnCadastrarTerreno.setFont(new Font("Arial", Font.BOLD, 16));
		btnCadastrarTerreno.setBorder(null);
		btnCadastrarTerreno.setBackground(new Color(51, 102, 255));
		btnCadastrarTerreno.setBounds(10, 297, 235, 38);
		panel.add(btnCadastrarTerreno);
	}
}
