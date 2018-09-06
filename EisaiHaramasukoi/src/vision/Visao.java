package vision;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.ButtonGroup;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visao extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtEndereco;
	private JButton btnGravar;
	private JButton btnLimpar;
	private JComboBox boxProfissao;
	private ButtonGroup grupo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visao frame = new Visao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Visao() throws IOException {
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 290);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setPreferredSize(new Dimension(40, 0));
		horizontalGlue.setSize(new Dimension(40, 0));
		panel.add(horizontalGlue);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(ImageIO.read(Visao.class.getResource("/images/homer.jpg")).getScaledInstance(100, 100, BufferedImage.SCALE_SMOOTH)));
		panel.add(lblIcon);
		
		JLabel label = new JLabel("Cadastro de Clientes");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Georgia", Font.BOLD, 20));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Georgia", Font.PLAIN, 15));
		panel_1.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setSize(new Dimension(30, 0));
		txtNome.setMinimumSize(new Dimension(30, 20));
		panel_1.add(txtNome);
		txtNome.setColumns(20);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Georgia", Font.PLAIN, 15));
		panel_1.add(lblSexo);
		
		grupo = new ButtonGroup();
		JRadioButton rdbtnF = new JRadioButton("F");
		rdbtnF.setActionCommand("F");
		panel_1.add(rdbtnF);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		rdbtnM.setActionCommand("M");
		panel_1.add(rdbtnM);
		
		grupo.add(rdbtnM);
		grupo.add(rdbtnF);
		
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		panel_1.add(horizontalGlue_2);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Georgia", Font.PLAIN, 15));
		panel_1.add(lblCPF);
		
		txtCPF = new JTextField();
		txtCPF.setSize(new Dimension(50, 0));
		txtCPF.setMinimumSize(new Dimension(50, 20));
		txtCPF.setColumns(15);
		panel_1.add(txtCPF);
		
		JLabel lblProfisso = new JLabel("Profiss\u00E3o");
		lblProfisso.setFont(new Font("Georgia", Font.PLAIN, 15));
		panel_1.add(lblProfisso);
		
		boxProfissao = new JComboBox();
		boxProfissao.setModel(new DefaultComboBoxModel(new String[] {"Professor", "Engenheiro", "Pedreiro", "Informata"}));
		boxProfissao.setFont(new Font("Georgia", Font.PLAIN, 15));
		panel_1.add(boxProfissao);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setFont(new Font("Georgia", Font.PLAIN, 15));
		panel_1.add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setSize(new Dimension(50, 0));
		txtEndereco.setMinimumSize(new Dimension(50, 20));
		txtEndereco.setColumns(30);
		panel_1.add(txtEndereco);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		btnGravar = new JButton("Gravar");
		
		btnGravar.setIcon(new ImageIcon(Visao.class.getResource("/images/ok1.png")));
		btnGravar.setSelectedIcon(null);
		panel_2.add(btnGravar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(Visao.class.getResource("/images/clean.png")));
		panel_2.add(btnLimpar);
	}

	public JButton getBtnGravar() {
		return btnGravar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JTextField getTxtCPF() {
		return txtCPF;
	}

	public void setTxtCPF(JTextField txtCPF) {
		this.txtCPF = txtCPF;
	}

	public JTextField getTxtEndereco() {
		return txtEndereco;
	}

	public void setTxtEndereco(JTextField txtEndereco) {
		this.txtEndereco = txtEndereco;
	}

	public JComboBox getBoxProfissao() {
		return boxProfissao;
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}



}
