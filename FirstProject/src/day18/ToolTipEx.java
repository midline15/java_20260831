package day18;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ToolTipManager;

public class ToolTipEx extends JFrame {

	ToolTipEx (){
		setTitle(this.getClass().getName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createToolBar();
		
		ToolTipManager  m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		
		setSize(300, 300);
		setVisible(true);
	}

	private void createToolBar() {
		JToolBar toolBar= new JToolBar("KitaeMenu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		JButton btn = new JButton("New");
		btn.setToolTipText("파일을 생성합니다.");
		toolBar.add(btn);
		toolBar.add(new JButton(new ImageIcon("images/open.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/save.jpg")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		add(toolBar, BorderLayout.NORTH);
		}
	
	public static void main(String[] args) {
		new ToolTipEx();
	}

}
