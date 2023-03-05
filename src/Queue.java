import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r = -1;
	private int f = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 160, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Queue Data Structure");
		lblNewLabel.setFont(new Font("AppleMyungjo", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(245, 255, 250));
		lblNewLabel.setBackground(new Color(245, 255, 250));
		lblNewLabel.setBounds(165, 6, 156, 20);
		contentPane.add(lblNewLabel);
		
		sizefield = new JTextField();
		sizefield.setBounds(305, 54, 130, 26);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton queue = new JButton("Create Queue");
		queue.setForeground(new Color(255, 0, 255));
		queue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = Integer.valueOf(sizefield.getText());
				q = new int[size];
				String message = " Queue of size " + size + " Created ";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		queue.setBounds(165, 95, 117, 29);
		contentPane.add(queue);
		
		element = new JTextField();
		element.setBounds(190, 155, 130, 26);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("Insert");
		insert.setForeground(new Color(255, 0, 0));
		insert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(r == size-1)
				{
					JOptionPane.showMessageDialog(contentPane, " Insertion Not Possible");
				}
				else
				{
					elem = Integer.valueOf(element.getText());
					++r;
					q[r] = elem;
					JOptionPane.showConfirmDialog(contentPane, "Push Succesfull");
					element.setText("");
				}
				element.setText("");
			}
		});
		insert.setBounds(343, 155, 80, 29);
		contentPane.add(insert);
		
		JButton delete = new JButton("Delete");
		delete.setForeground(new Color(25, 25, 112));
		delete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r == -1 || f>r)
				{
					JOptionPane.showConfirmDialog(contentPane, " Deletion Not Possible");
				}
				else
				{
					String message = " Element deleted is " + q[f];
					JOptionPane.showConfirmDialog(contentPane, message);
					++f;
				}
			}
		});
		delete.setBounds(190, 208, 117, 29);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.setForeground(new Color(0, 0, 255));
		display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				if(r == -1 || f>r)
				{
					JOptionPane.showConfirmDialog(contentPane, "Display Not Possible");
				}
				else
				{
					for(int i=f;i<=r;i++)
					{
						msg = msg + " " +q[i];
					}
					displaybox.setText(msg);
					}
				
				}
			
		});
		display.setBounds(190, 264, 117, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(230, 230, 250));
		displaybox.setBounds(48, 323, 512, 26);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("Enter An Element");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(40, 160, 110, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter The Queue Size");
		lblNewLabel_2.setForeground(new Color(138, 43, 226));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(40, 59, 132, 17);
		contentPane.add(lblNewLabel_2);
		
		JButton home = new JButton("Home");
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
				dispose();
			    
			}
		});
		home.setForeground(new Color(220, 20, 60));
		home.setBounds(428, 352, 117, 29);
		contentPane.add(home);
	}
}
