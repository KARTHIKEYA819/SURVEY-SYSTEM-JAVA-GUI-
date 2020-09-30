package COM.KARTHIK;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ADDNEWQUESTION extends JFrame {
	Connection con;
	Connection con1;
    private JLabel lblNewLabel_4;
	private JPanel contentPane;
	private JTextField QUESTION;
	private JTextField OPTION1;
	private JTextField OPTION2;
	private JTextField OPTION3;
	private JTextField OPTION4;
	private JTextField OPTION5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADDNEWQUESTION frame = new ADDNEWQUESTION();
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
	void createconnection() {
		try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
				Statement stmt10 = con.createStatement();
				ResultSet rs10 = stmt10.executeQuery("select count(question) from `surveysystem`.`surveyquestions`;");
				while(rs10.first()) {
					int i = rs10.getInt(1);
					i = i+1;
					String str = String.valueOf(i);
					lblNewLabel_4.setText(str);
					stmt10.close();
					con.close();
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public ADDNEWQUESTION() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 934, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ADDNEWQUESTION.class.getResource("/COM/KARTHIK/add new question.png")));
		lblNewLabel.setBounds(10, 0, 60, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ADD NEW QUESTION");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel_1.setBounds(97, 7, 622, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(ADDNEWQUESTION.class.getResource("/COM/KARTHIK/Close.png")));
		lblNewLabel_2.setBounds(845, 11, 60, 59);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 81, 965, 7);
		contentPane.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("QUESTION CODE :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(97, 114, 182, 20);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("00");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(290, 114, 42, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("QUESTION :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_5.setBounds(97, 166, 142, 26);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblOptionA = new JLabel("OPTION A :");
		lblOptionA.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblOptionA.setBounds(97, 218, 142, 26);
		contentPane.add(lblOptionA);
		
		JLabel lblOptionB = new JLabel("OPTION B :");
		lblOptionB.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblOptionB.setBounds(97, 275, 142, 26);
		contentPane.add(lblOptionB);
		
		JLabel lblOptionC = new JLabel("OPTION C :");
		lblOptionC.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblOptionC.setBounds(97, 332, 142, 26);
		contentPane.add(lblOptionC);
		
		JLabel lblOptionD = new JLabel("OPTION D :");
		lblOptionD.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblOptionD.setBounds(97, 390, 142, 26);
		contentPane.add(lblOptionD);
		
		JLabel lblOptionE = new JLabel("OPTION E :");
		lblOptionE.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblOptionE.setBounds(97, 445, 142, 26);
		contentPane.add(lblOptionE);
		
		QUESTION = new JTextField();
		QUESTION.setFont(new Font("Tahoma", Font.BOLD, 15));
		QUESTION.setBounds(249, 173, 590, 20);
		contentPane.add(QUESTION);
		QUESTION.setColumns(10);
		
		OPTION1 = new JTextField();
		OPTION1.setFont(new Font("Tahoma", Font.BOLD, 15));
		OPTION1.setColumns(10);
		OPTION1.setBounds(249, 225, 590, 20);
		contentPane.add(OPTION1);
		
		OPTION2 = new JTextField();
		OPTION2.setFont(new Font("Tahoma", Font.BOLD, 15));
		OPTION2.setColumns(10);
		OPTION2.setBounds(249, 282, 590, 20);
		contentPane.add(OPTION2);
		
		OPTION3 = new JTextField();
		OPTION3.setFont(new Font("Tahoma", Font.BOLD, 15));
		OPTION3.setColumns(10);
		OPTION3.setBounds(249, 339, 590, 20);
		contentPane.add(OPTION3);
		
		OPTION4 = new JTextField();
		OPTION4.setFont(new Font("Tahoma", Font.BOLD, 15));
		OPTION4.setColumns(10);
		OPTION4.setBounds(249, 397, 590, 20);
		contentPane.add(OPTION4);
		
		OPTION5 = new JTextField();
		OPTION5.setFont(new Font("Tahoma", Font.BOLD, 15));
		OPTION5.setColumns(10);
		OPTION5.setBounds(249, 452, 590, 20);
		contentPane.add(OPTION5);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  String l = lblNewLabel_4.getText();
              String q = QUESTION.getText();
              String a = OPTION1.getText();
              String b = OPTION2.getText();
              String c = OPTION3.getText();
              String d = OPTION4.getText();
              String e = OPTION5.getText();
              String query = "INSERT INTO `surveysystem`.`surveyquestions`\r\n" + 
              		"VALUES ('"+l+"' , '"+q+"' , '"+a+"' , '"+b+"' , '"+c+"' , '"+d+"' , '"+e+"' );";
              try {
				Class.forName("com.mysql.jdbc.Driver");
				 con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
				 Statement stmt11 = con1.createStatement();
				 stmt11.executeUpdate(query);
				 System.out.println("completed succesfully");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
              QUESTION.setText(null);
				OPTION1.setText(null);
				OPTION2.setText(null);
				OPTION3.setText(null);
				OPTION4.setText(null);
				OPTION5.setText(null);	
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(ADDNEWQUESTION.class.getResource("/COM/KARTHIK/save.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(290, 514, 109, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QUESTION.setText(null);
				OPTION1.setText(null);
				OPTION2.setText(null);
				OPTION3.setText(null);
				OPTION4.setText(null);
				OPTION5.setText(null);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(ADDNEWQUESTION.class.getResource("/COM/KARTHIK/clear.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(618, 514, 132, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(ADDNEWQUESTION.class.getResource("/COM/KARTHIK/pages background student.jpg")));
		lblNewLabel_6.setBounds(0, 0, 918, 563);
		contentPane.add(lblNewLabel_6);
		

		try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
				Statement stmt10 = con.createStatement();
				ResultSet rs10 = stmt10.executeQuery("select count(question) from `surveysystem`.`surveyquestions`;");
				while(rs10.next()) {
					int i = rs10.getInt(1);
					i = i+1;
					String str = String.valueOf(i);
					lblNewLabel_4.setText(str);
					
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
