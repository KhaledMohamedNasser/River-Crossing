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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class FirstScene {

	private JFrame frmRivercrosser;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstScene window = new FirstScene();
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
	public FirstScene() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRivercrosser = new JFrame();
		frmRivercrosser.setAlwaysOnTop(true);
		frmRivercrosser.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SN Waleed\\Desktop\\unnamed.png"));
		frmRivercrosser.setTitle("RiverCrosser\r\n");
		frmRivercrosser.getContentPane().setBackground(new Color(240, 255, 240));
		frmRivercrosser.getContentPane().setForeground(Color.ORANGE);
		frmRivercrosser.setBounds(100, 100, 503, 486);
		frmRivercrosser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("New Game");
		btnNewButton.setBounds(25, 149, 136, 33);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRivercrosser.dispose();
				HomeScreen screen=new HomeScreen();
			}
		});
		btnNewButton.setFont(new Font("Snap ITC", Font.PLAIN, 14));
		btnNewButton.setForeground(Color.BLUE);
		
		JButton btnNewButton_1 = new JButton("Load Game");
		btnNewButton_1.setBounds(185, 208, 136, 36);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Snap ITC", Font.PLAIN, 14));
		
		JButton btnNewButton_2 = new JButton("Quit");
		btnNewButton_2.setBounds(337, 290, 136, 33);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmRivercrosser.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		btnNewButton_2.setForeground(Color.BLUE);
		frmRivercrosser.getContentPane().setLayout(null);
		frmRivercrosser.getContentPane().add(btnNewButton);
		frmRivercrosser.getContentPane().add(btnNewButton_1);
		frmRivercrosser.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FirstScene.class.getResource("/ICrosser.jpg")));
		lblNewLabel.setBounds(0, 0, 482, 442);
		frmRivercrosser.getContentPane().add(lblNewLabel);
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
