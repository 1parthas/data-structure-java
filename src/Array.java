import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deleteposition;
	private JTextField insertposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 522);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setFont(new Font("AppleGothic", Font.BOLD, 16));
		lblNewLabel.setForeground(SystemColor.controlHighlight);
		lblNewLabel.setBounds(237, 6, 207, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Array Length");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.select"));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(134, 39, 146, 40);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(387, 39, 174, 40);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("Create Array");
		create.setForeground(new Color(139, 69, 19));
		create.setFont(new Font("Times New Roman", Font.BOLD, 15));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for creating array
				int len = Integer.valueOf(length.getText());
				arr = new int [len];
				String message = "Array of length " + len + " Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setBounds(269, 91, 117, 29);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("Insert An Integer Element");
		lblNewLabel_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(29, 147, 171, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(212, 143, 89, 26);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertposition.getText());
				arr[pos] = elem;
				String message = " Element " + elem + " inserted at position " + pos;
				JOptionPane.showConfirmDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		insert.setForeground(new Color(255, 0, 0));
		insert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insert.setBounds(516, 143, 117, 29);
		contentPane.add(insert);
		
		JLabel deletepos2 = new JLabel("Delete Position");
		deletepos2.setForeground(new Color(128, 0, 128));
		deletepos2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		deletepos2.setBounds(29, 212, 171, 18);
		contentPane.add(deletepos2);
		
		deleteposition = new JTextField();
		deleteposition.setColumns(10);
		deleteposition.setBounds(212, 208, 89, 26);
		contentPane.add(deleteposition);
		
		insertposition = new JTextField();
		insertposition.setBounds(415, 143, 106, 26);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Position");
		lblNewLabel_3.setForeground(Color.MAGENTA);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(313, 148, 90, 17);
		contentPane.add(lblNewLabel_3);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
			int pos = Integer.valueOf(deleteposition.getText());
			arr[pos] = 0;
			String message = " Element deleted at the position " + pos;
			JOptionPane.showConfirmDialog(contentPane, message);
			deleteposition.setText("");
			}
		});
		delete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		delete.setBounds(313, 208, 84, 29);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg = "";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg = msg + " " + arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		display.setBounds(269, 299, 117, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		displaybox.setForeground(Color.BLACK);
		displaybox.setBounds(93, 365, 468, 26);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton home = new JButton("Home");
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
				dispose();
			    
				
			}
		});
		home.setForeground(new Color(139, 0, 0));
		home.setBackground(new Color(139, 0, 0));
		home.setFont(new Font("Times New Roman", Font.BOLD, 14));
		home.setBounds(444, 415, 117, 29);
		contentPane.add(home);
	}
}
