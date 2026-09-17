package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame {

	ComboBoxEx() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };

		JComboBox<String> combo = new JComboBox<String>(fruits);
		c.add(combo);
		JComboBox<String> combo2 = new JComboBox<String>();
		c.add(combo2);
		for (int i = 0; i < fruits.length; i++) {
			combo2.addItem(fruits[i]);
		}

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboBoxEx();
	}

}
