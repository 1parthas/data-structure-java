import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose A Data Structure");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Ayuthaya", Font.BOLD, 16));
		lblNewLabel.setBounds(103, 6, 230, 24);
		contentPane.add(lblNewLabel);
		
		JButton stack = new JButton("Stack");
		stack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Stack Window Opening Code
				new Stack().setVisible(true);
				dispose();
				
			}
		});
		stack.setBounds(43, 76, 78, 29);
		contentPane.add(stack);
		
		JButton array = new JButton("Array");
		array.setFont(new Font("Times New Roman", Font.BOLD, 14));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Array Window Opening Code
				
				new Array().setVisible(true);
				dispose();
				
			}
		});
		array.setBounds(162, 42, 117, 29);
		contentPane.add(array);
		
		JButton queue = new JButton("Queue");
		queue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Queue Window Opening Code
				new Queue().setVisible(true);
				dispose();
			}
		});
		queue.setBounds(298, 76, 84, 29);
		contentPane.add(queue);
		
		JButton sll = new JButton("Singly Linked List");
		sll.setFont(new Font("Times New Roman", Font.BOLD, 14));
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Singly Linked List Window Opening Code
				new SinglyLinkedList().setVisible(true);
				dispose();
			}
		});
		sll.setBounds(266, 145, 155, 29);
		contentPane.add(sll);
		
		JButton cqueue = new JButton("Circular Queue");
		cqueue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Circular Queue Window Opening Code
				new CircularQueue().setVisible(true);
				dispose();
			}
		});
		cqueue.setBounds(6, 145, 137, 29);
		contentPane.add(cqueue);
		
		JButton dll = new JButton("Doubly Linked List");
		dll.setFont(new Font("Times New Roman", Font.BOLD, 14));
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Doubly Linked List Window Opening Code
				new DoublyLinkedList().setVisible(true);
				dispose();
			}
		});
		dll.setBounds(129, 207, 162, 29);
		contentPane.add(dll);
	}
}
