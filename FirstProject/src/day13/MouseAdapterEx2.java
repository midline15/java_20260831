package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx2 extends JFrame {

	public MouseAdapterEx2() {
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
			// 더블클릭했을 때 label 이동
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				if(e.getClickCount() == 2) {
					label.setLocation(e.getPoint());
				}
			}

		});
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseAdapterEx2();
	}

}
