package day13;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TextFieldEx1 extends JFrame{

	TextFieldEx1(){
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel name = new JLabel("이름 : ");
		c.add(name);
		JTextField nameField = new JTextField(20);
		c.add(nameField);
		JLabel addr = new JLabel("주소 : ");
		c.add(addr);
		JTextField addrField = new JTextField(20);
		c.add(addrField);
		JLabel hobby = new JLabel("취미 : ");
		c.add(hobby);
		JCheckBox c1= new JCheckBox("게임");
		JCheckBox c2= new JCheckBox("영화감상");
		JCheckBox c3= new JCheckBox("독서");
		JCheckBox c4= new JCheckBox("코딩");
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		JLabel gender = new JLabel("성별 : ");
		c.add(gender);
		ButtonGroup g = new ButtonGroup();
		JRadioButton r1 = new JRadioButton("남");
		JRadioButton r2 = new JRadioButton("여");
		g.add(r1);
		g.add(r2);
		c.add(r1);
		c.add(r2);
//		JLabel breakLine = new JLabel();
//		breakLine.setPreferredSize(new Dimension(2000, 0)); 
//		add(breakLine);
		JButton btn = new JButton("저장");
		c.add(btn);

		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldEx1();
	}

}
