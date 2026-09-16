package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame {
	
	public KeyListenerEx() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel arr[] = new JLabel[3];
		
		arr[0] = new JLabel("getKeyCode()");
		arr[1] = new JLabel(" getKeyChar() ");
		arr[2] = new JLabel(" getKeyText() ");
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				arr[0].setText(Integer.toString(e.getKeyCode()));
				arr[1].setText(Character.toString(e.getKeyChar()));
				arr[2].setText(e.getKeyText(e.getKeyCode()));	
				
				JLabel label = new JLabel("new label");
				c.add(label);
				JButton btn = new JButton();
				c.add(btn);
			}
		});
		
		for(int i = 0; i < arr.length; i++) {
			c.add(arr[i]);
			arr[i].setOpaque(true);
			arr[i].setBackground(Color.yellow);
		}

		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
