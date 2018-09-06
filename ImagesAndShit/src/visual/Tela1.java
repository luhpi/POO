package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Tela1 extends JFrame {

	private JPanel contentPane;
	public JLabel pepe = new JLabel(" ");
	public JLabel pepe2 = new JLabel(" ");



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() throws IOException {
		setResizable(false);
		setTitle("why?");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tela1.class.getResource("/figuras/cafe.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pepe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pepe.setVisible(false);
				pepe2.setVisible(true);
			}
		});
		ImageIcon pepe01 = new ImageIcon(ImageIO.read(Tela1.class.getResource("/figuras/1023.jpg")));
		pepe.setIcon(pepe01);
		contentPane.add(pepe, BorderLayout.CENTER);
		pepe2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pepe.setVisible(true);
				pepe2.setVisible(false);
			}
		});
		pepe2.setVisible(false);
		ImageIcon pepe02 = new ImageIcon(ImageIO.read(Tela1.class.getResource("/figuras/Sad-Memes-1.png")).getScaledInstance(620, 420, BufferedImage.SCALE_SMOOTH));
		
		pepe2.setIcon(pepe02);
		contentPane.add(pepe2, BorderLayout.NORTH);
	}

}
