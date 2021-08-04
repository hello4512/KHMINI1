package com.kh.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUp2 extends JFrame{
	
	public SignUp2() {
		super("PC방 프로그램");
		this.setSize(1280, 720);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(246, 246, 246));
		
		// 타이틀
		JLabel title = new JLabel("회원 가입");
		title.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setOpaque(true);
		title.setForeground(Color.white);
		title.setBackground(new Color(153, 184, 215));
		title.setLocation(0, 0);
		title.setSize(1280, 80);
		panel.add(title);
		
		// 아이디 입력
		JLabel id = new JLabel("- 아이디");
		id.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		id.setLocation(440, 100);
		id.setSize(500, 50);
		panel.add(id);
		
		JTextField inputId = new JTextField();
		inputId.setLocation(570, 115);
		inputId.setSize(140, 25);
		panel.add(inputId);
		
		// ** 아이디 중복 확인
		JButton checkId = new JButton("중복 확인");
		checkId.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		checkId.setForeground(Color.white);
		checkId.setBackground(Color.gray);
		checkId.setBorderPainted(false);
		checkId.setFocusPainted(false);
		checkId.setLocation(720, 115);
		checkId.setSize(100, 24);
		panel.add(checkId);
		
		JLabel duplId = new JLabel("");
		duplId.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		duplId.setLocation(570, 125);
		duplId.setSize(500, 50);
		panel.add(duplId);
		
		// 중복 확인 버튼 클릭이벤트 -> 저장된 데이터랑 비교 후 일치 여부 라벨 출력
		checkId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*if(ArrayList.searchId(inputId.getText) > 0) { // 회원정보 컬렉션 controller 아이디 검색 기능 생성 -> 매개변수로 문자열 입력값 전송 -> 일치하는 값 있으면 result 1 증가
					duplId.setText("이미 등록된 아이디입니다.");
					duplId.setForeground(Color.red);
				} else*/ if(inputId.getText().equals("")) {
					duplId.setText("아이디를 입력해주세요.");
					duplId.setForeground(Color.red);
				} else {
					duplId.setText("사용 가능한 아이디입니다.");
					duplId.setForeground(Color.blue);
				}
			}
		});
		
		// 이름 입력
		JLabel name = new JLabel("- 이름");
		name.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		name.setLocation(440, 160);
		name.setSize(500, 50);
		panel.add(name);
		
		JTextField inputName = new JTextField();
		inputName.setLocation(570, 175);
		inputName.setSize(252, 25);
		panel.add(inputName);
		
		// 비밀번호 입력
		JLabel pw = new JLabel("- 비밀번호");
		pw.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		pw.setLocation(440, 200);
		pw.setSize(500, 50);
		panel.add(pw);
		
		JTextField inputPw = new JTextField();
		inputPw.setLocation(570, 215);
		inputPw.setSize(252, 25);
		panel.add(inputPw);
		
		// 비밀번호 확인
		JLabel compare = new JLabel("- 비밀번호 확인");
		compare.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		compare.setLocation(440, 240);
		compare.setSize(500, 50);
		panel.add(compare);
		
		JTextField inputPw2 = new JTextField();
		inputPw2.setLocation(570, 255);
		inputPw2.setSize(140, 25);
		panel.add(inputPw2);
		
		// ** 비밀번호 일치 확인
		JButton checkPw = new JButton("확인");
		checkPw.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		checkPw.setForeground(Color.white);
		checkPw.setBackground(Color.gray);
		checkPw.setBorderPainted(false);
		checkPw.setFocusPainted(false);
		checkPw.setLocation(720, 255);
		checkPw.setSize(100, 24);
		panel.add(checkPw);
		
		JLabel samePw = new JLabel("");
		samePw.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		samePw.setLocation(570, 265);
		samePw.setSize(500, 50);
		panel.add(samePw);
		
		// 확인 버튼 클릭이벤트 -> inputPw와 inputPw2 비교해서 일치 여부 확인
		checkPw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(inputPw.getText().equals(inputPw2.getText())) {
					samePw.setText("비밀번호가 일치합니다.");
					samePw.setForeground(Color.blue);
				} else if(inputPw2.getText().equals("")) {
					samePw.setText("비밀번호를 입력해주세요.");
					samePw.setForeground(Color.red);
				} else {
					samePw.setText("비밀번호가 일치하지 않습니다.");
					samePw.setForeground(Color.red);
				}
			}
		});
		
		// 생년월일 입력
		JLabel birth = new JLabel("- 생년월일");
		birth.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		birth.setLocation(440, 300);
		birth.setSize(500, 50);
		panel.add(birth);
		
		JTextField inputBirth = new JTextField();
		inputBirth.setLocation(570, 315);
		inputBirth.setSize(252, 25);
		panel.add(inputBirth);
		
		JLabel form = new JLabel("ex. 19990101");
		form.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		form.setForeground(Color.gray);
		form.setLocation(570, 325);
		form.setSize(500, 50);
		panel.add(form);
		
		// 성별 선택
		JLabel gender = new JLabel("- 성별");
		gender.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		gender.setLocation(440, 360);
		gender.setSize(500, 50);
		panel.add(gender);
		
		JRadioButton male = new JRadioButton("남자");
		male.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		male.setContentAreaFilled(false);
		male.setFocusPainted(false);
		male.setLocation(570, 373);
		male.setSize(65, 25);
		JRadioButton female = new JRadioButton("여자");
		female.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		female.setContentAreaFilled(false);
		female.setFocusPainted(false);
		female.setLocation(640, 373);
		female.setSize(65, 25);
		ButtonGroup mf = new ButtonGroup();
		mf.add(male);
		mf.add(female);
		panel.add(male);
		panel.add(female);
		
		// 핸드폰 번호 입력
		JLabel phone = new JLabel("- 핸드폰 번호");
		phone.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		phone.setLocation(440, 400);
		phone.setSize(500, 50);
		panel.add(phone);
		
		JTextField inputNum = new JTextField();
		inputNum.setLocation(570, 415);
		inputNum.setSize(140, 25);
		panel.add(inputNum);
		
		// ** 핸드폰 번호 중복 확인
		JButton checkNum = new JButton("확인");
		checkNum.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		checkNum.setForeground(Color.white);
		checkNum.setBackground(Color.gray);
		checkNum.setBorderPainted(false);
		checkNum.setFocusPainted(false);
		checkNum.setLocation(720, 415);
		checkNum.setSize(100, 24);
		panel.add(checkNum);
		
		JLabel duplNum = new JLabel("");
		duplNum.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		duplNum.setLocation(570, 425);
		duplNum.setSize(500, 50);
		panel.add(duplNum);
		
		// 확인 버튼 클릭이벤트 -> 저장된 데이터랑 비교 후 일치 여부 라벨 출력
		checkNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*if(ArrayList.searchNum(inputNum.getText) > 0) { // controller 번호 검색 기능 생성 -> 매개변수로 문자열 입력값 전송 -> 일치하는 값 있으면 result 1 증가
					duplNum.setText("이미 등록된 번호입니다.");
					duplNum.setForeground(Color.red);
				} else*/ if(inputNum.getText().equals("")) {
					duplNum.setText("번호를 입력해주세요.");
					duplNum.setForeground(Color.red);
				} else {
					duplNum.setText("사용 가능한 번호입니다.");
					duplNum.setForeground(Color.blue);
				}
			}
		});
		
		// 이메일 입력
		JLabel email = new JLabel("- 이메일");
		email.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		email.setLocation(440, 460);
		email.setSize(500, 50);
		panel.add(email);
		
		JTextField inputEmail = new JTextField();
		inputEmail.setLocation(570, 475);
		inputEmail.setSize(252, 25);
		panel.add(inputEmail);
		
		// 완료 버튼
		JButton finish = new JButton("회원가입 완료");
		finish.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		finish.setForeground(Color.white);
		finish.setBackground(new Color(153, 184, 215));
		finish.setBorderPainted(false);
		finish.setFocusPainted(false);
		finish.setLocation(440, 540);
		finish.setSize(380, 50);
		panel.add(finish);
		
		// 완료 버튼 클릭이벤트
		// 1. 입력 창에 모두 입력 + 아이디, 비밀번호, 폰번호 조건 일치하면 데이터 입력 후 로그인 화면으로 돌아감
		// 2. 아이디, 폰번호 중복이거나 비밀번호 불일치하면 재 확인 팝업
		// 3. 아이디, 비밀번호, 폰번호 셋 중 하나라도 확인버튼 누르지 않았을 경우 재 확인 팝업
		// 4. 입력 창에 모두 입력되지 않았을 경우 재 확인 팝업
		finish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!inputId.getText().equals("") && !inputName.getText().equals("") && !inputPw.getText().equals("") && !inputPw2.getText().equals("")
						&& !inputBirth.getText().equals("") && (male.isSelected() || female.isSelected()) && !inputNum.getText().equals("") && !inputEmail.getText().equals("")
						&& duplId.getText().equals("사용 가능한 아이디입니다.") && samePw.getText().equals("비밀번호가 일치합니다.") && duplNum.getText().equals("사용 가능한 번호입니다.")) {
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
//					ChangePanel.changePanel(mfr, signUp2, new LoginPage());
				} else if(duplId.getText().equals("이미 등록된 아이디입니다.")) {
					JOptionPane.showMessageDialog(null, "다른 아이디를 입력해 주세요.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else if(samePw.getText().equals("비밀번호가 일치하지 않습니다.")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 확인해 주세요.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else if(duplNum.getText().equals("이미 등록된 번호입니다.")) {
					JOptionPane.showMessageDialog(null, "핸드폰 번호를 확인해 주세요.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else if(duplId.getText().equals("") || samePw.getText().equals("") || duplNum.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디, 비밀번호, 핸드폰 번호를 확인해 주세요.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "모두 입력되었는지 확인해 주세요.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		// 취소 버튼
		JButton back = new JButton("취소");
		back.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		back.setBackground(new Color(221, 221, 221));
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setLocation(440, 600);
		back.setSize(380, 50);
		panel.add(back);
		
		// 취소 버튼 클릭이벤트 -> 회원가입 동의 화면으로 돌아감
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "동의 화면으로 돌아갑니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
//				ChangePanel.changePanel(mfr, signUp2, new SignUp());
			}
		});
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
