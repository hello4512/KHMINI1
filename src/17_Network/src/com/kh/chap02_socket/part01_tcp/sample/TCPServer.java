package com.kh.chap02_socket.part01_tcp.sample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public void serverStart() {
		//	서버는 서버 소켓 생성이 필요
		
		//	특정 프로그램을 구분할 수 있는 포트 번호
		int port = 8888;
		
		try {
			ServerSocket server = new ServerSocket(port);
			while(true) {
				//	클라이언트의 요청 accept(수락) 후
				//	해당 클라이언트와 연결된 소켓 리턴
				Socket client = server.accept();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
