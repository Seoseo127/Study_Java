package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Exam2 {

	public static void main(String[] args) {
		System.out.println(">> main() 시작");
		
		//(실습) FileReader_Exam1 내용을 반복문으로 처리(모든 읽고 화면출력)
		File file = new File("file/test_char.txt");
		
		FileReader fr = null;
		
		try {
			//1.객체(인스턴스) 생성
			//fr = new FileReader(file);
			fr = new FileReader("file/test_char.txt");
			
			//2.작업처리(파일에서 1문자 읽고, 화면출력)
			int readValue = fr.read();
			while (readValue != -1) {
				//System.out.println(readValue + " : " + (char)readValue);
				System.out.print((char)readValue);
				readValue = fr.read();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("[예외] 파일못찾음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[예외] 파일 읽기 오류");
		} finally {
			//3.닫기
			try {
				if (fr != null) fr.close();
			} catch (IOException e) {}
		}
		System.out.println();
				
		System.out.println(">> main() 끝");
	}

}






