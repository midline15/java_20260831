package day18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Quiz1 extends JFrame {

	Quiz1() {
		setTitle("숫자가 아닌 키가 입력되는 경우 경고창 만들기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel la = new JLabel("학번 : ");
		JTextField tf = new JTextField(10);
		c.add(la);
		c.add(tf);

		tf.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

//				if (Character.isISOControl(c)) {
//					return;
//				}
				if (c == ' ') {
					e.consume(); // 입력 무시
					return; // 메서드 종료 (경고창 띄우지 않음)
				}
				if ((c < '0' || c > '9') && !Character.isISOControl(c)) {
					e.consume();

					JOptionPane.showMessageDialog(null, c + "는 숫자 키가 아닙니다. \n숫자를 입력하세요.", "경고",
							JOptionPane.ERROR_MESSAGE);

				}
			}
		});

		setSize(500, 100);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Quiz1();
	}

}
