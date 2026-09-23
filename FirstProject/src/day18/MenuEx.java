package day18;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {

	public MenuEx() {
		setTitle("Menu 만들기예제");
		createMenu(); // 메뉴생성, 프레임에삽입
		setSize(250, 200);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		
		JMenuItem load = new JMenuItem("Load");
		screenMenu.add(load);
		JMenuItem hide = new JMenuItem("Hide");
		screenMenu.add(hide);
		JMenuItem reShow = new JMenuItem("ReShow");
		screenMenu.add(reShow);
		screenMenu.addSeparator();// 분리선삽입
		JMenuItem exit = new JMenuItem("Exit");
		screenMenu.add(exit);
		
		menuBar.add(screenMenu);
		menuBar.add(new JMenu("Edit"));
		menuBar.add(new JMenu("Source"));
		menuBar.add(new JMenu("Project"));
		menuBar.add(new JMenu("Run"));
		
		setJMenuBar(menuBar);
	}

	public static void main(String[] args) {
		new MenuEx();
	}
}
