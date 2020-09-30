package COM.KARTHIK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.RenderingHints.Key;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ADMINLOGIN extends JFrame {
	JButton btnNewButton;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADMINLOGIN frame = new ADMINLOGIN();
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
	public ADMINLOGIN() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1365, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(1032, 179, 156, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					passwordField.setCursor(textField.getCursor());
				}
				else {
					
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 23));
		textField.setBounds(966, 241, 284, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblPassword.setBounds(1032, 308, 156, 30);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
					btnNewButton.doClick();
				}
				else{
					
				}
			}
		});
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField.setBounds(966, 362, 284, 30);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("KARTHIKEYA") && passwordField.getText().equals("KARTHIKEYA")) {
					textField.setText(null);
					passwordField.setText(null);
					new ADMINHOME().setVisible(true);
					
				}
				else {
					textField.setText(null);
					passwordField.setText(null);
					new ERROR().setVisible(true);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(ADMINLOGIN.class.getResource("/COM/KARTHIK/login.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(947, 454, 131, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new MAINPAGE().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(ADMINLOGIN.class.getResource("/COM/KARTHIK/Back.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(1149, 451, 121, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New btnRestart.setEnabled(false);abel");
		lblNewLabel_1.setIcon(new ImageIcon(ADMINLOGIN.class.getResource("/COM/KARTHIK/login Background.PNG")));
		lblNewLabel_1.setBounds(10, 11, 1329, 759);
		contentPane.add(lblNewLabel_1);
	}
}
