import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class HomeScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SN Waleed\\Desktop\\unnamed.png"));
		frame.setBounds(100, 100, 627, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Traditional Arabic", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(12, 318, 105, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Traditional Arabic", Font.PLAIN, 18));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(140, 318, 105, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(HomeScreen.class.getResource("/rightBank.png")));
		label.setBounds(460, 84, 149, 273);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomeScreen.class.getResource("/leftBank.png")));
		lblNewLabel.setBounds(0, 84, 149, 273);
		frame.getContentPane().add(lblNewLabel);
	}
}
