import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField displaybox;
	class Node
	{
		Node prelink;
		int data;
		Node nextlink;
	}
	Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 438);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Doubly Linked Data Structure ");
		lblNewLabel.setForeground(new Color(210, 105, 30));
		lblNewLabel.setFont(new Font("AppleMyungjo", Font.BOLD, 16));
		lblNewLabel.setBounds(248, 6, 225, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter The Element");
		lblNewLabel_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(84, 68, 115, 17);
		contentPane.add(lblNewLabel_1);
		
		element1 = new JTextField();
		element1.setBounds(297, 63, 130, 26);
		contentPane.add(element1);
		element1.setColumns(10);
		
		JButton insertrear = new JButton("Insert Rear");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Insert Code here
				Node temp;
				int elem = Integer.valueOf(element1.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null)
				{
					first = newnode;
				}
				else
				{
					temp = first;
					while(temp.nextlink != null)
					{
						temp = temp.nextlink;
					}
					temp.nextlink = newnode;
					temp.prelink = temp;
				}
				element1.setText("");
				JOptionPane.showMessageDialog(contentPane, "Insertion at rear is Succesfull");
				
			}
		});
		insertrear.setForeground(new Color(0, 191, 255));
		insertrear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insertrear.setBounds(513, 63, 117, 29);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter The Element");
		lblNewLabel_1_1.setForeground(new Color(160, 82, 45));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(84, 123, 115, 17);
		contentPane.add(lblNewLabel_1_1);
		
		element2 = new JTextField();
		element2.setColumns(10);
		element2.setBounds(297, 118, 130, 26);
		contentPane.add(element2);
		
		JButton insertfront = new JButton("Insert front");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Insert Front Code Here
				int elem = Integer.valueOf(element2.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null)
				{
					first = newnode;
				}
				else
				{
					newnode.nextlink = first;
					first.prelink = newnode;
					first = newnode;
				}
				element2.setText("");
				JOptionPane.showMessageDialog(contentPane, "Insertion at front Succesfull");
			}
		});
		insertfront.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insertfront.setForeground(new Color(220, 20, 60));
		insertfront.setBounds(513, 118, 117, 29);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("Delete Rear");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// rear delete code here
				Node temp;
				if (first ==  null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else if(first.nextlink == null)
				{
					JOptionPane.showMessageDialog(contentPane, " Element deleted is " + first.data);
					first = null;
				}
				else
				{
					temp = first;
					while(temp.nextlink.nextlink!=null)
					{
						temp = temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, " Element deleted is " + temp.nextlink.data);
					temp.nextlink = null;
				}
				
			}
		});
		deleterear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		deleterear.setForeground(new Color(0, 0, 255));
		deleterear.setBounds(297, 195, 117, 29);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("Delete Front");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete code here
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else if(first.nextlink == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is" + first.data);
					first = null;
				}
				else
				{
					first = first.nextlink;
					first.prelink = null;
				}
			}
		});
		deletefront.setForeground(new Color(138, 43, 226));
		deletefront.setFont(new Font("Times New Roman", Font.BOLD, 14));
		deletefront.setBounds(297, 236, 117, 29);
		contentPane.add(deletefront);
		
		JButton dispfwd = new JButton("Display Forward");
		dispfwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// forword display code
				Node temp;
				String msg = "";
				if (first == null)
				{
					JOptionPane.showMessageDialog(contentPane, " Display Not Possible");
				}
				else if( first.nextlink == null)
				{
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else 
				{
					temp = first;
					while(temp!=null)
					{
						msg = msg + " " +temp.data;
						temp = temp.nextlink;
					}
					displaybox.setText(msg);
				}
			}
		});
		dispfwd.setForeground(new Color(47, 79, 79));
		dispfwd.setFont(new Font("Times New Roman", Font.BOLD, 14));
		dispfwd.setBounds(155, 274, 145, 29);
		contentPane.add(dispfwd);
		
		JButton disprev = new JButton("Display Reverse");
		disprev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg = "";
				if (first == null)
				{
					JOptionPane.showMessageDialog(contentPane, " Display Not Possible");
				}
				else if(first.nextlink == null)
				{
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else
				{
					temp = first;
					while(temp.nextlink!=null)
					{
						msg = msg + " " +temp.data;
						temp = temp.nextlink;
					}
					while(temp!=null)
					{
						msg = msg + " " +temp.data;
						//JOptionPane.showMessageDialog(contentPane, temp.data + "");
						temp = temp.prelink;
					}
					displaybox.setText(msg);
					}
			}
		});
		disprev.setFont(new Font("Times New Roman", Font.BOLD, 14));
		disprev.setForeground(new Color(128, 128, 0));
		disprev.setBounds(402, 274, 145, 29);
		contentPane.add(disprev);
		
		displaybox = new JTextField();
		displaybox.setBounds(230, 328, 285, 26);
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
		home.setBounds(513, 364, 117, 29);
		contentPane.add(home);
	}
}
