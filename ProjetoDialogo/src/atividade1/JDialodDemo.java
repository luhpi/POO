package atividade1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialodDemo extends JFrame {

	private JPanel contentPane;
	private static JDialodDemo frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JDialodDemo();
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
	public JDialodDemo() {
		setTitle("JFrame com Caixa de JDialog Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrirCaixaDe = new JButton("Abrir JDialog");
		btnAbrirCaixaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//true=modal, false=não modal
				JDialog diag= new JDialog(frame,true);
				diag.setBounds(200, 200, 250, 150);
				diag.setTitle("Caixa de Diálogo Modal");
				diag.setResizable(false);
				diag.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				diag.getContentPane().setBackground(Color.GREEN);
				diag.setVisible(true);
			}
		});
		btnAbrirCaixaDe.setBounds(10, 11, 174, 23);
		contentPane.add(btnAbrirCaixaDe);
	}
}
