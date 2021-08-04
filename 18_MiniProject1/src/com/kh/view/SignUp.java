package com.kh.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.kh.common.ChangePanel;

public class SignUp extends JFrame{
	
	public SignUp() {
		super("PC방 프로그램");
		this.setSize(1280, 720);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(246, 246, 246));
		
		// 타이틀
		JLabel title = new JLabel("회원 가입 동의");
		title.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setOpaque(true);
		title.setForeground(Color.white);
		title.setBackground(new Color(153, 184, 215));
		title.setLocation(0, 0);
		title.setSize(1280, 80);
		panel.add(title);
		
		// 이용약관 동의 체크, 설명
		JCheckBox agree1 = new JCheckBox(" 이용약관 동의");
		agree1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		agree1.setBackground(new Color(246, 246, 246));
		agree1.setFocusPainted(false);
		agree1.setLocation(165, 90);
		agree1.setSize(500, 50);
		panel.add(agree1);
		
		JTextArea clause1 = new JTextArea("날리는 꽃가루에 눈이 따끔해 눈물이 고여도 꾹 참을래 내 마음 한켠 비밀스런 오르골에 넣어두고서 영원히 되감을 순간이니까 우리 둘의 마지막 페이지를 잘 부탁해 어느 작별이 이보다 완벽할까 Love me only till this spring 오 라일락 꽃이 지는 날 good bye 이런 결말이 어울려 안녕 꽃잎 같은 안녕 하이얀 우리 봄날의 climax 아 얼마나 기쁜 일이야 Ooh ooh Love me only till this spring 봄바람처럼 Ooh ooh Love me only till this spring 봄바람처럼 기분이 달아 콧노래 부르네 (랄라) 입꼬리는 살짝 올린 채 어쩜 이렇게 하늘은 더 바람은 또 완벽한 건지 오늘따라 내 모습 맘에 들어 처음 만난 그날처럼 예쁘다고 말해줄래 어느 이별이 이토록 달콤할까 Love resembles misty dream 오 라일락 꽃이 지는 날 good bye 이런 결말이 어울려 안녕 꽃잎 같은 안녕 하이얀 우리 봄날의 climax 아 얼마나 기쁜 일이야 Ooh ooh Love resembles misty dream 뜬구름처럼 Ooh ooh Love resembles misty dream 뜬구름처럼 너도 언젠가 날 잊게 될까 지금 표정과 오늘의 향기도 단잠 사이에 스쳐간 봄날의 꿈처럼 오 라일락 꽃이 지는 날 good bye 너의 대답이 날 울려 안녕 약속 같은 안녕 하이얀 우리 봄날에 climax 아 얼마나 기쁜 일이야 Ooh ooh Love me only untill this spring 봄바람처럼 Ooh ooh Love me only untill this spring 봄바람처럼 Ooh ooh Love resembles misty dream 뜬구름처럼 Ooh ooh Love resembles misty dream 뜬구름처럼");
		clause1.setLineWrap(true);
		clause1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		JScrollPane sp1 = new JScrollPane(clause1);
		sp1.setLocation(165, 150);
		sp1.setSize(900, 120);
		panel.add(sp1);
		
		// 개인정보 동의 체크, 설명
		JCheckBox agree2 = new JCheckBox(" 개인정보 수집 및 이용 동의");
		agree2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		agree2.setBackground(new Color(246, 246, 246));
		agree2.setFocusPainted(false);
		agree2.setLocation(165, 280);
		agree2.setSize(500, 50);
		panel.add(agree2);
		
		JTextArea clause2 = new JTextArea("뭐해?라는 두 글자에 네가 보고 싶어 나의 속마음을 담아 이모티콘 하나하나 속에 달라지는 내 미묘한 심리를 알까 아니 바쁘지 않아 nothing no no 잠들어 있지 않아 insomnia nia nia 지금 다른 사람과 함께이지 않아 응, 나도 너를 생각 중 우리의 네모 칸은 bloom 엄지손가락으로 장미꽃을 피워 향기에 취할 것 같아 오직 둘만의 비밀의 정원 I feel bloom I feel bloom I feel bloom 너에게 한 송이를 더 보내 밤샘 작업으로 업데이트 흥미로운 이 작품의 지은이 that's me 어쩜 이 관계의 클라이맥스 2막으로 넘어가기엔 지금이 good timing 같은 맘인 걸 알아 realize la lize 말을 고르지 말아 just reply la la ly 조금 장난스러운 나의 은유에 네 해석이 궁금해 우리의 색은 gray and blue 엄지손가락으로 말풍선을 띄워 금세 터질 것 같아 우 호흡이 가빠져 어지러워 I feel blue. I feel blue. I feel blue. 너에게 가득히 채워 띄어쓰기없이보낼게사랑인것같애 백만송이장미꽃을, 나랑피워볼래? 꽃잎의 색은 우리 마음 가는 대로 칠해 시들 때도 예쁘게 우리의 네모 칸은 bloom 엄지손가락으로 장미꽃을 피워 향기에 취할 것 같아 오직 둘만의 비밀의 정원 I feel bloom I feel bloom I feel bloom 너에게 한 송이를 더 보내");
		clause2.setLineWrap(true);
		clause2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		JScrollPane sp2 = new JScrollPane(clause2);
		sp2.setLocation(165, 340);
		sp2.setSize(900, 120);
		panel.add(sp2);
		
		// 모두 동의 체크
		JCheckBox allAgree = new JCheckBox(" PC방 이용약관, 개인정보 수집 및 이용에 대해 모두 동의합니다 (선택 개인정보 수집 및 이용 동의 포함)");
		allAgree.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		allAgree.setBackground(new Color(246, 246, 246));
		allAgree.setFocusPainted(false);
		allAgree.setLocation(165, 470);
		allAgree.setSize(1000, 50);
		panel.add(allAgree);
		
		// 다음 단계 버튼
		JButton next = new JButton("다음 단계");
		next.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		next.setForeground(Color.white);
		next.setBackground(new Color(153, 184, 215));
		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setLocation(440, 540);
		next.setSize(380, 50);
		panel.add(next);
		
		// 다음 단계 버튼 이벤트 -> 체크박스 모두 체크하면 회원가입 창으로
		next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((agree1.isSelected() && agree2.isSelected()) && allAgree.isSelected()) {
					JOptionPane.showMessageDialog(null, "회원가입 화면으로 넘어갑니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
//					ChangePanel.changePanel(mfr, signUp, new SignUp2());
				} else {
					JOptionPane.showMessageDialog(null, "PC방 이용약관, 개인정보 수집 및 이용에 대해 모두 동의하셔야 회원가입 가능합니다.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		// 이전 화면 버튼
		JButton prev = new JButton("이전 화면으로");
		prev.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		prev.setBackground(new Color(221, 221, 221));
		prev.setBorderPainted(false);
		prev.setFocusPainted(false);
		prev.setLocation(440, 600);
		prev.setSize(380, 50);
		panel.add(prev);
		
		// 이전 화면 버튼 이벤트 -> 로그인 화면으로
		prev.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "로그인 화면으로 돌아갑니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
//				ChangePanel.changePanel(mfr, signUp, new LoginPage());
			}
		});
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
