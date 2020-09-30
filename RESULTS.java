package COM.KARTHIK;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JProgressBar;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RESULTS {
	JButton button;
	String q;
    Connection con;
    Connection con1;
    Connection con2;
    Connection con3;
    Connection con4;
    Connection con5;
    Connection con6;
    private JLabel label;
    private JLabel lblNewLabel_9;
    private JLabel label_13;
    private JLabel label_9;
    private JLabel label_10;
    private JLabel lblNewLabel_4;
    private JLabel label_12;
    private JLabel label_11;
    private JLabel label_5;
    private JLabel label_6;
    private JLabel label_7;
    private JLabel label_8;
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RESULTS window = new RESULTS();
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
	void createconnection() {
		try {
			
				Class.forName("com.mysql.jdbc.Driver");
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
					String query = " select * from surveysystem.surveyquestions where code='"+q+"';";
					Statement stmt= con.createStatement();
					ResultSet rs = stmt.executeQuery(query);
					while(rs.next()) {
						 lblNewLabel_4.setText(rs.getString("QUESTION"));
						 label.setText(rs.getString("OPT1"));
						 label_5.setText(rs.getString("OPT2"));
						 label_6.setText(rs.getString("OPT3"));
						 label_7.setText(rs.getString("OPT4"));
						 label_8.setText(rs.getString("OPT5"));
					}
					con.close();
					stmt.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public void votes() {
		try {
			String a=label.getText();
			String b=label_5.getText();
			String c=label_6.getText();
			String d=label_7.getText();
			String e=label_8.getText();
			Class.forName("com.mysql.jdbc.Driver");
			con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
			con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
			con4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
			con5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
			con6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
			Statement stmt101=con2.createStatement();
			ResultSet rs121 =stmt101.executeQuery("SELECT count(QUESTIONCODE) from surveysystem.survey where QUESTIONCODE='"+q+"' and ANSWER='"+a+"';");
			while(rs121.next()) {
				lblNewLabel_9.setText(rs121.getString(1));
			}
			stmt101.close();
			rs121.close();
			con2.close();
			
			Statement stmt102=con3.createStatement();
			ResultSet rs122=stmt102.executeQuery("SELECT count(QUESTIONCODE) from surveysystem.survey where QUESTIONCODE='"+q+"' and ANSWER='"+b+"';");
			while(rs122.next()) {
				label_9.setText(rs122.getString(1));
			}
			stmt102.close();
			rs122.close();
			con3.close();
			
			Statement stmt103=con4.createStatement();
			ResultSet rs123=stmt103.executeQuery("SELECT count(QUESTIONCODE) from surveysystem.survey where QUESTIONCODE='"+q+"' and ANSWER='"+c+"';");
			while(rs123.next()) {
				label_10.setText(rs123.getString(1));
			}
			stmt103.close();
			rs123.close();
			con4.close();
			
			Statement stmt104=con5.createStatement();
			ResultSet rs124=stmt104.executeQuery("SELECT count(QUESTIONCODE) from surveysystem.survey where QUESTIONCODE='"+q+"' and ANSWER='"+d+"';");
			while(rs124.next()) {
				label_11.setText(rs124.getString(1));
			}
			stmt104.close();
			rs124.close();
			con5.close();
			
			Statement stmt105=con6.createStatement();
			ResultSet rs125=stmt105.executeQuery("SELECT count(QUESTIONCODE) from surveysystem.survey where QUESTIONCODE='"+q+"' and ANSWER='"+e+"';");
			while(rs125.next()) {
				label_12.setText(rs125.getString(1));
			}
			stmt105.close();
			rs125.close();
			con6.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void results() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
			Statement stmt10=con1.createStatement();
			ResultSet rs12 =stmt10.executeQuery("SELECT count(QUESTIONCODE) from surveysystem.survey where QUESTIONCODE='"+q+"';");
			while(rs12.next()) {
				label_13.setText(rs12.getString(1));
			}
			con1.close();
			stmt10.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public RESULTS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 687);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RESULTS.class.getResource("/COM/KARTHIK/all student result.png")));
		lblNewLabel.setBounds(10, 0, 68, 70);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SURVEY RESULT");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_1.setBounds(106, 11, 442, 48);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_11 = new JLabel("(");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_11.setBounds(568, 342, 15, 21);
		frame.getContentPane().add(lblNewLabel_11);
		
		
		JLabel lblNewLabel_12 = new JLabel("100");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_12.setBounds(579, 342, 46, 21);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel(")");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13.setBounds(643, 339, 15, 27);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel label_15 = new JLabel("(");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_15.setBounds(568, 395, 15, 21);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("100");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_16.setBounds(579, 395, 46, 21);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel(")");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_17.setBounds(643, 392, 15, 27);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("(");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_18.setBounds(568, 452, 15, 21);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("100");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_19.setBounds(579, 452, 46, 21);
		frame.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel(")");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_20.setBounds(643, 449, 15, 27);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("(");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_21.setBounds(568, 500, 15, 21);
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("100");
		label_22.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_22.setBounds(579, 500, 46, 21);
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel(")");
		label_23.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_23.setBounds(643, 497, 15, 27);
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("(");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_24.setBounds(568, 553, 15, 21);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("100");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_25.setBounds(579, 553, 46, 21);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel(")");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_26.setBounds(643, 550, 15, 27);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("(");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_27.setBounds(568, 604, 15, 21);
		frame.getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("100");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_28.setBounds(579, 604, 46, 21);
		frame.getContentPane().add(label_28);
		
		JLabel label_29 = new JLabel(")");
		label_29.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_29.setBounds(643, 601, 15, 27);
		frame.getContentPane().add(label_29);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 68, 661, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("SURVEY RESULT BY QUESTION NUMBER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(10, 70, 658, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 154, 658, 10);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("QUESTION :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_3.setBounds(0, 164, 178, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("QUESTION");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_4.setBounds(10, 202, 648, 27);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("OPTIONS :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_5.setBounds(10, 240, 127, 27);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("OPTION NAME");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_6.setBounds(178, 291, 212, 27);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("NO OF VOTES");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_7.setBounds(463, 291, 195, 27);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("1.");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_8.setBounds(106, 342, 22, 27);
		frame.getContentPane().add(lblNewLabel_8);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 329, 658, 2);
		frame.getContentPane().add(separator_2);
		
		label = new JLabel("OPTION NAME");
		label.setFont(new Font("Tahoma", Font.BOLD, 23));
		label.setBounds(178, 342, 212, 27);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("2.");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_1.setBounds(106, 392, 31, 27);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("3.");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_2.setBounds(106, 449, 31, 27);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4.");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_3.setBounds(106, 497, 31, 27);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("5.");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_4.setBounds(106, 550, 31, 27);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("OPTION NAME");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_5.setBounds(178, 392, 212, 27);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("OPTION NAME");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_6.setBounds(178, 449, 212, 27);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("OPTION NAME");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_7.setBounds(178, 497, 212, 27);
		frame.getContentPane().add(label_7);
		
		label_8 = new JLabel("OPTION NAME");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_8.setBounds(178, 550, 212, 27);
		frame.getContentPane().add(label_8);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(-12, 278, 683, 2);
		frame.getContentPane().add(separator_3);
		
		lblNewLabel_9 = new JLabel("00");
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_9.setBounds(531, 342, 31, 21);
		frame.getContentPane().add(lblNewLabel_9);
		
		label_9 = new JLabel("00");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_9.setBounds(531, 395, 46, 21);
		frame.getContentPane().add(label_9);
		
		label_10 = new JLabel("00");
		label_10.setForeground(Color.RED);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_10.setBounds(531, 452, 46, 21);
		frame.getContentPane().add(label_10);
		
		label_11 = new JLabel("00");
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_11.setBounds(531, 500, 46, 21);
		frame.getContentPane().add(label_11);
		
		label_12 = new JLabel("00");
		label_12.setForeground(Color.RED);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_12.setBounds(531, 553, 46, 21);
		frame.getContentPane().add(label_12);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(489, 594, 136, 2);
		frame.getContentPane().add(separator_4);
		
		JLabel lblNewLabel_10 = new JLabel("TOTAL :");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_10.setBounds(392, 607, 99, 21);
		frame.getContentPane().add(lblNewLabel_10);
		
		label_13 = new JLabel("00");
		label_13.setForeground(Color.MAGENTA);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 23));
		label_13.setBounds(531, 607, 46, 21);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("QUESTION CODE :");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_14.setBounds(41, 118, 188, 25);
		frame.getContentPane().add(label_14);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
					button.doClick();
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(239, 117, 169, 26);
		frame.getContentPane().add(textField);
		
		button = new JButton("SEARCH");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				q=textField.getText();
				createconnection();
				results();
				votes();
				String total1 = label_13.getText();
				String d1=lblNewLabel_9.getText();
				String d2=label_9.getText();
				String d3=label_10.getText();
				String d4=label_11.getText();
				String d5=label_12.getText();
				int total=Integer.parseInt(total1);
				int o1=Integer.parseInt(d1)*100;
				int o2=Integer.parseInt(d2)*100;
				int o3=Integer.parseInt(d3)*100;
				int o4=Integer.parseInt(d4)*100;
				int o5=Integer.parseInt(d5)*100;
				
				double p1=o1/total;
				double p2=o2/total;
				double p3=o3/total;
				double p4=o4/total;
				double p5=o5/total;
				
				String f1= String.valueOf(p1);
				String f2= String.valueOf(p2);
				String f3= String.valueOf(p3);
				String f4= String.valueOf(p4);
				String f5= String.valueOf(p5);
				
				
				lblNewLabel_12.setText(String.format(f1,"%.0f"));
				label_16.setText(String.format(f2,"%.2f"));
				label_19.setText(String.format(f3,"%.2f"));
				label_22.setText(String.format(f4,"%.2f"));
				label_25.setText(String.format(f5,"%.2f"));
				
			}
		});
		button.setIcon(new ImageIcon(RESULTS.class.getResource("/COM/KARTHIK/search.png")));
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(441, 117, 159, 25);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setIcon(new ImageIcon(RESULTS.class.getResource("/COM/KARTHIK/Close.png")));
		btnNewButton.setBounds(582, 0, 89, 67);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_14 = new JLabel("%");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_14.setBounds(621, 342, 26, 21);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel label_30 = new JLabel("%");
		label_30.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_30.setBounds(621, 395, 26, 21);
		frame.getContentPane().add(label_30);
		
		JLabel label_31 = new JLabel("%");
		label_31.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_31.setBounds(621, 452, 26, 21);
		frame.getContentPane().add(label_31);
		
		JLabel label_32 = new JLabel("%");
		label_32.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_32.setBounds(621, 500, 26, 21);
		frame.getContentPane().add(label_32);
		
		JLabel label_33 = new JLabel("%");
		label_33.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_33.setBounds(621, 553, 26, 21);
		frame.getContentPane().add(label_33);
		
		JLabel label_34 = new JLabel("%");
		label_34.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_34.setBounds(621, 604, 26, 21);
		frame.getContentPane().add(label_34);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(RESULTS.class.getResource("/COM/KARTHIK/pages background student.jpg")));
		lblNewLabel_15.setBounds(0, 0, 693, 654);
		frame.getContentPane().add(lblNewLabel_15);
		
		
	}
}
