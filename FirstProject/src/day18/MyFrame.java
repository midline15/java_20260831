package day18;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4084096259948870073L;

	public MyFrame() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());


		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
