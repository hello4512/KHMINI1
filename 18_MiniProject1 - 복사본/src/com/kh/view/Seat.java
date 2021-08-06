package com.kh.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.common.ChangePanel;


public class Seat extends JPanel{
	private MainFrame mfr;
	private JPanel seat;
		
	public Seat(MainFrame mf)  {
		this.mfr = mf;
		this.seat = this;
		
		JPanel panel = new JPanel(new GridLayout(14, 7, 5, 10));
		panel.setPreferredSize(new Dimension(800, 500));
		
		JButton b1 = new JButton("1");
		b1.setPreferredSize(new Dimension(100, 100));
		b1.setHorizontalAlignment(b1.RIGHT);
		b1.setFocusPainted(false);
		b1.setFont(b1.getFont().deriveFont(20.0f));
		panel.add(b1);
		
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				b1.setText("사용시간/ 남은시간");
				ChangePanel.changePanel(mfr, seat, new PaymentScreen(mf));
			}
		});

		JButton b2 = new JButton("2");
		b2.setFocusPainted(false);
		b2.setHorizontalAlignment(b2.RIGHT);
		b2.setFont(b2.getFont().deriveFont(20.0f));
		panel.add(b2);

		JButton b3 = new JButton("3");
		b3.setFocusPainted(false);
		b3.setHorizontalAlignment(b3.RIGHT);
		b3.setFont(b3.getFont().deriveFont(20.0f));
		panel.add(b3);

		JButton b4 = new JButton("4");
		b4.setHorizontalAlignment(b4.RIGHT);
		b4.setFocusPainted(false);
		b4.setFont(b4.getFont().deriveFont(20.0f));
		panel.add(b4);

		JButton b5 = new JButton("5");
		b5.setHorizontalAlignment(b5.RIGHT);
		b5.setFocusPainted(false);
		b5.setFont(b5.getFont().deriveFont(20.0f));
		panel.add(b5);

		JButton b6 = new JButton("6");
		b6.setHorizontalAlignment(b6.RIGHT);
		b6.setFocusPainted(false);
		b6.setFont(b6.getFont().deriveFont(20.0f));
		panel.add(b6);

		JButton b7 = new JButton("7");
		b7.setHorizontalAlignment(b7.RIGHT);
		b7.setFocusPainted(false);
		b7.setFont(b7.getFont().deriveFont(20.0f));
		panel.add(b7);

		JButton b8 = new JButton("8");
		b8.setHorizontalAlignment(b8.RIGHT);
		b8.setFocusPainted(false);
		b8.setFont(b8.getFont().deriveFont(20.0f));
		panel.add(b8);

		JButton b9 = new JButton("9");
		b9.setHorizontalAlignment(b9.RIGHT);
		b9.setFocusPainted(false);
		b9.setFont(b9.getFont().deriveFont(20.0f));
		panel.add(b9);

		JButton b10 = new JButton("10");
		b10.setHorizontalAlignment(b10.RIGHT);
		b10.setFocusPainted(false);
		b10.setFont(b10.getFont().deriveFont(20.0f));
		panel.add(b10);

		JButton b11 = new JButton("11");
		b11.setHorizontalAlignment(b11.RIGHT);
		b11.setFocusPainted(false);
		b11.setFont(b11.getFont().deriveFont(20.0f));
		panel.add(b11);

		JButton b12 = new JButton("12");
		b12.setHorizontalAlignment(b12.RIGHT);
		b12.setFocusPainted(false);
		b12.setFont(b12.getFont().deriveFont(20.0f));
		panel.add(b12);

		JButton b13 = new JButton("13");
		b13.setHorizontalAlignment(b13.RIGHT);
		b13.setFocusPainted(false);
		b13.setFont(b13.getFont().deriveFont(20.0f));
		panel.add(b13);

		JButton b14 = new JButton("14");
		b14.setHorizontalAlignment(b14.RIGHT);
		b14.setFocusPainted(false);
		b14.setFont(b14.getFont().deriveFont(20.0f));
		panel.add(b14);

		JButton b15 = new JButton("15");
		b15.setHorizontalAlignment(b15.RIGHT);
		b15.setFocusPainted(false);
		b15.setFont(b15.getFont().deriveFont(20.0f));
		panel.add(b15);

		JButton b16 = new JButton("16");
		b16.setHorizontalAlignment(b16.RIGHT);
		b16.setFocusPainted(false);
		b16.setFont(b16.getFont().deriveFont(20.0f));
		panel.add(b16);

		JButton b17 = new JButton("17");
		b17.setHorizontalAlignment(b17.RIGHT);
		b17.setFocusPainted(false);
		b17.setFont(b17.getFont().deriveFont(20.0f));
		panel.add(b17);

		JButton b18 = new JButton("18");
		b18.setHorizontalAlignment(b18.RIGHT);
		b18.setFocusPainted(false);
		b18.setFont(b18.getFont().deriveFont(20.0f));
		panel.add(b18);

		JButton b19 = new JButton("19");
		b19.setHorizontalAlignment(b19.RIGHT);
		b19.setFocusPainted(false);
		b19.setFont(b19.getFont().deriveFont(20.0f));
		panel.add(b19);

		JButton b20 = new JButton("20");
		b20.setHorizontalAlignment(b20.RIGHT);
		b20.setFocusPainted(false);
		b20.setFont(b20.getFont().deriveFont(20.0f));
		panel.add(b20);

		JButton b21 = new JButton("21");
		b21.setHorizontalAlignment(b21.RIGHT);
		b21.setFocusPainted(false);
		b21.setFont(b21.getFont().deriveFont(15.0f));
		panel.add(b21);

		JButton b22 = new JButton("22");
		b22.setHorizontalAlignment(b22.RIGHT);
		b22.setFocusPainted(false);
		b22.setFont(b22.getFont().deriveFont(15.0f));
		panel.add(b22);

		JButton b23 = new JButton("23");
		b23.setHorizontalAlignment(b23.RIGHT);
		b23.setFocusPainted(false);
		b23.setFont(b23.getFont().deriveFont(20.0f));
		panel.add(b23);

		JButton b24 = new JButton("24");
		b24.setHorizontalAlignment(b24.RIGHT);
		b24.setFocusPainted(false);
		b24.setFont(b24.getFont().deriveFont(20.0f));
		panel.add(b24);
		
		JButton b25 = new JButton("25");
		b25.setHorizontalAlignment(b25.RIGHT);
		b25.setFocusPainted(false);
		b25.setFont(b25.getFont().deriveFont(20.0f));
		panel.add(b25);
		
		JButton b26 = new JButton("26");
		b26.setHorizontalAlignment(b26.RIGHT);
		b26.setFocusPainted(false);
		b26.setFont(b26.getFont().deriveFont(20.0f));
		panel.add(b26);
		
		JButton b27 = new JButton("27");
		b27.setHorizontalAlignment(b27.RIGHT);
		b27.setFocusPainted(false);
		b27.setFont(b27.getFont().deriveFont(20.0f));
		panel.add(b27);
		
		JButton b28 = new JButton("28");
		b28.setHorizontalAlignment(b28.RIGHT);
		b28.setFocusPainted(false);
		b28.setFont(b28.getFont().deriveFont(20.0f));
		panel.add(b28);
		
		JButton b29 = new JButton("29");
		b29.setHorizontalAlignment(b29.RIGHT);
		b29.setFocusPainted(false);
		b29.setFont(b29.getFont().deriveFont(20.0f));
		panel.add(b29);
		
		JButton b30 = new JButton("30");
		b30.setHorizontalAlignment(b30.RIGHT);
		b30.setFocusPainted(false);
		b30.setFont(b30.getFont().deriveFont(20.0f));
		panel.add(b30);
		
		JButton b31 = new JButton("31");
		b31.setHorizontalAlignment(b31.RIGHT);
		b31.setFocusPainted(false);
		b31.setFont(b31.getFont().deriveFont(20.0f));
		panel.add(b31);
		
		JButton b32 = new JButton("32");
		b32.setHorizontalAlignment(b32.RIGHT);
		b32.setFocusPainted(false);
		b32.setFont(b32.getFont().deriveFont(20.0f));
		panel.add(b32);
		
		JButton b33 = new JButton("33");
		b33.setHorizontalAlignment(b33.RIGHT);
		b33.setFocusPainted(false);
		b33.setFont(b33.getFont().deriveFont(20.0f));
		panel.add(b33);
		
		JButton b34 = new JButton("34");
		b34.setHorizontalAlignment(b34.RIGHT);
		b34.setFocusPainted(false);
		b34.setFont(b34.getFont().deriveFont(20.0f));
		panel.add(b34);
		
		JButton b35 = new JButton("35");
		b35.setHorizontalAlignment(b35.RIGHT);
		b35.setFocusPainted(false);
		b35.setFont(b35.getFont().deriveFont(20.0f));
		panel.add(b35);
		
		JButton b36 = new JButton("36");
		b36.setHorizontalAlignment(b36.RIGHT);
		b36.setFocusPainted(false);
		b36.setFont(b36.getFont().deriveFont(20.0f));
		panel.add(b36);
		
		JButton b37 = new JButton("37");
		b37.setHorizontalAlignment(b37.RIGHT);
		b37.setFocusPainted(false);
		b37.setFont(b37.getFont().deriveFont(20.0f));
		panel.add(b37);
		
		JButton b38 = new JButton("38");
		b38.setHorizontalAlignment(b38.RIGHT);
		b38.setFocusPainted(false);
		b38.setFont(b38.getFont().deriveFont(20.0f));
		panel.add(b38);
		
		JButton b39 = new JButton("39");
		b39.setHorizontalAlignment(b39.RIGHT);
		b39.setFocusPainted(false);
		b39.setFont(b39.getFont().deriveFont(20.0f));
		panel.add(b39);
		
		
		JButton b40 = new JButton("40");
		b40.setHorizontalAlignment(b40.RIGHT);
		b40.setFocusPainted(false);
		b40.setFont(b40.getFont().deriveFont(20.0f));
		panel.add(b40);
		
		JButton b41 = new JButton("41");
		b41.setHorizontalAlignment(b41.RIGHT);
		b41.setFocusPainted(false);
		b41.setFont(b41.getFont().deriveFont(20.0f));
		panel.add(b41);
		
		JButton b42 = new JButton("42");
		b42.setHorizontalAlignment(b42.RIGHT);
		b42.setFocusPainted(false);
		b42.setFont(b42.getFont().deriveFont(20.0f));
		panel.add(b42);
		
		JButton b43 = new JButton("43");
		b43.setHorizontalAlignment(b43.RIGHT);
		b43.setFocusPainted(false);
		b43.setFont(b43.getFont().deriveFont(20.0f));
		panel.add(b43);
		
		JButton b44 = new JButton("44");
		b44.setHorizontalAlignment(b44.RIGHT);
		b44.setFocusPainted(false);
		b44.setFont(b44.getFont().deriveFont(20.0f));
		panel.add(b44);
		
		JButton b45 = new JButton("45");
		b45.setHorizontalAlignment(b45.RIGHT);
		b45.setFocusPainted(false);
		b45.setFont(b45.getFont().deriveFont(20.0f));
		panel.add(b45);
		
		JButton b46 = new JButton("46");
		b46.setHorizontalAlignment(b46.RIGHT);
		b46.setFocusPainted(false);
		b46.setFont(b46.getFont().deriveFont(20.0f));
		panel.add(b46);
		
		JButton b47 = new JButton("47");
		b47.setHorizontalAlignment(b47.RIGHT);
		b47.setFocusPainted(false);
		b47.setFont(b47.getFont().deriveFont(20.0f));
		panel.add(b47);
		
		JButton b48 = new JButton("48");
		b48.setHorizontalAlignment(b48.RIGHT);
		b48.setFocusPainted(false);
		b48.setFont(b48.getFont().deriveFont(20.0f));
		panel.add(b48);
		
		JButton b49 = new JButton("49");
		b49.setHorizontalAlignment(b49.RIGHT);
		b49.setFocusPainted(false);
		b49.setFont(b49.getFont().deriveFont(20.0f));
		panel.add(b49);
		
		JButton b50 = new JButton("50");
		b50.setHorizontalAlignment(b50.RIGHT);
		b50.setFocusPainted(false);
		b50.setFont(b50.getFont().deriveFont(20.0f));
		panel.add(b50);
		
		JButton b51 = new JButton("51");
		b51.setHorizontalAlignment(b51.RIGHT);
		b51.setFocusPainted(false);
		b51.setFont(b51.getFont().deriveFont(20.0f));
		panel.add(b51);
		
		JButton b52 = new JButton("52");
		b52.setHorizontalAlignment(b52.RIGHT);
		b52.setFocusPainted(false);
		b52.setFont(b52.getFont().deriveFont(20.0f));
		panel.add(b52);
		
		JButton b53 = new JButton("53");
		b53.setHorizontalAlignment(b53.RIGHT);
		b53.setFocusPainted(false);
		b53.setFont(b53.getFont().deriveFont(20.0f));
		panel.add(b53);
		
		JButton b54 = new JButton("54");
		b54.setHorizontalAlignment(b54.RIGHT);
		b54.setFocusPainted(false);
		b54.setFont(b54.getFont().deriveFont(20.0f));
		panel.add(b54);
		
		JButton b55 = new JButton("55");
		b55.setHorizontalAlignment(b55.RIGHT);
		b55.setFocusPainted(false);
		b55.setFont(b55.getFont().deriveFont(20.0f));
		panel.add(b55);
		
		JButton b56 = new JButton("56");
		b56.setHorizontalAlignment(b56.RIGHT);
		b56.setFocusPainted(false);
		b56.setFont(b56.getFont().deriveFont(20.0f));
		panel.add(b56);
		
		JButton b57 = new JButton("57");
		b57.setHorizontalAlignment(b57.RIGHT);
		b57.setFocusPainted(false);
		b57.setFont(b57.getFont().deriveFont(20.0f));
		panel.add(b57);
		
		JButton b58 = new JButton("58");
		b58.setHorizontalAlignment(b58.RIGHT);
		b58.setFocusPainted(false);
		b58.setFont(b58.getFont().deriveFont(20.0f));
		panel.add(b58);
		
		JButton b59 = new JButton("59");
		b59.setHorizontalAlignment(b59.RIGHT);
		b59.setFocusPainted(false);
		b59.setFont(b59.getFont().deriveFont(20.0f));
		panel.add(b59);
		
		JButton b60 = new JButton("60");
		b60.setHorizontalAlignment(b60.RIGHT);
		b60.setFocusPainted(false);
		b60.setFont(b60.getFont().deriveFont(20.0f));
		panel.add(b60);
		
		JButton b61 = new JButton("61");
		b61.setHorizontalAlignment(b61.RIGHT);
		b61.setFocusPainted(false);
		b61.setFont(b61.getFont().deriveFont(20.0f));
		panel.add(b61);
		
		JButton b62 = new JButton("62");
		b62.setHorizontalAlignment(b62.RIGHT);
		b62.setFocusPainted(false);
		b62.setFont(b62.getFont().deriveFont(20.0f));
		panel.add(b62);

		JButton b63 = new JButton("63");
		b63.setHorizontalAlignment(b63.RIGHT);
		b63.setFocusPainted(false);
		b63.setFont(b63.getFont().deriveFont(20.0f));
		panel.add(b63);
		
		JButton b64 = new JButton("64");
		b64.setHorizontalAlignment(b64.RIGHT);
		b64.setFocusPainted(false);
		b64.setFont(b64.getFont().deriveFont(20.0f));
		panel.add(b64);
		
		JButton b65 = new JButton("65");
		b65.setHorizontalAlignment(b65.RIGHT);
		b65.setFocusPainted(false);
		b65.setFont(b65.getFont().deriveFont(20.0f));
		panel.add(b65);
		
		JButton b66 = new JButton("66");
		b66.setHorizontalAlignment(b66.RIGHT);
		b66.setFocusPainted(false);
		b66.setFont(b66.getFont().deriveFont(20.0f));
		panel.add(b66);
		
		JButton b67 = new JButton("67");
		b67.setHorizontalAlignment(b67.RIGHT);
		b67.setFocusPainted(false);
		b67.setFont(b67.getFont().deriveFont(20.0f));
		panel.add(b67);
		
		JButton b68 = new JButton("68");
		b68.setHorizontalAlignment(b68.RIGHT);
		b68.setFocusPainted(false);
		b68.setFont(b68.getFont().deriveFont(20.0f));
		panel.add(b68);
		
		JButton b69 = new JButton("69");
		b69.setHorizontalAlignment(b69.RIGHT);
		b69.setFocusPainted(false);
		b69.setFont(b69.getFont().deriveFont(20.0f));
		panel.add(b69);
		
		JButton b70 = new JButton("70");
		b70.setHorizontalAlignment(b70.RIGHT);
		b70.setFocusPainted(false);
		b70.setFont(b70.getFont().deriveFont(20.0f));
		panel.add(b70);
		
		JButton b71 = new JButton("71");
		b71.setHorizontalAlignment(b71.RIGHT);
		b71.setFocusPainted(false);
		b71.setFont(b71.getFont().deriveFont(20.0f));
		panel.add(b71);
		
		JButton b72 = new JButton("72");
		b72.setHorizontalAlignment(b72.RIGHT);
		b72.setFocusPainted(false);
		b72.setFont(b72.getFont().deriveFont(20.0f));
		panel.add(b72);
		
		JButton b73 = new JButton("73");
		b73.setHorizontalAlignment(b73.RIGHT);
		b73.setFocusPainted(false);
		b73.setFont(b73.getFont().deriveFont(20.0f));
		panel.add(b73);
		
		JButton b74 = new JButton("74");
		b74.setHorizontalAlignment(b74.RIGHT);
		b74.setFocusPainted(false);
		b74.setFont(b74.getFont().deriveFont(20.0f));
		panel.add(b74);
		
		JButton b75 = new JButton("75");
		b75.setHorizontalAlignment(b75.RIGHT);
		b75.setFocusPainted(false);
		b75.setFont(b75.getFont().deriveFont(20.0f));
		panel.add(b75);
		
		JButton b76 = new JButton("76");
		b76.setHorizontalAlignment(b76.RIGHT);
		b76.setFocusPainted(false);
		b76.setFont(b76.getFont().deriveFont(20.0f));
		panel.add(b76);
		
		JButton b77 = new JButton("77");
		b77.setHorizontalAlignment(b77.RIGHT);
		b77.setFocusPainted(false);
		b77.setFont(b77.getFont().deriveFont(20.0f));
		panel.add(b77);
		
		JButton b78 = new JButton("78");
		b78.setHorizontalAlignment(b78.RIGHT);
		b78.setFocusPainted(false);
		b78.setFont(b78.getFont().deriveFont(20.0f));
		panel.add(b78);
		
		JButton b79 = new JButton("79");
		b79.setHorizontalAlignment(b79.RIGHT);
		b79.setFocusPainted(false);
		b79.setFont(b79.getFont().deriveFont(20.0f));
		panel.add(b79);
		
		JButton b80 = new JButton("80");
		b80.setHorizontalAlignment(b80.RIGHT);
		b80.setFocusPainted(false);
		b80.setFont(b80.getFont().deriveFont(20.0f));
		panel.add(b80);
		
		JButton b81 = new JButton("81");
		b81.setHorizontalAlignment(b81.RIGHT);
		b81.setFocusPainted(false);
		b81.setFont(b81.getFont().deriveFont(20.0f));
		panel.add(b81);
		
		JButton b82 = new JButton("82");
		b82.setHorizontalAlignment(b82.RIGHT);
		b82.setFocusPainted(false);
		b82.setFont(b82.getFont().deriveFont(20.0f));
		panel.add(b82);
		
		JButton b83 = new JButton("83");
		b83.setHorizontalAlignment(b83.RIGHT);
		b83.setFocusPainted(false);
		b83.setFont(b83.getFont().deriveFont(20.0f));
		panel.add(b83);
		
		JButton b84 = new JButton("84");
		b84.setHorizontalAlignment(b84.RIGHT);
		b84.setFocusPainted(false);
		b84.setFont(b84.getFont().deriveFont(20.0f));
		panel.add(b84);
		
		JButton b85 = new JButton("85");
		b85.setHorizontalAlignment(b85.RIGHT);
		b85.setFocusPainted(false);
		b85.setFont(b85.getFont().deriveFont(20.0f));
		panel.add(b85);
		
		JButton b86 = new JButton("86");
		b86.setHorizontalAlignment(b86.RIGHT);
		b86.setFocusPainted(false);
		b86.setFont(b86.getFont().deriveFont(20.0f));
		panel.add(b86);
		
		JButton b87 = new JButton("87");
		b87.setHorizontalAlignment(b87.RIGHT);
		b87.setFocusPainted(false);
		b87.setFont(b87.getFont().deriveFont(20.0f));
		panel.add(b87);
		
		JButton b88 = new JButton("88");
		b88.setHorizontalAlignment(b88.RIGHT);
		b88.setFocusPainted(false);
		b88.setFont(b88.getFont().deriveFont(20.0f));
		panel.add(b88);
		
		JButton b89 = new JButton("89");
		b89.setHorizontalAlignment(b89.RIGHT);
		b89.setFocusPainted(false);
		b89.setFont(b89.getFont().deriveFont(20.0f));
		panel.add(b89);
		
		JButton b90 = new JButton("90");
		b90.setHorizontalAlignment(b90.RIGHT);
		b90.setFocusPainted(false);
		b90.setFont(b90.getFont().deriveFont(20.0f));
		panel.add(b90);
		
		JButton b91 = new JButton("91");
		b91.setHorizontalAlignment(b91.RIGHT);
		b91.setFocusPainted(false);
		b91.setFont(b91.getFont().deriveFont(20.0f));
		panel.add(b91);
		
		JButton b92 = new JButton("92");
		b92.setHorizontalAlignment(b92.RIGHT);
		b92.setFocusPainted(false);
		b92.setFont(b92.getFont().deriveFont(20.0f));
		panel.add(b92);
		
		JButton b93 = new JButton("93");
		b93.setHorizontalAlignment(b93.RIGHT);
		b93.setFocusPainted(false);
		b93.setFont(b93.getFont().deriveFont(20.0f));
		panel.add(b93);
		
		JButton b94 = new JButton("94");
		b94.setHorizontalAlignment(b94.RIGHT);
		b94.setFocusPainted(false);
		b94.setFont(b94.getFont().deriveFont(20.0f));
		panel.add(b94);
		
		JButton b95 = new JButton("95");
		b95.setHorizontalAlignment(b95.RIGHT);
		b95.setFocusPainted(false);
		b95.setFont(b95.getFont().deriveFont(20.0f));
		panel.add(b95);
		
		JButton b96 = new JButton("96");
		b96.setHorizontalAlignment(b96.RIGHT);
		b96.setFocusPainted(false);
		b96.setFont(b96.getFont().deriveFont(20.0f));
		panel.add(b96);
		
		JButton b97 = new JButton("97");
		b97.setHorizontalAlignment(b97.RIGHT);
		b97.setFocusPainted(false);
		b97.setFont(b97.getFont().deriveFont(20.0f));
		panel.add(b97);

		JButton b98 = new JButton("98");
		b98.setHorizontalAlignment(b98.RIGHT);
		b98.setFocusPainted(false);
		b98.setFont(b98.getFont().deriveFont(20.0f));
		panel.add(b98);
		
		this.add(panel);
		
	}

}
