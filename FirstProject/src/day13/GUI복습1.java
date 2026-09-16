package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI복습1 extends JFrame {

	GUI복습1() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JButton btn = new JButton("버튼!");
//		btn.setSize(100, 20);
//		btn.setLocation(60, 150);
		btn.setBounds(50, 60, 120, 30);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c.setBackground(new Color(255, 0, 255));
			}
		});

		c.add(btn);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUI복습1();
	}

}
