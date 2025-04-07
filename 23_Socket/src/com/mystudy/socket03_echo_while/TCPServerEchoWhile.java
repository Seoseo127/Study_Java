package com.mystudy.socket03_echo_while;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEchoWhile {

	public static void main(String[] args) {
		//(실습) 서버측 : 읽고, 쓰기
		// 클라이언트에서 보내온 메시지를 1번 받고, - BufferedReader
		// 받은 메시지를 클라이언트에게 다시 보내기 - PrintWriter
		// BufferedReader <- InputStreamReader <- InputStream
		// PrintWriter <- OutputStream
		//------------------------------------------
		//(추가) 메시지 읽고, 쓰기 반복
		//-----------------------------
		
		ServerSocket server = null;
		Socket socket = null;
		
		//메시지를 읽고, 보내기 위한 객체 생성
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			server = new ServerSocket(10000);
			System.out.println(">> 서버시작, 대기중~~~");
			
			socket = server.accept();
			System.out.println("클라이언트 접속 : " + socket.getRemoteSocketAddress());
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			while (true) {
				//메시지 읽기(받기) ----------------
				String msg = br.readLine(); //줄바꿈 문자 이전까지 읽기
				System.out.println("> 받은 메시지 : " + msg);
				
				if (msg == null) {
					System.out.println("::: 읽은 값이 없어서(null) 작업을 종료합니다");
					break;
				}
				if ("exit".equalsIgnoreCase(msg)) {
					System.out.println("::: 접속자 중단요청(exit)으로 작업 중단");
					break;
				}
				
				//메시지 쓰기(보내기) --------------
				pw.println(msg);
				pw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				System.out.println(":: BufferedReader 종료");
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (pw != null) pw.close();
			System.out.println(":: PrintWriter 종료");
			try {
				if (socket != null) socket.close();
				System.out.println(":: Socket 종료");
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (server != null) server.close();
				System.out.println(":: ServerSocket 종료");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(">> 서버 종료");

	}

}
