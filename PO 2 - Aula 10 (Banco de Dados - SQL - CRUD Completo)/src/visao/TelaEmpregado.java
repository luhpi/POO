package visao;

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
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class TelaEmpregado extends JFrame {

	private JPanel contentPane;
	
	// Buttons
	public JButton btnCriar;
	public JButton btnConsultar;
	public JButton btnAtualizar;
	public JButton btnDeletar;
	
	public JLabel lblNomeEmpregado;	// Read
	public JLabel lblNomeDeletado;	// Delete
	
	// Create
	public JTextField FieldCodigoCreate;
	public JTextField FieldNomeCreate;
	
	// Read
	public JTextField FieldCodigoRead;
	
	// Update
	public JTextField FieldCodigoUpdate;
	public JTextField FieldNomeUpdate;
	
	// Delete
	public JTextField FieldCodigoDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEmpregado frame = new TelaEmpregado();
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
	public TelaEmpregado() {
		setTitle("Empregados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(204, 153, 255));
		contentPane.add(tabbedPane);
		
		JPanel panelCreate = new JPanel();
		panelCreate.setBackground(new Color(255, 153, 102));
		panelCreate.setLayout(null);
		panelCreate.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null)))));
		tabbedPane.addTab("Create", null, panelCreate, null);
		
		JLabel lblCreate = new JLabel("Create");
		lblCreate.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblCreate.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreate.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		lblCreate.setBounds(33, 60, 364, 36);
		panelCreate.add(lblCreate);
		
		JLabel lblCodigoCreate = new JLabel("Codigo do empregado:");
		lblCodigoCreate.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblCodigoCreate.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCodigoCreate.setBounds(33, 145, 217, 36);
		panelCreate.add(lblCodigoCreate);
		
		JLabel lblNomeCreate = new JLabel("Nome do empregado:");
		lblNomeCreate.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNomeCreate.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNomeCreate.setBounds(33, 192, 217, 36);
		panelCreate.add(lblNomeCreate);
		
		FieldCodigoCreate = new JTextField();
		FieldCodigoCreate.setBackground(new Color(255, 204, 153));
		FieldCodigoCreate.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		FieldCodigoCreate.setColumns(10);
		FieldCodigoCreate.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
		FieldCodigoCreate.setBounds(260, 145, 137, 36);
		panelCreate.add(FieldCodigoCreate);
		
		FieldNomeCreate = new JTextField();
		FieldNomeCreate.setBackground(new Color(255, 204, 153));
		FieldNomeCreate.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		FieldNomeCreate.setColumns(10);
		FieldNomeCreate.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
		FieldNomeCreate.setBounds(260, 192, 137, 36);
		panelCreate.add(FieldNomeCreate);
		
		btnCriar = new JButton("Criar");
		btnCriar.setBackground(new Color(255, 153, 102));
		btnCriar.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new EtchedBorder(EtchedBorder.RAISED, null, null)));
		btnCriar.setBounds(171, 239, 94, 36);
		panelCreate.add(btnCriar);
		
		JPanel panelRead = new JPanel();
		panelRead.setBackground(new Color(255, 255, 153));
		tabbedPane.addTab("Read", null, panelRead, null);
		panelRead.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null)))));
		panelRead.setLayout(null);
		
		JLabel lblRead = new JLabel("Read");
		lblRead.setHorizontalAlignment(SwingConstants.CENTER);
		lblRead.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		lblRead.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblRead.setBounds(31, 60, 364, 36);
		panelRead.add(lblRead);
		
		JLabel lblCodigoRead = new JLabel("Codigo do empregado:");
		lblCodigoRead.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCodigoRead.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblCodigoRead.setBounds(33, 139, 217, 36);
		panelRead.add(lblCodigoRead);
		
		FieldCodigoRead = new JTextField();
		FieldCodigoRead.setBackground(new Color(255, 255, 204));
		FieldCodigoRead.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		FieldCodigoRead.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
		FieldCodigoRead.setBounds(260, 139, 137, 36);
		panelRead.add(FieldCodigoRead);
		FieldCodigoRead.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(new Color(255, 255, 153));
		btnConsultar.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new EtchedBorder(EtchedBorder.RAISED, null, null)));
		btnConsultar.setBounds(165, 186, 94, 36);
		panelRead.add(btnConsultar);
		
		lblNomeEmpregado = new JLabel("");
		lblNomeEmpregado.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNomeEmpregado.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNomeEmpregado.setBounds(53, 233, 314, 36);
		panelRead.add(lblNomeEmpregado);
		
		JPanel panelUpdate = new JPanel();
		panelUpdate.setBackground(new Color(153, 255, 204));
		panelUpdate.setLayout(null);
		panelUpdate.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null)))));
		tabbedPane.addTab("Update", null, panelUpdate, null);
		
		JLabel lblUpdate = new JLabel("Update");
		lblUpdate.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdate.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		lblUpdate.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblUpdate.setBounds(33, 60, 364, 36);
		panelUpdate.add(lblUpdate);
		
		JLabel lblCodigoUpdate = new JLabel("Codigo do empregado:");
		lblCodigoUpdate.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblCodigoUpdate.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCodigoUpdate.setBounds(33, 145, 217, 36);
		panelUpdate.add(lblCodigoUpdate);
		
		JLabel lblNomeUpdate = new JLabel("Nome do empregado:");
		lblNomeUpdate.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNomeUpdate.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNomeUpdate.setBounds(33, 192, 217, 36);
		panelUpdate.add(lblNomeUpdate);
		
		FieldCodigoUpdate = new JTextField();
		FieldCodigoUpdate.setBackground(new Color(204, 255, 204));
		FieldCodigoUpdate.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		FieldCodigoUpdate.setColumns(10);
		FieldCodigoUpdate.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
		FieldCodigoUpdate.setBounds(260, 145, 137, 36);
		panelUpdate.add(FieldCodigoUpdate);
		
		FieldNomeUpdate = new JTextField();
		FieldNomeUpdate.setBackground(new Color(204, 255, 204));
		FieldNomeUpdate.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		FieldNomeUpdate.setColumns(10);
		FieldNomeUpdate.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
		FieldNomeUpdate.setBounds(260, 192, 137, 36);
		panelUpdate.add(FieldNomeUpdate);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(new Color(153, 255, 204));
		btnAtualizar.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new EtchedBorder(EtchedBorder.RAISED, null, null)));
		btnAtualizar.setBounds(171, 239, 94, 36);
		panelUpdate.add(btnAtualizar);
		
		JPanel panelDelete = new JPanel();
		panelDelete.setLayout(null);
		panelDelete.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null)))));
		panelDelete.setBackground(new Color(153, 204, 255));
		tabbedPane.addTab("Delete", null, panelDelete, null);
		
		JLabel lblDelete = new JLabel("Delete");
		lblDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelete.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		lblDelete.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblDelete.setBounds(31, 60, 364, 36);
		panelDelete.add(lblDelete);
		
		JLabel lblCodigoDelete = new JLabel("Codigo do empregado:");
		lblCodigoDelete.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblCodigoDelete.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCodigoDelete.setBounds(33, 139, 217, 36);
		panelDelete.add(lblCodigoDelete);
		
		FieldCodigoDelete = new JTextField();
		FieldCodigoDelete.setBackground(new Color(204, 255, 255));
		FieldCodigoDelete.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		FieldCodigoDelete.setColumns(10);
		FieldCodigoDelete.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
		FieldCodigoDelete.setBounds(260, 139, 137, 36);
		panelDelete.add(FieldCodigoDelete);
		
		btnDeletar = new JButton("Deletar");
		btnDeletar.setBackground(new Color(153, 204, 255));
		btnDeletar.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new EtchedBorder(EtchedBorder.RAISED, null, null)));
		btnDeletar.setBounds(165, 186, 94, 36);
		panelDelete.add(btnDeletar);
		
		lblNomeDeletado = new JLabel("");
		lblNomeDeletado.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNomeDeletado.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNomeDeletado.setBounds(53, 233, 314, 36);
		panelDelete.add(lblNomeDeletado);
	}

	public JButton getBtnCriar() {
		return btnCriar;
	}

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public JButton getBtnAtualizar() {
		return btnAtualizar;
	}

	public JButton getBtnDeletar() {
		return btnDeletar;
	}

	public JLabel getLblNomeEmpregado() {
		return lblNomeEmpregado;
	}

	public JLabel getLblNomeDeletado() {
		return lblNomeDeletado;
	}

	public JTextField getFieldCodigoCreate() {
		return FieldCodigoCreate;
	}

	public JTextField getFieldNomeCreate() {
		return FieldNomeCreate;
	}

	public JTextField getFieldCodigoRead() {
		return FieldCodigoRead;
	}

	public JTextField getFieldCodigoUpdate() {
		return FieldCodigoUpdate;
	}

	public JTextField getFieldNomeUpdate() {
		return FieldNomeUpdate;
	}

	public JTextField getFieldCodigoDelete() {
		return FieldCodigoDelete;
	}
	

}
