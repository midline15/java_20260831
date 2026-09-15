package day12;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutEx1 extends JFrame {

	public NullLayoutEx1() {
		setTitle("Grid 연습문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JButton btn = new JButton("버튼!!!");
//		btn.setSize(200, 50);
//		btn.setLocation(15,15);
		btn.setBounds(15, 15, 200, 50);
		c.add(btn);

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullLayoutEx1();
	}

}
