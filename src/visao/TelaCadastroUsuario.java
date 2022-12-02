package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.PessoaControl;
import modelo.Pessoa;

public class TelaCadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeUsuario;
	private JTextField textDataNasc;
	private JTextField textEmail;
	private JTextField textCpf;
	private JTextField textField;
	private JTextField textCidade;
	private JTextField textSenha;

	/**
	 * Create the frame.
	 */
	public TelaCadastroUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 562);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadUsuario = new JLabel("CADASTRE-SE");
		lblCadUsuario.setForeground(new Color(255, 51, 153));

		lblCadUsuario.setFont(new Font("Segoe Script", Font.PLAIN, 27));
		lblCadUsuario.setBounds(155, 50, 227, 30);
		lblCadUsuario.setFont(new Font("Segoe Script", Font.PLAIN, 25));
		lblCadUsuario.setBounds(160, 53, 227, 30);
		contentPane.add(lblCadUsuario);

		JLabel lblNome = new JLabel("Nome completo:");
		lblNome.setForeground(new Color(153, 51, 102));
		lblNome.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNome.setBounds(10, 108, 147, 30);
		contentPane.add(lblNome);

		textNomeUsuario = new JTextField();
		textNomeUsuario.setBounds(10, 145, 237, 20);
		lblNome.setBounds(10, 119, 147, 30);
		contentPane.add(lblNome);

		textNomeUsuario = new JTextField();
		textNomeUsuario.setBounds(10, 160, 237, 20);
		contentPane.add(textNomeUsuario);
		textNomeUsuario.setColumns(10);

		JLabel lblCasdDataNasc = new JLabel("Data de nascimento:");
		lblCasdDataNasc.setForeground(new Color(153, 51, 102));
		lblCasdDataNasc.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblCasdDataNasc.setBounds(306, 112, 173, 22);
		contentPane.add(lblCasdDataNasc);

		textDataNasc = new JTextField();
		textDataNasc.setBounds(306, 145, 122, 20);
		lblCasdDataNasc.setBounds(294, 123, 173, 22);
		contentPane.add(lblCasdDataNasc);

		textDataNasc = new JTextField();
		textDataNasc.setBounds(300, 160, 122, 20);
		contentPane.add(textDataNasc);
		textDataNasc.setColumns(10);

		JLabel lblNewLabel = new JLabel("E-mail:");
		lblNewLabel.setForeground(new Color(153, 51, 102));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel.setBounds(221, 206, 76, 14);
		contentPane.add(lblNewLabel);

		textEmail = new JTextField();
		textEmail.setBounds(221, 231, 330, 20);
		lblNewLabel.setBounds(212, 210, 76, 14);
		contentPane.add(lblNewLabel);

		textEmail = new JTextField();
		textEmail.setBounds(212, 235, 304, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setForeground(new Color(153, 51, 102));
		lblCpf.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblCpf.setBounds(10, 206, 46, 14);
		lblCpf.setBounds(10, 210, 46, 14);
		contentPane.add(lblCpf);

		textCpf = new JTextField();
		textCpf.setText("");
		textCpf.setBounds(10, 231, 147, 20);
		textCpf.setBounds(10, 235, 147, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("UF:");
		lblNewLabel_1.setForeground(new Color(153, 51, 102));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 298, 46, 14);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setBounds(10, 308, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox<String> areaEstado = new JComboBox<String>();
		areaEstado.setBounds(48, 307, 89, 22);
		
		areaEstado.addItem(" ");
		areaEstado.addItem("AC");
		areaEstado.addItem("AL");
		areaEstado.addItem("AP");
		areaEstado.addItem("AM");
		areaEstado.addItem("BA");
		areaEstado.addItem("CE");
		areaEstado.addItem("DF");
		areaEstado.addItem("ES");
		areaEstado.addItem("GO");
		areaEstado.addItem("MA");
		areaEstado.addItem("MT");
		areaEstado.addItem("MS");
		areaEstado.addItem("MG");
		areaEstado.addItem("PA");
		areaEstado.addItem("PB");
		areaEstado.addItem("PR");
		areaEstado.addItem("PE");
		areaEstado.addItem("PI");
		areaEstado.addItem("RJ");
		areaEstado.addItem("RN");
		areaEstado.addItem("RS");
		areaEstado.addItem("RO");
		areaEstado.addItem("RR");
		areaEstado.addItem("SC");
		areaEstado.addItem("SP");
		areaEstado.addItem("SE");
		areaEstado.addItem("TO");
		
		contentPane.add(areaEstado);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setForeground(new Color(153, 51, 102));
		lblCidade.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblCidade.setBounds(192, 305, 76, 14);
		contentPane.add(lblCidade);

		textField = new JTextField();
		textField.setBounds(289, 305, 162, 20);
		lblCidade.setBounds(212, 308, 76, 14);
		contentPane.add(lblCidade);

		textCidade = new JTextField();
		textCidade.setBounds(305, 308, 162, 20);
		contentPane.add(textCidade);
		textCidade.setColumns(10);

		JButton btnNewButton = new JButton("Cadastrar-se");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = textNomeUsuario.getText();
				String dataNasc = textDataNasc.getText();
				String email = textEmail.getText();
				String cpf = textCpf.getText();
				String cidade = textCidade.getText();
				String senha = textSenha.getText();
				
				
				modelo.Pessoa novaPessoa = new modelo.Pessoa ();	
				if (nome == null || nome.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Campo nome não foi preenchido!");
					
				} else {
					novaPessoa.setNome(nome);
				}
				
				if (dataNasc == null || dataNasc.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Campo da data de nascimento não foi preenchido!");
					
				} else {
					novaPessoa.setDataNasc(dataNasc);
				}
				
				if (email == null || email.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Campo do email não foi preenchido!");
					
				} else {
					novaPessoa.setEmail(email);
				}
				
				if (cpf == null || cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Campo do CPF não foi preenchido!");
					
				} else {
					novaPessoa.setCpf(cpf);
				}
				
				if (cidade == null || cidade.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Campo da cidade não foi preenchido!");
					
				} else {
					novaPessoa.setCidade(cidade);
				}
				
				if (senha == null || senha.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Campo da senha não foi preenchido!");
					
				} else {
					novaPessoa.setSenha(senha);
				}
				
				PessoaControl tabelaPessoa =  PessoaControl.getInstancia();
				boolean inserir = tabelaPessoa.inserir(novaPessoa);

				if (inserir == true) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					
					textNomeUsuario.setText(null);
					textDataNasc.setText(null);
					textEmail.setText(null);
					textCpf.setText(null);
					textCidade.setText(null);
					textSenha.setText(null);
				} else {
					JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
				}
				dispose();
				TelaGeral telaGeralG = new TelaGeral();
				telaGeralG.setLocationRelativeTo(null);
				telaGeralG.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(new Color(255, 51, 153));
		btnNewButton.setForeground(new Color(153, 51, 102));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(178, 410, 133, 23);
		btnNewButton.setBounds(180, 433, 133, 23);

		contentPane.add(btnNewButton);
		
		JButton btnVoltarLogin = new JButton("VOLTAR");
		btnVoltarLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaLogin telaLogin = new TelaLogin();
				telaLogin.setLocationRelativeTo(null);
				telaLogin.setVisible(true);
			}
		});
		btnVoltarLogin.setBounds(10, 11, 89, 23);
		contentPane.add(btnVoltarLogin);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(new Color(153, 51, 102));
		lblNewLabel_2.setBounds(10, 370, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		textSenha = new JTextField();
		textSenha.setBounds(83, 370, 141, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
	}
}
