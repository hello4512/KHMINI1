package com.kh.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.kh.common.ChangePanel;
import com.kh.model.vo.PcMember;

public class LoginAfterPage extends JPanel{
	private MainFrame mfr;
	private JPanel loginafterpage;
	private Image img;
		
	public LoginAfterPage(MainFrame mf) {
		this.mfr = mf;
		this.loginafterpage = this;
		
		Login lo = new Login(mf);
		PcMember pm = new PcMember();
		Seat se = new Seat(mf);
		
		// 로그인 후 화면
		
		// up JPanel
		JPanel upPanel = new JPanel();
		upPanel.setPreferredSize(new Dimension(840, 80));
		upPanel.setBackground(Color.darkGray);
			
		// JLabel "no."
		JLabel nojl = new JLabel("no." /*OO 입니다*/);
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
				ChangePanel.changePanel(mfr, loginafterpage, new Seat(mf));
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
		JLabel info = new JLabel("ID : " + pm.getUserId());
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
		
		// Timer
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Task is complete :)");
			}			
		};
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2020);
		date.set(Calendar.MONTH,Calendar.JUNE);
		date.set(Calendar.DAY_OF_MONTH,20);
		date.set(Calendar.HOUR_OF_DAY,0);
		date.set(Calendar.MINUTE,0);
		date.set(Calendar.SECOND,0);
		date.set(Calendar.MILLISECOND,0);
		
		timer.schedule(task, date.getTime());
		
				
		// leftPanel JLabel 남은시간
		JLabel time = new JLabel("남은시간 : "/*cal.get(Calendar.MINUTE)*/);
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
				
		
		// leftPanel JLabel 사용시간
		JLabel usagetime = new JLabel("사용시간 : " + cal2.get(Calendar.MINUTE));
		leftPanel.add(usagetime);
		usagetime.setFont(new Font("고딕", Font.BOLD, 30));
		usagetime.setForeground(Color.white);
		usagetime.setPreferredSize(new Dimension(800, 80));
				
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
				ChangePanel.changePanel(mfr, loginafterpage, new Login(mf));
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
	
	public void Time() {
		
	}
		
}

