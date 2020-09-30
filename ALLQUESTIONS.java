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
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JProgressBar;

public class ALLQUESTIONS extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ALLQUESTIONS frame = new ALLQUESTIONS();
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
	public ALLQUESTIONS() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1391, 824);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ALLQUESTIONS.class.getResource("/COM/KARTHIK/all questions.png")));
		lblNewLabel_1.setBounds(10, 0, 72, 65);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ALL SURVEY QUESTIONS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 65));
		lblNewLabel_2.setBounds(107, 0, 947, 65);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(ALLQUESTIONS.class.getResource("/COM/KARTHIK/Close.png")));
		btnNewButton.setBounds(1276, 0, 89, 65);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 77, 1365, 14);
		contentPane.add(separator);
		
		table = new JTable();
		table.setUpdateSelectionOnSort(false);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"CODE", "QUSTION", "OPTION 1", "OPTION 2", "OPTION 3", "OPTION 4", "OPTION 5"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(51);
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.MAGENTA, Color.RED, null));
		table.setBounds(24, 123, 1317, 651);
		contentPane.add(table);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trai","root","karthik");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from `surveysystem`.`surveyquestions`");
				while(rs.next()) {
					String id= rs.getString("code");
					String q= rs.getString("QUESTION");
					String opt1= rs.getString("OPT1");
					String opt2= rs.getString("OPT2");
					String opt3= rs.getString("OPT3");
					String opt4= rs.getString("OPT4");
					String opt5= rs.getString("OPT5");
					model.addRow(new Object[]{id,q,opt1,opt2,opt3,opt4,opt5});
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
}
