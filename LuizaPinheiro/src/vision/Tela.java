package vision;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JTextField fieldSenha;
	private JButton btnLogar;
	private JButton btnLimpar;
	private JDialog dial1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setTitle("Janela Principal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		try {
			Image image = ImageIO.read(Tela.class.getResource("/images/Login-icon.png"));
			image = image.getScaledInstance(289, 279, BufferedImage.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(image);
			label.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		label.setBounds(80, 166, 289, 279);
		contentPane.add(label);
		
		JLabel lblUsurio = new JLabel("USUARIO");
		lblUsurio.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblUsurio.setForeground(Color.WHITE);
		lblUsurio.setBounds(504, 217, 118, 31);
		contentPane.add(lblUsurio);
		
		fieldNome = new JTextField();
		fieldNome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		fieldNome.setBounds(421, 259, 289, 31);
		contentPane.add(fieldNome);
		fieldNome.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSenha.setBounds(520, 301, 86, 31);
		contentPane.add(lblSenha);
		
		fieldSenha = new JTextField();
		fieldSenha.setFont(new Font("Tahoma", Font.PLAIN, 25));
		fieldSenha.setColumns(10);
		fieldSenha.setBounds(421, 332, 289, 31);
		contentPane.add(fieldSenha);
		
		btnLogar = new JButton("Logar");
		btnLogar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogar.setIcon(new ImageIcon(Tela.class.getResource("/images/ok1.png")));
		btnLogar.setBounds(421, 395, 118, 23);
		contentPane.add(btnLogar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpar.setIcon(new ImageIcon(Tela.class.getResource("/images/clean.png")));
		btnLimpar.setBounds(592, 395, 118, 23);
		contentPane.add(btnLimpar);
		
		
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public JTextField getFieldSenha() {
		return fieldSenha;
	}

	public JButton getBtnLogar() {
		return btnLogar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}
	
	
}
