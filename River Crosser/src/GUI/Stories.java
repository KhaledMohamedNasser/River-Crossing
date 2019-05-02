package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stories extends JFrame {

	private JPanel contentPane;
	private static Stories frame = new Stories();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public Stories() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Story One");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				playFrame story =new playFrame();
				story.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(12, 183, 121, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Story Two");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Story2 story =new Story2();
				story.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(12, 276, 121, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Load Game");
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBounds(259, 232, 130, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Stories.class.getResource("/ICrosser.jpg")));
		lblNewLabel.setBounds(0, 0, 483, 446);
		contentPane.add(lblNewLabel);
	}
}
