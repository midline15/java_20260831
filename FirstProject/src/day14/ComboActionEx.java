package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboActionEx extends JFrame{
	
	ComboActionEx(){
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };
		
		JComboBox<String> combo = new JComboBox<String>(fruits);
		c.add(combo);
		
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int selectedIndex = cb.getSelectedIndex();
				String selectedItem = (String)cb.getSelectedItem();
				System.out.println(selectedIndex + selectedItem);
			}
		});

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboActionEx();
	}

}
