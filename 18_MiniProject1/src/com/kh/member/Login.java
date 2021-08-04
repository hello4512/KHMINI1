package com.kh.member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	private Image bg = new ImageIcon
            (Login.class.getResource("icon/bg.jpg")).getImage();
	public Login() {
		JFrame frame = new JFrame("로그인 화면");
		frame.setSize(1280,720);
		
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(bg, 0, 0, 1280, 720, null);
			}
		};		
		panel.setLayout(null);
		
		
		String text = "<html><p style=\"color:white;font-size:40px;border-bottom:5px solid white;\">"+ "01" +"</p></html>";
		JLabel label = new JLabel(text);
		//label.setFont(new Font("",Font.BOLD,40));
		//label.setForeground(Color.white);

		String PName = "<html><p style=\"color:#E5C9F1;font-size:40px;\">"+ "MINI1 PC" +"</p></html>";
		JLabel label2 = new JLabel(PName);
		//label2.setFont(new Font("",Font.BOLD,40));
		//label2.setForeground(Color.getHSBColor(282, (float)16.6, (float)94.5));

		String PMenu = "<html><p style=\"color:#BEBEBE;font-size:15px;\">"
					   + "COFFEE<br>" + "DRINK<br>" + "RICE<br>" + "NOODLE<br>" + "CHICKEN<br>" + "SNACK<br>"
					   +"</p></html>";
		String PMenuDetail = "<html><p style=\"color:#FFFFFF;font-size:15px;\">"
				   + "아메리카노 / 카페라떼 / 카라멜마끼아또<br>"
				   + "탄산음료(콜라, 사이다, 웰치스) / 아이스티 / 에이드<br>"
				   + "김치볶음밥 / 낙지볶음밥 / 새우볶음밥<br>"
				   + "라면 / 짜파게티 / 라볶이 / 우동<br>"
				   + "순살치킨 / 버팔로윙 / 버팔로봉 / 지파이<br>"
				   + "핫도그 / 치즈스틱 / 소떡소떡 / 츄러스<br>"
				   +"</p></html>";
		JLabel label3 = new JLabel(PMenu);
		JLabel label4 = new JLabel(PMenuDetail);

		label.setSize(400, 80);
		label.setLocation(20, 20);
		label2.setSize(230, 60);
		label2.setLocation(525, 80);
		label3.setSize(100, 180);
		label3.setLocation(350, 200);
		label4.setSize(500, 180);
		label4.setLocation(500, 200);
		
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);

		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.DARK_GRAY);
		panel2.setSize(1280, 150);
		panel2.setLocation(0, 550);

		JLabel logo = new JLabel("KH정보교육원");
		logo.setFont(new Font("",Font.BOLD,25));
		logo.setForeground(Color.LIGHT_GRAY);
		logo.setSize(300, 150);
		logo.setLocation(10, 0);
		panel2.add(logo);		

		JPanel panel3 = new JPanel();	
		panel3.setBackground(Color.DARK_GRAY);
		panel3.setBounds(680, 550, 600, 150);
		panel3.setLayout(null);
		JLabel IdLabel = new JLabel("아이디 ");
		JLabel PwLabel = new JLabel("비밀번호 ");
		JLabel NumLabel = new JLabel("비회원 ");
		IdLabel.setForeground(Color.WHITE);
		PwLabel.setForeground(Color.WHITE);
		NumLabel.setForeground(Color.WHITE);
		JTextField IdArea = new JTextField(15);
		JPasswordField PwArea = new JPasswordField(15);
		JTextField NumArea = new JTextField(15);
		JButton LoginBtn = new JButton("로그인");
		JButton JoinBtn = new JButton("회원가입");
		JButton SearchBtn = new JButton("아이디/비밀번호 찾기");
		LoginBtn.setBackground(new Color(52, 152, 219));	//RGB
		JoinBtn.setBackground(new Color(224, 224, 224));
		SearchBtn.setBackground(new Color(224, 224, 224));

		IdLabel.setSize(100, 30);
		IdLabel.setLocation(0, 10);
		PwLabel.setSize(100, 30);
		PwLabel.setLocation(0, 50);
		NumLabel.setSize(100, 30);
		NumLabel.setLocation(0, 90);

		IdArea.setSize(150, 30);
		IdArea.setLocation(100, 10);
		PwArea.setSize(150, 30);
		PwArea.setLocation(100, 50);
		NumArea.setSize(150, 30);
		NumArea.setLocation(100, 90);
		
		LoginBtn.setSize(100, 110);
		LoginBtn.setLocation(260, 10);
		JoinBtn.setSize(180, 50);
		JoinBtn.setLocation(370, 10);
		SearchBtn.setSize(180, 50);
		SearchBtn.setLocation(370, 70);
		
		panel3.add(IdLabel);
		panel3.add(IdArea);		
		panel3.add(PwLabel);
		panel3.add(PwArea);		
		panel3.add(NumLabel);
		panel3.add(NumArea);
		panel3.add(LoginBtn);
		panel3.add(JoinBtn);
		panel3.add(SearchBtn);
		
		panel2.add(panel3);
		frame.add(panel3);
		frame.add(panel2);
		frame.add(panel);		
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

		JDialog dialog = new JDialog(frame, "아이디/비밀번호 찾기");
		dialog.setBounds(440, 110, 400, 500);
		JPanel findID = new JPanel();
		JLabel findTit = new JLabel("아이디 / 비밀번호 찾기");
		findTit.setFont(new Font("",Font.BOLD,30));
		String textIdOn = "<html><p style=\"width:120px;border-bottom:5px solid black;text-align:center;font-size:15px;\">"+ "아이디 찾기" +"</p></html>";
		String textIdOff = "<html><p style=\"width:120px;border-bottom:5px solid gray;text-align:center;font-size:15px;color:gray;\">"+ "아이디 찾기" +"</p></html>";
		String textPwOn = "<html><p style=\"width:120px;border-bottom:5px solid black;text-align:center;font-size:15px;\">"+ "비밀번호 찾기" +"</p></html>";
		String textPwOff = "<html><p style=\"width:120px;border-bottom:5px solid gray;text-align:center;font-size:15px;color:gray;\">"+ "비밀번호 찾기" +"</p></html>";
		JButton findIdtxt = new JButton(textIdOn);
		JButton findPwtxt = new JButton(textPwOff);
		findIdtxt.setBorder(null);
		findPwtxt.setBorder(null);

		JTextField InputName = new JTextField("이름 입력");
		JTextField InputID = new JTextField("아이디 입력");
		JTextField InputEmail = new JTextField("이메일주소 입력");
		JTextField InputPhone = new JTextField("휴대폰번호 입력 (-제외)");
		JButton SearchId_btn = new JButton("아이디 찾기");
		JButton SearchPw_btn = new JButton("비밀번호 찾기");

		InputName.setSize(300, 50);
		InputName.setLocation(260, 10);
		InputID.setSize(300, 50);
		InputID.setLocation(260, 10);
		InputEmail.setSize(300, 50);
		InputEmail.setLocation(260, 10);
		InputPhone.setSize(300, 50);
		InputPhone.setLocation(260, 10);
		SearchId_btn.setSize(300, 50);
		SearchId_btn.setLocation(260, 10);
		SearchPw_btn.setSize(300, 50);
		SearchPw_btn.setLocation(260, 10);
		
		
		findID.add(findTit);
		findID.add(findIdtxt);
		findID.add(findPwtxt);
		findID.add(InputName);
		findID.add(InputEmail);
		findID.add(SearchId_btn);
		//dialog.add(contents);
		dialog.add(findID);
		
		JPanel findPW = new JPanel();
		

		SearchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}			
		});
		findIdtxt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				findIdtxt.setText(textIdOn);
				findPwtxt.setText(textPwOff);
			}			
		});
		findPwtxt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				findIdtxt.setText(textIdOff);
				findPwtxt.setText(textPwOn);
			}			
		});
	}
	public static void main(String[] args) {
		new Login();
	}
}
