package com.kh.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.kh.common.ChangePanel;

public class MainPage extends JPanel{
	// ChangePanel에 사용할 JFrame과 JPanel -> 이전/다음 창 이벤트 - 패널로 화면 전환
	private MainFrame mfr;
	private JPanel mainPage;
	
	// 코로나 예방수칙 배경 설정
	ImageIcon bg = new ImageIcon("icon/background.jpg");
	
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(bg.getImage(), 0, 0, d.width, d.height, null);
	}
	
	public MainPage(MainFrame mf) {
		this.mfr = mf;
		this.mainPage = this;
		
		this.setLayout(null);

		// 방역수칙 질문 1 -> 아이콘, 질문, Y/N버튼
		Image icon = new ImageIcon("icon/airplane.PNG").getImage();
		JLabel iconLabel = new JLabel(new ImageIcon(icon));
		iconLabel.setLocation(90, 430);
		iconLabel.setSize(55, 55);
		this.add(iconLabel);
		
		JLabel label = new JLabel("최근 2주 내 해외 방문하신 적이 있습니까?");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		label.setForeground(Color.WHITE);
		label.setLocation(160, 430);
		label.setSize(500, 55);
		this.add(label);
		
		JRadioButton yes1 = new JRadioButton("예");
		yes1.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		yes1.setForeground(Color.WHITE);
		yes1.setContentAreaFilled(false);
		yes1.setFocusPainted(false);
		yes1.setLocation(610, 430);
		yes1.setSize(50, 55);
		JRadioButton no1 = new JRadioButton("아니오");
		no1.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		no1.setForeground(Color.WHITE);
		no1.setContentAreaFilled(false);
		no1.setFocusPainted(false);
		no1.setLocation(670, 430);
		no1.setSize(100, 55);
		ButtonGroup yesNo1 = new ButtonGroup();
		yesNo1.add(yes1);
		yesNo1.add(no1);
		this.add(yes1);
		this.add(no1);
		
		// 질문 2
		Image icon2 = new ImageIcon("icon/temp.PNG").getImage();
		JLabel iconLabel2 = new JLabel(new ImageIcon(icon2));
		iconLabel2.setLocation(90, 510);
		iconLabel2.setSize(55, 55);
		this.add(iconLabel2);
		
		JLabel label2 = new JLabel("체온이 37.5도 이상입니까?");
		label2.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		label2.setForeground(Color.WHITE);
		label2.setLocation(160, 510);
		label2.setSize(500, 55);
		this.add(label2);
		
		JRadioButton yes2 = new JRadioButton("예");
		yes2.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		yes2.setForeground(Color.WHITE);
		yes2.setContentAreaFilled(false);
		yes2.setFocusPainted(false);
		yes2.setLocation(610, 510);
		yes2.setSize(50, 55);
		JRadioButton no2 = new JRadioButton("아니오");
		no2.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		no2.setForeground(Color.WHITE);
		no2.setContentAreaFilled(false);
		no2.setFocusPainted(false);
		no2.setLocation(670, 510);
		no2.setSize(100, 55);
		ButtonGroup yesNo2 = new ButtonGroup();
		yesNo2.add(yes2);
		yesNo2.add(no2);
		this.add(yes2);
		this.add(no2);
		
		// 질문 3
		Image icon3 = new ImageIcon("icon/note.PNG").getImage();
		JLabel iconLabel3 = new JLabel(new ImageIcon(icon3));
		iconLabel3.setLocation(90, 590);
		iconLabel3.setSize(55, 55);
		this.add(iconLabel3);
		
		JLabel label3 = new JLabel("개인정보 수집에 동의하십니까?");
		label3.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		label3.setForeground(Color.WHITE);
		label3.setLocation(160, 590);
		label3.setSize(500, 55);
		this.add(label3);
		
		JRadioButton yes3 = new JRadioButton("예");
		yes3.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		yes3.setForeground(Color.WHITE);
		yes3.setContentAreaFilled(false);
		yes3.setFocusPainted(false);
		yes3.setLocation(610, 590);
		yes3.setSize(50, 55);
		JRadioButton no3 = new JRadioButton("아니오");
		no3.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		no3.setForeground(Color.WHITE);
		no3.setContentAreaFilled(false);
		no3.setFocusPainted(false);
		no3.setLocation(670, 590);
		no3.setSize(100, 55);
		ButtonGroup yesNo3 = new ButtonGroup();
		yesNo3.add(yes3);
		yesNo3.add(no3);
		this.add(yes3);
		this.add(no3);
		
		// 확인 버튼
		JButton btn = new JButton("확인");
		btn.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		btn.setForeground(new Color(70, 24, 90));
		btn.setBackground(Color.white);
		btn.setFocusPainted(false);
		btn.setLocation(860, 570);
		btn.setSize(150, 70);
		this.add(btn);
		
		// 확인 버튼 이벤트 -> 질문 N/N/Y일 때 선불결제 화면으로 전환, 입장조건 안 될 경우 화면 안 넘어감
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(no1.isSelected() && no2.isSelected() && yes3.isSelected()) {
					JOptionPane.showMessageDialog(null, "선불 결제 화면으로 넘어갑니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
//					ChangePanel.changePanel(mfr, mainPage, new PayUpFront());
				} else {
					JOptionPane.showMessageDialog(null, "방역수칙에 위반되거나 개인정보 수집에 동의하지 않아 이용하실 수 없습니다.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				}
					
			}
		});
		
		mf.add(this);
	}
	
}
