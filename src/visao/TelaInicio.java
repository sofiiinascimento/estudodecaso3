package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Panel;
import java.awt.Canvas;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

public class TelaInicio extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicio frame = new TelaInicio();
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
	public TelaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 343);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Quantidade de livros");
		lblNewLabel_1.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel_1.setBounds(232, 57, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 224));
		panel.setForeground(Color.WHITE);
		panel.setBounds(27, 11, 70, 60);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Biografia do usuário");
		lblNewLabel_2.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel_2.setBounds(27, 98, 106, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 224));
		panel_1.setBounds(0, 119, 434, 14);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 205, 170));
		panel_2.setBounds(27, 144, 94, 125);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 182, 193));
		panel_3.setBounds(160, 144, 94, 125);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(152, 251, 152));
		panel_4.setBounds(290, 144, 94, 125);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Nome do livro ");
		lblNewLabel_3.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel_3.setBounds(27, 280, 122, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nome do livro ");
		lblNewLabel_4.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel_4.setBounds(170, 280, 118, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nome do livro");
		lblNewLabel_5.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		lblNewLabel_5.setBounds(290, 280, 94, 14);
		contentPane.add(lblNewLabel_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 224));
		panel_5.setBounds(273, 35, 29, 11);
		contentPane.add(panel_5);
		
		JLabel lblNewLabel = new JLabel("Nome do usuário");
		lblNewLabel.setFont(new Font("Source Sans Pro", Font.BOLD, 14));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(27, 82, 106, 14);
		contentPane.add(lblNewLabel);
	}
}
