package GUI;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Story2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Story2 frame = new Story2();
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
	public Story2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1114, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Framer-90");
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(974, 553, 110, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Farmer-40");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(974, 599, 110, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Farmer-80");
		btnNewButton_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(852, 553, 110, 34);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Farmer-60");
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_3.setBounds(852, 599, 110, 34);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setBounds(10, 601, 97, 31);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Reset");
		btnNewButton_5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_5.setForeground(Color.BLUE);
		btnNewButton_5.setBounds(119, 601, 97, 31);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Wolf");
		btnNewButton_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_6.setForeground(Color.BLUE);
		btnNewButton_6.setBounds(743, 575, 97, 34);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Move");
		btnNewButton_7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_7.setForeground(Color.BLUE);
		btnNewButton_7.setBounds(497, 575, 97, 34);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Save");
		btnNewButton_8.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_8.setForeground(Color.BLUE);
		btnNewButton_8.setBounds(10, 555, 97, 31);
		contentPane.add(btnNewButton_8);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Story2.class.getResource("/farmerBigRight.png")));
		lblNewLabel_1.setBounds(1017, 439, 67, 88);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Story2.class.getResource("/farmerRight1.png")));
		lblNewLabel_2.setBounds(956, 432, 65, 78);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Story2.class.getResource("/farmerR3.png")));
		lblNewLabel_3.setBounds(918, 419, 56, 71);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Story2.class.getResource("/farmer5.png")));
		lblNewLabel_4.setBounds(852, 399, 67, 88);
		contentPane.add(lblNewLabel_4);
		  
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Story2.class.getResource("/Black_Right.png")));
		lblNewLabel_5.setBounds(791, 399, 56, 65);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Story2.class.getResource("/farmerBigLeft.png")));
		lblNewLabel_6.setBounds(10, 422, 67, 88);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.hide();
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Story2.class.getResource("/farmerLeft1.png")));
		lblNewLabel_7.setBounds(89, 419, 65, 78);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.hide();
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Story2.class.getResource("/farmerL3.png")));
		lblNewLabel_8.setBounds(140, 399, 76, 88);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.hide();
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Story2.class.getResource("/farmer5.png")));
		lblNewLabel_9.setBounds(194, 383, 76, 88);
		contentPane.add(lblNewLabel_9);
		lblNewLabel_9.hide();
		 
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Story2.class.getResource("/Black_Left.png")));
		lblNewLabel_10.setBounds(263, 399, 56, 65);
		contentPane.add(lblNewLabel_10);
		lblNewLabel_10.hide();
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Story2.class.getResource("/Raft.png")));
		lblNewLabel_11.setBounds(707, 483, 170, 68);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Story2.class.getResource("/RiverBig.png")));
		lblNewLabel.setBounds(0, 0, 1096, 540);
		contentPane.add(lblNewLabel);
		

		
		

    }
}
