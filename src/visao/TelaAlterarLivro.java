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

import controle.LivroControl;
import modelo.Livro;
import modelo.Pessoa;

public class TelaAlterarLivro extends JFrame {
	private JTextField textNomeLivro;
	private JTextField textNomeAutor;
	private JTextField textQuantPag;
	private JComboBox areraGenero;

	/**
	 * Create the frame.
	 */
	public TelaAlterarLivro(Pessoa pessoa, Livro livro) {
		setBackground(new Color(204, 255, 255));
		getContentPane().setBackground(new Color(255, 255, 240));
		getContentPane().setForeground(new Color(102, 51, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 562);
		getContentPane().setLayout(null);

		textNomeLivro = new JTextField();
		textNomeLivro.setText(livro.getTituloLivro());
		textNomeLivro.setBounds(22, 166, 425, 25);
		getContentPane().add(textNomeLivro);
		textNomeLivro.setColumns(10);

		JLabel lblNewLabel = new JLabel("ALTERAR LIVRO");
		lblNewLabel.setFont(new Font("Segoe Script", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setBounds(161, 66, 247, 48);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Título do livro:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(153, 0, 102));
		lblNewLabel_1.setBounds(22, 141, 198, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNomeAutor_2 = new JLabel("Nome do autor:");
		lblNomeAutor_2.setForeground(new Color(153, 0, 102));
		lblNomeAutor_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNomeAutor_2.setBounds(22, 228, 160, 14);
		getContentPane().add(lblNomeAutor_2);

		textNomeAutor = new JTextField();
		textNomeAutor.setText(livro.getAutor());
		textNomeAutor.setBounds(22, 253, 425, 25);
		getContentPane().add(textNomeAutor);
		textNomeAutor.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Gênero:");
		lblNewLabel_2.setForeground(new Color(153, 0, 102));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(22, 300, 146, 23);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Quantidade de páginas:");
		lblNewLabel_3.setForeground(new Color(153, 0, 102));
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(22, 376, 270, 25);
		getContentPane().add(lblNewLabel_3);

		textQuantPag = new JTextField();
		textQuantPag.setText(livro.getQuantPag());
		textQuantPag.setBounds(22, 412, 125, 25);
		getContentPane().add(textQuantPag);
		textQuantPag.setColumns(10);
		
		JComboBox<String> areaGenero = new JComboBox<>();
		areaGenero.setBounds(22, 323, 184, 25);
		areaGenero.addItem(" ");
		areaGenero.addItem("Fantasia");
		areaGenero.addItem("Romance");
		getContentPane().add(areaGenero);

		JButton btnCadastroLivro = new JButton("Alterar");
		btnCadastroLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeLivro = textNomeLivro.getText();
				String nomeAutor = textNomeAutor.getText();
				String quantPag = textQuantPag.getText();
				String genero = ""+areaGenero.getSelectedItem();
				
				Livro novoLivro = new Livro ();
				if (nomeLivro == null || nomeLivro.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Campo nome do livro não foi preenchido");				
				} else {
					novoLivro.setTituloLivro(nomeLivro);
				}
				
				if (nomeAutor == null || nomeAutor.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Campo nome do autor não foi preenchido");				
				} else {
					novoLivro.setAutor(nomeAutor);
				}
				
				if (genero == null || genero.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Campo do gênero não foi preenchido");				
				} else {
					novoLivro.setGenero(genero);
				}
				
				if (quantPag == null || quantPag.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Campo da quantidade de páginas não foi preenchido");				
				} else {
					novoLivro.setQuantPag(quantPag);
				}
				
				LivroControl tabelaLivro = LivroControl.getInstancia();
				boolean inserir = tabelaLivro.update(pessoa, livro, novoLivro);
				
				if (inserir == true) {
					JOptionPane.showMessageDialog(null,"Livro alterado com sucesso!");
					
					textNomeLivro.setText(null);
					textNomeAutor.setText(null);
					textQuantPag.setText(null);
					areaGenero.setAction(null);
				} else {
					JOptionPane.showMessageDialog(null,"Erro ao cadastrar!!!");
				}
				
				dispose();
				TelaGeral telaGeralG = new TelaGeral(pessoa);
				telaGeralG.setLocationRelativeTo(null);
				telaGeralG.setVisible(true);
				
			}
		});
		btnCadastroLivro.setBackground(new Color(204, 153, 153));
		btnCadastroLivro.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCadastroLivro.setForeground(new Color(204, 51, 102));
		btnCadastroLivro.setBounds(197, 476, 146, 23);
		getContentPane().add(btnCadastroLivro);
		
		JButton btnNewButton = new JButton("VOLTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaGeral telaGeralG = new TelaGeral(pessoa);
				telaGeralG.setLocationRelativeTo(null);
				telaGeralG.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(21, 26, 89, 23);
		getContentPane().add(btnNewButton);

	}
}
