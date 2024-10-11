import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Team3Games {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Team3Games window = new Team3Games();
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
	public Team3Games() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 650, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/coollogo_com-311863347.gif"));
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBounds(100, 11, 439, 97);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel LogoLabel = new JLabel("New label");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Team_3_Logo.jpg"));
		LogoLabel.setIcon(img);
		LogoLabel.setForeground(Color.WHITE);
		LogoLabel.setBounds(305, 176, 331, 234);
		frame.getContentPane().add(LogoLabel);
		
		JLabel LogoLabel2 = new JLabel("New label");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Team_3_Logo2.jpg"));
		LogoLabel2.setIcon(img2);
		LogoLabel2.setForeground(Color.WHITE);
		LogoLabel2.setBounds(-182, 176, 477, 247);
		frame.getContentPane().add(LogoLabel2);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 17));
		btnNewButton.setText("START");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(239, 119, 165, 39);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
