package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 362);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmQ = new JMenuItem("q");
		mntmQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Wow vish = new Wow();
				getContentPane().add(vish);
				vish.setVisible(true);
			}
		});
		
		JMenuItem mntmAbrirJanela = new JMenuItem("Abrir janela");
		mntmAbrirJanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SpecialBoi ji = new SpecialBoi();
				getContentPane().add(ji);
				ji.setVisible(true);
			}
		});
		mnMenu.add(mntmAbrirJanela);
		mnMenu.add(mntmQ);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
