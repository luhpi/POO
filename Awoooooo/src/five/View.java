package five;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class View extends JFrame {

	private JPanel contentPane;
	private boolean start = false;
	public JLabel lblA1;
	public JLabel lblA2;
	public JLabel lblA3;
	public JLabel lblB1;
	public JLabel lblB2;
	public JLabel lblB3;
	public JLabel lblC1;
	public JLabel lblC2;
	public JLabel lblC3;
	private JLabel dog;
	public JButton btnStopPls;
	public JButton btnStart;
	public JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	public View() {
		setResizable(false);
		setTitle("i told yuo abou the stairs");
		setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/six/3PtbYnKx_400x400.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 590);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(View.class.getResource("/six/Webp.net-resizeimage.jpg")));
		label.setBounds(110, 110, 300, 274);
		label.setVisible(false);
		contentPane.add(label);
		
		btnStopPls = new JButton("stop pls");
		btnStopPls.setBorder(null);
		btnStopPls.setBackground(Color.YELLOW);
		btnStopPls.setForeground(Color.BLUE);
		btnStopPls.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnStopPls.setBounds(107, 515, 115, 25);
		contentPane.add(btnStopPls);
		
		btnStart = new JButton("start");
		btnStart.setBorder(null);
		btnStart.setBackground(Color.YELLOW);
		btnStart.setForeground(Color.BLUE);
		btnStart.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnStart.setBounds(307, 515, 115, 25);
		btnStart.setVisible(true);
		contentPane.add(btnStart);
		
		dog = new JLabel("");
		dog.setVisible(false);
		dog.setIcon(new ImageIcon(View.class.getResource("/six/3PtbYnKx_400x400.jpg")));
		dog.setBounds(60, 60, 400, 400);
		contentPane.add(dog);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.MAGENTA, 5));
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 10, 500, 500);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		lblA1 = new JLabel("0");
		lblA1.setBorder(new LineBorder(Color.GREEN, 3));
		lblA1.setForeground(Color.RED);
		lblA1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblA1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblA1);
		
		lblA2 = new JLabel("0");
		lblA2.setBorder(new LineBorder(Color.GREEN, 3));
		lblA2.setForeground(Color.RED);
		lblA2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblA2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblA2);
		
		lblA3 = new JLabel("0");
		lblA3.setBorder(new LineBorder(Color.GREEN, 3));
		lblA3.setForeground(Color.RED);
		lblA3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblA3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblA3);
		
		lblB1 = new JLabel("0");
		lblB1.setBorder(new LineBorder(Color.GREEN, 3));
		lblB1.setForeground(Color.RED);
		lblB1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblB1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblB1);
		
		lblB2 = new JLabel("0");
		lblB2.setBorder(new LineBorder(Color.GREEN, 3));
		lblB2.setForeground(Color.RED);
		lblB2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblB2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblB2);
		
		lblB3 = new JLabel("0");
		lblB3.setBorder(new LineBorder(Color.GREEN, 3));
		lblB3.setForeground(Color.RED);
		lblB3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblB3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblB3);
		
		lblC1 = new JLabel("0");
		lblC1.setBorder(new LineBorder(Color.GREEN, 3));
		lblC1.setForeground(Color.RED);
		lblC1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblC1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblC1);
		
		lblC2 = new JLabel("0");
		lblC2.setBorder(new LineBorder(Color.GREEN, 3));
		lblC2.setForeground(Color.RED);
		lblC2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblC2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblC2);
		
		lblC3 = new JLabel("0");
		lblC3.setBorder(new LineBorder(Color.GREEN, 3));
		lblC3.setForeground(Color.RED);
		lblC3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblC3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblC3);
		
		
	}

	public JLabel getLblA1() {
		return lblA1;
	}

	public void setLblA1(JLabel lblA1) {
		this.lblA1 = lblA1;
	}

	public JLabel getLblA2() {
		return lblA2;
	}

	public void setLblA2(JLabel lblA2) {
		this.lblA2 = lblA2;
	}

	public JLabel getLblA3() {
		return lblA3;
	}

	public void setLblA3(JLabel lblA3) {
		this.lblA3 = lblA3;
	}

	public JLabel getLblB1() {
		return lblB1;
	}

	public void setLblB1(JLabel lblB1) {
		this.lblB1 = lblB1;
	}

	public JLabel getLblB2() {
		return lblB2;
	}

	public void setLblB2(JLabel lblB2) {
		this.lblB2 = lblB2;
	}

	public JLabel getLblB3() {
		return lblB3;
	}

	public void setLblB3(JLabel lblB3) {
		this.lblB3 = lblB3;
	}

	public JLabel getLblC1() {
		return lblC1;
	}

	public void setLblC1(JLabel lblC1) {
		this.lblC1 = lblC1;
	}

	public JLabel getLblC2() {
		return lblC2;
	}

	public void setLblC2(JLabel lblC2) {
		this.lblC2 = lblC2;
	}

	public JLabel getLblC3() {
		return lblC3;
	}

	public void setLblC3(JLabel lblC3) {
		this.lblC3 = lblC3;
	}

	public JLabel getDog() {
		return dog;
	}

	public void setDog(JLabel dog) {
		this.dog = dog;
	}

	public JButton getBtnStopPls() {
		return btnStopPls;
	}

	public JButton getBtnStart() {
		return btnStart;
	}

	public JLabel getLabel() {
		return label;
	}
	
}
