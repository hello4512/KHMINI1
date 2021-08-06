package com.kh.test.view;

import javax.swing.JFrame;


public class MainFrame extends JFrame {

	public static int SeatNumber;
	
	public MainFrame() {
		super("패널 체인지 테스트");
		this.setSize(1280, 720);
				
		// new LoginAfterPage(this);
		 new ManagerPage(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
