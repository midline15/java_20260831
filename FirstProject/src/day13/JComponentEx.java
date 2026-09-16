package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{
	
	public JComponentEx() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);

		btn1.setBackground(Color.yellow);
		btn1.setForeground(Color.MAGENTA);
		btn1.setFont(new Font("arial", Font.ITALIC, 20));
		btn2.setEnabled(false);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComponentEx();
	}

}
