package com.kh.test.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.kh.test.common.ChangePanel;






public class Seat extends JPanel{
	private MainFrame mfr;
	private JPanel seat;
		
	public Seat(MainFrame mf)  {
		this.mfr = mf;
		this.seat = this;
		this.setBackground(Color.black);
		
		JPanel panel = new JPanel(new GridLayout(14, 7, 3, 3));
		panel.setPreferredSize(new Dimension(1100, 650));
		
		panel.setBackground(Color.BLACK);
		
		
		JButton b1 = new JButton("1");
		b1.setPreferredSize(new Dimension(300, 100));
		b1.setHorizontalAlignment(b1.RIGHT);
		b1.setFocusPainted(false);
		b1.setFont(b1.getFont().deriveFont(20.0f));
		panel.add(b1);
		
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "1번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});
		

		JButton b2 = new JButton("2");
		b2.setFocusPainted(false);
		b2.setHorizontalAlignment(SwingConstants.RIGHT);
		b2.setFont(b2.getFont().deriveFont(20.0f));
		panel.add(b2);
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "2번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b3 = new JButton("3");
		b3.setFocusPainted(false);
		b3.setHorizontalAlignment(SwingConstants.RIGHT);
		b3.setFont(b3.getFont().deriveFont(20.0f));
		panel.add(b3);
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "3번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});
		
		JButton b4 = new JButton("4");
		b4.setHorizontalAlignment(SwingConstants.RIGHT);
		b4.setFocusPainted(false);
		b4.setFont(b4.getFont().deriveFont(20.0f));
		panel.add(b4);
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "4번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});

		JButton b5 = new JButton("5");
		b5.setHorizontalAlignment(SwingConstants.RIGHT);
		b5.setFocusPainted(false);
		b5.setFont(b5.getFont().deriveFont(20.0f));
		panel.add(b5);
		
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "5번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});

		JButton b6 = new JButton("6");
		b6.setHorizontalAlignment(SwingConstants.RIGHT);
		b6.setFocusPainted(false);
		b6.setFont(b6.getFont().deriveFont(20.0f));
		panel.add(b6);
		
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "6번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});

		JButton b7 = new JButton("7");
		b7.setHorizontalAlignment(SwingConstants.RIGHT);
		b7.setFocusPainted(false);
		b7.setFont(b7.getFont().deriveFont(20.0f));
		panel.add(b7);
		
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "7번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b8 = new JButton("8");
		b8.setHorizontalAlignment(SwingConstants.RIGHT);
		b8.setFocusPainted(false);
		b8.setFont(b8.getFont().deriveFont(20.0f));
		panel.add(b8);
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "8번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b9 = new JButton("9");
		b9.setHorizontalAlignment(SwingConstants.RIGHT);
		b9.setFocusPainted(false);
		b9.setFont(b9.getFont().deriveFont(20.0f));
		panel.add(b9);

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "9번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b10 = new JButton("10");
		b10.setHorizontalAlignment(SwingConstants.RIGHT);
		b10.setFocusPainted(false);
		b10.setFont(b10.getFont().deriveFont(20.0f));
		panel.add(b10);
		
		b10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "10번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b11 = new JButton("11");
		b11.setHorizontalAlignment(SwingConstants.RIGHT);
		b11.setFocusPainted(false);
		b11.setFont(b11.getFont().deriveFont(20.0f));
		panel.add(b11);
		
		b11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "11번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b12 = new JButton("12");
		b12.setHorizontalAlignment(SwingConstants.RIGHT);
		b12.setFocusPainted(false);
		b12.setFont(b12.getFont().deriveFont(20.0f));
		panel.add(b12);
		
		b12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "12번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b13 = new JButton("13");
		b13.setHorizontalAlignment(SwingConstants.RIGHT);
		b13.setFocusPainted(false);
		b13.setFont(b13.getFont().deriveFont(20.0f));
		panel.add(b13);

		b13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "13번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b14 = new JButton("14");
		b14.setHorizontalAlignment(SwingConstants.RIGHT);
		b14.setFocusPainted(false);
		b14.setFont(b14.getFont().deriveFont(20.0f));
		panel.add(b14);

		b14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "14번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b15 = new JButton("15");
		b15.setHorizontalAlignment(SwingConstants.RIGHT);
		b15.setFocusPainted(false);
		b15.setFont(b15.getFont().deriveFont(20.0f));
		panel.add(b15);
		
		b15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "15번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b16 = new JButton("16");
		b16.setHorizontalAlignment(SwingConstants.RIGHT);
		b16.setFocusPainted(false);
		b16.setFont(b16.getFont().deriveFont(20.0f));
		panel.add(b16);

		b16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "16번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b17 = new JButton("17");
		b17.setHorizontalAlignment(SwingConstants.RIGHT);
		b17.setFocusPainted(false);
		b17.setFont(b17.getFont().deriveFont(20.0f));
		panel.add(b17);
		
		b17.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "17번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b18 = new JButton("18");
		b18.setHorizontalAlignment(SwingConstants.RIGHT);
		b18.setFocusPainted(false);
		b18.setFont(b18.getFont().deriveFont(20.0f));
		panel.add(b18);
		
		b18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "18번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b19 = new JButton("19");
		b19.setHorizontalAlignment(SwingConstants.RIGHT);
		b19.setFocusPainted(false);
		b19.setFont(b19.getFont().deriveFont(20.0f));
		panel.add(b19);
		
		b19.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "19번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b20 = new JButton("20");
		b20.setHorizontalAlignment(SwingConstants.RIGHT);
		b20.setFocusPainted(false);
		b20.setFont(b20.getFont().deriveFont(20.0f));
		panel.add(b20);
		
		b20.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "20번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b21 = new JButton("21");
		b21.setHorizontalAlignment(SwingConstants.RIGHT);
		b21.setFocusPainted(false);
		b21.setFont(b21.getFont().deriveFont(20.0f));
		panel.add(b21);
		
		b21.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "21번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b22 = new JButton("22");
		b22.setHorizontalAlignment(SwingConstants.RIGHT);
		b22.setFocusPainted(false);
		b22.setFont(b22.getFont().deriveFont(20.0f));
		panel.add(b22);
		
		b22.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "22번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b23 = new JButton("23");
		b23.setHorizontalAlignment(SwingConstants.RIGHT);
		b23.setFocusPainted(false);
		b23.setFont(b23.getFont().deriveFont(20.0f));
		panel.add(b23);
		
		b23.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "23번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b24 = new JButton("24");
		b24.setHorizontalAlignment(SwingConstants.RIGHT);
		b24.setFocusPainted(false);
		b24.setFont(b24.getFont().deriveFont(20.0f));
		panel.add(b24);
		
		b24.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "24번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b25 = new JButton("25");
		b25.setHorizontalAlignment(SwingConstants.RIGHT);
		b25.setFocusPainted(false);
		b25.setFont(b25.getFont().deriveFont(20.0f));
		panel.add(b25);
		
		b25.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "25번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b26 = new JButton("26");
		b26.setHorizontalAlignment(SwingConstants.RIGHT);
		b26.setFocusPainted(false);
		b26.setFont(b26.getFont().deriveFont(20.0f));
		panel.add(b26);
		
		b26.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "26번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b27 = new JButton("27");
		b27.setHorizontalAlignment(SwingConstants.RIGHT);
		b27.setFocusPainted(false);
		b27.setFont(b27.getFont().deriveFont(20.0f));
		panel.add(b27);
		
		b27.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "27번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b28 = new JButton("28");
		b28.setHorizontalAlignment(SwingConstants.RIGHT);
		b28.setFocusPainted(false);
		b28.setFont(b28.getFont().deriveFont(20.0f));
		panel.add(b28);
		
		b28.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "28번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b29 = new JButton("29");
		b29.setHorizontalAlignment(SwingConstants.RIGHT);
		b29.setFocusPainted(false);
		b29.setFont(b29.getFont().deriveFont(20.0f));
		panel.add(b29);
		
		b29.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "29번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b30 = new JButton("30");
		b30.setHorizontalAlignment(SwingConstants.RIGHT);
		b30.setFocusPainted(false);
		b30.setFont(b30.getFont().deriveFont(20.0f));
		panel.add(b30);
		
		b30.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "30번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b31 = new JButton("31");
		b31.setHorizontalAlignment(SwingConstants.RIGHT);
		b31.setFocusPainted(false);
		b31.setFont(b31.getFont().deriveFont(20.0f));
		panel.add(b31);
		
		b31.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "31번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b32 = new JButton("32");
		b32.setHorizontalAlignment(SwingConstants.RIGHT);
		b32.setFocusPainted(false);
		b32.setFont(b32.getFont().deriveFont(20.0f));
		panel.add(b32);
		
		b32.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "32번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b33 = new JButton("33");
		b33.setHorizontalAlignment(SwingConstants.RIGHT);
		b33.setFocusPainted(false);
		b33.setFont(b33.getFont().deriveFont(20.0f));
		panel.add(b33);
		
		b33.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "33번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b34 = new JButton("34");
		b34.setHorizontalAlignment(SwingConstants.RIGHT);
		b34.setFocusPainted(false);
		b34.setFont(b34.getFont().deriveFont(20.0f));
		panel.add(b34);
		
		b34.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "34번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b35 = new JButton("35");
		b35.setHorizontalAlignment(SwingConstants.RIGHT);
		b35.setFocusPainted(false);
		b35.setFont(b35.getFont().deriveFont(20.0f));
		panel.add(b35);
		
		b35.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "35번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b36 = new JButton("36");
		b36.setHorizontalAlignment(SwingConstants.RIGHT);
		b36.setFocusPainted(false);
		b36.setFont(b36.getFont().deriveFont(20.0f));
		panel.add(b36);
		
		b36.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "36번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b37 = new JButton("37");
		b37.setHorizontalAlignment(SwingConstants.RIGHT);
		b37.setFocusPainted(false);
		b37.setFont(b37.getFont().deriveFont(20.0f));
		panel.add(b37);
		
		b37.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "37번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b38 = new JButton("38");
		b38.setHorizontalAlignment(SwingConstants.RIGHT);
		b38.setFocusPainted(false);
		b38.setFont(b38.getFont().deriveFont(20.0f));
		panel.add(b38);
		
		b38.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "38번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b39 = new JButton("39");
		b39.setHorizontalAlignment(SwingConstants.RIGHT);
		b39.setFocusPainted(false);
		b39.setFont(b39.getFont().deriveFont(20.0f));
		panel.add(b39);
		
		b39.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "39번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b40 = new JButton("40");
		b40.setHorizontalAlignment(SwingConstants.RIGHT);
		b40.setFocusPainted(false);
		b40.setFont(b40.getFont().deriveFont(20.0f));
		panel.add(b40);
		
		b40.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "40번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b41 = new JButton("41");
		b41.setHorizontalAlignment(SwingConstants.RIGHT);
		b41.setFocusPainted(false);
		b41.setFont(b41.getFont().deriveFont(20.0f));
		panel.add(b41);
		
		b41.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "41번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b42 = new JButton("42");
		b42.setHorizontalAlignment(SwingConstants.RIGHT);
		b42.setFocusPainted(false);
		b42.setFont(b42.getFont().deriveFont(20.0f));
		panel.add(b42);
		
		b42.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "42번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b43 = new JButton("43");
		b43.setHorizontalAlignment(SwingConstants.RIGHT);
		b43.setFocusPainted(false);
		b43.setFont(b43.getFont().deriveFont(20.0f));
		panel.add(b43);
		
		b43.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "43번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b44 = new JButton("44");
		b44.setHorizontalAlignment(SwingConstants.RIGHT);
		b44.setFocusPainted(false);
		b44.setFont(b44.getFont().deriveFont(20.0f));
		panel.add(b44);
		
		b44.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "44번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b45 = new JButton("45");
		b45.setHorizontalAlignment(SwingConstants.RIGHT);
		b45.setFocusPainted(false);
		b45.setFont(b45.getFont().deriveFont(20.0f));
		panel.add(b45);
		
		b45.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "45번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b46 = new JButton("46");
		b46.setHorizontalAlignment(SwingConstants.RIGHT);
		b46.setFocusPainted(false);
		b46.setFont(b46.getFont().deriveFont(20.0f));
		panel.add(b46);
		
		b46.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "46번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b47 = new JButton("47");
		b47.setHorizontalAlignment(SwingConstants.RIGHT);
		b47.setFocusPainted(false);
		b47.setFont(b47.getFont().deriveFont(20.0f));
		panel.add(b47);
		
		b47.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "47번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b48 = new JButton("48");
		b48.setHorizontalAlignment(SwingConstants.RIGHT);
		b48.setFocusPainted(false);
		b48.setFont(b48.getFont().deriveFont(20.0f));
		panel.add(b48);
		
		b48.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "48번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b49 = new JButton("49");
		b49.setHorizontalAlignment(SwingConstants.RIGHT);
		b49.setFocusPainted(false);
		b49.setFont(b49.getFont().deriveFont(20.0f));
		panel.add(b49);
		
		b49.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "49번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b50 = new JButton("50");
		b50.setHorizontalAlignment(SwingConstants.RIGHT);
		b50.setFocusPainted(false);
		b50.setFont(b50.getFont().deriveFont(20.0f));
		panel.add(b50);
		
		b50.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "50번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b51 = new JButton("51");
		b51.setHorizontalAlignment(SwingConstants.RIGHT);
		b51.setFocusPainted(false);
		b51.setFont(b51.getFont().deriveFont(20.0f));
		panel.add(b51);
		
		b51.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "51번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b52 = new JButton("52");
		b52.setHorizontalAlignment(SwingConstants.RIGHT);
		b52.setFocusPainted(false);
		b52.setFont(b52.getFont().deriveFont(20.0f));
		panel.add(b52);
		
		b52.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "52번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b53 = new JButton("53");
		b53.setHorizontalAlignment(SwingConstants.RIGHT);
		b53.setFocusPainted(false);
		b53.setFont(b53.getFont().deriveFont(20.0f));
		panel.add(b53);
		
		b53.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "53번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b54 = new JButton("54");
		b54.setHorizontalAlignment(SwingConstants.RIGHT);
		b54.setFocusPainted(false);
		b54.setFont(b54.getFont().deriveFont(20.0f));
		panel.add(b54);
		
		b54.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "54번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b55 = new JButton("55");
		b55.setHorizontalAlignment(SwingConstants.RIGHT);
		b55.setFocusPainted(false);
		b55.setFont(b55.getFont().deriveFont(20.0f));
		panel.add(b55);
		
		b55.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "55번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b56 = new JButton("56");
		b56.setHorizontalAlignment(SwingConstants.RIGHT);
		b56.setFocusPainted(false);
		b56.setFont(b56.getFont().deriveFont(20.0f));
		panel.add(b56);
		
		b56.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "56번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b57 = new JButton("57");
		b57.setHorizontalAlignment(SwingConstants.RIGHT);
		b57.setFocusPainted(false);
		b57.setFont(b57.getFont().deriveFont(20.0f));
		panel.add(b57);
		
		b57.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "57번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b58 = new JButton("58");
		b58.setHorizontalAlignment(SwingConstants.RIGHT);
		b58.setFocusPainted(false);
		b58.setFont(b58.getFont().deriveFont(20.0f));
		panel.add(b58);
		
		b58.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "58번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b59 = new JButton("59");
		b59.setHorizontalAlignment(SwingConstants.RIGHT);
		b59.setFocusPainted(false);
		b59.setFont(b59.getFont().deriveFont(20.0f));
		panel.add(b59);
		
		b59.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "59번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b60 = new JButton("60");
		b60.setHorizontalAlignment(SwingConstants.RIGHT);
		b60.setFocusPainted(false);
		b60.setFont(b60.getFont().deriveFont(20.0f));
		panel.add(b60);
		
		b60.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "60번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b61 = new JButton("61");
		b61.setHorizontalAlignment(SwingConstants.RIGHT);
		b61.setFocusPainted(false);
		b61.setFont(b61.getFont().deriveFont(20.0f));
		panel.add(b61);
		
		b61.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "61번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b62 = new JButton("62");
		b62.setHorizontalAlignment(SwingConstants.RIGHT);
		b62.setFocusPainted(false);
		b62.setFont(b62.getFont().deriveFont(20.0f));
		panel.add(b62);
		
		b62.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "62번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	

		JButton b63 = new JButton("63");
		b63.setHorizontalAlignment(SwingConstants.RIGHT);
		b63.setFocusPainted(false);
		b63.setFont(b63.getFont().deriveFont(20.0f));
		panel.add(b63);
		
		b63.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "63번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b64 = new JButton("64");
		b64.setHorizontalAlignment(SwingConstants.RIGHT);
		b64.setFocusPainted(false);
		b64.setFont(b64.getFont().deriveFont(20.0f));
		panel.add(b64);
		
		b64.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "64번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b65 = new JButton("65");
		b65.setHorizontalAlignment(SwingConstants.RIGHT);
		b65.setFocusPainted(false);
		b65.setFont(b65.getFont().deriveFont(20.0f));
		panel.add(b65);
		
		b65.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "65번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b66 = new JButton("66");
		b66.setHorizontalAlignment(SwingConstants.RIGHT);
		b66.setFocusPainted(false);
		b66.setFont(b66.getFont().deriveFont(20.0f));
		panel.add(b66);
		
		b66.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "66번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b67 = new JButton("67");
		b67.setHorizontalAlignment(SwingConstants.RIGHT);
		b67.setFocusPainted(false);
		b67.setFont(b67.getFont().deriveFont(20.0f));
		panel.add(b67);
		
		b67.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "67번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b68 = new JButton("68");
		b68.setHorizontalAlignment(SwingConstants.RIGHT);
		b68.setFocusPainted(false);
		b68.setFont(b68.getFont().deriveFont(20.0f));
		panel.add(b68);
		
		b68.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "68번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b69 = new JButton("69");
		b69.setHorizontalAlignment(SwingConstants.RIGHT);
		b69.setFocusPainted(false);
		b69.setFont(b69.getFont().deriveFont(20.0f));
		panel.add(b69);
		
		b69.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "69번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b70 = new JButton("70");
		b70.setHorizontalAlignment(SwingConstants.RIGHT);
		b70.setFocusPainted(false);
		b70.setFont(b70.getFont().deriveFont(20.0f));
		panel.add(b70);
		
		b70.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "70번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b71 = new JButton("71");
		b71.setHorizontalAlignment(SwingConstants.RIGHT);
		b71.setFocusPainted(false);
		b71.setFont(b71.getFont().deriveFont(20.0f));
		panel.add(b71);
		
		b71.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "71번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b72 = new JButton("72");
		b72.setHorizontalAlignment(SwingConstants.RIGHT);
		b72.setFocusPainted(false);
		b72.setFont(b72.getFont().deriveFont(20.0f));
		panel.add(b72);
		
		b72.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "72번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b73 = new JButton("73");
		b73.setHorizontalAlignment(SwingConstants.RIGHT);
		b73.setFocusPainted(false);
		b73.setFont(b73.getFont().deriveFont(20.0f));
		panel.add(b73);
		
		b73.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "73번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b74 = new JButton("74");
		b74.setHorizontalAlignment(SwingConstants.RIGHT);
		b74.setFocusPainted(false);
		b74.setFont(b74.getFont().deriveFont(20.0f));
		panel.add(b74);
		
		b74.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "74번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b75 = new JButton("75");
		b75.setHorizontalAlignment(SwingConstants.RIGHT);
		b75.setFocusPainted(false);
		b75.setFont(b75.getFont().deriveFont(20.0f));
		panel.add(b75);
		
		b75.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "75번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b76 = new JButton("76");
		b76.setHorizontalAlignment(SwingConstants.RIGHT);
		b76.setFocusPainted(false);
		b76.setFont(b76.getFont().deriveFont(20.0f));
		panel.add(b76);
		
		b76.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "76번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b77 = new JButton("77");
		b77.setHorizontalAlignment(SwingConstants.RIGHT);
		b77.setFocusPainted(false);
		b77.setFont(b77.getFont().deriveFont(20.0f));
		panel.add(b77);
		
		b77.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "77번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b78 = new JButton("78");
		b78.setHorizontalAlignment(SwingConstants.RIGHT);
		b78.setFocusPainted(false);
		b78.setFont(b78.getFont().deriveFont(20.0f));
		panel.add(b78);
		
		b78.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "78번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b79 = new JButton("79");
		b79.setHorizontalAlignment(SwingConstants.RIGHT);
		b79.setFocusPainted(false);
		b79.setFont(b79.getFont().deriveFont(20.0f));
		panel.add(b79);
		
		b79.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "79번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b80 = new JButton("80");
		b80.setHorizontalAlignment(SwingConstants.RIGHT);
		b80.setFocusPainted(false);
		b80.setFont(b80.getFont().deriveFont(20.0f));
		panel.add(b80);
		
		b80.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "80번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b81 = new JButton("81");
		b81.setHorizontalAlignment(SwingConstants.RIGHT);
		b81.setFocusPainted(false);
		b81.setFont(b81.getFont().deriveFont(20.0f));
		panel.add(b81);
		
		b81.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "81번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b82 = new JButton("82");
		b82.setHorizontalAlignment(SwingConstants.RIGHT);
		b82.setFocusPainted(false);
		b82.setFont(b82.getFont().deriveFont(20.0f));
		panel.add(b82);
		
		b82.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "82번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b83 = new JButton("83");
		b83.setHorizontalAlignment(SwingConstants.RIGHT);
		b83.setFocusPainted(false);
		b83.setFont(b83.getFont().deriveFont(20.0f));
		panel.add(b83);
		
		b83.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "83번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b84 = new JButton("84");
		b84.setHorizontalAlignment(SwingConstants.RIGHT);
		b84.setFocusPainted(false);
		b84.setFont(b84.getFont().deriveFont(20.0f));
		panel.add(b84);
		
		b84.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "84번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b85 = new JButton("85");
		b85.setHorizontalAlignment(SwingConstants.RIGHT);
		b85.setFocusPainted(false);
		b85.setFont(b85.getFont().deriveFont(20.0f));
		panel.add(b85);
		
		b85.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "85번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b86 = new JButton("86");
		b86.setHorizontalAlignment(SwingConstants.RIGHT);
		b86.setFocusPainted(false);
		b86.setFont(b86.getFont().deriveFont(20.0f));
		panel.add(b86);
		
		b86.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "86번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b87 = new JButton("87");
		b87.setHorizontalAlignment(SwingConstants.RIGHT);
		b87.setFocusPainted(false);
		b87.setFont(b87.getFont().deriveFont(20.0f));
		panel.add(b87);
		
		b87.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "87번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b88 = new JButton("88");
		b88.setHorizontalAlignment(SwingConstants.RIGHT);
		b88.setFocusPainted(false);
		b88.setFont(b88.getFont().deriveFont(20.0f));
		panel.add(b88);
		
		b88.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "88번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b89 = new JButton("89");
		b89.setHorizontalAlignment(SwingConstants.RIGHT);
		b89.setFocusPainted(false);
		b89.setFont(b89.getFont().deriveFont(20.0f));
		panel.add(b89);
		
		b89.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "89번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b90 = new JButton("90");
		b90.setHorizontalAlignment(SwingConstants.RIGHT);
		b90.setFocusPainted(false);
		b90.setFont(b90.getFont().deriveFont(20.0f));
		panel.add(b90);
		
		b90.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "90번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b91 = new JButton("91");
		b91.setHorizontalAlignment(SwingConstants.RIGHT);
		b91.setFocusPainted(false);
		b91.setFont(b91.getFont().deriveFont(20.0f));
		panel.add(b91);
		
		b91.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "91번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b92 = new JButton("92");
		b92.setHorizontalAlignment(SwingConstants.RIGHT);
		b92.setFocusPainted(false);
		b92.setFont(b92.getFont().deriveFont(20.0f));
		panel.add(b92);
		
		b92.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "92번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b93 = new JButton("93");
		b93.setHorizontalAlignment(SwingConstants.RIGHT);
		b93.setFocusPainted(false);
		b93.setFont(b93.getFont().deriveFont(20.0f));
		panel.add(b93);
		
		b93.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "93번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b94 = new JButton("94");
		b94.setHorizontalAlignment(SwingConstants.RIGHT);
		b94.setFocusPainted(false);
		b94.setFont(b94.getFont().deriveFont(20.0f));
		panel.add(b94);
		
		b94.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "94번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b95 = new JButton("95");
		b95.setHorizontalAlignment(SwingConstants.RIGHT);
		b95.setFocusPainted(false);
		b95.setFont(b95.getFont().deriveFont(20.0f));
		panel.add(b95);
		
		b95.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "95번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b96 = new JButton("96");
		b96.setHorizontalAlignment(SwingConstants.RIGHT);
		b96.setFocusPainted(false);
		b96.setFont(b96.getFont().deriveFont(20.0f));
		panel.add(b96);
		
		b96.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "96번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b97 = new JButton("97");
		b97.setHorizontalAlignment(SwingConstants.RIGHT);
		b97.setFocusPainted(false);
		b97.setFont(b97.getFont().deriveFont(20.0f));
		panel.add(b97);

		b97.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "97번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		JButton b98 = new JButton("98");
		b98.setHorizontalAlignment(SwingConstants.RIGHT);
		b98.setFocusPainted(false);
		b98.setFont(b98.getFont().deriveFont(20.0f));
		panel.add(b98);
		
		b98.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "98번 좌석이 선택되었습니다.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});	
		
		this.add(panel);
		
	}

}
