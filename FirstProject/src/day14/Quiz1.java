package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz1 extends JFrame {

	Quiz1() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(10, 1));

		JPanel[] p = new JPanel[10];
		JLabel[] l = new JLabel[10];
		JTextField[] tf = new JTextField[10];
		JCheckBox[] ch = new JCheckBox[8];
		String[] str = { "금액", "오만원", "만원", "오천원", "천원", "500원", "100원", "50원", "10원", "1원", };
		for (int i = 0; i < p.length; i++) {
			p[i] = new JPanel();
			p[i].setBackground(Color.yellow);
			l[i] = new JLabel(str[i]);
			tf[i] = new JTextField(10);
			p[i].add(l[i]);
			p[i].add(tf[i]);
			if (i > 0 && i < 9) {
				ch[i - 1] = new JCheckBox();
				p[i].add(ch[i - 1]);
			}
			if (i >0) {
				p[i].setLayout(new FlowLayout(FlowLayout.RIGHT));
				tf[i].setEditable(false);
				p[i].add(new JLabel("              "));
			}
			c.add(p[i]);

		}

		JButton btn = new JButton("계산");
		p[0].add(btn);
		p[9].add(new JLabel("       "));

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int[] arr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
				int money = Integer.parseInt(tf[0].getText());
				for (int i = 0; i < arr.length-1; i++) {
					if (ch[i].isSelected()) {
						tf[i + 1].setText(Integer.toString(money / arr[i]));
						money = money % arr[i];
					}else {
						tf[i+1].setText("0");
					}
				}
				tf[9].setText(Integer.toString(money));
			}
		});

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Quiz1();
	}

}
