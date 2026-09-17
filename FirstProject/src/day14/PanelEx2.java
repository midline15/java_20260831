package day14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEx2 extends JFrame	{

	PanelEx2(){
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel top = new JPanel();
		top.setBackground(Color.blue);
		top.add(new JLabel("상단"));
		JPanel bottom = new JPanel();
		bottom.setBackground(Color.blue);
		bottom.add(new JLabel("하단"));
		JPanel center = new JPanel();
		center.add(new JButton());
		center.add(new JButton());
		
		c.add(top, BorderLayout.NORTH);
		c.add(bottom, BorderLayout.SOUTH);
		c.add(center, BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PanelEx2();
	}

}
