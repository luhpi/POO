package visual;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;

import java.awt.Font;
import java.beans.PropertyVetoException;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class JanelaInterna extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaInterna frame = new JanelaInterna();
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
	public JanelaInterna() {
		setClosable(true);
		setMaximizable(true);
		try {
			setClosed(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("Minha Janela Interna");
		setBounds(100, 100, 450, 300);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		JPanel painel1 = new JPanel();
		painel1.setLayout(new BorderLayout());
		painel1.add("Center", new JTextArea(5, 30));
		
		JPanel painel2 = new JPanel();
		painel2.setLayout(new BoxLayout(painel1, BoxLayout.Y_AXIS));
		painel2.add(new JCheckBox("Você está na faculdade."));
		painel2.add(new JCheckBox("Você está em casa."));
		
		splitPane.setTopComponent(painel1);
		splitPane.setBottomComponent(painel2);
		
		
		getContentPane().add(splitPane);

	}

}
