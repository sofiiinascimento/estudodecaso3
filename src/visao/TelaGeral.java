package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaGeral extends JFrame {

	private JPanel contentPane;
	private JTable table_1;

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

		table_1 = new JTable();
		table_1.setBounds(70, 418, 409, -188);
		contentPane.add(table_1);

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
	}
}
