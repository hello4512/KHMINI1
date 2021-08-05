package miniproject;

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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Selectplace  {
	private BufferedImage img; 

	public Selectplace() {

		JFrame frame = new JFrame();
		frame.setSize(1280, 720);

		// 자리선택 버튼
		JButton seatbtn = new JButton("자리선택");
		seatbtn.setFocusPainted(false);
		seatbtn.setPreferredSize(new Dimension(180, 50));
		seatbtn.setBackground(Color.pink);
		seatbtn.setFont(new Font("고딕", Font.BOLD, 30));

		// 총 시간 및 금액 라벨 
		JLabel lb = new JLabel("총 시간 및 금액");
		lb.setHorizontalAlignment(JLabel.CENTER); //라벨 글자 가운데 정렬
		lb.setPreferredSize(new Dimension(180, 50));
		lb.setOpaque(true);
		lb.setBackground(Color.yellow);
		lb.setFont(new Font("고딕", Font.BOLD, 21));
		
		// 총 시간 및 금액라벨 밑 텍스트필드(?)
		JTextArea ta = new JTextArea(8,16); 
		ta.setPreferredSize(new Dimension(50,50));
		
		// 결제하기 버튼
		JButton paymentbtn = new JButton("결제하기");
		paymentbtn.setFocusPainted(false);
		paymentbtn.setPreferredSize(new Dimension(180, 50));
		paymentbtn.setBackground(Color.red);
		paymentbtn.setFont(new Font("고딕", Font.BOLD, 30));
		
		// 왼쪽 패널 (그리드레이아웃 올릴 패널)
		JPanel leftPanel = new JPanel(new GridLayout(6, 5, 10, 20));
		leftPanel.setPreferredSize(new Dimension(800, 650));
		leftPanel.setBackground(new Color(0, 0, 0, 0));


		//오른쪽 패널
		JPanel rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(200, 320));
		rightPanel.setBackground(new Color(0, 0, 0, 0));
		
		// lol 배경 올릴 패널
		//JPanel backgroundPanel = new JPanel();
		//backgroundPanel.setPreferredSize(new Dimension(700,500)); 
		// 이미지 크기 지정하여 이미지 객체 생성
		//Image icon = new ImageIcon("image./lol.jpg").getImage().getScaledInstance(150, 150, 0);  
		// JLabel 생성하여 Image 설정
		//JLabel label = new JLabel(new ImageIcon(icon));
		//backgroundPanel.add(label);
		
		try {
			img =  ImageIO.read(new File("images/lol.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rightPanel.add(seatbtn);  
		rightPanel.add(lb);   // 금액 라벨
		rightPanel.add(ta);
		rightPanel.add(paymentbtn); 
		
		// 전체 패널
		MyPanel page = new MyPanel();
		page.add(leftPanel); 
		page.add(rightPanel);  
 
		frame.add(page);  // 전체 패널 프레임에 올리기
		//frame.add(backgroundPanel); // 롤 배경 패널 프레임에 올리기
		
		// 아래부터 그리드 레이아웃 내용 구성
		JLabel lb1 = new JLabel("회원요금");
		lb1.setFont(lb1.getFont().deriveFont(25.0f));
		lb1.setHorizontalAlignment(JLabel.CENTER);
		lb1.setBackground(Color.blue);
		lb1.setOpaque(true);
		leftPanel.add(lb1);

		JLabel lb2 = new JLabel("학생요금");
		lb2.setFont(lb2.getFont().deriveFont(25.0f));
		lb2.setHorizontalAlignment(JLabel.CENTER);
		lb2.setBackground(Color.blue);
		lb2.setOpaque(true);
		leftPanel.add(lb2);

		JLabel lb3 = new JLabel("비회원요금");
		lb3.setFont(lb3.getFont().deriveFont(25.0f));
		lb3.setHorizontalAlignment(JLabel.CENTER);
		lb3.setBackground(Color.blue);
		lb3.setOpaque(true);
		leftPanel.add(lb3);

		JLabel lb4 = new JLabel("상품권");
		lb4.setFont(lb4.getFont().deriveFont(25.0f));
		lb4.setHorizontalAlignment(JLabel.CENTER);
		lb4.setBackground(Color.blue);
		lb4.setOpaque(true);
		leftPanel.add(lb4);

		JLabel lb5 = new JLabel("결제수단");
		lb5.setFont(lb5.getFont().deriveFont(25.0f));
		lb5.setHorizontalAlignment(JLabel.CENTER);
		lb5.setBackground(Color.blue);
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


		/*
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

					
			}
		});
		*/
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	 private class MyPanel extends JPanel{
		 
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	        }
	    }

	public static void main(String[] args) {
		new Selectplace();
	}
}
