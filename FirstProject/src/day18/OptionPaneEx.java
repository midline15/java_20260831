package day18;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OptionPaneEx extends JFrame {

	public OptionPaneEx() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton inputBtn = new JButton("Input");
		JButton confirmBtn = new JButton("Confirm");
		JButton messageBtn = new JButton("Message");
		JTextField tf = new JTextField(15);

		c.add(inputBtn);
		c.add(confirmBtn);
		c.add(messageBtn);
		c.add(tf);

		inputBtn.addActionListener(e -> {
			String name = JOptionPane.showInputDialog("이름 입력");
			if (!name.isEmpty()) {
				tf.setText(name);
			}
		});

		confirmBtn.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "계속할것입니까?", "Confirm", JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.CLOSED_OPTION) {
				tf.setText("닫음");
			} else if (result == JOptionPane.YES_OPTION) {
				tf.setText("YES");
			} else if (result == JOptionPane.NO_OPTION) {
				tf.setText("NO");
			}
		});

		messageBtn.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "조심하세요", "Message", JOptionPane.ERROR_MESSAGE);
		});

		setSize(600, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new OptionPaneEx();
	}

}
