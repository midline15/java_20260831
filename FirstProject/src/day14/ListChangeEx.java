package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ListChangeEx extends JFrame{
	
	ListChangeEx(){
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField text = new JTextField(20);
		c.add(text);
		
		Vector<String> v = new Vector<String>();
		JList<String> list = new JList<String>(v);
		JScrollPane scroll = new JScrollPane(list);
		c.add(scroll);
		
		v.add("홍길동");
		list.setVisibleRowCount(5); 
		list.setFixedCellWidth(100);
		
		text.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				v.add(text.getText());
				((JTextField)e.getSource()).setText("");
				list.setListData(v);
			}
		});

		setSize(300, 300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new ListChangeEx();
	}

}
