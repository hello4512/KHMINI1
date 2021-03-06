package com.kh.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.kh.common.ChangePanel;

public class PaymentScreen extends JPanel{
	private MainFrame mfr;
	private JPanel paymentScreen;

	// 코로나 예방수칙 배경 설정
	ImageIcon bg = new ImageIcon("icon/lol.jpg");
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(bg.getImage(), 0, 0, d.width, d.height, null);
	}
	
	public PaymentScreen(MainFrame mf) {
		this.mfr = mf;
		this.paymentScreen = this;
		
		// 자리선택 버튼
		JButton seatbtn = new JButton("자리선택");
		seatbtn.setFocusPainted(false);
		seatbtn.setPreferredSize(new Dimension(160, 80));
		seatbtn.setBackground(new Color(212, 244, 250));
		seatbtn.setFont(new Font("고딕", Font.BOLD, 30));

		// 총 시간 및 금액 라벨 
		JLabel lb = new JLabel("시간 및 금액");
		lb.setHorizontalAlignment(JLabel.CENTER); //라벨 글자 가운데 정렬
		lb.setPreferredSize(new Dimension(160, 50));
		lb.setOpaque(true);
		lb.setBackground(Color.yellow);
		lb.setFont(new Font("고딕", Font.BOLD, 21));
		
		// 클릭한 총 시간 및 금액 뜨는 라벨 
		JLabel  tlabel = new JLabel();
		tlabel.setBackground(Color.white);
		tlabel.setOpaque(true);
		//JTextArea ta = new JTextArea(8,16); 
		tlabel.setPreferredSize(new Dimension(150,70));
		
		JLabel label = new JLabel("결제수단");
		label.setHorizontalAlignment(JLabel.CENTER); 
		label.setPreferredSize(new Dimension(160, 50));
		label.setOpaque(true);
		label.setBackground(Color.yellow);
		label.setFont(new Font("고딕", Font.BOLD, 25));
		
		// 클릭한 결제 수단 뜨는 라벨 
		JLabel  tlabel2 = new JLabel();
		tlabel2.setBackground(Color.white);
		tlabel2.setOpaque(true);
		//JTextArea ta = new JTextArea(8,16); 
		tlabel2.setPreferredSize(new Dimension(150,70));
		
		
		// 결제하기 버튼
		JButton paymentbtn = new JButton("결제하기");
		paymentbtn.setFocusPainted(false);
		paymentbtn.setPreferredSize(new Dimension(160, 50));
		paymentbtn.setBackground(new Color(255,167,167));
		paymentbtn.setFont(new Font("고딕", Font.BOLD, 30));
		
		// 왼쪽 패널 (그리드레이아웃 올릴 패널)
		JPanel leftPanel = new JPanel(new GridLayout(6, 5, 10, 20));
		leftPanel.setPreferredSize(new Dimension(800, 650));
		leftPanel.setBackground(new Color(0, 0, 0, 0));

		//오른쪽 패널
		JPanel rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(200, 400));
		rightPanel.setBackground(new Color(0, 0, 0, 0));
		
		rightPanel.add(seatbtn);  
		rightPanel.add(lb);   // 금액 라벨
		rightPanel.add(tlabel);
		rightPanel.add(label);
		rightPanel.add(tlabel2);
		rightPanel.add(paymentbtn); 
		
		// 전체 패널
		this.add(leftPanel); 
		this.add(rightPanel);  
 
		
		// 아래부터 그리드 레이아웃 내용 구성
		JLabel lb1 = new JLabel("회원요금");
		lb1.setFont(lb1.getFont().deriveFont(25.0f));
		lb1.setHorizontalAlignment(JLabel.CENTER);
		lb1.setBackground(new Color(232,217,255));
		lb1.setOpaque(true);
		leftPanel.add(lb1);

		JLabel lb2 = new JLabel("학생요금");
		lb2.setFont(lb2.getFont().deriveFont(25.0f));
		lb2.setHorizontalAlignment(JLabel.CENTER);
		lb2.setBackground(new Color(232,217,255));
		lb2.setOpaque(true);
		leftPanel.add(lb2);

		JLabel lb3 = new JLabel("비회원요금");
		lb3.setFont(lb3.getFont().deriveFont(25.0f));
		lb3.setHorizontalAlignment(JLabel.CENTER);
		lb3.setBackground(new Color(232,217,255));
		lb3.setOpaque(true);
		leftPanel.add(lb3);

		JLabel lb4 = new JLabel("상품권");
		lb4.setFont(lb4.getFont().deriveFont(25.0f));
		lb4.setHorizontalAlignment(JLabel.CENTER);
		lb4.setBackground(new Color(232,217,255));
		lb4.setOpaque(true);
		leftPanel.add(lb4);

		JLabel lb5 = new JLabel("결제수단");
		lb5.setFont(lb5.getFont().deriveFont(25.0f));
		lb5.setHorizontalAlignment(JLabel.CENTER);
		lb5.setBackground(new Color(232,217,255));
		lb5.setOpaque(true);
		leftPanel.add(lb5);

		JButton b1 = new JButton("1시간 / 1000원");
		b1.setFocusPainted(false);
		b1.setFont(b1.getFont().deriveFont(15.0f));
		leftPanel.add(b1);

		JButton b2 = new JButton("1시간 / 900원");
		b2.setFocusPainted(false);
		b2.setFont(b2.getFont().deriveFont(15.0f));
		leftPanel.add(b2);

		JButton b3 = new JButton("1시간 / 1200원");
		b3.setFocusPainted(false);
		b3.setFont(b3.getFont().deriveFont(15.0f));
		leftPanel.add(b3);

		JButton b4 = new JButton("문화상품권");
		b4.setFocusPainted(false);
		b4.setFont(b4.getFont().deriveFont(20.0f));
		leftPanel.add(b4);

		JButton b5 = new JButton("카드");
		b5.setFocusPainted(false);
		b5.setFont(b5.getFont().deriveFont(20.0f));
		leftPanel.add(b5);

		JButton b6 = new JButton("3시간 / 3000원");
		b6.setFocusPainted(false);
		b6.setFont(b6.getFont().deriveFont(15.0f));
		leftPanel.add(b6);

		JButton b7 = new JButton("3시간 / 2400원");
		b7.setFocusPainted(false);
		b7.setFont(b7.getFont().deriveFont(15.0f));
		leftPanel.add(b7);

		JButton b8 = new JButton("3시간 / 3300원");
		b8.setFocusPainted(false);
		b8.setFont(b8.getFont().deriveFont(15.0f));
		leftPanel.add(b8);

		JButton b9 = new JButton("넥슨캐시");
		b9.setFocusPainted(false);
		b9.setFont(b9.getFont().deriveFont(20.0f));
		leftPanel.add(b9);

		JButton b10 = new JButton("현금");
		b10.setFocusPainted(false);
		b10.setFont(b10.getFont().deriveFont(20.0f));
		leftPanel.add(b10);

		JButton b11 = new JButton("5시간 / 4000원");
		b11.setFocusPainted(false);
		b11.setFont(b11.getFont().deriveFont(15.0f));
		leftPanel.add(b11);

		JButton b12 = new JButton("5시간 / 3500원");
		b12.setFocusPainted(false);
		b12.setFont(b12.getFont().deriveFont(15.0f));
		leftPanel.add(b12);

		JButton b13 = new JButton("5시간 / 5000원");
		b13.setFocusPainted(false);
		b13.setFont(b13.getFont().deriveFont(15.0f));
		leftPanel.add(b13);

		JButton b14 = new JButton("온캐시");
		b14.setFocusPainted(false);
		b14.setFont(b14.getFont().deriveFont(20.0f));
		leftPanel.add(b14);

		JButton b15 = new JButton("카카오페이");
		b15.setFocusPainted(false);
		b15.setFont(b15.getFont().deriveFont(20.0f));
		leftPanel.add(b15);

		JButton b16 = new JButton("12시간 / 10000원");
		b16.setFocusPainted(false);
		b16.setFont(b16.getFont().deriveFont(15.0f));
		leftPanel.add(b16);

		JButton b17 = new JButton("12시간 / 8000원");
		b17.setFocusPainted(false);
		b17.setFont(b17.getFont().deriveFont(15.0f));
		leftPanel.add(b17);

		JButton b18 = new JButton("12시간 / 12000원");
		b18.setFocusPainted(false);
		b18.setFont(b18.getFont().deriveFont(15.0f));
		leftPanel.add(b18);

		JButton b19 = new JButton("틴캐시");
		b19.setFocusPainted(false);
		b19.setFont(b19.getFont().deriveFont(20.0f));
		leftPanel.add(b19);

		JButton b20 = new JButton("삼성페이");
		b20.setFocusPainted(false);
		b20.setFont(b20.getFont().deriveFont(20.0f));
		leftPanel.add(b20);

		JButton b21 = new JButton("20시간 / 15000원");
		b21.setFocusPainted(false);
		b21.setFont(b21.getFont().deriveFont(15.0f));
		leftPanel.add(b21);

		JButton b22 = new JButton("20시간 / 12000원");
		b22.setFocusPainted(false);
		b22.setFont(b22.getFont().deriveFont(15.0f));
		leftPanel.add(b22);

		leftPanel.add(new JLabel(""));

		JButton b23 = new JButton("구글기프트");
		b23.setFocusPainted(false);
		b23.setFont(b23.getFont().deriveFont(20.0f));
		leftPanel.add(b23);

		JButton b24 = new JButton("토스");
		b24.setFocusPainted(false);
		b24.setFont(b24.getFont().deriveFont(20.0f));
		leftPanel.add(b24);


		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
	
				tlabel.setText("1시간/1000원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
	
				tlabel.setText("1시간/900원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
	
				tlabel.setText("1시간/1200원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
	
				tlabel.setText("문화상품권");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel2.setText("카드");
				tlabel2.setHorizontalAlignment(JLabel.CENTER);
				tlabel2.setFont(tlabel.getFont().deriveFont(25.0f));
			}
		});
		
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("3시간/3000원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("3시간/2400원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("3시간/3300원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		
		
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("넥슨캐시");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		
		b10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel2.setText("현금");
				tlabel2.setHorizontalAlignment(JLabel.CENTER);
				tlabel2.setFont(tlabel.getFont().deriveFont(25.0f));
			}
		});
		
		b11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("5시간/4000원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("5시간/3500원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("5시간/5000원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("온캐시");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel2.setText("카카오페이");
				tlabel2.setHorizontalAlignment(JLabel.CENTER);
				tlabel2.setFont(tlabel.getFont().deriveFont(25.0f));
			}
		});
		
		b16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("12시간/10000원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b17.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("12시간/8000원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("12시간/12000원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		b19.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("틴캐시");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		
		b20.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel2.setText("삼성페이");
				tlabel2.setHorizontalAlignment(JLabel.CENTER);
				tlabel2.setFont(tlabel.getFont().deriveFont(25.0f));
			}
		});
		
		
		b21.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("20시간/15000원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		
		b22.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("20시간/12000원");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		
		b23.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel.setText("구글기프트");
				tlabel.setHorizontalAlignment(JLabel.CENTER);
				tlabel.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		
		
		b24.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tlabel2.setText("토스");
				tlabel2.setHorizontalAlignment(JLabel.CENTER);
				tlabel2.setFont(tlabel.getFont().deriveFont(20.0f));
			}
		});
		
		//자리선택 버튼 눌렀을 때 이벤트
		seatbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mfr, paymentScreen, new Seat(mf));
			}
		});
		
		//결제하기 버튼 눌렀을 때 이벤트
		paymentbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "결제 완료 되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, paymentScreen, new Login(mf));
			}
		});
	}
	
	

}
