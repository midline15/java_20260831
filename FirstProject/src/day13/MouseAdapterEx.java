package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame {

	public MouseAdapterEx() {
		Random r = new Random();
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		// 30,30위치에 JLabel 컴포넌트 부착
		// 사이즈는 70,50 , 내용은 "hello"
		JLabel label = new JLabel("Hello");
		label.setBounds(30, 30, 70, 10);

		c.add(label);
		c.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				label.setLocation(e.getX(), e.getY());
				c.setBackground(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
			}

		});
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseAdapterEx();
	}

}
