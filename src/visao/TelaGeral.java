package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;

public class TelaGeral extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGeral frame = new TelaGeral();
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
	public TelaGeral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 30, 128, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Status dos livros");
		lblNewLabel.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel.setBounds(33, 34, 91, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(33, 103, 80, 110);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 192, 203));
		panel_1.setBounds(158, 103, 80, 110);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(303, 103, 80, 106);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do livro");
		lblNewLabel_1.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel_1.setBounds(33, 224, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome do livro");
		lblNewLabel_2.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel_2.setBounds(158, 224, 80, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nome do livro");
		lblNewLabel_3.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel_3.setBounds(303, 220, 80, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Status escolhido");
		lblNewLabel_4.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel_4.setBounds(33, 237, 91, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Status escolhido");
		lblNewLabel_5.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel_5.setBounds(158, 237, 100, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Status escolhido");
		lblNewLabel_6.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel_6.setBounds(303, 237, 100, 14);
		contentPane.add(lblNewLabel_6);
	}
}
