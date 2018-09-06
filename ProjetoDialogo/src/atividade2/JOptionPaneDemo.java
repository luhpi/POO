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
	private Object[] obj={"Internacional", "Gr�mio"};
	private Object[] btn={"Bot�o 1", "Bot�o 2", "Bot�o 3"};

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
				//JOptionPane.showMessageDialog(contentPane, "O Gr�mio n�o tem Mundial!!!");
				//JOptionPane.showMessageDialog(contentPane,"O Gr�mio n�o tem Mundial!", "Aten��o - Aviso Importante", 1, new ImageIcon(JOptionPaneDemo.class.getResource("/figuras/ok1.png")));
				
				//JOptionPane.showInputDialog
				//String recebeTexto=JOptionPane.showInputDialog(contentPane,"Quem tem Mundial?");
				//String recebeTexto=(String) JOptionPane.showInputDialog(contentPane,"Quem tem Mundial?","Aten��o - Quest�o importante",1, new ImageIcon(JOptionPaneDemo.class.getResource("/figuras/ok1.png")),obj,"Internacional");
				//System.out.println(recebeTexto);
				
				//JOptionPane.showConfirmDialog
				//int recebeNum=JOptionPane.showConfirmDialog(contentPane, "O Gr�mio tem Mundial?");
				//int recebeNum=JOptionPane.showConfirmDialog(contentPane,"O Gr�mio tem Mundial?", "Aten��o - Confirma��o Importante", 2,2, new ImageIcon(JOptionPaneDemo.class.getResource("/figuras/ok1.png")));
				//System.out.println(recebeNum);
				
				//JOptionPane.showOptionDialog
				//int recebeNum=JOptionPane.showOptionDialog(contentPane,"O Gr�mio tem Mundial?", "Aten��o, quest�o importante",0,2,new ImageIcon(JOptionPaneDemo.class.getResource("/figuras/ok1.png")),btn,"Bot�o 2");
			}
		});
		btnAbrirJoptionpane.setBounds(10, 11, 167, 23);
		contentPane.add(btnAbrirJoptionpane);
	}

}
