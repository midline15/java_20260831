package day12;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		setTitle("프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setBackground(new Color(0x40,0x40,0x40));
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("첫번째 버튼");
		c.add(btn1);		
		JButton btn2 = new JButton("두번째 버튼");
		c.add(btn2);		
		JButton btn3 = new JButton("세번째 버튼");
		c.add(btn3);		

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
