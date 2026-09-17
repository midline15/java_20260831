package day14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz3 extends JFrame {
	private String lastInput = "";

	Quiz3() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String arr[] = { "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "+/-", "0", ".", "=" };

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel top = new JPanel();
		top.setBackground(Color.gray);
		top.add(new JLabel("상단"));
		JTextField tf1 = new JTextField(20);
		top.add(tf1);

		JPanel bottom = new JPanel();
		bottom.setBackground(Color.yellow);
		bottom.add(new JLabel("하단"));
		JTextField tf2 = new JTextField(20);
		bottom.add(tf2);

		JPanel center = new JPanel();
		center.setBackground(Color.cyan);
		center.setLayout(new GridLayout(4, 4, 3, 3));

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> op = new ArrayList<String>();
		op.add("+");
		op.add("-");
		op.add("*");
		op.add("+/-");
		op.add("=");

		for (int i = 0; i < arr.length; i++) {
			JButton btn = new JButton(arr[i]);
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String input = ((JButton) e.getSource()).getText();
					String num = tf1.getText();

					if (!op.contains(input)) { // 숫자일때
						tf1.setText(num + input);
					} else { // 기호일때
						if (num.isBlank()) { // 숫자가 없을때 기호
							return;
						}
						if (op.contains(input) && op.contains(lastInput)) { // 기호 연속으로 누를때
							return;
						} else if (input.equals("+/-")) {
							if (num.charAt(0) == '-') {
								tf1.setText(num.substring(1));
							} else {
								tf1.setText("-" + num);
							}
						} else if (input.equals("=")) {
							if(list.size() == 0) { // 숫자만 있을때
								tf2.setText(num);
							} else {
								// 계산 실행
							}
							tf1.setText("");
						} else {  // +,-,x 눌렀을 때
							list.add(Integer.parseInt(num));
							tf1.setText(num + " "+input+" ");
						}

					}

					lastInput = input;
				}
			});
			center.add(btn);
		}

		c.add(top, BorderLayout.NORTH);
		c.add(bottom, BorderLayout.SOUTH);
		c.add(center, BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Quiz3();
	}

}
