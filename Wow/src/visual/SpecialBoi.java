package visual;

import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;

public class SpecialBoi extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpecialBoi frame = new SpecialBoi();
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
	public SpecialBoi() {
		setClosable(true);
		setBackground(new Color(240, 240, 240));
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
