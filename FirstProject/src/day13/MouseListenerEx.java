package day13;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {

	public MouseListenerEx() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		// 30,30위치에 JLabel 컴포넌트 부착
		// 사이즈는 70,50 , 내용은 "hello"
		JLabel label = new JLabel("Hello");
		label.setBounds(30, 30, 70, 10);

		c.add(label);
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println(e.getX() +", "+e.getY());
				label.setLocation(e.getX(), e.getY());
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스 올라옴");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스 ㅅㄱㅇ");
			}
		});
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
