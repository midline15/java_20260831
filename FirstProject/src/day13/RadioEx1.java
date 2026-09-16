package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioEx1 extends JFrame {

	public RadioEx1() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry= new JRadioButton("체리");
		group.add(apple);
		group.add(pear);
		group.add(cherry);

		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioEx1();
	}

}
