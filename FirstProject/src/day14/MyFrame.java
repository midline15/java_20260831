package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());


		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}
