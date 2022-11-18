package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtSenha;
	private JButton btnCadastrar;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(73, 79, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtSenha = new JTextField();
		txtSenha.setBounds(73, 116, 86, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);

		JButton btnLogar = new JButton("LOGAR");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// VALIDAR O LOGIN

				// SE A PESSOA EXISTE
				dispose();
				TelaGeral telaGeral = new TelaGeral();
				telaGeral.setLocationRelativeTo(null);
				telaGeral.setVisible(true);
			}
		});
		btnLogar.setBounds(73, 164, 89, 23);
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
		btnCadastrar.setBounds(196, 164, 143, 23);
		contentPane.add(btnCadastrar);
	}
}
