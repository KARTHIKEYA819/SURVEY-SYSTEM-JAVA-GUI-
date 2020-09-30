package COM.KARTHIK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DELETEQUESTION extends JFrame {
    Connection con;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField question;
	private JTextField OPTIONA;
	private JTextField OPTIONB;
	private JTextField OPTIONC;
	private JTextField OPTIOND;
	private JTextField OPTIONE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DELETEQUESTION frame = new DELETEQUESTION();
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
	public DELETEQUESTION() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DELETEQUESTION.class.getResource("/COM/KARTHIK/delete Question.png")));
		lblNewLabel.setBounds(0, 0, 67, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DELETE QUESTION");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 65));
		lblNewLabel_1.setBounds(77, 8, 656, 52);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(DELETEQUESTION.class.getResource("/COM/KARTHIK/Close.png")));
		btnNewButton.setBounds(829, 0, 89, 69);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 84, 908, 2);
		contentPane.add(separator);
		
		JLabel label = new JLabel("QUESTION CODE :");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(120, 97, 188, 25);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(318, 96, 169, 26);
		contentPane.add(textField);
		
		JButton button = new JButton("SEARCH");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String code = textField.getText();
				textField.setEditable(false);
				String query = " select * from surveysystem.surveyquestions where code='"+code+"';";
				try {
					Class.forName("com.mysql.jdbc.Driver");
					try {
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
						Statement stmt = con.createStatement();
						ResultSet rs = stmt.executeQuery(query);
						while(rs.next()) {
							question.setText(rs.getString("QUESTION"));
							OPTIONA.setText(rs.getString("OPT1"));
							OPTIONB.setText(rs.getString("OPT2"));
							OPTIONC.setText(rs.getString("OPT3"));
							OPTIOND.setText(rs.getString("OPT4"));
							OPTIONE.setText(rs.getString("OPT5"));
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(520, 96, 139, 25);
		contentPane.add(button);
		
		question = new JTextField();
		question.setFont(new Font("Tahoma", Font.BOLD, 15));
		question.setColumns(10);
		question.setBounds(282, 161, 590, 20);
		contentPane.add(question);
		
		OPTIONA = new JTextField();
		OPTIONA.setFont(new Font("Tahoma", Font.BOLD, 15));
		OPTIONA.setColumns(10);
		OPTIONA.setBounds(282, 213, 590, 20);
		contentPane.add(OPTIONA);
		
		OPTIONB = new JTextField();
		OPTIONB.setFont(new Font("Tahoma", Font.BOLD, 15));
		OPTIONB.setColumns(10);
		OPTIONB.setBounds(282, 270, 590, 20);
		contentPane.add(OPTIONB);
		
		OPTIONC = new JTextField();
		OPTIONC.setFont(new Font("Tahoma", Font.BOLD, 15));
		OPTIONC.setColumns(10);
		OPTIONC.setBounds(282, 327, 590, 20);
		contentPane.add(OPTIONC);
		
		OPTIOND = new JTextField();
		OPTIOND.setFont(new Font("Tahoma", Font.BOLD, 15));
		OPTIOND.setColumns(10);
		OPTIOND.setBounds(282, 385, 590, 20);
		contentPane.add(OPTIOND);
		
		OPTIONE = new JTextField();
		OPTIONE.setFont(new Font("Tahoma", Font.BOLD, 15));
		OPTIONE.setColumns(10);
		OPTIONE.setBounds(282, 440, 590, 20);
		contentPane.add(OPTIONE);
		
		JLabel label_1 = new JLabel("QUESTION :");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		label_1.setBounds(120, 155, 142, 26);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("OPTION A :");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		label_2.setBounds(120, 207, 142, 26);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("OPTION B :");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		label_3.setBounds(120, 264, 142, 26);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("OPTION C :");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 21));
		label_4.setBounds(120, 321, 142, 26);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("OPTION D :");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 21));
		label_5.setBounds(120, 379, 142, 26);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("OPTION E :");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 21));
		label_6.setBounds(120, 434, 142, 26);
		contentPane.add(label_6);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setToolTipText("YOU CAN ONLY DELETE LAST ENTERED QUESTION ONLY");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					try {
						PreparedStatement ptmt = con.prepareStatement("DELETE FROM `surveysystem`.`surveyquestions` where code=?");
						ptmt.setString(1,textField.getText());
						ptmt.executeUpdate();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				textField.setText(null);
				textField.setEditable(true);
				question.setText(null);
				OPTIONA.setText(null);
				OPTIONB.setText(null);
				OPTIONC.setText(null);
				OPTIOND.setText(null);
				OPTIONE.setText(null);
			}
		});
		btnDelete.setIcon(new ImageIcon(DELETEQUESTION.class.getResource("/COM/KARTHIK/delete.png")));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(318, 490, 139, 31);
		contentPane.add(btnDelete);
		
		JButton button_2 = new JButton("CLEAR");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField.setEditable(true);
				question.setText(null);
				OPTIONA.setText(null);
				OPTIONB.setText(null);
				OPTIONC.setText(null);
				OPTIOND.setText(null);
				OPTIONE.setText(null);
			}
		});
		button_2.setIcon(new ImageIcon(DELETEQUESTION.class.getResource("/COM/KARTHIK/clear.png")));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(614, 494, 139, 23);
		contentPane.add(button_2);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(DELETEQUESTION.class.getResource("/COM/KARTHIK/pages background student.jpg")));
		label_7.setBounds(0, 0, 918, 548);
		contentPane.add(label_7);
	}
}
