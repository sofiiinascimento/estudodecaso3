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

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class TelaGeral extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable tableUsuario;
	private JScrollPane scrollPane_1;
	private JTable tableLivros;
	
	private Livro livroSelecionado;

	/**
	 * Create the frame.
	 */
	public TelaGeral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 662);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Cadastrar um livro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroLivro telaCadLivro = new TelaCadastroLivro();
				telaCadLivro.setLocationRelativeTo(null);
				telaCadLivro.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(379, 11, 143, 32);
		contentPane.add(btnNewButton);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 361, 193);
		contentPane.add(scrollPane);

		tableUsuario = new JTable();
		scrollPane.setViewportView(tableUsuario);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 214, 533, 387);
		contentPane.add(scrollPane_1);

		LivroControl livrosControl = LivroControl.getInstancia();
		ArrayList<Livro> listaLivros = livrosControl.tabelaLivros;

		tableLivros = new JTable();
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
				new String[] { "Título", "Autor", "Gênero", "Quant. Páginas" });
		tableLivros.setModel(modelo);
		if (listaLivros.size() > 0 && listaLivros != null) {
			for (Livro livro : listaLivros) {
				modelo.addRow(new Object[] { livro.getTituloLivro(), livro.getAutor(), livro.getGenero(),
						livro.getQuantPag() });
			}
		}
		tableLivros.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int posicaoPessoa = tableLivros.getSelectedRow();
				
				livroSelecionado = listaLivros.get(posicaoPessoa);
				
				livroSelecionado.getAutor();
				livroSelecionado.getGenero();
				livroSelecionado.getQuantPag();
				livroSelecionado.getTituloLivro();
				
			}
		});
		scrollPane_1.setViewportView(tableLivros);

	}
}
