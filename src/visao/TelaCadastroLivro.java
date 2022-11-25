package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroLivro extends JFrame {
	private JTextField textFieldNomeLivro;
	private JTextField textFieldNomeAutor;
	private JTextField textFieldQuantPag;
	private JComboBox areraGenero;

	/**
	 * Create the frame.
	 */
	public TelaCadastroLivro() {
		setBackground(new Color(204, 255, 255));
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setForeground(new Color(102, 51, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 562);
		getContentPane().setLayout(null);

		textFieldNomeLivro = new JTextField();
		textFieldNomeLivro.setBounds(22, 150, 286, 20);
		getContentPane().add(textFieldNomeLivro);
		textFieldNomeLivro.setColumns(10);

		JLabel lblNewLabel = new JLabel("CADASTRE UM LIVRO");
		lblNewLabel.setFont(new Font("Segoe Script", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setBounds(100, 60, 340, 48);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Título do livro:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(153, 0, 102));
		lblNewLabel_1.setBounds(22, 125, 198, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNomeAutor_2 = new JLabel("Nome do autor:");
		lblNomeAutor_2.setForeground(new Color(153, 0, 102));
		lblNomeAutor_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNomeAutor_2.setBounds(22, 202, 160, 14);
		getContentPane().add(lblNomeAutor_2);

		textFieldNomeAutor = new JTextField();
		textFieldNomeAutor.setBounds(22, 227, 286, 20);
		getContentPane().add(textFieldNomeAutor);
		textFieldNomeAutor.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Gênero:");
		lblNewLabel_2.setForeground(new Color(153, 0, 102));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(22, 274, 146, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Quantidade de páginas:");
		lblNewLabel_3.setForeground(new Color(153, 0, 102));
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(22, 344, 198, 25);
		getContentPane().add(lblNewLabel_3);

		textFieldQuantPag = new JTextField();
		textFieldQuantPag.setBounds(22, 380, 68, 20);
		getContentPane().add(textFieldQuantPag);
		textFieldQuantPag.setColumns(10);

		JButton btnCadastroLivro = new JButton("Cadastrar");
		btnCadastroLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastroLivro.setBackground(new Color(204, 153, 153));
		btnCadastroLivro.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCadastroLivro.setForeground(new Color(204, 51, 102));
		btnCadastroLivro.setBounds(196, 450, 146, 23);
		getContentPane().add(btnCadastroLivro);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 204));
		panel.setBounds(369, 181, 115, 188);
		getContentPane().add(panel);

		JLabel lblNewLabel_4 = new JLabel("Capa do livro");
		lblNewLabel_4.setForeground(new Color(153, 0, 102));
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(367, 144, 117, 26);
		getContentPane().add(lblNewLabel_4);

		JComboBox<String> comboboxGenero = new JComboBox<>();
		comboboxGenero.setBounds(22, 299, 115, 22);
		comboboxGenero.addItem("Sr");
		comboboxGenero.addItem("Sra");
		comboboxGenero.addItem("Srta");
		getContentPane().add(comboboxGenero);
		
		JButton btnNewButton = new JButton("VOLTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaGeral telaGeralG = new TelaGeral();
				telaGeralG.setLocationRelativeTo(null);
				telaGeralG.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(21, 26, 89, 23);
		getContentPane().add(btnNewButton);

	}
}
