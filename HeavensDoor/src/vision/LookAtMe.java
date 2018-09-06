package vision;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

public class LookAtMe extends JFrame {

	private JPanel contentPane;
	//Atualizar
	private JTextField aCodigo;
	private JTextField aNome;
	private JButton btnAtualizar;
	private JLabel aResultado;
	//Inserir
	private JTextField iNome;
	private JButton btnInserir;
	private JLabel iResultado;
	//Pesquisar
	private JTextField pCodigo;
	private JButton btnPesquisar;
	private JLabel pResultado;
	//remover
	private JTextField rCodigo;
	private JButton btnRemover;
	private JLabel rResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LookAtMe frame = new LookAtMe();
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
	public LookAtMe() {
		setResizable(false);
		setTitle("Tela Empregado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 344, 192);
		contentPane.add(tabbedPane);
		
		JPanel pAtualiza = new JPanel();
		tabbedPane.addTab("Atualizar", null, pAtualiza, null);
		pAtualiza.setLayout(null);
		
		aResultado = new JLabel("");
		aResultado.setHorizontalAlignment(SwingConstants.CENTER);
		aResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		aResultado.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		aResultado.setBackground(Color.WHITE);
		aResultado.setBounds(10, 107, 319, 36);
		pAtualiza.add(aResultado);
		
		aCodigo = new JTextField();
		aCodigo.setColumns(10);
		aCodigo.setBounds(69, 20, 260, 20);
		pAtualiza.add(aCodigo);
		
		JLabel label_1 = new JLabel("C\u00F3digo");
		label_1.setBounds(20, 23, 56, 14);
		pAtualiza.add(label_1);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(115, 73, 113, 23);
		pAtualiza.add(btnAtualizar);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 52, 56, 14);
		pAtualiza.add(lblNome);
		
		aNome = new JTextField();
		aNome.setColumns(10);
		aNome.setBounds(69, 49, 260, 20);
		pAtualiza.add(aNome);
		
		JPanel pInsere = new JPanel();
		pInsere.setLayout(null);
		tabbedPane.addTab("Inserir", null, pInsere, null);
		
		iResultado = new JLabel("");
		iResultado.setHorizontalAlignment(SwingConstants.CENTER);
		iResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		iResultado.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		iResultado.setBackground(Color.WHITE);
		iResultado.setBounds(10, 107, 319, 36);
		pInsere.add(iResultado);
		
		iNome = new JTextField();
		iNome.setColumns(10);
		iNome.setBounds(69, 20, 260, 20);
		pInsere.add(iNome);
		
		btnInserir = new JButton("Inserir");
		btnInserir.setBounds(115, 73, 113, 23);
		pInsere.add(btnInserir);
		
		JLabel label_4 = new JLabel("Nome");
		label_4.setBounds(20, 23, 56, 14);
		pInsere.add(label_4);
		
		JPanel pPesquisa = new JPanel();
		tabbedPane.addTab("Pesquisar", null, pPesquisa, null);
		pPesquisa.setLayout(null);
		
		pResultado = new JLabel("");
		pResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pResultado.setBounds(10, 107, 319, 36);
		pPesquisa.add(pResultado);
		pResultado.setHorizontalAlignment(SwingConstants.CENTER);
		pResultado.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pResultado.setBackground(Color.WHITE);
		
		pCodigo = new JTextField();
		pCodigo.setBounds(69, 20, 260, 20);
		pPesquisa.add(pCodigo);
		pCodigo.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(20, 23, 56, 14);
		pPesquisa.add(lblCdigo);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(115, 73, 113, 23);
		pPesquisa.add(btnPesquisar);
		
		
		JPanel pRemove = new JPanel();
		pRemove.setLayout(null);
		tabbedPane.addTab("Remover", null, pRemove, null);
		
		rResultado = new JLabel("");
		rResultado.setHorizontalAlignment(SwingConstants.CENTER);
		rResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rResultado.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		rResultado.setBackground(Color.WHITE);
		rResultado.setBounds(10, 107, 319, 36);
		pRemove.add(rResultado);
		
		rCodigo = new JTextField();
		rCodigo.setColumns(10);
		rCodigo.setBounds(69, 20, 260, 20);
		pRemove.add(rCodigo);
		
		JLabel label_6 = new JLabel("C\u00F3digo");
		label_6.setBounds(20, 23, 56, 14);
		pRemove.add(label_6);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(115, 73, 113, 23);
		pRemove.add(btnRemover);
	}


	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getaCodigo() {
		return aCodigo;
	}

	public JTextField getaNome() {
		return aNome;
	}



	public JLabel getaResultado() {
		return aResultado;
	}

	public JTextField getiNome() {
		return iNome;
	}

	public JButton getBtnInserir() {
		return btnInserir;
	}

	public JLabel getiResultado() {
		return iResultado;
	}

	public JTextField getpCodigo() {
		return pCodigo;
	}

	public JButton getBtnPesquisar() {
		return btnPesquisar;
	}

	public JLabel getpResultado() {
		return pResultado;
	}

	public JTextField getrCodigo() {
		return rCodigo;
	}

	public JButton getBtnRemover() {
		return btnRemover;
	}

	public JLabel getrResultado() {
		return rResultado;
	}
	
		public JButton getBtnAtualizar() {
		return btnAtualizar;
	}
}
