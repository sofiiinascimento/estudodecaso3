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
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnCadastrar = new JButton("CADASTRAR USUARIO");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroUsuario telaCadUsuario = new TelaCadastroUsuario();
				telaCadUsuario.setLocationRelativeTo(null);
				telaCadUsuario.setVisible(true);
			}
		});
		btnCadastrar.setBounds(181, 427, 183, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setForeground(new Color(153, 0, 102));
		lblNewLabel.setFont(new Font("Vijaya", Font.BOLD, 40));
		lblNewLabel.setBounds(217, 28, 129, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seja bem-vindo(a) a sua estante virtual ");
		lblNewLabel_1.setForeground(new Color(153, 0, 51));
		lblNewLabel_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(116, 63, 330, 56);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Se for sua primeira vez aqui, se cadastre!\r\n");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setLabelFor(this);
		lblNewLabel_2.setBounds(126, 129, 304, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nome");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(116, 265, 51, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Porém, se você for um usuário, faça seu login e acesse sua estante :)");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(88, 143, 418, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Senha");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(116, 305, 46, 14);
		contentPane.add(lblNewLabel_5);
				
						txtUsuario = new JTextField();
						txtUsuario.setBounds(181, 260, 187, 29);
						contentPane.add(txtUsuario);
						txtUsuario.setColumns(10);
						
						pwdSenha = new JPasswordField();
						pwdSenha.setBounds(181, 300, 187, 29);
						contentPane.add(pwdSenha);
						
								JButton btnLogar = new JButton("ENTRAR");
								btnLogar.setFont(new Font("Tahoma", Font.PLAIN, 13));
								btnLogar.setBounds(236, 356, 89, 23);
								contentPane.add(btnLogar);
								
								JLabel lblNewLabel_6 = new JLabel("LOGIN");
								lblNewLabel_6.setFont(new Font("Source Sans Pro", Font.BOLD, 20));
								lblNewLabel_6.setBounds(251, 213, 128, 14);
								contentPane.add(lblNewLabel_6);
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
	}
}
