package com.kh.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.kh.common.ChangePanel;
import com.kh.model.dao.MemberDao;
import com.kh.model.vo.PcMember;

public class SignUp2 extends JPanel{
	private MainFrame mfr;
	private JPanel signUp2;
	private MemberDao md = new MemberDao();
	private ArrayList<PcMember> list = new ArrayList<>();
	
	public SignUp2(MainFrame mf) {
		this.mfr = mf;
		this.signUp2 = this;
		
		this.setLayout(null);
		this.setBackground(new Color(246, 246, 246));
		
		list = md.fileOpen();
//		System.out.println("????Ʈ Ȯ??");
//		System.out.println(list);
		
		// Ÿ??Ʋ
		JLabel title = new JLabel("ȸ?? ????");
		title.setFont(new Font("???? ????", Font.BOLD, 30));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setOpaque(true);
		title.setForeground(Color.white);
		title.setBackground(new Color(52, 152, 219));
		title.setLocation(0, 0);
		title.setSize(1280, 80);
		this.add(title);
		
		// ???̵? ?Է?
		JLabel id = new JLabel("- ???̵?");
		id.setFont(new Font("???? ????", Font.PLAIN, 15));
		id.setLocation(440, 100);
		id.setSize(500, 50);
		this.add(id);
		
		JTextField inputId = new JTextField();
		inputId.setLocation(570, 115);
		inputId.setSize(140, 25);
		this.add(inputId);
		
		// ** ???̵? ?ߺ? Ȯ??
		JButton checkId = new JButton("?ߺ? Ȯ??");
		checkId.setFont(new Font("???? ????", Font.BOLD, 15));
		checkId.setForeground(Color.white);
		checkId.setBackground(Color.gray);
		checkId.setBorderPainted(false);
		checkId.setFocusPainted(false);
		checkId.setLocation(720, 115);
		checkId.setSize(100, 24);
		this.add(checkId);
		
		JLabel duplId = new JLabel("");
		duplId.setFont(new Font("???? ????", Font.BOLD, 15));
		duplId.setLocation(570, 125);
		duplId.setSize(500, 50);
		this.add(duplId);
		
		// ?ߺ? Ȯ?? ??ư Ŭ???̺?Ʈ -> ?????? ?????Ͷ? ???? ?? ??ġ ???? ???? ????
		checkId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int value = 0;
				for(int i = 0; i < list.size(); i++) {
					if(inputId.getText().equals(list.get(i).getUserId()))
						value++;
				}
				if(value > 0) {
					duplId.setText("?̹? ???ϵ? ???̵??Դϴ?.");
					duplId.setForeground(Color.red);
				} else if(inputId.getText().equals("")) {
					duplId.setText("???̵??? ?Է????ּ???.");
					duplId.setForeground(Color.red);
				} else {
					duplId.setText("???? ?????? ???̵??Դϴ?.");
					duplId.setForeground(Color.blue);
				}
			}
		});
		
		// ?̸? ?Է?
		JLabel name = new JLabel("- ?̸?");
		name.setFont(new Font("???? ????", Font.PLAIN, 15));
		name.setLocation(440, 160);
		name.setSize(500, 50);
		this.add(name);
		
		JTextField inputName = new JTextField();
		inputName.setLocation(570, 175);
		inputName.setSize(252, 25);
		this.add(inputName);
		
		// ???й?ȣ ?Է?
		JLabel pw = new JLabel("- ???й?ȣ");
		pw.setFont(new Font("???? ????", Font.PLAIN, 15));
		pw.setLocation(440, 200);
		pw.setSize(500, 50);
		this.add(pw);
		
		JTextField inputPw = new JTextField();
		inputPw.setLocation(570, 215);
		inputPw.setSize(252, 25);
		this.add(inputPw);
		
		// ???й?ȣ Ȯ??
		JLabel compare = new JLabel("- ???й?ȣ Ȯ??");
		compare.setFont(new Font("???? ????", Font.PLAIN, 15));
		compare.setLocation(440, 240);
		compare.setSize(500, 50);
		this.add(compare);
		
		JTextField inputPw2 = new JTextField();
		inputPw2.setLocation(570, 255);
		inputPw2.setSize(140, 25);
		this.add(inputPw2);
		
		// ** ???й?ȣ ??ġ Ȯ??
		JButton checkPw = new JButton("Ȯ??");
		checkPw.setFont(new Font("???? ????", Font.BOLD, 15));
		checkPw.setForeground(Color.white);
		checkPw.setBackground(Color.gray);
		checkPw.setBorderPainted(false);
		checkPw.setFocusPainted(false);
		checkPw.setLocation(720, 255);
		checkPw.setSize(100, 24);
		this.add(checkPw);
		
		JLabel samePw = new JLabel("");
		samePw.setFont(new Font("???? ????", Font.BOLD, 15));
		samePw.setLocation(570, 265);
		samePw.setSize(500, 50);
		this.add(samePw);
		
		// Ȯ?? ??ư Ŭ???̺?Ʈ -> inputPw?? inputPw2 ?????ؼ? ??ġ ???? Ȯ??
		checkPw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(inputPw.getText().equals(inputPw2.getText())) {
					samePw.setText("???й?ȣ?? ??ġ?մϴ?.");
					samePw.setForeground(Color.blue);
				} else if(inputPw2.getText().equals("")) {
					samePw.setText("???й?ȣ?? ?Է????ּ???.");
					samePw.setForeground(Color.red);
				} else {
					samePw.setText("???й?ȣ?? ??ġ???? ?ʽ??ϴ?.");
					samePw.setForeground(Color.red);
				}
			}
		});
		
		// ???????? ?Է?
		JLabel birth = new JLabel("- ????????");
		birth.setFont(new Font("???? ????", Font.PLAIN, 15));
		birth.setLocation(440, 300);
		birth.setSize(500, 50);
		this.add(birth);
		
		JTextField inputBirth = new JTextField();
		inputBirth.setLocation(570, 315);
		inputBirth.setSize(252, 25);
		this.add(inputBirth);
		
		JLabel form = new JLabel("ex. 19990101");
		form.setFont(new Font("???? ????", Font.PLAIN, 15));
		form.setForeground(Color.gray);
		form.setLocation(570, 325);
		form.setSize(500, 50);
		this.add(form);
		
		// ???? ????
		JLabel gender = new JLabel("- ????");
		gender.setFont(new Font("???? ????", Font.PLAIN, 15));
		gender.setLocation(440, 360);
		gender.setSize(500, 50);
		this.add(gender);
		
		JRadioButton male = new JRadioButton("????");
		male.setFont(new Font("???? ????", Font.PLAIN, 15));
		male.setContentAreaFilled(false);
		male.setFocusPainted(false);
		male.setLocation(570, 373);
		male.setSize(65, 25);
		JRadioButton female = new JRadioButton("????");
		female.setFont(new Font("???? ????", Font.PLAIN, 15));
		female.setContentAreaFilled(false);
		female.setFocusPainted(false);
		female.setLocation(640, 373);
		female.setSize(65, 25);
		ButtonGroup genGroup = new ButtonGroup();
		genGroup.add(male);
		genGroup.add(female);
		this.add(male);
		this.add(female);
		
		// ?ڵ??? ??ȣ ?Է?
		JLabel phone = new JLabel("- ?ڵ??? ??ȣ");
		phone.setFont(new Font("???? ????", Font.PLAIN, 15));
		phone.setLocation(440, 400);
		phone.setSize(500, 50);
		this.add(phone);
		
		JTextField inputNum = new JTextField();
		inputNum.setLocation(570, 415);
		inputNum.setSize(140, 25);
		this.add(inputNum);
		
		// ** ?ڵ??? ??ȣ ?ߺ? Ȯ??
		JButton checkNum = new JButton("Ȯ??");
		checkNum.setFont(new Font("???? ????", Font.BOLD, 15));
		checkNum.setForeground(Color.white);
		checkNum.setBackground(Color.gray);
		checkNum.setBorderPainted(false);
		checkNum.setFocusPainted(false);
		checkNum.setLocation(720, 415);
		checkNum.setSize(100, 24);
		this.add(checkNum);
		
		JLabel duplNum = new JLabel("");
		duplNum.setFont(new Font("???? ????", Font.BOLD, 15));
		duplNum.setLocation(570, 425);
		duplNum.setSize(500, 50);
		this.add(duplNum);
		
		// Ȯ?? ??ư Ŭ???̺?Ʈ -> ?????? ?????Ͷ? ???? ?? ??ġ ???? ???? ????
		checkNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int value = 0;
				for(int i = 0; i < list.size(); i++) {
					if(inputNum.getText().equals(list.get(i).getUserPhone()))
						value++;
				}
				if(value > 0) {
					duplNum.setText("?̹? ???ϵ? ??ȣ?Դϴ?.");
					duplNum.setForeground(Color.red);
				} else if(inputNum.getText().equals("")) {
					duplNum.setText("??ȣ?? ?Է????ּ???.");
					duplNum.setForeground(Color.red);
				} else {
					duplNum.setText("???? ?????? ??ȣ?Դϴ?.");
					duplNum.setForeground(Color.blue);
				}
			}
		});
		
		// ?̸??? ?Է?
		JLabel email = new JLabel("- ?̸???");
		email.setFont(new Font("???? ????", Font.PLAIN, 15));
		email.setLocation(440, 460);
		email.setSize(500, 50);
		this.add(email);
		
		JTextField inputEmail = new JTextField();
		inputEmail.setLocation(570, 475);
		inputEmail.setSize(252, 25);
		this.add(inputEmail);
		
		// ?Ϸ? ??ư
		JButton finish = new JButton("ȸ?????? ?Ϸ?");
		finish.setFont(new Font("???? ????", Font.BOLD, 18));
		finish.setForeground(Color.white);
		finish.setBackground(new Color(52, 152, 219));
		finish.setBorderPainted(false);
		finish.setFocusPainted(false);
		finish.setLocation(440, 540);
		finish.setSize(380, 50);
		this.add(finish);
		
		// ?Ϸ? ??ư Ŭ???̺?Ʈ
		// 1. ?Է? â?? ???? ?Է? + ???̵?, ???й?ȣ, ????ȣ ???? ??ġ?ϸ? ?????? ?Է? ?? ?α??? ȭ?????? ???ư?
		// 2. ???̵?, ????ȣ ?ߺ??̰ų? ???й?ȣ ????ġ?ϸ? ?? Ȯ?? ?˾?
		// 3. ???̵?, ???й?ȣ, ????ȣ ?? ?? ?ϳ????? Ȯ?ι?ư ?????? ?ʾ??? ???? ?? Ȯ?? ?˾?
		// 4. ?Է? â?? ???? ?Էµ??? ?ʾ??? ???? ?? Ȯ?? ?˾?
		finish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!inputId.getText().equals("") && !inputName.getText().equals("") && !inputPw.getText().equals("") && !inputPw2.getText().equals("")
						&& !inputBirth.getText().equals("") && (male.isSelected() || female.isSelected()) && !inputNum.getText().equals("") && !inputEmail.getText().equals("")
						&& duplId.getText().equals("???? ?????? ???̵??Դϴ?.") && samePw.getText().equals("???й?ȣ?? ??ġ?մϴ?.") && duplNum.getText().equals("???? ?????? ??ȣ?Դϴ?.")) {
					// ?Է? ???? PcMember?? ?Է?, dat???Ͽ? ????
					int setBirth = Integer.parseInt(inputBirth.getText());
					char setGender = 'M';
					if(female.isSelected()) setGender = 'F';
					list.add(new PcMember(inputId.getText(), inputName.getText(), inputPw.getText(), setBirth, setGender, inputNum.getText(), inputEmail.getText()));
					md.fileSave(list);
					// ?α??? ȭ?????? ???ư???
					JOptionPane.showMessageDialog(null, "ȸ???????? ?Ϸ??Ǿ????ϴ?.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
					ChangePanel.changePanel(mfr, signUp2, new Login(mf));
				} else if(duplId.getText().equals("?̹? ???ϵ? ???̵??Դϴ?.")) {
					JOptionPane.showMessageDialog(null, "???̵??? Ȯ???? ?ּ???.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else if(samePw.getText().equals("???й?ȣ?? ??ġ???? ?ʽ??ϴ?.")) {
					JOptionPane.showMessageDialog(null, "???й?ȣ?? Ȯ???? ?ּ???.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else if(duplNum.getText().equals("?̹? ???ϵ? ??ȣ?Դϴ?.")) {
					JOptionPane.showMessageDialog(null, "?ڵ??? ??ȣ?? Ȯ???? ?ּ???.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else if(duplId.getText().equals("") || samePw.getText().equals("") || duplNum.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "???̵?, ???й?ȣ, ?ڵ??? ??ȣ?? Ȯ???? ?ּ???.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "???? ?ԷµǾ????? Ȯ???? ?ּ???.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		// ???? ??ư
		JButton back = new JButton("????");
		back.setFont(new Font("???? ????", Font.BOLD, 17));
		back.setBackground(new Color(221, 221, 221));
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setLocation(440, 600);
		back.setSize(380, 50);
		this.add(back);
		
		// ???? ??ư Ŭ???̺?Ʈ -> ȸ?????? ???? ȭ?????? ???ư?
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(mfr, signUp2, new SignUp(mf));
			}
		});
		
		
	}
	
}
