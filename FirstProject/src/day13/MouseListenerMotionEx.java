package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerMotionEx extends JFrame{

	public MouseListenerMotionEx() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Mouse Event");
		c.add(label);
		
		c.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				label.setText("mouseDragged : " + e.getX() + ", " + e.getY());
			}
			
			@Override
			public void mouseMoved(MouseEvent e) {
				label.setText("mouseDragged : " + e.getPoint());
			}
			
		});
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				label.setText("드래그 끝");
			}
		});

		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseListenerMotionEx();
	}

}
