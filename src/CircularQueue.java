import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JLabel lblNewLabel_2;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r = -1;
	private int f = 0;
	private int count = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 431);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 181));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("AppleMyungjo", Font.BOLD, 16));
		lblNewLabel.setBounds(59, 6, 302, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Queue Element ");
		lblNewLabel_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(72, 73, 135, 17);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(245, 68, 130, 26);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton queue = new JButton("Create Queue");
		queue.setForeground(new Color(148, 0, 211));
		queue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = Integer.valueOf(sizefield.getText());
				cq = new int[size];
				String message = " Circular Queue of size " + size + " Created ";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		queue.setBounds(154, 102, 117, 29);
		contentPane.add(queue);
		
		lblNewLabel_2 = new JLabel("Enter An Element");
		lblNewLabel_2.setForeground(new Color(139, 0, 139));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(72, 153, 110, 17);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(245, 143, 130, 26);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("Insert");
		insert.setForeground(new Color(0, 0, 205));
		insert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(count == size)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion Not Possible");
				}
				else
				{
					elem = Integer.valueOf(element.getText());
					r = (r+1)%size;
					cq[r] = elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Push Succesfull");
					element.setText("");
				}
				element.setText("");
			}
		});
		insert.setBounds(154, 174, 117, 29);
		contentPane.add(insert);
		
		JButton delete = new JButton("Delete");
		delete.setForeground(new Color(139, 0, 0));
		delete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == 0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else
				{
					String message = " Element deleted is " + cq[f];
					f = (f+1)%size;
					JOptionPane.showMessageDialog(contentPane, message);
					count--;
				}
			}
		});
		delete.setBounds(154, 215, 117, 29);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.setForeground(new Color(255, 0, 0));
		display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int f1 = f;
				String msg = "";
				if(count == 0)
				{
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				}
				else
				{
					for(int i=1;i<=count;i++)
					{
						msg = msg + " " +cq[f1];
						f1 = (f1+1)%size;
					}
					displaybox.setText(msg);
					}
				
				}
			
		});
		display.setBounds(154, 256, 117, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(72, 297, 302, 26);
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
		home.setForeground(new Color(220, 20, 60));
		home.setBounds(267, 339, 117, 29);
		contentPane.add(home);
	}
}
