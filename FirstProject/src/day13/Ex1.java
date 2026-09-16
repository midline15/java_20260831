package day13;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex1 extends JFrame {
	
	public Ex1() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton[] arr = new JButton[5];
		for(int i = 0; i <arr.length; i++) {
			arr[i] = new JButton("0");
			arr[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					JButton btn = (JButton)e.getComponent();
					btn.setText(Integer.toString(Integer.parseInt(btn.getText())+1));
				}
			});
			c.add(arr[i]);
		}		

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1();
	}

}
