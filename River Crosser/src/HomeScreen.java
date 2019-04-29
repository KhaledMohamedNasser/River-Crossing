import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SN Waleed\\Desktop\\unnamed.png"));
		frame.setBounds(100, 100, 633, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setFont(new Font("Traditional Arabic", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(12, 299, 105, 39);
		frame.getContentPane().add(btnNewButton);
	}

}
