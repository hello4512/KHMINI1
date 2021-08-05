package text.com.kh.test.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OpenPage2 extends JPanel{
	private MainFrame mf;
	private JPanel mainPage;
	private Image img;
	
	public OpenPage2(MainFrame mf) {
		this.mf = mf;
		this.mainPage = this;
					
		// 관리자 화면
		
		// out JPanel 바탕화면 
		JPanel outPanel = new JPanel();
		outPanel.setPreferredSize(new Dimension(1280, 720));
		outPanel.setBackground(Color.blue);
						
		// inJPanel 생성
		JPanel inPanel = new JPanel();
		inPanel.setPreferredSize(new Dimension(1200, 665));
		inPanel.setBackground(Color.white);
		outPanel.add(inPanel);
		inPanel.setLayout(new FlowLayout());
						
		// JLabel "주문목록"
		JLabel jmjl = new JLabel("주문목록");
		inPanel.add(jmjl);
		jmjl.setFont(new Font("고딕", Font.BOLD, 40));
		jmjl.setForeground(Color.black);
		jmjl.setPreferredSize(new Dimension(1200, 80));
		jmjl.setHorizontalAlignment(JLabel.CENTER);
		// jmjl.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// JButton "완료"
		JButton move = new JButton("완료");
		move.setBackground(Color.red);
		inPanel.add(move);
		move.setFont(new Font("고딕", Font.BOLD, 20));
		move.setForeground(Color.white);
		move.setPreferredSize(new Dimension(120, 60));
		move.setLayout(new FlowLayout(FlowLayout.RIGHT));

		// right JPanel "주문접수" button
		JButton menubutton = new JButton("주문접수");
		menubutton.setBackground(Color.gray);
		inPanel.add(menubutton);
		menubutton.setFont(new Font("고딕", Font.BOLD, 20));
		menubutton.setForeground(Color.white);
		menubutton.setPreferredSize(new Dimension(120, 60));
		menubutton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		// linePanel 생성
		JPanel linePanel = new JPanel();
		linePanel.setPreferredSize(new Dimension(1200, 10));
		linePanel.setBackground(Color.black);
		inPanel.add(linePanel);
				
		// JtextField 
		JLabel requests = new JLabel("요청사항");
		inPanel.add(requests);
		requests.setFont(new Font("고딕", Font.BOLD, 40));
		requests.setHorizontalAlignment(JLabel.LEFT);
		
		JTextField tf = new JTextField(50);
		JTextArea ta = new JTextArea(10, 50);
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				ta.append(text + "\n");
				tf.setText("");
				}
			});
		inPanel.add(tf);
		inPanel.add(ta);
		
		
		this.add(outPanel);
		mf.add(this);
	}
		
}



