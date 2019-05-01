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
		setBounds(100, 100, 948, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Canvas canvas=new Canvas();
		canvas.setBounds(0, 0, 930, 462);
		
		contentPane.add(canvas);
		
		JButton btnNewButton = new JButton("Framer-90");
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(808, 468, 110, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Farmer-40");
		btnNewButton_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(808, 515, 110, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Farmer-80");
		btnNewButton_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(661, 466, 110, 34);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Farmer-60");
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_3.setBounds(661, 515, 110, 34);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setBounds(12, 515, 97, 31);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Reset");
		btnNewButton_5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_5.setForeground(Color.BLUE);
		btnNewButton_5.setBounds(121, 515, 97, 31);
		contentPane.add(btnNewButton_5);
		//setContentPane(contentPane);
	}
}
