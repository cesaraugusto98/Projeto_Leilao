package edu.fatec.sp.swing.produto;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
<<<<<<< HEAD
import java.awt.Component;
import javax.swing.Box;
=======
>>>>>>> origin/cesar
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
<<<<<<< HEAD
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
=======

>>>>>>> origin/cesar

public class Carro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNomeFabricante;
	private JTextField txtPreco;
	private JTextField txtAno;
	private JTextField txtKmRodado;
	private JTextField txtPlaca;
	private JTextField txtCor;
	private JTextField txtModelo;
	private JTextField txtPotencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carro frame = new Carro();
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
	public Carro() {
		getContentPane().setLayout(null);
		JLabel lblCdigoDoLeilo = new JLabel("C\u00F3digo do leil\u00E3o");
		lblCdigoDoLeilo.setBounds(12, 53, 89, 16);
		getContentPane().add(lblCdigoDoLeilo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox.setBounds(119, 49, 62, 25);
		getContentPane().add(comboBox);
		getContentPane().setLayout(null);
		
		JLabel lblCdigoDoLeilo1 = new JLabel("C\u00F3digo do leil\u00E3o");
		lblCdigoDoLeilo1.setBounds(12, 50, 89, 16);
		getContentPane().add(lblCdigoDoLeilo1);
		
		textField = new JTextField();
		textField.setBounds(119, 48, 114, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		setBounds(100, 100, 430, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.inactiveCaptionBorder);
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(0, 51, 414, 208);
		contentPane.add(panel);
		
		JLabel label = new JLabel("C\u00F3digo do leil\u00E3o");
		
		JLabel label_1 = new JLabel("Nome fabricante");
		
		JComboBox cbCodLeilao = new JComboBox();
		cbCodLeilao.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_2 = new JLabel("C\u00F3digo do produto");
		
		JComboBox cbCodProd = new JComboBox();
		cbCodProd.setBackground(SystemColor.inactiveCaptionBorder);
		
		txtNomeFabricante = new JTextField();
		txtNomeFabricante.setColumns(10);
		
		JLabel label_3 = new JLabel("Pre\u00E7o");
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		JLabel label_4 = new JLabel("Ano");
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		
		JLabel label_5 = new JLabel("Numero de multas");
		
		JSpinner spnNumMultas = new JSpinner();
		
		JLabel label_6 = new JLabel("Km rodados");
		
		txtKmRodado = new JTextField();
		txtKmRodado.setColumns(10);
		
		JLabel label_8 = new JLabel("Placa");
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		
		JLabel label_9 = new JLabel("Cor");
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		
		JLabel label_10 = new JLabel("Modelo");
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		
		JLabel lblNumeroDePortas = new JLabel("Numero de portas");
		
		JSpinner spnNumPortas = new JSpinner();
		
		JLabel lblNewLabel = new JLabel("Potencia");
		
		txtPotencia = new JTextField();
		txtPotencia.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(label)
										.addComponent(label_1))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(cbCodLeilao, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(label_2)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(cbCodProd, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
										.addComponent(txtNomeFabricante)))
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
											.addComponent(label_3)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(label_4)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtPotencia, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(label_5)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(spnNumMultas, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(label_6)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGap(12)
											.addComponent(txtKmRodado, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
									.addGap(20)))
							.addGap(260))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_8)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_9)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(382))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_10)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNumeroDePortas)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spnNumPortas, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(cbCodLeilao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(cbCodProd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(txtNomeFabricante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4)
						.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(txtPotencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(spnNumMultas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6)
						.addComponent(txtKmRodado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_8)
						.addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_9)
						.addComponent(txtCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_10)
						.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumeroDePortas)
						.addComponent(spnNumPortas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton button = new JButton("Cancelar");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial", Font.BOLD, 14));
		button.setBorder(null);
		button.setBackground(new Color(204, 51, 51));
		button.setBounds(154, 271, 117, 35);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cadastrar");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Arial", Font.BOLD, 14));
		button_1.setBorder(null);
		button_1.setBackground(new Color(0, 204, 102));
		button_1.setBounds(283, 271, 117, 35);
		contentPane.add(button_1);
		
		JLabel lblCadastroDeCarro = new JLabel("Cadastro de carro");
		lblCadastroDeCarro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeCarro.setForeground(Color.DARK_GRAY);
		lblCadastroDeCarro.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCadastroDeCarro.setBounds(17, 13, 383, 26);
		contentPane.add(lblCadastroDeCarro);
	}
}
