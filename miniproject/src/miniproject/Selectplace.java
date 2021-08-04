package miniproject;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Selectplace {
	public Selectplace() {
		JFrame frame = new JFrame("선불결제화면");
		frame.setSize(1280,720);
		// 그리드레이아웃 설정한 패널
		JPanel panel1 = new JPanel();
		panel1.setLocation(100,100);
		panel1.setSize(1000, 600);
		panel1.setLayout(null);
		
		// 자리선택 패널
		JPanel panel2 = new JPanel();
		panel2.setLocation(800,100);
		panel2.setSize(400, 200);
		panel2.setLayout(null);
		
		panel2.add(new Button("자리선택"));
		
		JPanel panel = new JPanel(new GridLayout(6, 5, 10, 20));
		panel.setSize(1000,500);
		JLabel lb1 = new JLabel("회원요금");
		lb1.setFont(lb1.getFont().deriveFont(30.0f));
		lb1.setHorizontalAlignment(JLabel.CENTER);
		lb1.setBackground(Color.blue);
		lb1.setOpaque(true);
		panel.add(lb1);
		
		JLabel lb2 = new JLabel("학생요금");
		lb2.setFont(lb2.getFont().deriveFont(30.0f));
		lb2.setHorizontalAlignment(JLabel.CENTER);
		lb2.setBackground(Color.blue);
		lb2.setOpaque(true);
		panel.add(lb2);
		
		JLabel lb3 = new JLabel("비회원요금");
		lb3.setFont(lb3.getFont().deriveFont(30.0f));
		lb3.setHorizontalAlignment(JLabel.CENTER);
		lb3.setBackground(Color.blue);
		lb3.setOpaque(true);
		panel.add(lb3);
		
		JLabel lb4 = new JLabel("상품권");
		lb4.setFont(lb4.getFont().deriveFont(30.0f));
		lb4.setHorizontalAlignment(JLabel.CENTER);
		lb4.setBackground(Color.blue);
		lb4.setOpaque(true);
		panel.add(lb4);
		
		JLabel lb5 = new JLabel("결제수단");
		lb5.setFont(lb5.getFont().deriveFont(30.0f));
		lb5.setHorizontalAlignment(JLabel.CENTER);
		lb5.setBackground(Color.blue);
		lb5.setOpaque(true);
		panel.add(lb5);
		
		JButton b1 = new JButton("1시간 / 1000원");
		b1.setFont(b1.getFont().deriveFont(20.0f));
		panel.add(b1);
		
		JButton b2 = new JButton("1시간 / 900원");
		b2.setFont(b2.getFont().deriveFont(20.0f));
		panel.add(b2);
		
		JButton b3 = new JButton("1시간 / 1200원");
		b3.setFont(b3.getFont().deriveFont(20.0f));
		panel.add(b3);
		
		JButton b4 = new JButton("문화상품권");
		b4.setFont(b4.getFont().deriveFont(20.0f));
		panel.add(b4);
		
		JButton b5 = new JButton("카드");
		b5.setFont(b5.getFont().deriveFont(20.0f));
		panel.add(b5);
		
		JButton b6 = new JButton("3시간 / 3000원");
		b6.setFont(b6.getFont().deriveFont(20.0f));
		panel.add(b6);
		
		JButton b7 = new JButton("3시간 / 2400원");
		b7.setFont(b7.getFont().deriveFont(20.0f));
		panel.add(b7);
		JButton b9 = new JButton("3시간 / 3300원");
		b9.setFont(b9.getFont().deriveFont(20.0f));
		panel.add(b9);
		
		JButton b10 = new JButton("넥슨캐시");
		b10.setFont(b10.getFont().deriveFont(20.0f));
		panel.add(b10);
		
		JButton b11 = new JButton("현금");
		b11.setFont(b11.getFont().deriveFont(20.0f));
		panel.add(b11);
		
		JButton b12 = new JButton("5시간 / 4000원");
		b12.setFont(b12.getFont().deriveFont(20.0f));
		panel.add(b12);
		
		
		JButton b13 = new JButton("5시간 / 3500원");
		b13.setFont(b13.getFont().deriveFont(20.0f));
		panel.add(b13);
	
		JButton b14 = new JButton("5시간 / 5000원");
		b14.setFont(b14.getFont().deriveFont(20.0f));
		panel.add(b14);
		
		JButton b15 = new JButton("온캐시");
		b15.setFont(b15.getFont().deriveFont(20.0f));
		panel.add(b15);
		
		JButton b16 = new JButton("카카오페이");
		b16.setFont(b16.getFont().deriveFont(20.0f));
		panel.add(b16);
		
		JButton b17 = new JButton("12시간 / 10000원");
		b17.setFont(b17.getFont().deriveFont(20.0f));
		panel.add(b17);
		
		JButton b18 = new JButton("12시간 / 8000원");
		b18.setFont(b18.getFont().deriveFont(20.0f));
		panel.add(b18);
		
		JButton b19 = new JButton("12시간 / 12000원");
		b19.setFont(b19.getFont().deriveFont(20.0f));
		panel.add(b19);
		
		JButton b20 = new JButton("틴캐시");
		b20.setFont(b20.getFont().deriveFont(20.0f));
		panel.add(b20);
	
		JButton b21 = new JButton("삼성페이");
		b21.setFont(b21.getFont().deriveFont(20.0f));
		panel.add(b21);
		
		JButton b22 = new JButton("20시간 / 15000원");
		b22.setFont(b22.getFont().deriveFont(20.0f));
		panel.add(b22);
		
		JButton b23 = new JButton("20시간 / 12000원");
		b23.setFont(b23.getFont().deriveFont(20.0f));
		panel.add(b23);
		
		panel.add(new JLabel(""));
		
		JButton b24 = new JButton("구글기프트");
		b24.setFont(b24.getFont().deriveFont(20.0f));
		panel.add(b24);
		
		JButton b25= new JButton("토스");
		b25.setFont(b25.getFont().deriveFont(20.0f));
		panel.add(b25);
		panel1.add(panel);
		
		frame.add(panel1);
		frame.add(panel2); //  자리선택 패널 추가
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Selectplace();
	}
}
