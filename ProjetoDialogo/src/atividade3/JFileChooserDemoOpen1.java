package atividade3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class JFileChooserDemoOpen1 extends JFrame {

	private JPanel contentPane;
	private JLabel labelMensagem ;
	private JTextField fieldMensagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChooserDemoOpen1 frame = new JFileChooserDemoOpen1();
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
	public JFileChooserDemoOpen1() {
		setTitle("JFileChooser com showOpenDialog()");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSelecionarNomeDe = new JButton("Selecionar nome de Arquivo");
		btnSelecionarNomeDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser jfc= new JFileChooser();
				
				jfc.setDialogTitle("Abrir Arquivo de Texto");
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de Texto ", "txt", "text");
				jfc.setFileFilter(filter);
				
				int opt=jfc.showOpenDialog(contentPane);
				
				if(opt==jfc.APPROVE_OPTION)
				{
					fieldMensagem.setText(jfc.getSelectedFile().getName());
				}
					
			}
		});
		btnSelecionarNomeDe.setBounds(10, 11, 204, 23);
		contentPane.add(btnSelecionarNomeDe);
		
		labelMensagem = new JLabel("Nome do Arquivo");
		labelMensagem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelMensagem.setBounds(254, 192, 170, 14);
		contentPane.add(labelMensagem);
		
		fieldMensagem = new JTextField();
		fieldMensagem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fieldMensagem.setBounds(254, 214, 170, 20);
		contentPane.add(fieldMensagem);
		fieldMensagem.setColumns(10);
	}
}
