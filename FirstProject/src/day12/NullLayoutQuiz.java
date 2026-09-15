package day12;

import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutQuiz extends JFrame {
	// 700 * 700 크기의 컨테이너 안에
	// 1부터 10까지 값을 가지는 버튼을 랜덤한 위치에 출력
	// 버튼 크기는 50*20

	public NullLayoutQuiz() {
		setTitle("NullLayoutQuiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		Random r = new Random();
		for (int i = 1; i <= 10; i++) {
			JButton btn = new JButton(Integer.toString(i));
			int x = r.nextInt(630)+10;
			int y = r.nextInt(650)+10;
			btn.setBounds(x, y, 50, 20);
			c.add(btn);
		}

		setSize(700, 700);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullLayoutQuiz();
	}

}
