package edu.fatec.sp.swing.produto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Moto {

	private JFrame frame;
	private JTextField txtFldNomeFabricante;
	private JTextField txtFldPreco;
	private JTextField txtFldAnoVeiculo;
	private JTextField txtFldKmRodado;
	private JTextField txtFldEstadoVeiculo;
	private JTextField txtFldCor;
	private JTextField txtFldPlacaVeiculo;
	private JTextField txtFldCilindradas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Moto window = new Moto();
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
	public Moto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 285);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo do leil\u00E3o");
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo do produto");
		
		JComboBox cbCodLeilao = new JComboBox();
		
		JComboBox cbCodProduto = new JComboBox();
		
		JLabel lblNewLabel_2 = new JLabel("Nome do fabricante");
		
		txtFldNomeFabricante = new JTextField();
		txtFldNomeFabricante.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Pre\u00E7o");
		
		txtFldPreco = new JTextField();
		txtFldPreco.setColumns(10);
		
		JLabel lblAno = new JLabel("Ano do ve\u00EDculo");
		
		txtFldAnoVeiculo = new JTextField();
		txtFldAnoVeiculo.setColumns(10);
		
		JLabel lblKmRodado = new JLabel("Km rodado");
		
		txtFldKmRodado = new JTextField();
		txtFldKmRodado.setColumns(10);
		
		txtFldEstadoVeiculo = new JTextField();
		txtFldEstadoVeiculo.setColumns(10);
		
		JLabel lblEstadoDoVeiculo = new JLabel("Estado do veiculo");
		
		JLabel lblCor = new JLabel("Cor");
		
		txtFldCor = new JTextField();
		txtFldCor.setColumns(10);
		
		JLabel lblNumeroDeMultas = new JLabel("Numero de multas");
		
		JSpinner SpnNumeroMultas = new JSpinner();
		
		JLabel lblPlacaDoVeiculo = new JLabel("Placa do veiculo");
		
		txtFldPlacaVeiculo = new JTextField();
		txtFldPlacaVeiculo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cilindradas");
		
		txtFldCilindradas = new JTextField();
		txtFldCilindradas.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton button = new JButton("<- Voltar");
		
		JLabel lblCadastroDeMoto = new JLabel("CADASTRO DE MOTO");
		lblCadastroDeMoto.setForeground(Color.DARK_GRAY);
		lblCadastroDeMoto.setFont(new Font("Tahoma", Font.BOLD, 22));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_2)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtFldNomeFabricante))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(cbCodLeilao, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(cbCodProduto, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_3)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtFldPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblAno)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(txtFldAnoVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNumeroDeMultas)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(SpnNumeroMultas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblPlacaDoVeiculo)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtFldPlacaVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNewLabel_4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtFldCilindradas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblCadastroDeMoto)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblKmRodado)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtFldKmRodado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(lblEstadoDoVeiculo)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtFldEstadoVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(lblCor)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtFldCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap(7, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
							.addGap(379))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(217)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCadastroDeMoto))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(cbCodLeilao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(cbCodProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAno)
						.addComponent(txtFldAnoVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtFldNomeFabricante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtFldPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKmRodado)
						.addComponent(txtFldKmRodado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEstadoDoVeiculo)
						.addComponent(txtFldEstadoVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCor)
						.addComponent(txtFldCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumeroDeMultas)
						.addComponent(SpnNumeroMultas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPlacaDoVeiculo)
						.addComponent(txtFldPlacaVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtFldCilindradas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCadastrar, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
