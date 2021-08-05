package com.kh.menu.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import com.kh.menu.model.vo.Product;

public class MainPage extends JPanel {
	protected static final Component scroller = null;
	private MainFrame mfr;
	private JPanel mainPage;
	private List<JSpinner> splist = new ArrayList<>();
	private List<Product> selectedProduct = new ArrayList<>();

	public MainPage(MainFrame mf) {
		this.mfr = mf;
		this.mainPage = this;
		this.setLayout(null);
		this.setBackground(Color.LIGHT_GRAY);

		// 하단 정보 패널
		JPanel infor = new JPanel();
		JLabel text = new JLabel("선택된 제품이 없습니다.");
		infor.setBackground(Color.white);
		infor.setLocation(30, 630);
		infor.setSize(1200, 30);
		infor.add(text);
		this.add(infor);

		// 상위메뉴
		JPanel foodMenuT = new JPanel();
		foodMenuT.setLocation(30, 30);
		foodMenuT.setSize(600, 50);

		foodMenuT.setLayout(null);

		JButton btn1 = new JButton("과자류");
		btn1.setLocation(107, 10);
		btn1.setSize(100, 40);
		JButton btn2 = new JButton("식사류");
		btn2.setLocation(265, 10);
		btn2.setSize(100, 40);
		JButton btn3 = new JButton("음료류");
		btn3.setLocation(422, 10);
		btn3.setSize(100, 40);

		foodMenuT.add(btn1);
		// foodMenuT.add(btn2);
		// foodMenuT.add(btn3);

//		JTextField foodMenuM = new JTextField();
//		foodMenuM.setLocation(30, 100);
//		foodMenuM.setSize(815,520);

		// foodMenuM1 JPanel 생성
		JPanel foodMenuM1 = new JPanel();
		foodMenuM1.setLocation(30, 100);
		foodMenuM1.setSize(160, 250);
		foodMenuM1.setBackground(Color.white);
		foodMenuM1.setLayout(null);
		// 이미지 크기 지정하여 이미지 객체 생성
		Image icon1 = new ImageIcon("image/Swingchip.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label1 = new JLabel(new ImageIcon(icon1));
		label1.setLocation(20, -10);
		label1.setSize(120, 200);
		foodMenuM1.add(label1);
		// 과자이름
		JTextField name1 = new JTextField("스윙칩");
		name1.setLocation(30, 170);
		name1.setSize(50, 30);
		foodMenuM1.add(name1);
		// 가격
		JTextField price1 = new JTextField("1500원");
		price1.setLocation(80, 170);
		price1.setSize(50, 30);
		foodMenuM1.add(price1);
		// JButton 생성
		JButton button1 = new JButton("주문하기");
		button1.setLocation(30, 200);
		button1.setSize(100, 30);
		foodMenuM1.add(button1);

		// foodMenuM2 JPanel 생성
		JPanel foodMenuM2 = new JPanel();
		foodMenuM2.setLocation(194, 100);
		foodMenuM2.setSize(160, 250);
		foodMenuM2.setBackground(Color.white);
		foodMenuM2.setLayout(null);
		// 이미지 크기 지정하여 이미지 객체 생성
		Image icon2 = new ImageIcon("image/꼬깔콘.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label2 = new JLabel(new ImageIcon(icon2));
		label2.setLocation(20, -10);
		label2.setSize(120, 200);
		foodMenuM2.add(label2);
		// 과자이름
		JTextField name2 = new JTextField("꼬깔콘 ");
		name2.setLocation(30, 170);
		name2.setSize(50, 30);
		foodMenuM2.add(name2);
		// 가격
		JTextField price2 = new JTextField("1000원");
		price2.setLocation(80, 170);
		price2.setSize(50, 30);
		foodMenuM2.add(price2);
		// JButton 생성
		JButton button2 = new JButton("주문하기");
		button2.setLocation(30, 200);
		button2.setSize(100, 30);
		foodMenuM2.add(button2);

		// foodMenuM3 JPanel 생성
		JPanel foodMenuM3 = new JPanel();
		foodMenuM3.setLocation(358, 100);
		foodMenuM3.setSize(160, 250);
		foodMenuM3.setBackground(Color.white);
		foodMenuM3.setLayout(null);
		// 이미지 크기 지정하여 이미지 객체 생성
		Image icon3 = new ImageIcon("image/꾸이맨.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label3 = new JLabel(new ImageIcon(icon3));
		label3.setLocation(20, -10);
		label3.setSize(120, 200);
		foodMenuM3.add(label3);
		// 과자이름
		JTextField name3 = new JTextField("꾸이맨");
		name3.setLocation(30, 170);
		name3.setSize(50, 30);
		foodMenuM3.add(name3);
		// 가격
		JTextField price3 = new JTextField("800원");
		price3.setLocation(80, 170);
		price3.setSize(50, 30);
		foodMenuM3.add(price3);

		// JButton 생성
		JButton button3 = new JButton("주문하기");
		button3.setLocation(30, 200);
		button3.setSize(100, 30);
		foodMenuM3.add(button3);

		// foodMenuM4 JPanel 생성
		JPanel foodMenuM4 = new JPanel();
		foodMenuM4.setLocation(522, 100);
		foodMenuM4.setSize(160, 250);
		foodMenuM4.setBackground(Color.white);
		foodMenuM4.setLayout(null);
		// 이미지 크기 지정하여 이미지 객체 생성
		Image icon4 = new ImageIcon("image/꿀꽈배기.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label4 = new JLabel(new ImageIcon(icon4));
		label4.setLocation(20, -10);
		label4.setSize(120, 200);
		foodMenuM4.add(label4);
		// 과자이름
		JTextField name4 = new JTextField("꿀꽈배기");
		name4.setLocation(30, 170);
		name4.setSize(50, 30);
		foodMenuM4.add(name4);
		// 가격
		JTextField price4 = new JTextField("1500원");
		price4.setLocation(80, 170);
		price4.setSize(50, 30);
		foodMenuM4.add(price4);
		// JButton 생성
		JButton button4 = new JButton("주문하기");
		button4.setLocation(30, 200);
		button4.setSize(100, 30);
		foodMenuM4.add(button4);

		// foodMenuM5 JPanel 생성
		JPanel foodMenuM5 = new JPanel();
		foodMenuM5.setLocation(685, 100);
		foodMenuM5.setSize(160, 250);
		foodMenuM5.setBackground(Color.white);
		foodMenuM5.setLayout(null);
		// 이미지 크기 지정하여 이미지 객체 생성
		Image icon5 = new ImageIcon("image/숏다리.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label5 = new JLabel(new ImageIcon(icon5));
		label5.setLocation(20, -10);
		label5.setSize(120, 200);
		foodMenuM5.add(label5);
		// 과자이름
		JTextField name5 = new JTextField("숏다리");
		name5.setLocation(30, 170);
		name5.setSize(50, 30);
		foodMenuM5.add(name5);
		// 가격
		JTextField price5 = new JTextField("1200원");
		price5.setLocation(80, 170);
		price5.setSize(50, 30);
		foodMenuM5.add(price5);
		// JButton 생성
		JButton button5 = new JButton("주문하기");
		button5.setLocation(30, 200);
		button5.setSize(100, 30);
		foodMenuM5.add(button5);

		// foodMenuM6 JPanel 생성
		JPanel foodMenuM6 = new JPanel();
		foodMenuM6.setLocation(30, 370);
		foodMenuM6.setSize(160, 250);
		foodMenuM6.setBackground(Color.white);
		foodMenuM6.setLayout(null);
		// 이미지 크기 지정하여 이미지 객체 생성
		Image icon6 = new ImageIcon("image/야채타임.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label6 = new JLabel(new ImageIcon(icon6));
		label6.setLocation(20, -10);
		label6.setSize(120, 200);
		foodMenuM6.add(label6);
		// 과자이름
		JTextField name6 = new JTextField("야채타임");
		name6.setLocation(30, 170);
		name6.setSize(50, 30);
		foodMenuM6.add(name6);
		// 가격
		JTextField price6 = new JTextField("2000원");
		price6.setLocation(80, 170);
		price6.setSize(50, 30);
		foodMenuM6.add(price6);
		// JButton 생성
		JButton button6 = new JButton("주문하기");
		button6.setLocation(30, 200);
		button6.setSize(100, 30);
		foodMenuM6.add(button6);

		// foodMenuM7 JPanel 생성
		JPanel foodMenuM7 = new JPanel();
		foodMenuM7.setLocation(194, 370);
		foodMenuM7.setSize(160, 250);
		foodMenuM7.setBackground(Color.white);
		foodMenuM7.setLayout(null);
		// 이미지 크기 지정하여 이미지 객체 생성
		Image icon7 = new ImageIcon("image/자유시간.png").getImage().getScaledInstance(150, 100, 0);
		JLabel label7 = new JLabel(new ImageIcon(icon7));
		label7.setLocation(20, 30);
		label7.setSize(120, 100);
		foodMenuM7.add(label7);
		// 과자이름
		JTextField name7 = new JTextField("자유시간");
		name7.setLocation(30, 170);
		name7.setSize(50, 30);
		foodMenuM7.add(name7);
		// 가격
		JTextField price7 = new JTextField("1000원");
		price7.setLocation(80, 170);
		price7.setSize(50, 30);
		foodMenuM7.add(price7);
		// JButton 생성
		JButton button7 = new JButton("주문하기");
		button7.setLocation(30, 200);
		button7.setSize(100, 30);
		foodMenuM7.add(button7);

		// foodMenuM8 JPanel 생성
		JPanel foodMenuM8 = new JPanel();
		foodMenuM8.setLocation(358, 370);
		foodMenuM8.setSize(160, 250);
		foodMenuM8.setBackground(Color.white);
		foodMenuM8.setLayout(null);
		// 이미지 크기 지정하여 이미지 객체 생성
		Image icon8 = new ImageIcon("image/초코송이.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label8 = new JLabel(new ImageIcon(icon8));
		label8.setLocation(20, -10);
		label8.setSize(120, 200);
		foodMenuM8.add(label8);
		// 과자이름
		JTextField name8 = new JTextField("초코송이");
		name8.setLocation(30, 170);
		name8.setSize(50, 30);
		foodMenuM8.add(name8);
		// 가격
		JTextField price8 = new JTextField("1000원");
		price8.setLocation(80, 170);
		price8.setSize(50, 30);
		foodMenuM8.add(price8);
		// JButton 생성
		JButton button8 = new JButton("주문하기");
		button8.setLocation(30, 200);
		button8.setSize(100, 30);
		foodMenuM8.add(button8);

		// foodMenuM9 JPanel 생성
		JPanel foodMenuM9 = new JPanel();
		foodMenuM9.setLocation(522, 370);
		foodMenuM9.setSize(160, 250);
		foodMenuM9.setBackground(Color.white);
		foodMenuM9.setLayout(null);
		// 이미지 크기 지정하여 이미지 객체 생성
		Image icon9 = new ImageIcon("image/칸초.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label9 = new JLabel(new ImageIcon(icon9));
		label9.setLocation(20, -10);
		label9.setSize(120, 200);
		foodMenuM9.add(label9);
		// 과자이름
		JTextField name9 = new JTextField("칸초");
		name9.setLocation(30, 170);
		name9.setSize(50, 30);
		foodMenuM9.add(name9);
		// 가격
		JTextField price9 = new JTextField("800원");
		price9.setLocation(80, 170);
		price9.setSize(50, 30);
		foodMenuM9.add(price9);
		// JButton 생성
		JButton button9 = new JButton("주문하기");
		button9.setLocation(30, 200);
		button9.setSize(100, 30);
		foodMenuM9.add(button9);

		// foodMenuM10 JPanel 생성
		JPanel foodMenuM10 = new JPanel();
		foodMenuM10.setLocation(685, 370);
		foodMenuM10.setSize(160, 250);
		foodMenuM10.setBackground(Color.white);
		foodMenuM10.setLayout(null);
		// 이미지 크기 지정하여 이미지 객체 생성
		Image icon10 = new ImageIcon("image/홈런볼.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label10 = new JLabel(new ImageIcon(icon10));
		label10.setLocation(20, -10);
		label10.setSize(120, 200);
		foodMenuM10.add(label10);
		// 과자이름
		JTextField name10 = new JTextField("홈런볼");
		name10.setLocation(30, 170);
		name10.setSize(50, 30);
		foodMenuM10.add(name10);
		// 가격
		JTextField price10 = new JTextField("1200원");
		price10.setLocation(80, 170);
		price10.setSize(50, 30);
		foodMenuM10.add(price10);
		// JButton 생성
		JButton button10 = new JButton("주문하기");
		button10.setLocation(30, 200);
		button10.setSize(100, 30);
		foodMenuM10.add(button10);

//		JTextField order = new JTextField();
//		order.setLocation(860, 30);
//		order.setSize(370,270);

		JPanel orderM = new JPanel();
		// orderM.setLocation(860, 85);
		// orderM.setSize(370, 250);
		orderM.setPreferredSize(new Dimension(370, 400));
		orderM.setBackground(Color.white);
		// frame.add(orderM);

		JScrollPane scroller = new JScrollPane(orderM, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		scroller.setLocation(860, 85);
		scroller.setSize(370, 250);

		this.add(scroller);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls1 = new JLabel();
				JLabel jlp1 = new JLabel();
				SpinnerNumberModel numberModel1 = new SpinnerNumberModel(1, 0, 9, 1);
				JSpinner spinner1 = new JSpinner(numberModel1);
				splist.add(spinner1);
				selectedProduct.add(new Product("스윙칩", 1500));
				jls1.setText(name1.getText());
				jls1.setPreferredSize(new Dimension(100, 30));
				jlp1.setText(price1.getText());
				jlp1.setPreferredSize(new Dimension(100, 30));
				spinner1.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls1);
				orderM.add(jlp1);
				orderM.add(spinner1);
				orderM.revalidate();
				orderM.repaint();
				button1.setEnabled(false);
				text.setText("스윙칩이 선택되었습니다.");
			}
		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls2 = new JLabel();
				JLabel jlp2 = new JLabel();
				SpinnerNumberModel numberModel2 = new SpinnerNumberModel(1, 0, 9, 1);
				JSpinner spinner2 = new JSpinner(numberModel2);
				splist.add(spinner2);
				selectedProduct.add(new Product("꼬깔콘", 1000));
				jls2.setText(name2.getText());
				jls2.setPreferredSize(new Dimension(100, 30));
				jlp2.setText(price2.getText());
				jlp2.setPreferredSize(new Dimension(100, 30));
				spinner2.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls2);
				orderM.add(jlp2);
				orderM.add(spinner2);
				orderM.revalidate();
				orderM.repaint();
				button2.setEnabled(false);
				text.setText("꼬깔콘이 선택되었습니다.");
			}
		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls3 = new JLabel();
				JLabel jlp3 = new JLabel();
				SpinnerNumberModel numberModel3 = new SpinnerNumberModel(1, 0, 9, 1);
				JSpinner spinner3 = new JSpinner(numberModel3);
				splist.add(spinner3);
				selectedProduct.add(new Product("꾸이맨", 800));
				jls3.setText(name3.getText());
				jls3.setPreferredSize(new Dimension(100, 30));
				jlp3.setText(price3.getText());
				jlp3.setPreferredSize(new Dimension(100, 30));
				spinner3.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls3);
				orderM.add(jlp3);
				orderM.add(spinner3);
				orderM.revalidate();
				orderM.repaint();
				button3.setEnabled(false);
				text.setText("꾸이맨이 선택되었습니다.");
			}
		});

		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls4 = new JLabel();
				JLabel jlp4 = new JLabel();
				SpinnerNumberModel numberModel4 = new SpinnerNumberModel(1, 0, 9, 1);
				JSpinner spinner4 = new JSpinner(numberModel4);
				splist.add(spinner4);
				selectedProduct.add(new Product("꿀꽈배기", 1500));
				jls4.setText(name4.getText());
				jls4.setPreferredSize(new Dimension(100, 30));
				jlp4.setText(price4.getText());
				jlp4.setPreferredSize(new Dimension(100, 30));
				spinner4.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls4);
				orderM.add(jlp4);
				orderM.add(spinner4);
				orderM.revalidate();
				orderM.repaint();
				button4.setEnabled(false);
				text.setText("꿀꽈배기가 선택되었습니다.");
			}
		});
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls5 = new JLabel();
				JLabel jlp5 = new JLabel();
				SpinnerNumberModel numberModel5 = new SpinnerNumberModel(1, 0, 9, 1);
				JSpinner spinner5 = new JSpinner(numberModel5);
				splist.add(spinner5);
				selectedProduct.add(new Product("숏다리", 1200));
				jls5.setText(name5.getText());
				jls5.setPreferredSize(new Dimension(100, 30));
				jlp5.setText(price5.getText());
				jlp5.setPreferredSize(new Dimension(100, 30));
				spinner5.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls5);
				orderM.add(jlp5);
				orderM.add(spinner5);
				orderM.revalidate();
				orderM.repaint();
				button5.setEnabled(false);
				text.setText("숏다리가 선택되었습니다.");
			}
		});
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls6 = new JLabel();
				JLabel jlp6 = new JLabel();
				SpinnerNumberModel numberModel6 = new SpinnerNumberModel(1, 0, 9, 1);
				JSpinner spinner6 = new JSpinner(numberModel6);
				splist.add(spinner6);
				selectedProduct.add(new Product("야채타임", 2000));
				jls6.setText(name6.getText());
				jls6.setPreferredSize(new Dimension(100, 30));
				jlp6.setText(price6.getText());
				jlp6.setPreferredSize(new Dimension(100, 30));
				spinner6.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls6);
				orderM.add(jlp6);
				orderM.add(spinner6);
				orderM.revalidate();
				orderM.repaint();
				button6.setEnabled(false);
				text.setText("야채타임이 선택되었습니다.");
			}
		});
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls7 = new JLabel();
				JLabel jlp7 = new JLabel();
				SpinnerNumberModel numberModel7 = new SpinnerNumberModel(1, 0, 9, 1);
				JSpinner spinner7 = new JSpinner(numberModel7);
				splist.add(spinner7);
				selectedProduct.add(new Product("자유시간", 1000));
				jls7.setText(name7.getText());
				jls7.setPreferredSize(new Dimension(100, 30));
				jlp7.setText(price5.getText());
				jlp7.setPreferredSize(new Dimension(100, 30));
				spinner7.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls7);
				orderM.add(jlp7);
				orderM.add(spinner7);
				orderM.revalidate();
				orderM.repaint();
				button7.setEnabled(false);
				text.setText("자유시간이 선택되었습니다.");
			}
		});
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls7 = new JLabel();
				JLabel jlp7 = new JLabel();
				SpinnerNumberModel numberModel7 = new SpinnerNumberModel(1, 0, 9, 1);
				JSpinner spinner7 = new JSpinner(numberModel7);
				splist.add(spinner7);
				selectedProduct.add(new Product("저유시간", 1000));
				jls7.setText(name7.getText());
				jls7.setPreferredSize(new Dimension(100, 30));
				jlp7.setText(price7.getText());
				jlp7.setPreferredSize(new Dimension(100, 30));
				spinner7.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls7);
				orderM.add(jlp7);
				orderM.add(spinner7);
				orderM.revalidate();
				orderM.repaint();
				button7.setEnabled(false);
				text.setText("자유시간이 선택되었습니다.");
			}
		});
		button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls8 = new JLabel();
				JLabel jlp8 = new JLabel();
				SpinnerNumberModel numberModel8 = new SpinnerNumberModel(1, 0, 9, 1);
				JSpinner spinner8 = new JSpinner(numberModel8);
				splist.add(spinner8);
				selectedProduct.add(new Product("초코송이", 1000));
				jls8.setText(name8.getText());
				jls8.setPreferredSize(new Dimension(100, 30));
				jlp8.setText(price8.getText());
				jlp8.setPreferredSize(new Dimension(100, 30));
				spinner8.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls8);
				orderM.add(jlp8);
				orderM.add(spinner8);
				orderM.revalidate();
				orderM.repaint();
				button8.setEnabled(false);
				text.setText("초코송이가 선택되었습니다.");
			}
		});
		button9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls9 = new JLabel();
				JLabel jlp9 = new JLabel();
				SpinnerNumberModel numberModel9 = new SpinnerNumberModel(1, 0, 9, 1);
				JSpinner spinner9 = new JSpinner(numberModel9);
				splist.add(spinner9);
				selectedProduct.add(new Product("칸초", 800));
				jls9.setText(name9.getText());
				jls9.setPreferredSize(new Dimension(100, 30));
				jlp9.setText(price9.getText());
				jlp9.setPreferredSize(new Dimension(100, 30));
				spinner9.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls9);
				orderM.add(jlp9);
				orderM.add(spinner9);
				orderM.revalidate();
				orderM.repaint();
				button9.setEnabled(false);
				text.setText("칸초가 선택되었습니다.");
			}
		});
		button10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls10 = new JLabel();
				JLabel jlp10 = new JLabel();
				SpinnerNumberModel numberModel10 = new SpinnerNumberModel(1, 0, 9, 1);
				JSpinner spinner10 = new JSpinner(numberModel10);
				splist.add(spinner10);
				selectedProduct.add(new Product("홈런볼", 1200));
				jls10.setText(name10.getText());
				jls10.setPreferredSize(new Dimension(100, 30));
				jlp10.setText(price10.getText());
				jlp10.setPreferredSize(new Dimension(100, 30));
				spinner10.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls10);
				orderM.add(jlp10);
				orderM.add(spinner10);
				orderM.revalidate();
				orderM.repaint();
				button10.setEnabled(false);
				text.setText("홈런볼이 선택되었습니다.");
			}
		});

		JButton reset = new JButton("초기화");
		reset.setLocation(645, 30);
		reset.setSize(200, 50);

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				orderM.removeAll();
				orderM.revalidate();
				orderM.repaint();
				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				button8.setEnabled(true);
				button9.setEnabled(true);
				button10.setEnabled(true);

			}
		});


		JTextField orderB1 = new JTextField("총 주문금액");
		orderB1.setLocation(860, 340);
		orderB1.setSize(250, 50);

		JTextField orderB2 = new JTextField("~원");
		orderB2.setLocation(1115, 340);
		orderB2.setSize(115, 50);

		JButton orderT = new JButton("주문결정하기");
		orderT.setLocation(860, 30);
		orderT.setSize(370, 50);
		
		orderT.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Product p = new Product();
				int sum = 0;
				for(JSpinner j : splist) {
				    for(Product p1 : selectedProduct) {
					int price =  p.getPrice() * (int)j.getValue();
					sum += price;	
					orderB2.setText("" + sum);
					
					}
				} 
			}
		
		});
		
//		JTextField bill = new JTextField();
//		bill.setLocation(860, 320);
//		bill.setSize(370,180);

		JButton billInfor = new JButton("결제정보");
		billInfor.setLocation(860, 400);
		billInfor.setSize(370, 50);

		JButton billCash = new JButton("현금");
		billCash.setLocation(860, 455);
		billCash.setSize(110, 50);

		JButton billCard = new JButton("카드");
		billCard.setLocation(990, 455);
		billCard.setSize(110, 50);

		JButton billKakao = new JButton("카카오페이");
		billKakao.setLocation(1120, 455);
		billKakao.setSize(110, 50);

		JTextField call = new JTextField("요청사항은 50자 이내로 작성해주세요");
		call.setLocation(860, 515);
		call.setSize(370, 30);

		call.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				call.setText("");
			}

		});

		JButton pay = new JButton("주문하기");
		pay.setBackground(Color.yellow);
		pay.setLocation(860, 560);
		pay.setSize(370, 60);

		pay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "주문이 완료 되었습니다.");
			}
		});

		this.add(foodMenuT);
		// mf.add(foodMenuM);
		this.add(foodMenuM1);
		this.add(foodMenuM2);
		this.add(foodMenuM3);
		this.add(foodMenuM4);
		this.add(foodMenuM5);
		this.add(foodMenuM6);
		this.add(foodMenuM7);
		this.add(foodMenuM8);
		this.add(foodMenuM9);
		this.add(foodMenuM10);
		this.add(reset);
		// mf.add(order);
		this.add(orderT);

		this.add(orderB1);
		this.add(orderB2);
		// mf.add(bill);
		this.add(billInfor);
		this.add(billCash);
		this.add(billCard);
		this.add(billKakao);
		this.add(call);
		this.add(pay);

		mf.add(this);
	}
}
