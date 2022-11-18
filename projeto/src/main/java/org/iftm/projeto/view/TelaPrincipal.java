package org.iftm.projeto.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JDesktopPane desktop = new JDesktopPane();
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		JMenu menuCadastros = new JMenu("Cadastros");
		barraMenu.add(menuCadastros);
		
		JMenuItem menuUsuarios = new JMenuItem("Veterinários");
		menuUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVeterinario tela = new TelaVeterinario();
				tela.setVisible(true);
				desktop.add(tela);
			}
		});
		menuCadastros.add(menuUsuarios);
		
		JMenu menuOperacoes = new JMenu("Opera\u00E7\u00F5es");
		barraMenu.add(menuOperacoes);
		
		JMenu menuConsultas = new JMenu("Consultas");
		barraMenu.add(menuConsultas);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		barraMenu.add(menuAjuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		contentPane.add(desktop, BorderLayout.CENTER);
	}
}
