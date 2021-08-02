package com.kh.chap02_socket.part01_tcp.run;

import com.kh.chap02_socket.part01_tcp.sample.TCPClient;

public class ClientRun {

	public static void main(String[] args) {
		TCPClient tc = new TCPClient();
		tc.clientStart();
	}

}
