package day12;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	public BorderLayoutEx() {
		setTitle("300x300 스윙 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(10, 5));

		c.add(new JButton("상단"), BorderLayout.NORTH);
		c.add(new JButton("하단"), BorderLayout.SOUTH);
		c.add(new JButton("중앙"), BorderLayout.CENTER);
		c.add(new JButton("좌"), BorderLayout.WEST);
		c.add(new JButton("우"), BorderLayout.EAST);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
