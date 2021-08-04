package com.kh.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		super("PC방 프로그램");
		this.setSize(1280, 720);
		this.setLocationRelativeTo(null); // 실행했을 때 화면 가운데에 창 뜨게 하는 메소드
		
		new MainPage(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
