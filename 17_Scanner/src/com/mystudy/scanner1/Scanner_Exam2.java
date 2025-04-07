package com.mystudy.scanner1;

import java.util.Scanner;

public class Scanner_Exam2 {

	public static void main(String[] args) {
		/* (실습)Scanner 사용 성적처리
		입력 : 성명, 국어, 영어, 수학 점수를 입력 받아
		처리 : 총점, 평균 구하기
		출력 : 결과를 화면 출력
		<성적처리결과>
		성명 : 홍길동
		국어 : 100
		영어 : 90
		수학 : 82
		------------
		총점 : 272
		평균 : 90.66
		========================= */
	while (true) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성명 : ");
		String name = scan.nextLine(); 
		
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 : ");
		int math = scan.nextInt();
		scan.nextLine(); //빈문자열 읽어서 버리기
		
		
		//처리 : 총점, 평균 구하기
		int tot = kor + eng + math;
		double avg  = tot * 100 / 3 / 100.0;
	
		
		//출력 : 결과를 화면 출력
		System.out.println("\n-------------------");
		System.out.println("<성적처리 결과>");
		System.out.println("성명 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println();
		
		//계속할래? 그만할래?
		System.out.println(":: 성적처리를 중단 하시겠습니까?(y/n) ");
		String answer = scan.nextLine();
		if ("y".equalsIgnoreCase(answer)) {
			System.out.println("성적처리를 중단합니다~~~");
			break;
	}
	}
	}
}







