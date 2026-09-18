package day15;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _홀짝 extends JFrame {

	_홀짝() {
		setTitle("");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		p1.setBounds(0, 0, 300, 100);
		JLabel l1 = new JLabel("?");
		l1.setOpaque(true);
		l1.setBackground(new Color(255,0,255));
		l1.setForeground(Color.yellow);
		l1.setFont(new Font("Arial", Font.PLAIN, 30));
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setPreferredSize(new Dimension(80, 80));
		p1.add(l1);
		c.add(p1);

		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
		p2.setBounds(0,110,300,20);;
		JLabel l2 = new JLabel("무엇일까요?");
		p2.add(l2);
		c.add(p2);

		JPanel p = new JPanel();
		p.setBounds(0, 140, 300, 50);
		
		JButton[] b = new JButton[3];
		String[] s = { "홀", "짝", "다시" };

		for (int i = 0; i < s.length; i++) {
			b[i] = new JButton(s[i]);
			b[i].setSize(80, 50);
			b[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					int num = (int) (Math.random() * 10) + 1;
					String correct = num % 2 == 0 ? "짝" : "홀";

					String text = ((JButton) e.getSource()).getText();
					if (text.equals("다시")) {
						l1.setText("?");
						l2.setText("무엇일까요?");
//						b[0].setEnabled(true);
//						b[1].setEnabled(true);
						c.repaint();
						return;
					}
					l1.setText(Integer.toString(num));
					if (text.equals(correct)) {
						l2.setText(correct + "! 맞았어요.");
					} else {
						l2.setText(correct + "! 아쉽군요.");
					}
//					b[0].setEnabled(false);
//					b[1].setEnabled(false);
					c.repaint();

				}
			});
			p.add(b[i]);
		}
		c.add(p);

		setSize(300, 230);
		setVisible(true);
	}

	public static void main(String[] args) {
		new _홀짝();
	}

}
