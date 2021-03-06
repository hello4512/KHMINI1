package com.kh.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.kh.common.ChangePanel;
import com.kh.model.dao.MemberDao;
import com.kh.model.vo.PcMember;

public class LoginAfterPage extends JPanel implements ActionListener{
	private MainFrame mfr;
	private JPanel loginafterpage;
	private Image img;
	private MemberDao a = new MemberDao();
	private ArrayList<PcMember> list = new ArrayList<>();
	
	private String one;
	private String two;
	private String b;
	private int m = -1;
	private int h, s;
	
	private JLabel aa = new JLabel();
	private JLabel aa2 = new JLabel();
	
	public LoginAfterPage(MainFrame mf) {
		list = a.fileOpen();
		this.mfr = mf;
		this.loginafterpage = this;
		
		Login lo = new Login(mf);
		PcMember pm = new PcMember();
		Seat2 se = new Seat2(mf);
		
		a.fileOpen();
				
		// 로그인 후 화면
		
		// up JPanel
		JPanel upPanel = new JPanel();
		upPanel.setPreferredSize(new Dimension(840, 80));
		upPanel.setBackground(Color.darkGray);
			
		// JLabel "no."
		JLabel nojl = new JLabel("no. " + mfr.SeatNumber);	//	좌석 번호 가져오기
		upPanel.add(nojl);
		nojl.setFont(new Font("고딕", Font.BOLD, 30));
		nojl.setForeground(Color.white);
		nojl.setPreferredSize(new Dimension(560, 60));
		
		/*// JLabel "회원번호 or 비회원 번호"
		JLabel nojl2 = new JLabel("OO 입니다");
		upPanel.add(nojl2);
		nojl2.setFont(new Font("고딕", Font.BOLD, 30));
		nojl2.setForeground(Color.white);
		nojl2.setPreferredSize(new Dimension(260, 60));
		*/
		
		// JButton "자리이동"
		JButton move = new JButton("자리 이동 >>");
		move.setBackground(Color.darkGray);
		upPanel.add(move);
		move.setPreferredSize(new Dimension(240, 60));
		move.setFont(new Font("고딕", Font.BOLD, 20));
		move.setForeground(Color.yellow);
		move.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "자리이동 페이지로 이동합니다", "자리 이동", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, loginafterpage, new Seat2(mf));
			}
		});
				
		// left JPanel 
		JPanel leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(840, 720));
		leftPanel.setBackground(Color.black);
		leftPanel.add(upPanel);
		leftPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
				
		// 개행용 JLabel
		JLabel jl1 = new JLabel();
		leftPanel.add(jl1);
		jl1.setPreferredSize(new Dimension(1000, 60));
		
		// leftPanel JLabel ID 
		JLabel info = new JLabel("ID : " + mfr.getLoginID /*list.get(mfr.getValue).getUserId()*/);
		leftPanel.add(info);
		info.setFont(new Font("고딕", Font.BOLD, 30));
		info.setForeground(Color.white);
		info.setPreferredSize(new Dimension(800, 80));
		
		
		// leftPanel JLabel 회원등급
		/*JLabel rank = new JLabel("회원등급 : ");
		leftPanel.add(rank);
		rank.setFont(new Font("고딕", Font.BOLD, 30));
		rank.setForeground(Color.white);
		rank.setPreferredSize(new Dimension(800, 80));
		*/
		// Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTimeInMillis(System.currentTimeMillis() + 1000 * 60 * 6);
		
						
		// leftPanel JLabel 남은시간
		JLabel time = new JLabel("남은시간 : " + mfr.getpaymentScreenNumber + "분"/*cal.get(Calendar.MINUTE)*/);
		leftPanel.add(time);
		time.setFont(new Font("고딕", Font.BOLD, 60));
		time.setForeground(Color.white);
		time.setPreferredSize(new Dimension(800, 160));
			
		
		// 현재 시간
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date today = new Date();
		
		// leftPanel JLabel 시작시간
		JLabel starttime = new JLabel("시작시간 : " + format.format(today));
		leftPanel.add(starttime);
		starttime.setFont(new Font("고딕", Font.BOLD, 30));
		starttime.setForeground(Color.white);
		starttime.setPreferredSize(new Dimension(800, 80));
			
		// 
		int elapsedTime = 0;
		int seconds = 0;
		int minutes = 0;
		int hours = 0;
		boolean started = false;
		String seconds_string = String.format("%02d", seconds);
		String minutes_string = String.format("%02d", minutes);
		String hours_string = String.format("%02d", hours);
		
		// 사용시간 출력하기
		JLabel timeLabel = new JLabel();
		leftPanel.add(timeLabel);
		time.setPreferredSize(new Dimension(800, 160));
		
		timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
		
		JButton timeButton = new JButton();
		timeButton.add(timeLabel);
				
		/*Timer timer2 = new Timer();
		
		elapsedTime = elapsedTime + 1000;
		hours = (elapsedTime/3600000);
		minutes = (elapsedTime/60000) % 60;
		seconds =(elapsedTime/1000) % 60;
		seconds_string = String.format("%02d", seconds);
		minutes_string = String.format("%02d", minutes);
		hours_string = String.format("%02d", hours);
		*/
		// JLabel aa = new JLabel();
		// JLabel aa2 = new JLabel();
				
		// leftPanel JLabel 사용시간
		JLabel usagetime = new JLabel("사용시간 : " + aa2/*timeLabel.getText()*/);
		leftPanel.add(usagetime);
		leftPanel.add(aa2);
		usagetime.setFont(new Font("고딕", Font.BOLD, 30));
		usagetime.setForeground(Color.white);
		usagetime.setPreferredSize(new Dimension(800, 80));
		
		// 시계
		/*JLabel clock = new JLabel("시계");
		leftPanel.add(clock);
		leftPanel.add(aa2);
		clock.setFont(new Font("고딕", Font.BOLD, 30));
		clock.setForeground(Color.white);
		clock.setPreferredSize(new Dimension(800, 80));
		*/
				
		// JButton "사용 종료"
		JButton exit = new JButton("사용 종료");
		exit.setBackground(Color.red);
		leftPanel.add(exit);
		exit.setPreferredSize(new Dimension(180, 60));
		exit.setFont(new Font("고딕", Font.BOLD, 30));
		exit.setForeground(Color.white);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "사용을 종료 합니다", "사용 종료", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, loginafterpage, new MainPage(mf));
			}
		});
				
		
		// right JPanel 생성
		JPanel rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(400, 720));
		rightPanel.setBackground(Color.gray);
		Image icon = new ImageIcon("icon/raccoon.jpg").getImage().getScaledInstance(340, 520, 0);
		// JLabel 생성하여 Image 설정
		JLabel label = new JLabel(new ImageIcon(icon));
		rightPanel.add(label);
		// 메인 페이지에서 클릭이 일어났을 때 이벤트 감지
		// this.addMouseListener(new MyMouseAdapter());
		
		// right JPanel "메뉴 주문" button
		JButton menubutton = new JButton("메뉴 주문");
		menubutton.setBackground(Color.blue);
		rightPanel.add(menubutton);
		menubutton.setPreferredSize(new Dimension(350, 100));
		menubutton.setFont(new Font("고딕", Font.BOLD, 60));
		menubutton.setForeground(Color.white);
		menubutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "메뉴 주문 페이지로 이동합니다.", "메뉴 주문", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, loginafterpage, new CafePage(mf));
			}
		});
		
	
				
		this.add(leftPanel);
		this.add(rightPanel);
		mf.add(this);
	}
	
	public void timeget() {
		String sday=null;
		Calendar t = Calendar.getInstance();
		int year = t.get(Calendar.YEAR); 
		int month = t.get(Calendar.MONTH)+1;
		int date = t.get(Calendar.DATE);
		int amPm = t.get(Calendar.AM_PM);
		int hour = t.get(Calendar.HOUR);
		int min = t.get(Calendar.MINUTE);
		int sec = t.get(Calendar.SECOND);
		String ampm=amPm==Calendar.AM? "오전":"오후";
		int day= t.get(Calendar.DAY_OF_WEEK);
		b = (year+"."+month+"."+date+"."+ampm+" "+hour+":"+min+":"+sec);
		aa.setText(b);
		add(aa);
		while(true) {
			Calendar t2=Calendar.getInstance();
			int year2 = t2.get(Calendar.YEAR); 
			int month2 = t2.get(Calendar.MONTH)+1;
			int date2 = t2.get(Calendar.DATE);
			int amPm2 = t2.get(Calendar.AM_PM);
			int hour2 = t2.get(Calendar.HOUR);
			int min2 = t2.get(Calendar.MINUTE);
			int sec2 = t2.get(Calendar.SECOND);
			String ampm2=amPm==Calendar.AM? "오전":"오후";
			int day2= t.get(Calendar.DAY_OF_WEEK);
			one = (year2+"."+month2+"."+date2+".");
			two = (ampm2+" "+hour2+":"+min2+":"+sec2);
			if(sec2<sec) {
				sec2 += 60;
			}
			s = (sec2 -sec);
			if(s == 0) {
				m++;
			}
			if(m == 60) {
				m = 0;
				h++;
			}
			String h2 = h+"";
			String m2 = m+"";
			String s2 = s+"";
					
			aa2.setText(h2+":"+m2+":"+s2);
			
			add(aa2);
			try {
				Thread.sleep(1000);//1초
				repaint();
		    } catch(Exception e) {
		    	
		    }
		}
	}
	
	public void setlabel() {	
		aa2.setOpaque(true);
		aa2.setBackground(new Color(0,0,0,0));
		aa2.setBounds(55,70,300,100);
		aa2.setForeground(Color.red);
		aa.setOpaque(true);
		aa.setBackground(new Color(0,0,0,0));
		aa.setBounds(85,170,300,150);
		aa.setForeground(Color.black);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}

