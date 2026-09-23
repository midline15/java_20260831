package day18;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DialogEx extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MyDialog dialog;

	DialogEx() {
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container c = getContentPane();

		JButton btn = new JButton("Show Dialog");
		add(btn);
		dialog = new MyDialog(this, "Test Dialog");

		btn.addActionListener(e -> {
			dialog.setVisible(true);

			String text = dialog.getInput();

			if (text.isEmpty()) {
				return;
			} else {
				btn.setText(text);
			}
		});

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DialogEx();
	}

}
