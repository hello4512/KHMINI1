package com.kh.chap02_socket.part01_tcp.run;

import com.kh.chap02_socket.part01_tcp.sample.TCPServer;

public class ServerRun {

	public static void main(String[] args) {
		TCPServer ts = new TCPServer();
		ts.serverStart();
	}

}
