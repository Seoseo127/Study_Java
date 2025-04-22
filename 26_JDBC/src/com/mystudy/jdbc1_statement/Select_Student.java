package com.mystudy.jdbc1_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_Student {

	public static void main(String[] args) {
		//JDBC 이용한 DB 연동 프로그래밍 작성 절차
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		//2. DB연결 - Connection 객체 생성 <- DriverManager
		//3. Statement 문 실행(SQL 문 실행)
		//4. SQL 실행 결과에 대한 처리
		//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
		//   - INSERT, UPDATE, DELETE : int 값(건수) 처리
		//5. 클로징 처리에 의한 자원 반납
		//--------------------
		
		Connection conn = null;
		Statement stmt = null;
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> 드라이버 로딩 성공");
			
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"MYSTUDY", "mystudypw");
			System.out.println(">> DB연결 성공");
			
			//3. Statement 문 실행(SQL 문 실행)
			stmt = conn.createStatement();
			
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
			//   - INSERT, UPDATE, DELETE : int 값(건수) 처리
			
		} catch (ClassNotFoundException e) {
			System.out.println(">>[예외발생] 드라이버 로딩 실패!!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(">>[예외발생] Connection, Statement 객체 생성 실패");
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			try {
				if (stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		

	}

}
