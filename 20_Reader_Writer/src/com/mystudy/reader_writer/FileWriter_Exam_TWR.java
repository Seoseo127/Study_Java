package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Exam_TWR {

	public static void main(String[] args) {
		System.out.println(">> main() 시작");
		// FileWriter : 파일에 문자단위 출력(쓰기)
		File file = new File("file/test_char_out_twr.txt");
		
		
		
		//1. 객체생성
		try (FileWriter fw = new FileWriter(file);) {
			
			//2. 작업처리(파일에 문자 출력/쓰기)
			fw.write('대');
			fw.write("한민국");
			
//			fw.flush(); //버퍼에 있는 데이터를 강제로 Output 처리
			
			fw.write("Hello Java!!!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println(">> main() 끝");
	}

}







