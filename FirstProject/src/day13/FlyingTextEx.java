package day13;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame{
	
	public FlyingTextEx() {
		int flyingUnit = 10;
		
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("Hello");
		label.setBounds(50,50,100,20);
		c.add(label);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				
				if(keyCode == KeyEvent.VK_UP) {
					label.setLocation(label.getX(), label.getY()-flyingUnit);
				}
				else if(keyCode == KeyEvent.VK_DOWN) {
					label.setLocation(label.getX(), label.getY()+flyingUnit);
				}
				else if(keyCode == KeyEvent.VK_LEFT) {
					label.setLocation(label.getX()-flyingUnit, label.getY());
				}
				else if(keyCode == KeyEvent.VK_RIGHT) {
					label.setLocation(label.getX()+flyingUnit, label.getY());
				}
			}
		});
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.setFocusable(true);
				c.requestFocus();
			}
		});

		setSize(300, 300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new FlyingTextEx();
	}

}
