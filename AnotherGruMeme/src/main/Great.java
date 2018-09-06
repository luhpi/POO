package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Great extends JFrame {

	private JPanel contentPane;
	private JTextArea lblMakeA;
	private JPanel panel01;
	private JPanel panel02;
	private JLabel label_1;
	private JTextArea txtrSetUpAnother;
	private JPanel panel03;
	private JTextArea txtrMemeGotChopped;
	private JLabel label_2;
	private JPanel panel04;
	private JTextArea textArea;
	private JLabel label_3;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	public Tnx valeu = new Tnx();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Great frame = new Great();
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
	public Great() {
		setResizable(false);
		setTitle("I can't belive I'm doing this");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Great.class.getResource("/images/Sem t\u00EDtulo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().add(valeu);
		valeu.setVisible(false);
		
		panel01 = new JPanel();
		panel01.setBounds(0, 0, 512, 326);
		contentPane.add(panel01);
		panel01.setLayout(null);
		
		JButton button = new JButton("==>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel02.setVisible(true);
				panel01.setVisible(false);
			}
		});
		button.setBackground(new Color(204, 255, 255));
		button.setBounds(340, 265, 89, 23);
		panel01.add(button);
		
		lblMakeA = new JTextArea("make a JFrame with a trending meme");
		lblMakeA.setBounds(299, 122, 166, 116);
		panel01.add(lblMakeA);
		lblMakeA.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblMakeA.setLineWrap(true);
		lblMakeA.setEditable(false);
		lblMakeA.setBackground(new Color(204, 255, 255));
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 512, 327);
		panel01.add(label);
		label.setAlignmentY(0.0f);
		label.setIcon(new ImageIcon(Great.class.getResource("/images/01.png")));
		
		panel02 = new JPanel();
		panel02.setBounds(0, 0, 504, 326);
		contentPane.add(panel02);
		panel02.setLayout(null);
		
		button_1 = new JButton("==>");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel03.setVisible(true);
				panel02.setVisible(false);
			}
		});
		button_1.setBounds(340, 265, 89, 23);
		panel02.add(button_1);
		button_1.setBackground(new Color(204, 255, 255));
		
		txtrSetUpAnother = new JTextArea("set up another meme in the icon");
		txtrSetUpAnother.setLineWrap(true);
		txtrSetUpAnother.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtrSetUpAnother.setEditable(false);
		txtrSetUpAnother.setBackground(new Color(204, 255, 255));
		txtrSetUpAnother.setBounds(305, 133, 147, 116);
		panel02.add(txtrSetUpAnother);
		
		label_1 = new JLabel("");
		label_1.setBounds(0, 0, 510, 327);
		label_1.setIcon(new ImageIcon(Great.class.getResource("/images/02.png")));
		panel02.add(label_1);
		
		panel02.setVisible(false);
		
		panel03 = new JPanel();
		panel03.setLayout(null);
		panel03.setBounds(0, 0, 512, 326);
		contentPane.add(panel03);
		
		button_2 = new JButton("==>");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel04.setVisible(true);
				panel03.setVisible(false);				
			}
		});
		button_2.setBackground(new Color(204, 255, 255));
		button_2.setBounds(340, 265, 89, 23);
		panel03.add(button_2);
		
		txtrMemeGotChopped = new JTextArea("meme got chopped off");
		txtrMemeGotChopped.setLineWrap(true);
		txtrMemeGotChopped.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		txtrMemeGotChopped.setEditable(false);
		txtrMemeGotChopped.setBackground(new Color(204, 255, 255));
		txtrMemeGotChopped.setBounds(329, 138, 119, 116);
		panel03.add(txtrMemeGotChopped);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Great.class.getResource("/images/03.png")));
		label_2.setAlignmentY(0.0f);
		label_2.setBounds(0, 0, 512, 327);
		panel03.add(label_2);
		
		panel04 = new JPanel();
		panel04.setLayout(null);
		panel04.setBounds(0, 0, 512, 326);
		contentPane.add(panel04);
		
		
		button_3 = new JButton("==>");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeu.setVisible(true);
			}
		});
		button_3.setBackground(new Color(204, 255, 255));
		button_3.setBounds(340, 265, 89, 23);
		panel04.add(button_3);
		
		textArea = new JTextArea("meme got chopped off");
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		textArea.setEditable(false);
		textArea.setBackground(new Color(204, 255, 255));
		textArea.setBounds(329, 138, 119, 116);
		panel04.add(textArea);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Great.class.getResource("/images/04.png")));
		label_3.setAlignmentY(0.0f);
		label_3.setBounds(0, 0, 512, 327);
		panel04.add(label_3);
		panel04.setVisible(false);
		panel03.setVisible(false);
	}
}
