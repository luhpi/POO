package main;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Tnx extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tnx frame = new Tnx();
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
	public Tnx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setClosable(true);
		setTitle("Thanks");
		setBounds(100, 100, 300, 200);
		getContentPane().setLayout(null);
		
		JLabel lblWhatAboutAn = new JLabel("what about an upvote?");
		lblWhatAboutAn.setBackground(new Color(255, 255, 255));
		lblWhatAboutAn.setBounds(0, 0, 284, 170);
		lblWhatAboutAn.setForeground(new Color(255, 0, 0));
		lblWhatAboutAn.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblWhatAboutAn.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblWhatAboutAn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tnx.class.getResource("/images/stock-photo-the-girl-in-the-pin-up-image-of-wink-european-white-caucasian-88994617.jpg")));
		lblNewLabel.setBounds(0, 0, 284, 309);
		getContentPane().add(lblNewLabel);

	}

}
