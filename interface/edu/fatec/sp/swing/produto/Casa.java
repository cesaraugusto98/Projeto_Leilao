package edu.fatec.sp.swing.produto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Casa extends JFrame {

	private JPanel contentPane;
	private JTextField txtCidade;
	private JTextField txtEndereco;
	private JTextField txtPreco;
	private JTextField txtUf;
	private JTextField txtAreaTerreno;
	private JTextField txtAreaConstruida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Casa frame = new Casa();
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
	public Casa() {
		setBounds(100, 100, 430, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Cadastro de im\u00F3vel");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setBounds(10, 11, 383, 26);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.inactiveCaptionBorder);
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(0, 48, 414, 302);
		contentPane.add(panel);
		
		JTextArea txtDescricao = new JTextArea();
		txtDescricao.setRows(5);
		txtDescricao.setLineWrap(true);
		txtDescricao.setBorder(new LineBorder(Color.DARK_GRAY));
		
		JLabel label_1 = new JLabel("C\u00F3digo do leil\u00E3o");
		
		JComboBox cbCodLeilao = new JComboBox();
		cbCodLeilao.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_2 = new JLabel("C\u00F3digo do produto");
		
		JComboBox cbCodProd = new JComboBox();
		cbCodProd.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_3 = new JLabel("Cidade");
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		
		JLabel label_4 = new JLabel("C\u00F4modos");
		
		JSpinner spnNumComodos = new JSpinner();
		
		JLabel label_5 = new JLabel("Endereco");
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		
		JLabel label_6 = new JLabel("Pre\u00E7o");
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		JLabel label_7 = new JLabel("UF");
		
		txtUf = new JTextField();
		txtUf.setColumns(10);
		
		JLabel lblAreaTerreno = new JLabel("Area Terreno");
		
		txtAreaTerreno = new JTextField();
		txtAreaTerreno.setColumns(10);
		
		JLabel label_11 = new JLabel("Descri\u00E7\u00E3o");
		
		JLabel lblAreaConstruida = new JLabel("Area construida");
		
		txtAreaConstruida = new JTextField();
		txtAreaConstruida.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 414, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(label_1)
								.addGap(17)
								.addComponent(cbCodLeilao, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(label_2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(cbCodProd, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(label_3)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(label_4)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(spnNumComodos, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(label_5)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblAreaConstruida)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtAreaConstruida, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblAreaTerreno)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtAreaTerreno, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_6)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_7)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtUf, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(label_11)
								.addGap(219))))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 302, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(cbCodLeilao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(cbCodProd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_6)
						.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7)
						.addComponent(txtUf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3)
						.addComponent(label_4)
						.addComponent(spnNumComodos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAreaConstruida)
						.addComponent(txtAreaConstruida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAreaTerreno)
						.addComponent(txtAreaTerreno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_11)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton button = new JButton("Cancelar");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial", Font.BOLD, 14));
		button.setBorder(null);
		button.setBackground(new Color(204, 51, 51));
		button.setBounds(158, 362, 117, 35);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cadastrar");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Arial", Font.BOLD, 14));
		button_1.setBorder(null);
		button_1.setBackground(new Color(0, 204, 102));
		button_1.setBounds(287, 362, 117, 35);
		contentPane.add(button_1);
	}
}
