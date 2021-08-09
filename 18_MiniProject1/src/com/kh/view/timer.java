package com.kh.view;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class timer extends JFrame{
	private String one;
	private String two;
	private String b;
	private int m = -1;
	private int h, s;
	
	private JLabel aa = new JLabel();
	private JLabel aa2 = new JLabel();

	public timer() {
		set();
		setlabel();
		timeget();
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
	public void set() {
		setTitle("Y_Clock Test");
		setSize(400, 300);
		setLocationRelativeTo(null);	//	화면 가운데서 창이 나옴
		setLayout(null);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	public static void main(String[] args) { 
		new timer();
		System.out.println();
	}

	
}
