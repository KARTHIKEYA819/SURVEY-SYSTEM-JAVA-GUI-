package COM.KARTHIK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.JInternalFrame;

public class CODUCTSURVEY extends JFrame {
	Connection con;
	private JButton btnNewButton_1;
	private JLabel question;
	private JLabel lblNewLabel_3;
	private JRadioButton optiond;
	private JRadioButton optione;
	private JRadioButton optionb;
	private JRadioButton optionc;
	private JRadioButton optiona;
    int questionid=0;
    int max;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CODUCTSURVEY frame = new CODUCTSURVEY();
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
	
	void startsurvey() {
		questionid = questionid+1;
		String query = " select * from surveysystem.surveyquestions where code='"+questionid+"';";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				while(rs.next()) {
					question.setText(rs.getString("QUESTION"));
					optiona.setText(rs.getString("OPT1"));
					optionb.setText(rs.getString("OPT2"));
					optionc.setText(rs.getString("OPT3"));
					optiond.setText(rs.getString("OPT4"));
					optione.setText(rs.getString("OPT5"));
					lblNewLabel_3.setText(rs.getString("code"));
				}
				String query1 = "select count(question) from `surveysystem`.`surveyquestions`;";
				Statement stmt10 = con.createStatement();
				ResultSet rs2 = stmt10.executeQuery(query1);
				while(rs2.next()) {
					max=rs2.getInt(1);
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
	public CODUCTSURVEY() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 723, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CODUCTSURVEY.class.getResource("/COM/KARTHIK/index student.png")));
		lblNewLabel.setBounds(21, 7, 60, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SURVEY");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 75));
		lblNewLabel_1.setBounds(219, 0, 330, 74);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 78, 1091, 8);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("QUESTION ID   :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(20, 97, 256, 37);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("00");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBounds(286, 104, 64, 23);
		contentPane.add(lblNewLabel_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 155, 1101, 8);
		contentPane.add(separator_1);
		
		question = new JLabel("QUESTION");
		question.setForeground(Color.BLUE);
		question.setFont(new Font("Tahoma", Font.BOLD, 22));
		question.setBounds(10, 174, 687, 32);
		contentPane.add(question);
		
		optiona = new JRadioButton("OPTION A");
		optiona.setOpaque(false);
		optiona.setForeground(new Color(0, 0, 255));
		optiona.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnNewButton_1.setEnabled(true);
			}
		});
		buttonGroup.add(optiona);
		optiona.setFont(new Font("Tahoma", Font.BOLD, 22));
		optiona.setBounds(91, 240, 389, 23);
		contentPane.add(optiona);
		
		optionc = new JRadioButton("OPTION C");
		optionc.setOpaque(false);
		optionc.setForeground(new Color(0, 0, 255));
		optionc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnNewButton_1.setEnabled(true);
			}
		});
		buttonGroup.add(optionc);
		optionc.setFont(new Font("Tahoma", Font.BOLD, 22));
		optionc.setBounds(91, 344, 382, 23);
		contentPane.add(optionc);
		
		optionb = new JRadioButton("OPTION B");
		optionb.setOpaque(false);
		optionb.setForeground(new Color(0, 0, 255));
		optionb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnNewButton_1.setEnabled(true);
			}
		});
		buttonGroup.add(optionb);
		optionb.setFont(new Font("Tahoma", Font.BOLD, 22));
		optionb.setBounds(91, 294, 382, 23);
		contentPane.add(optionb);
		
		optiond = new JRadioButton("OPTION D");
		optiond.setOpaque(false);
		optiond.setForeground(new Color(0, 0, 255));
		optiond.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnNewButton_1.setEnabled(true);
			}
		});
		buttonGroup.add(optiond);
		optiond.setFont(new Font("Tahoma", Font.BOLD, 22));
		optiond.setBounds(91, 398, 382, 23);
		contentPane.add(optiond);
		
		optione = new JRadioButton("OPTION E");
		optione.setOpaque(false);
		optione.setForeground(new Color(0, 0, 255));
		optione.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnNewButton_1.setEnabled(true);
			}
		});
		buttonGroup.add(optione);
		optione.setFont(new Font("Tahoma", Font.BOLD, 22));
		optione.setBounds(91, 453, 382, 23);
		contentPane.add(optione);
		
		btnNewButton_1 = new JButton("NEXT");
		btnNewButton_1.setForeground(new Color(255, 51, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton_1.getText().equals("NEXT")) {

					
					String answer;
					if(optiona.isSelected()) {
						answer=optiona.getText();
					}
					else if(optionb.isSelected()) {
						answer=optionb.getText();
					}
					else if(optionc.isSelected()) {
						answer=optionc.getText();
					}
					else if(optiond.isSelected()) {
						answer=optiond.getText();
					}
					else if(optione.isSelected()) {
						answer=optione.getText();
					}
					else {
						answer="";
					}
					String qc = lblNewLabel_3.getText();
					String q= "INSERT INTO `surveysystem`.`survey` VALUES ('"+qc+"','"+answer+"');";
					
					try {
						Statement st = con.createStatement();
						st.executeUpdate(q);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(questionid == max-1) {
						btnNewButton_1.setText("SUBMIT");
						buttonGroup.clearSelection();
					}
					else {
						startsurvey();
						buttonGroup.clearSelection();
					}
				
				}
				else {
					setVisible(false);
					new FINALPAGE().setVisible(true);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_1.setBounds(421, 553, 171, 32);
		contentPane.add(btnNewButton_1);
		startsurvey();
		btnNewButton_1.setEnabled(false);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(139, 29, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(CODUCTSURVEY.class.getResource("/COM/KARTHIK/pages background student.jpg")));
		lblNewLabel_5.setBounds(10, 0, 697, 616);
		contentPane.add(lblNewLabel_5);
	}
}
