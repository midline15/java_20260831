package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {

	public CheckBoxEx() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon img1 = new ImageIcon("images/cherry.jpg");
		ImageIcon img2 = new ImageIcon("images/selectedCherry.jpg");

		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", img1);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(img2);

		c.add(apple);
		c.add(pear);
		c.add(cherry);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
