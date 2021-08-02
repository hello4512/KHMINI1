package com.kh.chap02_socket.part01_tcp.sample;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {

	public void clientStart() {
		int port = 8888;
		String serverIP = "";
		
		try {
			//	서버쪽으로 연결 요청을 위해
			//	*** 서버의 IP와 port 번호 *** 를 매개변수로 전달하며 소켓 객체 생성
			Socket socket = new Socket(serverIP, port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
