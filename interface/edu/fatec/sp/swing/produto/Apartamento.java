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
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class Apartamento extends JFrame {

	private JPanel contentPane;
	private JTextField txtPreco;
	private JTextField txtUf;
	private JTextField txtEndereco;
	private JTextField txtCidade;
	private JTextField txtCustoCondominio;
	private JTextField txtAreaApto;
	private JTextField txtAndar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apartamento frame = new Apartamento();
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
	public Apartamento() {
		setBounds(100, 100, 430, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeImvel = new JLabel("Cadastro de im\u00F3vel");
		lblCadastroDeImvel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeImvel.setForeground(Color.DARK_GRAY);
		lblCadastroDeImvel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCadastroDeImvel.setBounds(10, 11, 383, 26);
		contentPane.add(lblCadastroDeImvel);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.inactiveCaptionBorder);
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(0, 48, 414, 302);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("C\u00F3digo do leil\u00E3o");
		
		JComboBox cbCodLeilao = new JComboBox();
		cbCodLeilao.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_3 = new JLabel("C\u00F3digo do produto");
		
		JComboBox cbCodProd = new JComboBox();
		cbCodProd.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_4 = new JLabel("Pre\u00E7o");
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		JLabel lblUf = new JLabel("UF");
		
		txtUf = new JTextField();
		txtUf.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		
		JLabel lblEndereco = new JLabel("Endereco");
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		
		JLabel lblCustoDoCondominio = new JLabel("Custo do condominio");
		
		txtCustoCondominio = new JTextField();
		txtCustoCondominio.setColumns(10);
		
		JLabel lblComodos = new JLabel("C\u00F4modos");
		
		txtAreaApto = new JTextField();
		txtAreaApto.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		
		txtAndar = new JTextField();
		txtAndar.setColumns(10);
		
		JSpinner spnComodos = new JSpinner();
		
		JLabel lblNewLabel = new JLabel("Area apto");
		
		JLabel lblAndarApto = new JLabel("Andar apto");
		
		JTextArea txtDescricao = new JTextArea();
		txtDescricao.setBorder(new LineBorder(Color.DARK_GRAY));
		txtDescricao.setLineWrap(true);
		txtDescricao.setRows(5);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_1)
									.addGap(17)
									.addComponent(cbCodLeilao, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cbCodProd, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblCidade)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblComodos)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(spnComodos, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblEndereco)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
											.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
												.addComponent(label_4)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(lblUf)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtUf, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
											.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
												.addComponent(lblCustoDoCondominio)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtCustoCondominio, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panel.createSequentialGroup()
												.addGap(18)
												.addComponent(lblNewLabel)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtAreaApto, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
											.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(lblAndarApto)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtAndar, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))))
									.addComponent(lblDescrio, Alignment.LEADING)))
							.addGap(29))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(cbCodLeilao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3)
						.addComponent(cbCodProd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUf)
						.addComponent(txtUf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAndarApto)
						.addComponent(txtAndar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEndereco)
						.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCidade)
						.addComponent(lblComodos)
						.addComponent(spnComodos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCustoDoCondominio)
						.addComponent(txtCustoCondominio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(txtAreaApto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDescrio)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
		btnCancelar.setBorder(null);
		btnCancelar.setBackground(new Color(204, 51, 51));
		btnCancelar.setBounds(158, 362, 117, 35);
		contentPane.add(btnCancelar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Arial", Font.BOLD, 14));
		btnCadastrar.setBorder(null);
		btnCadastrar.setBackground(new Color(0, 204, 102));
		btnCadastrar.setBounds(287, 362, 117, 35);
		contentPane.add(btnCadastrar);
	}
}
