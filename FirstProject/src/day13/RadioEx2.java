package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioEx2 extends JFrame {

	private int price = 0;

	public RadioEx2() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과100원, 배500원, 체리20000원"));
		
		
		JLabel sumLabel = new JLabel("현재 " + price + "원입니다.");
		JRadioButton fruits[] = new JRadioButton[3];
		String fruitNames[] = { "사과", "배", "체리" };
		ButtonGroup g = new ButtonGroup();

		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JRadioButton(fruitNames[i]);
			g.add(fruits[i]);
			fruits[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					if (fruits[0].isSelected()) {
						price = 100;
					} else if (fruits[1].isSelected()) {
						price = 500;
					} else {
						price = 20000;
					}

					sumLabel.setText("현재" + price + "원 입니다.");
				}
			});

			c.add(fruits[i]);

		}

		c.add(sumLabel);

		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioEx2();
	}

}
