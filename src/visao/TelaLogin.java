package visao;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import controle.PessoaControl;
import modelo.Pessoa;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JButton btnCadastrar;
	private JPasswordField pwdSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setLocationRelativeTo(null);
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 568);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(73, 212, 143, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		JButton btnLogar = new JButton("LOGAR");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = txtUsuario.getText();
				String senha = pwdSenha.getText();
				
				PessoaControl tabelaPessoas = new PessoaControl();
				Pessoa pessoa = tabelaPessoas.efetuarLogin(nome, senha);
				
				if (pessoa != null) {
					
					dispose();
					TelaGeral telaGeral = new TelaGeral(pessoa);
					telaGeral.setLocationRelativeTo(null);
					telaGeral.setVisible(true);
					
				} else {
					JOptionPane.showMessageDialog(null,"Não foi possível achar esse usuário :(");
				}
				
			
			}
		});
		btnLogar.setBounds(45, 319, 89, 23);
		contentPane.add(btnLogar);

		btnCadastrar = new JButton("CADASTRAR USUARIO");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroUsuario telaCadUsuario = new TelaCadastroUsuario();
				telaCadUsuario.setLocationRelativeTo(null);
				telaCadUsuario.setVisible(true);
			}
		});
		btnCadastrar.setBounds(318, 265, 143, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setForeground(new Color(153, 0, 102));
		lblNewLabel.setFont(new Font("Vijaya", Font.BOLD, 40));
		lblNewLabel.setBounds(224, 28, 183, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seja bem-vindo(a) a sua estante virtual ");
		lblNewLabel_1.setForeground(new Color(153, 0, 51));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(138, 56, 332, 54);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Se for sua primeira vez aqui, se cadastre!\r\nPorém, se você for um usuário, \r\nfaça seu login e tenha acesso a sua estante :)");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setLabelFor(this);
		lblNewLabel_2.setBounds(178, 121, 304, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nome");
		lblNewLabel_3.setBounds(10, 215, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		pwdSenha = new JPasswordField();
		pwdSenha.setBounds(73, 267, 129, 19);
		contentPane.add(pwdSenha);
	}
}
