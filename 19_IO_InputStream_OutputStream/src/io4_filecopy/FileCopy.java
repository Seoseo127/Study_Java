package io4_filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// 파일복사 : 원본 파일에서 읽고, 대상 파일에 쓰기
		// 복사할 원본 파일(source file : AS-IS)
		// 쓰기위한 대상 파일(target file : TO-BE)
		//--------------------
		File inputFile = new File("temp.txt"); //원본파일
		File outputFile = new File("file/temp_copy.txt"); //복사본
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//(실습) 파일복사 기능 구현
		//1. 파일을 읽고, 쓰기용 객체 생성(FileInputStream, FileOutputStream)
		
		//2. 1 byte 읽고, 1 byte 쓰기 - read(), write(데이터) 반복
		
		//3. 사용객체 닫기(close)
		
		
		

	}

}










