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

public class SinglyLinkedList extends JFrame {
	

	private JPanel contentPane;
	private JTextField rear;
	private JTextField front;
	private JTextField displaybox;
	class Node
	
	{
		int data;
		Node link;
	}
	private Node first;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 446);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(125, 6, 328, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter The Element");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(61, 71, 115, 17);
		contentPane.add(lblNewLabel_1);
		
		rear = new JTextField();
		rear.setBounds(218, 66, 130, 26);
		contentPane.add(rear);
		rear.setColumns(10);
		
		JButton rearinsert = new JButton("Insert Rear");
		rearinsert.setForeground(new Color(47, 79, 79));
		rearinsert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rearinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				int elem = Integer.valueOf(rear.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first = newnode;
					
				}
				else
				{
					temp = first;
					while(temp.link!=null)
					{
						temp = temp.link;
					}
					temp.link=newnode;
				}
				rear.setText("");
				JOptionPane.showMessageDialog(contentPane, "insert rear Succesfull");
			}
		});
		rearinsert.setBounds(374, 66, 117, 29);
		contentPane.add(rearinsert);
		
		JLabel lblNewLabel_2 = new JLabel("Enter The Element");
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(61, 116, 115, 17);
		contentPane.add(lblNewLabel_2);
		
		front = new JTextField();
		front.setBounds(218, 111, 130, 26);
		contentPane.add(front);
		front.setColumns(10);
		
		JButton frontinsert = new JButton("Insert Front");
		frontinsert.setForeground(new Color(85, 107, 47));
		frontinsert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frontinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.valueOf(front.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if(first == null)
				{
					first = newnode;
				}
				else
				{
					newnode.link = first;
					first = newnode;
				}
				front.setText("");
				JOptionPane.showMessageDialog(contentPane, "insert front Succesfull");
			}
		});
		frontinsert.setBounds(374, 111, 117, 29);
		contentPane.add(frontinsert);
		
		JButton deleterear = new JButton("Delete Rear");
		deleterear.setForeground(new Color(165, 42, 42));
		deleterear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showConfirmDialog(contentPane, "element deleted is" + first.data);
					first = null;
				}
				else
				{
					temp = first;
					while(temp.link.link!=null)
					{
						temp = temp.link;
					}
					JOptionPane.showConfirmDialog(contentPane, " element deleted is" + temp.link.data);
					temp.link = null;
				}
			}
		});
		deleterear.setBounds(218, 180, 117, 29);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("Delete Front");
		deletefront.setForeground(new Color(199, 21, 133));
		deletefront.setFont(new Font("Times New Roman", Font.BOLD, 14));
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "deletion is not possible");
				}
				else if(first.link == null)
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is" + first.data);
					first = null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is " + first.data);
					first = first.link;
				}
					
			}
		});
		deletefront.setBounds(218, 221, 117, 29);
		contentPane.add(deletefront);
		
		JButton display = new JButton("Display");
		display.setForeground(new Color(138, 43, 226));
		display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg = "";
				if(first ==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
					//JOptionPane.showConfirmDialog(contentPane, "Display Not Possible");
				}
				
				else if (first.link == null)
				{
					//JOptionPane.showInternalMessageDialog(contentPane, first.data);
					JOptionPane.showMessageDialog(contentPane, first.data);
					//JOptionPane.showConfirmDialog(contentPane, first.data);
				}
				else
				{
					temp = first;
					while (temp !=null)
					{
						msg = msg + " " +temp.data;
						temp = temp.link;
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setBounds(218, 262, 117, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(147, 325, 282, 26);
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
		home.setBounds(410, 363, 117, 29);
		contentPane.add(home);
	}
}
