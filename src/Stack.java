import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 450);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Stack Data Structure");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("American Typewriter", Font.BOLD, 16));
		lblNewLabel.setBounds(270, 6, 167, 21);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Enter The Stack Size");
		lblNewLabel_1.setForeground(new Color(139, 69, 19));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(78, 68, 127, 17);
		contentPane.add(lblNewLabel_1);

		sizefield = new JTextField();
		sizefield.setBounds(270, 63, 130, 26);
		contentPane.add(sizefield);
		sizefield.setColumns(10);

		JButton stack = new JButton("Create Stack");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Stack creation code
				size = Integer.valueOf(sizefield.getText());
				s = new int[size];
				String message = " Stack of size " + size + " Created ";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		stack.setForeground(new Color(233, 150, 122));
		stack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		stack.setBounds(437, 63, 117, 29);
		contentPane.add(stack);

		JLabel lblNewLabel_2 = new JLabel("Enter an element");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(78, 132, 104, 17);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setBounds(270, 127, 130, 26);
		contentPane.add(element);
		element.setColumns(10);

		JButton push = new JButton("Push");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Push Code here
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Push Not Possible");	
				}
				else
				{
					elem = Integer.valueOf(element.getText());
					++top;
					s[top] = elem;
					JOptionPane.showConfirmDialog(contentPane, "Push Succesfull");
					element.setText("");
				}
			}
		});
		push.setBounds(437, 127, 117, 29);
		contentPane.add(push);

		JButton pop = new JButton("Pop");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pop code here
				if(top == -1)
				{
					JOptionPane.showMessageDialog(contentPane, " Pop Not possible");
				}
				else
				{
					String message = " Element deleted is " + s[top];
					JOptionPane.showConfirmDialog(contentPane, message);
					--top;
				}
				
			}
		});
		pop.setBounds(284, 207, 117, 29);
		contentPane.add(pop);

		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display code here
				String msg = "";
				if(top ==-1)
				{
					JOptionPane.showConfirmDialog(contentPane, " Display Not Possible");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						msg = msg + " " + s[i];
					}
					displaybox.setText(msg);

					}
		
			}
		});
		
		display.setBounds(283, 276, 117, 29);
		contentPane.add(display);

		displaybox = new JTextField();
		displaybox.setBackground(new Color(211, 211, 211));
		displaybox.setBounds(137, 343, 417, 26);
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
		home.setForeground(new Color(199, 21, 133));
		home.setBounds(573, 364, 117, 29);
		contentPane.add(home);
	}

}
