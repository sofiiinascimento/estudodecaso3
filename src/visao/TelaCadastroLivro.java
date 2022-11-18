package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroLivro extends JFrame {
	private JTextField textFieldNomeLivro;
	private JTextField textFieldNomeAutor;
	private JTextField textFieldQuantPag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroLivro frame = new TelaCadastroLivro();
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
	public TelaCadastroLivro() {
		setBackground(new Color(204, 255, 255));
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setForeground(new Color(102, 51, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 430);
		getContentPane().setLayout(null);
		
		textFieldNomeLivro = new JTextField();
		textFieldNomeLivro.setBounds(22, 97, 286, 20);
		getContentPane().add(textFieldNomeLivro);
		textFieldNomeLivro.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CADASTRE UM LIVRO");
		lblNewLabel.setFont(new Font("Segoe Script", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setBounds(109, 11, 340, 48);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Título do livro:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(153, 0, 102));
		lblNewLabel_1.setBounds(22, 74, 198, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNomeAutor_2 = new JLabel("Nome do autor:");
		lblNomeAutor_2.setForeground(new Color(153, 0, 102));
		lblNomeAutor_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNomeAutor_2.setBounds(22, 141, 160, 14);
		getContentPane().add(lblNomeAutor_2);
		
		textFieldNomeAutor = new JTextField();
		textFieldNomeAutor.setBounds(22, 166, 286, 20);
		getContentPane().add(textFieldNomeAutor);
		textFieldNomeAutor.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gênero:");
		lblNewLabel_2.setForeground(new Color(153, 0, 102));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(22, 207, 146, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade de páginas:");
		lblNewLabel_3.setForeground(new Color(153, 0, 102));
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(22, 258, 198, 25);
		getContentPane().add(lblNewLabel_3);
		
		textFieldQuantPag = new JTextField();
		textFieldQuantPag.setBounds(22, 294, 68, 20);
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
		btnCadastroLivro.setBounds(186, 341, 146, 23);
		getContentPane().add(btnCadastroLivro);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 204));
		panel.setBounds(371, 107, 115, 188);
		getContentPane().add(panel);
		
		JLabel lblNewLabel_4 = new JLabel("Capa do livro");
		lblNewLabel_4.setForeground(new Color(153, 0, 102));
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(369, 70, 117, 26);
		getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(22, 232, 125, 22);
		getContentPane().add(comboBox);
	}
}
