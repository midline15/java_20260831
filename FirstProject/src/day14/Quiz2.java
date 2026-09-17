package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz2 extends JFrame{
	
	Quiz2(){start();}

	public static void main(String[] args) {
		new Quiz2();
	}
	
	void start(){
		setTitle("NullLayoutQuiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
	
		JButton[] b = new JButton[10];
		ArrayList<Integer> list = new ArrayList();

		Random r = new Random();
		for (int i = 0; i <= 9; i++) {
			b[i] = new JButton(Integer.toString(i+1));
			int x = r.nextInt(230)+10;
			int y = r.nextInt(230)+10;
			b[i].setBounds(x, y, 50, 20);
			b[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton btn = (JButton)e.getSource();
					if(Integer.parseInt(btn.getText()) == list.get(0).intValue()) {
						list.remove(0);
						c.remove(btn);
						c.repaint();
					}
					if(list.isEmpty()) {
//						new Quiz2();
						start();
						
						
					}
				}
			});
			c.add(b[i]);
			list.add(i+1);
		}

		setSize(300, 300);
		setVisible(true);
	}

}
