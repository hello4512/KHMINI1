package com.kh.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public static int SeatNumber;				// 좌석 번호
	public static String getLoginID;			// 로그인 한 아이디값
	public static int getValue;					// 로그인 된 벨류값
	public static int getpaymentScreenNumber; 	// 선결제 금액당 시간값
	public static String menu;					// 메뉴
	public static int menunum;					// 메뉴 개수
	public static String call;					// 요청사항 입력값
	public static double timer;					// 사용시간
	
	public MainFrame() {
		super("PC방 프로그램");
		this.setSize(1280, 720);
		this.setLocationRelativeTo(null); // 실행했을 때 화면 가운데에 창 뜨게 하는 메소드
		
		new MainPage(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
