import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class GUI {

	private JFrame frmRivercrosser;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmRivercrosser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRivercrosser = new JFrame();
		frmRivercrosser.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SN Waleed\\Desktop\\unnamed.png"));
		frmRivercrosser.setTitle("RiverCrosser\r\n");
		frmRivercrosser.getContentPane().setBackground(new Color(240, 255, 240));
		frmRivercrosser.getContentPane().setForeground(Color.ORANGE);
		frmRivercrosser.setBounds(100, 100, 451, 310);
		frmRivercrosser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRivercrosser.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("River Crosser");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 12, 150, 33);
		frmRivercrosser.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Snap ITC", Font.PLAIN, 14));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(152, 58, 136, 33);
		frmRivercrosser.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Load Game");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Snap ITC", Font.PLAIN, 14));
		btnNewButton_1.setBounds(152, 114, 136, 36);
		frmRivercrosser.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Quit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBounds(152, 177, 136, 33);
		frmRivercrosser.getContentPane().add(btnNewButton_2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
