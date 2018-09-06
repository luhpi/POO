package vision;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textIdade;
	private JTextField textSalario;
	private JTextField textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setResizable(false);
		setTitle("Tela Cadastro\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 275);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(54, -1, 53, 36);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(245, 255, 250));
		lblNewLabel.setBackground(new Color(245, 255, 250));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBorder(null);
		textNome.setForeground(new Color(47, 79, 79));
		textNome.setBackground(new Color(245, 255, 250));
		textNome.setBounds(117, 8, 226, 21);
		textNome.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		panel.add(textNome);
		textNome.setColumns(20);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(54, 35, 44, 36);
		lblIdade.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdade.setForeground(new Color(245, 255, 250));
		lblIdade.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblIdade.setBackground(new Color(245, 255, 250));
		panel.add(lblIdade);
		
		textIdade = new JTextField();
		textIdade.setBorder(null);
		textIdade.setForeground(new Color(47, 79, 79));
		textIdade.setBackground(new Color(245, 255, 250));
		textIdade.setBounds(117, 44, 226, 21);
		textIdade.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		textIdade.setColumns(20);
		panel.add(textIdade);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio");
		lblSalrio.setBounds(54, 71, 53, 36);
		lblSalrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalrio.setForeground(new Color(245, 255, 250));
		lblSalrio.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblSalrio.setBackground(new Color(245, 255, 250));
		panel.add(lblSalrio);
		
		textSalario = new JTextField();
		textSalario.setBorder(null);
		textSalario.setBackground(new Color(245, 255, 250));
		textSalario.setForeground(new Color(47, 79, 79));
		textSalario.setBounds(117, 80, 226, 21);
		textSalario.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		textSalario.setColumns(20);
		panel.add(textSalario);
		
		JLabel lblrea = new JLabel("\u00C1rea");
		lblrea.setBounds(54, 107, 36, 36);
		lblrea.setHorizontalAlignment(SwingConstants.LEFT);
		lblrea.setForeground(new Color(245, 255, 250));
		lblrea.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblrea.setBackground(new Color(245, 255, 250));
		panel.add(lblrea);
		
		textArea = new JTextField();
		textArea.setBorder(null);
		textArea.setBackground(new Color(245, 255, 250));
		textArea.setForeground(new Color(47, 79, 79));
		textArea.setBounds(117, 114, 226, 21);
		textArea.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		textArea.setColumns(20);
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 255, 250));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnCadastro.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		btnCadastro.setBorderPainted(false);
		btnCadastro.setForeground(new Color(47, 79, 79));
		btnCadastro.setBackground(new Color(245, 255, 250));
		panel_1.add(btnCadastro);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		btnImprimir.setBorderPainted(false);
		btnImprimir.setForeground(new Color(47, 79, 79));
		btnImprimir.setBackground(new Color(245, 255, 250));
		panel_1.add(btnImprimir);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		ButtonGroup migos = new ButtonGroup();
				
		JRadioButton rdbtnFuncionrio = new JRadioButton("Funcion\u00E1rio");
		rdbtnFuncionrio.setBackground(new Color(47, 79, 79));
		rdbtnFuncionrio.setForeground(new Color(245, 255, 250));
		rdbtnFuncionrio.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		panel_2.add(rdbtnFuncionrio);
		
		JRadioButton rdbtnGerente = new JRadioButton("Gerente");
		rdbtnGerente.setBackground(new Color(47, 79, 79));
		rdbtnGerente.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		rdbtnGerente.setForeground(new Color(245, 255, 250));
		panel_2.add(rdbtnGerente);
		
		migos.add(rdbtnFuncionrio);
		migos.add(rdbtnGerente);

	}
}
