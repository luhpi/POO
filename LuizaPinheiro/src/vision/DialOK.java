package vision;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialOK extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialOK dialog = new DialOK();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialOK() {
		setTitle("Mensagem de erro");
		setBounds(100, 100, 300, 120);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setBounds(25, 31, 16, 16);
			label.setIcon(new ImageIcon(DialOK.class.getResource("/images/clean.png")));
			contentPanel.add(label);
		}
		{
			JLabel lblLoginRealizadoCom = new JLabel("Falha ao realizar login!");
			lblLoginRealizadoCom.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblLoginRealizadoCom.setBounds(69, 33, 191, 14);
			contentPanel.add(lblLoginRealizadoCom);
		}
	}

}
