package a01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import visual.Wow;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class Ex01 extends JFrame {

	private JPanel frame1;
	public JLabel labelzinha = new JLabel("");

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex01 frame = new Ex01();
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
	public Ex01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		frame1 = new JPanel();
		frame1.setBackground(Color.BLACK);
		frame1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frame1);
		
		labelzinha.setBounds(189, 117, 46, 14);
		frame1.add(labelzinha);
		
		JButton btnAbrirCaixaDe = new JButton("what's in the box?");
		btnAbrirCaixaDe.setBorder(null);
		btnAbrirCaixaDe.setBackground(Color.BLACK);
		btnAbrirCaixaDe.setForeground(Color.GREEN);
		btnAbrirCaixaDe.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnAbrirCaixaDe.setBounds(132, 87, 168, 75);
		btnAbrirCaixaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser choose = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Images ('.gif', '.png', '.jpg')", "gif", "png", "jpg" );
				choose.setFileFilter(filter);
				choose.showOpenDialog(frame1);
				int aux = choose.showSaveDialog(contentPane)
				if(aux==choose.)

				labelzinha.setIcon(new ImageIcon(Ex01.class.getResource(choose.getSelectedFile())));
						
			}
		});
		frame1.setLayout(null);
		frame1.add(btnAbrirCaixaDe);
		
		
	}
}
