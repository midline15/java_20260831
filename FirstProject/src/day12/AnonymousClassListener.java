package day12;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame {

	public AnonymousClassListener() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("클릭");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("클릭 됨!");
				JButton btn = (JButton) e.getSource();

				if (btn.getText().equals("클릭")) {
					btn.setText("Action");
					setTitle(btn.getText());
				} else {
					btn.setText("클릭");
					setTitle(btn.getText());
				}

			}
		});
		c.add(btn);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {

		new AnonymousClassListener();

	}

}
