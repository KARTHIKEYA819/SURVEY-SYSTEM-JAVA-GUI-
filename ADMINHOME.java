package COM.KARTHIK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ADMINHOME extends JFrame {
    int open =0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADMINHOME frame = new ADMINHOME();
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
	public ADMINHOME() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ADMINHOME.class.getResource("/COM/KARTHIK/SURVEY BACKGROUND.jpg")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1391, 824);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("ADD NEW QUESTION");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if(open ==0) {
					new ADDNEWQUESTION().setVisible(true);
					open=1;
				}
				else {
					open =0;
				}
			
			}
		});
		btnNewButton.setIcon(new ImageIcon(ADMINHOME.class.getResource("/COM/KARTHIK/add new question.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		menuBar.add(btnNewButton);
		
		JButton btnUpdateQuestion = new JButton("UPDATE QUESTION");
		btnUpdateQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if(open==0) {
					new UPDATEQUESTION().setVisible(true);
					open=1;
				}
				else {
					open=0;
				}
			
			}
		});
		btnUpdateQuestion.setIcon(new ImageIcon(ADMINHOME.class.getResource("/COM/KARTHIK/Update Question.png")));
		btnUpdateQuestion.setFont(new Font("Tahoma", Font.BOLD, 15));
		menuBar.add(btnUpdateQuestion);
		
		JButton btnAllQuestion = new JButton("ALL QUESTION");
		btnAllQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(open==0) {
					new ALLQUESTIONS().setVisible(true);
					open=1;
				}
				else {
					open=0;
				}
			
			
				
			}
		});
		btnAllQuestion.setIcon(new ImageIcon(ADMINHOME.class.getResource("/COM/KARTHIK/all questions.png")));
		btnAllQuestion.setFont(new Font("Tahoma", Font.BOLD, 15));
		menuBar.add(btnAllQuestion);
		
		JButton btnDeleteQuestion = new JButton("DELETE QUESTION");
		btnDeleteQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ERROR1().setVisible(true);
			}
		});
		btnDeleteQuestion.setToolTipText("YOU CAN ONLY DELETE LAST ENTERED QUESTION ONLY");
		btnDeleteQuestion.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeleteQuestion.setIcon(new ImageIcon(ADMINHOME.class.getResource("/COM/KARTHIK/delete Question.png")));
		menuBar.add(btnDeleteQuestion);
		
		JButton btnNewButton_1 = new JButton("SURVEY RESULTS");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				RESULTS.main(null);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(ADMINHOME.class.getResource("/COM/KARTHIK/all student result.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LOGOUT");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(ADMINHOME.class.getResource("/COM/KARTHIK/Logout.png")));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		menuBar.add(btnNewButton_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ADMINHOME.class.getResource("/COM/KARTHIK/index background.png")));
		lblNewLabel.setBounds(10, 0, 1365, 714);
		contentPane.add(lblNewLabel);
	}
}
