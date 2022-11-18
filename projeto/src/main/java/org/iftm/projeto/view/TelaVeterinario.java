package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class TelaVeterinario extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtEspecialidade;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVeterinario frame = new TelaVeterinario();
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
	public TelaVeterinario() {
		setBounds(100, 100, 450, 260);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro de Veterin\u00E1rios");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTitulo.setBounds(10, 11, 414, 30);
		getContentPane().add(lblTitulo);
		
		JPanel painel = new JPanel();
		painel.setBorder(new TitledBorder(null, "Dados:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		TitledBorder border= (TitledBorder) painel.getBorder();
		border.setTitle("Código : ");
		painel.setBounds(10, 52, 301, 173);
		getContentPane().add(painel);
		painel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome : ");
		lblNome.setBounds(10, 32, 56, 14);
		painel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(86, 29, 205, 20);
		painel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEspecialidade = new JLabel("Especialidade : ");
		lblEspecialidade.setBounds(10, 60, 74, 14);
		painel.add(lblEspecialidade);
		
		txtEspecialidade = new JTextField();
		txtEspecialidade.setBounds(86, 57, 205, 20);
		painel.add(txtEspecialidade);
		txtEspecialidade.setColumns(10);
		
		JLabel lblSalario = new JLabel("Sal\u00E1rio : ");
		lblSalario.setBounds(10, 91, 46, 14);
		painel.add(lblSalario);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(202, 139, 89, 23);
		painel.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(103, 139, 89, 23);
		painel.add(btnCancelar);
		
		txtSalario = new JTextField();
		txtSalario.setColumns(10);
		txtSalario.setBounds(86, 88, 205, 20);
		painel.add(txtSalario);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(321, 57, 89, 23);
		getContentPane().add(btnNovo);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(321, 91, 89, 23);
		getContentPane().add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(321, 125, 89, 23);
		getContentPane().add(btnExcluir);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(321, 159, 89, 23);
		getContentPane().add(btnPesquisar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(321, 190, 89, 23);
		getContentPane().add(btnFechar);

	}
}
