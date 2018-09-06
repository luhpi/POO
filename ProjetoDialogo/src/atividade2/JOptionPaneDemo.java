package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JOptionPaneDemo extends JFrame {

	private JPanel contentPane;
	private Object[] obj={"Internacional", "Grêmio"};
	private Object[] btn={"Botão 1", "Botão 2", "Botão 3"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneDemo frame = new JOptionPaneDemo();
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
	public JOptionPaneDemo() {
		setTitle("JFrame com JOptionPane Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrirJoptionpane = new JButton("Abrir JOPtionPane");
		btnAbrirJoptionpane.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessage
				//JOptionPane.showMessageDialog(contentPane, "O Grêmio não tem Mundial!!!");
				//JOptionPane.showMessageDialog(contentPane,"O Grêmio não tem Mundial!", "Atenção - Aviso Importante", 1, new ImageIcon(JOptionPaneDemo.class.getResource("/figuras/ok1.png")));
				
				//JOptionPane.showInputDialog
				//String recebeTexto=JOptionPane.showInputDialog(contentPane,"Quem tem Mundial?");
				//String recebeTexto=(String) JOptionPane.showInputDialog(contentPane,"Quem tem Mundial?","Atenção - Questão importante",1, new ImageIcon(JOptionPaneDemo.class.getResource("/figuras/ok1.png")),obj,"Internacional");
				//System.out.println(recebeTexto);
				
				//JOptionPane.showConfirmDialog
				//int recebeNum=JOptionPane.showConfirmDialog(contentPane, "O Grêmio tem Mundial?");
				//int recebeNum=JOptionPane.showConfirmDialog(contentPane,"O Grêmio tem Mundial?", "Atenção - Confirmação Importante", 2,2, new ImageIcon(JOptionPaneDemo.class.getResource("/figuras/ok1.png")));
				//System.out.println(recebeNum);
				
				//JOptionPane.showOptionDialog
				//int recebeNum=JOptionPane.showOptionDialog(contentPane,"O Grêmio tem Mundial?", "Atenção, questão importante",0,2,new ImageIcon(JOptionPaneDemo.class.getResource("/figuras/ok1.png")),btn,"Botão 2");
			}
		});
		btnAbrirJoptionpane.setBounds(10, 11, 167, 23);
		contentPane.add(btnAbrirJoptionpane);
	}

}
