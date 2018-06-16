package edu.fatec.sp.swing.produto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Rectangle;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Component;
import javax.swing.JDesktopPane;
import net.miginfocom.swing.MigLayout;
import java.awt.TextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Moto {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_3;
	private JTextField textField_8;

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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.inactiveCaptionBorder);
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(0, 50, 414, 208);
		frame.getContentPane().add(panel);
		
		JLabel lblCdigoDoLeilo = new JLabel("C\u00F3digo do leil\u00E3o");
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblCdigoDoProduto = new JLabel("C\u00F3digo do produto");
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel lblNewLabel = new JLabel("Nome fabricante");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ano");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNumeroDeMultas = new JLabel("Numero de multas");
		
		JLabel lblNewLabel_2 = new JLabel("Km rodados");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cilindradas");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cor");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		
		JLabel lblModelo = new JLabel("Modelo");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
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
										.addComponent(lblCdigoDoLeilo)
										.addComponent(lblNewLabel))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblCdigoDoProduto)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
											.addComponent(lblPreo)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_2, 0, 0, Short.MAX_VALUE))
										.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
											.addComponent(lblNumeroDeMultas)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(spinner, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_2)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGap(12)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_3)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
									.addGap(20)))
							.addGap(260))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblPlaca)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(382))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblModelo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(297, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCdigoDoLeilo)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCdigoDoProduto)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreo)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumeroDeMultas)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPlaca)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModelo)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(12, 12, 98, 26);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblNewLabel_6 = new JLabel("CADASTRO DE MOTO");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_6.setBounds(128, 12, 267, 26);
		frame.getContentPane().add(lblNewLabel_6);
		frame.setBounds(100, 100, 423, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
