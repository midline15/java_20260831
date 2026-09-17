package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx1 extends JFrame	{

	PanelEx1(){
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		c.add(panel1);
		c.add(panel2);
		panel1.add(new JButton("버튼1"));
		panel1.add(new JButton("버튼2"));
		panel2.add(new JButton("버튼3"));
		panel2.add(new JButton("버튼4"));
		
		panel1.setBackground(Color.CYAN);
		panel2.setBackground(Color.gray);
		panel2.setLayout(new GridLayout(2,1));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PanelEx1();
	}

}
