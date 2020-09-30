package COM.KARTHIK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MAINPAGE extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAINPAGE frame = new MAINPAGE();
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
	public MAINPAGE() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MAINPAGE.class.getResource("/COM/KARTHIK/SURVEY BACKGROUND.jpg")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 821, 824);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setIcon(new ImageIcon(MAINPAGE.class.getResource("/COM/KARTHIK/Close.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(642, 11, 154, 69);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("USER");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				new USERCHECK().setVisible(true);
			}
		});
		buttonGroup.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon(MAINPAGE.class.getResource("/COM/KARTHIK/index student.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(318, 11, 184, 69);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ADMIN");
		buttonGroup.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ADMINLOGIN().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(MAINPAGE.class.getResource("/COM/KARTHIK/index admin.png")));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(10, 11, 195, 69);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MAINPAGE.class.getResource("/COM/KARTHIK/clip-art-questionnaire-vector-graphics-survey-methodology-image-design.jpg")));
		lblNewLabel.setBounds(10, 11, 799, 770);
		contentPane.add(lblNewLabel);
	}
}
