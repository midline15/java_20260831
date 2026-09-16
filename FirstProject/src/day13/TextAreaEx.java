package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{

	public TextAreaEx() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel	label = new JLabel("입력 후 <Enter> 키를 입력하세요");
		c.add(label);
		JTextField field = new JTextField(20);
		c.add(field);
		JTextArea area = new JTextArea(7,20);
		c.add(area);
		JScrollPane scroll = new JScrollPane(area);
		c.add(scroll);
		
		area.setEditable(false);
		field.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(field.getText());
				area.append(field.getText() + "\n");
				field.setText("");
			}
		});

		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextAreaEx();
	}

}
