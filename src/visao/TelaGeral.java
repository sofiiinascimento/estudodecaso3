package visao;

import java.awt.Color;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.LivroControl;
import modelo.Livro;
import modelo.Pessoa;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaGeral extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane_1;
	private JTable tableLivros;
	private Livro livroSelecionado;
	LivroControl livrosControl = LivroControl.getInstancia();
	
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtData;
	private JTextField txtCpf;
	private JTextField txtCidade;

	/**
	 * Create the frame.
	 * @param pessoa2 
	 */
	public TelaGeral(Pessoa pessoa) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 662);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JButton btnNewButton = new JButton("Cadastrar um livro");
		btnNewButton.setBounds(379, 11, 143, 32);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroLivro telaCadLivro = new TelaCadastroLivro(pessoa);
				telaCadLivro.setLocationRelativeTo(null);
				telaCadLivro.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 214, 533, 342);
		contentPane.add(scrollPane_1);

		tableLivros = new JTable();
		
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
				new String[] { "Título", "Autor", "Gênero", "Quant. Páginas" });
		tableLivros.setModel(modelo);
		
		if (pessoa.getLivrosPessoa() == null) {
		}else {
			for (Livro livro : pessoa.getLivrosPessoa()) {
				modelo.addRow(new Object[] { livro.getTituloLivro(), livro.getAutor(), livro.getGenero(), livro.getQuantPag() });
			}
		}
		tableLivros.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				int posicaoLivro = tableLivros.getSelectedRow();
				
				livroSelecionado = pessoa.getLivrosPessoa().get(posicaoLivro);
				
				livroSelecionado.getAutor();
				livroSelecionado.getGenero();
				livroSelecionado.getQuantPag();
				livroSelecionado.getTituloLivro();	
			}
		});
		scrollPane_1.setViewportView(tableLivros);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(379, 180, 89, 23);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaAlterarLivro tela = new TelaAlterarLivro(pessoa, livroSelecionado);
				tela.setLocationRelativeTo(null);
				tela.setVisible(true);
				
			}
		});
		contentPane.add(btnAlterar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(379, 150, 89, 23);
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				livrosControl.delete(pessoa, livroSelecionado);
				dispose();
				TelaGeral tela = new TelaGeral(pessoa);
				tela.setLocationRelativeTo(null);
				tela.setVisible(true);
				
			}
		});
		contentPane.add(btnDeletar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(12, 580, 89, 23);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaLogin tela = new TelaLogin();
				tela.setLocationRelativeTo(null);
				tela.setVisible(true);
				
			}
		});
		contentPane.add(btnSair);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 11, 337, 181);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 62, 19);
		panel.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 41, 62, 19);
		panel.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Data Nascimento");
		lblSenha.setBounds(10, 71, 104, 19);
		panel.add(lblSenha);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 101, 62, 19);
		panel.add(lblCpf);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 131, 62, 19);
		panel.add(lblCidade);
		
		txtNome = new JTextField();
		txtNome.setText(pessoa.getNome());
		txtNome.setEditable(false);
		txtNome.setBounds(115, 10, 185, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText(pessoa.getEmail());
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBounds(115, 40, 185, 20);
		panel.add(txtEmail);
		
		txtData = new JTextField();
		txtData.setText(pessoa.getDataNasc());
		txtData.setEditable(false);
		txtData.setColumns(10);
		txtData.setBounds(115, 70, 185, 20);
		panel.add(txtData);
		
		txtCpf = new JTextField();
		txtCpf.setText(pessoa.getCpf());
		txtCpf.setEditable(false);
		txtCpf.setColumns(10);
		txtCpf.setBounds(115, 100, 185, 20);
		panel.add(txtCpf);
		
		txtCidade = new JTextField();
		txtCidade.setText(pessoa.getCidade());
		txtCidade.setEditable(false);
		txtCidade.setColumns(10);
		txtCidade.setBounds(115, 130, 185, 20);
		panel.add(txtCidade);

	}
}
