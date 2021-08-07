package com.kh.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.kh.common.ChangePanel;
import com.kh.model.vo.Product;



public class ManagerPage extends JPanel {
	private MainFrame mfr;
	private JPanel managerpage;
	private Image img;
	private List<JSpinner> splist = new ArrayList<>();
	private List<Product> selectedProduct = new ArrayList<>();

	public ManagerPage(MainFrame mf) {
		this.mfr = mf;
		this.managerpage = this;

		Product pd = new Product();
		CafePage cp = new CafePage(mf);
		
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

		// 주문목록 JLabel
		JLabel menujl1 = new JLabel("메뉴 : " + mfr.menu);
		inPanel.add(menujl1);
		menujl1.setPreferredSize(new Dimension(300, 120));
		menujl1.setFont(new Font("고딕", Font.BOLD, 20));

		// 주문갯수 JLabel
		JLabel menujl2 = new JLabel("갯수 : ");
		inPanel.add(menujl2);
		menujl2.setPreferredSize(new Dimension(300, 120));
		menujl2.setFont(new Font("고딕", Font.BOLD, 20));

		// 개행용 JLabel
		JLabel jl1 = new JLabel();
		inPanel.add(jl1);
		jl1.setPreferredSize(new Dimension(400, 60));

		// JButton "완료"
		JButton move = new JButton("완료");
		move.setBackground(Color.red);
		inPanel.add(move);
		move.setFont(new Font("고딕", Font.BOLD, 20));
		move.setForeground(Color.white);
		move.setPreferredSize(new Dimension(120, 60));
		move.setLayout(new FlowLayout(FlowLayout.RIGHT));
		move.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "요청완료", "요청완료", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, managerpage, new LoginAfterPage(mf));
			}
		});

		/*// 주문목록 JLabel
		JLabel menujl3 = new JLabel("메뉴");
		inPanel.add(menujl3);
		menujl3.setPreferredSize(new Dimension(300, 60));
		menujl3.setFont(new Font("고딕", Font.BOLD, 20));

		// 주문갯수 JLabel
		JLabel menujl4 = new JLabel("갯수");
		inPanel.add(menujl4);
		menujl4.setPreferredSize(new Dimension(300, 60));
		menujl4.setFont(new Font("고딕", Font.BOLD, 20));
		*/
		// 개행용 JLabel
		JLabel jl2 = new JLabel();
		inPanel.add(jl2);
		jl2.setPreferredSize(new Dimension(1010, 10));

		// right JPanel "주문접수" button
		JButton menubutton = new JButton("주문접수");
		menubutton.setBackground(Color.gray);
		inPanel.add(menubutton);
		menubutton.setFont(new Font("고딕", Font.BOLD, 20));
		menubutton.setForeground(Color.white);
		menubutton.setPreferredSize(new Dimension(120, 60));
		menubutton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		menubutton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "주문완료");			
			}});

		// linePanel 생성
		JPanel linePanel = new JPanel();
		linePanel.setPreferredSize(new Dimension(1200, 10));
		linePanel.setBackground(Color.black);
		inPanel.add(linePanel);

		// JtextField
		JLabel requests = new JLabel("요청사항");
		inPanel.add(requests);
		requests.setFont(new Font("고딕", Font.BOLD, 50));
		requests.setHorizontalAlignment(JLabel.LEFT);

		// 개행용 JLabel
		JLabel jl3 = new JLabel();
		inPanel.add(jl3);
		jl3.setPreferredSize(new Dimension(900, 100));

		/*// 개행용 JLabel
		JLabel jl4 = new JLabel("1");
		inPanel.add(jl4);
		jl4.setPreferredSize(new Dimension(1000, 50));
*/
		JTextArea ta = new JTextArea(10, 105);
		inPanel.add(ta);
		ta.setBackground(Color.black);
		ta.setForeground(Color.white);
		ta.setLayout(new FlowLayout(FlowLayout.LEFT));

		/*// 개행용 JLabel
		JLabel jl5 = new JLabel();
		inPanel.add(jl5);
		jl5.setPreferredSize(new Dimension(800, 50));
		jl5.setLayout(new FlowLayout(FlowLayout.RIGHT));
		 */
		
		JTextField tf = new JTextField(105);
		inPanel.add(tf);
		tf.setLayout(new FlowLayout(FlowLayout.LEFT));
			
		/*// 개행용 JLabel
		JLabel jl6 = new JLabel();
		inPanel.add(jl6);
		jl6.setPreferredSize(new Dimension(800, 50));
		jl6.setLayout(new FlowLayout(FlowLayout.RIGHT));
		*/
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				ta.append(text + "\n");
				tf.setText("");
			}
		});

		this.add(outPanel);
		mf.add(this);
	}

}
