package atividade3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFileChooserDemoOpen2 extends JFrame {

	private JPanel contentPane;
	private JLabel labelImagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChooserDemoOpen2 frame = new JFileChooserDemoOpen2();
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
	public JFileChooserDemoOpen2() {
		setTitle("JFileChooser com showOpenDialog()");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSelecionarNomeDe = new JButton("Selecionar figura");
		
		labelImagem = new JLabel("");
		labelImagem.setBounds(97, 75, 229, 135);
		
		btnSelecionarNomeDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser jfc= new JFileChooser();
				
				jfc.setDialogTitle("Abrir Arquivo de Imagem");
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de Imagem ", "png", "imagem");
				jfc.setFileFilter(filter);
				
				
				int opt=jfc.showOpenDialog(contentPane);
				
				if(opt==jfc.APPROVE_OPTION)
				{
					ImageIcon img;
					try {
						img = new ImageIcon(ImageIO.read(JFileChooserDemoOpen2.class.getResource("/figuras/excel.png")).getScaledInstance(labelImagem.getWidth(), labelImagem.getHeight(), BufferedImage.TYPE_INT_BGR));
						labelImagem.setIcon(img);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
									}
					
			}
		});
		btnSelecionarNomeDe.setBounds(10, 11, 204, 23);
		contentPane.add(btnSelecionarNomeDe);
		
		
		contentPane.add(labelImagem);
	}

}
