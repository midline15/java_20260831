package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelEx extends JFrame{
	
	public JLabelEx() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon image = new ImageIcon("images/beauty.jpg");
		JLabel  label = new JLabel(image);
		c.add(label);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JLabelEx();
	}

}
