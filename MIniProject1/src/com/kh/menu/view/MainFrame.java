package com.kh.menu.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		super("메뉴");
		
		this.setBounds(200, 200, 1280, 720);
		this.setLocationRelativeTo(null);
		
		new MainPage(this);

		// 반드시 필요한 코드
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
