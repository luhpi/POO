package vision;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	public JTextPane txtCadastro = new JTextPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setResizable(false);
		setTitle("Cadastros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 275);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		

		txtCadastro.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtCadastro.setForeground(new Color(245, 255, 250));
		txtCadastro.setBackground(new Color(47, 79, 79));
		txtCadastro.setToolTipText("");
		scrollPane.setViewportView(txtCadastro);		
		JButton btnOkay = new JButton("Okay");
		btnOkay.setBorder(null);
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose(); 
			}
		});
		btnOkay.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnOkay.setForeground(new Color(47, 79, 79));
		btnOkay.setBackground(new Color(245, 255, 250));
		contentPane.add(btnOkay, BorderLayout.SOUTH);
	}

}
