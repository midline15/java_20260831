package day13;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Repaint extends JFrame {

	Repaint() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
//				JLabel label = new JLabel("Hello");
//				label.setSize(50, 30);
//				label.setLocation(30, 30);
//				c.add(label);
//				c.revalidate();
//				c.repaint();
				if(e.getKeyCode() == KeyEvent.VK_F1) {
					
					JButton btn = new JButton();
					int x = (int)(Math.random()*250);
					int y = (int)(Math.random()*280);
					System.out.println(x+", "+y);
					btn.setBounds(x, y, 50, 20);
					c.add(btn);
//					c.revalidate();
					c.repaint();
				}
			}
		});

		c.setFocusable(true);
		c.requestFocus();
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Repaint();
	}

}
