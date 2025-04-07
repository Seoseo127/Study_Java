
public class Ex02_if_else {

	public static void main(String[] args) {
		// if 문 3종류
		// if (조건) {}
		// if (조건) {} else {}
		// if (조건) {} else if () {} else if () {} ... else {}
		//-----------------------
		int num1 = 200;
		int num2 = 50;
		System.out.println("num1: " + num1 + ", num2: " + num2);
		
		//1. if (조건) {}
		if (num1 > num2) {
			System.out.println("num1이 num2 보다 크다");
		}
		if (num1 <= num2) {
			System.out.println("num1이 num2 보다 작거나 같다");
		}
		System.out.println(">> if () 끝");
		System.out.println("-------------");
		
		//2. if (조건) {} else {}
		if (num1 > num2) {
			System.out.println("num1이 num2 보다 크다");
		} else {
			System.out.println("num1이 num2 보다 작거나 같다");
		}
		System.out.println(">> if ~ else 끝");
		System.out.println("====================");
		//3. if (조건) {} else if () {} else if () {} ... else {}
		num1 = 10;
		num2 = 50;
		System.out.println("num1: " + num1 + ", num2: " + num2);
		if (num1 > num2) {
			System.out.println("num1이 num2 보다 크다");
		} else if (num1 == num2) {
			System.out.println("num1은 num2 와 동일하다(같다)");
		} else {
			System.out.println("num1이 num2 보다 작다");
		}
		System.out.println("-------");
		
		// if문 작성방식 : else, else if 분리해서 작성
		if (num1 > num2) {
			System.out.println("num1이 num2 보다 크다");
		} 
		else if (num1 == num2) {
			System.out.println("num1은 num2 와 동일하다(같다)");
		} 
		else {
			System.out.println("num1이 num2 보다 작다");
		}
		System.out.println("-----------------");
		if (num1 > num2) {
			System.out.println("num1이 num2 보다 크다");
		} 
		if (num1 == num2) {
			System.out.println("num1은 num2 와 동일하다(같다)");
		} 
		if (num1 < num2) {
			System.out.println("num1이 num2 보다 작다");
		}
		System.out.println("========================");
		//3. if (조건) {} else if () else if ()
		/* 점수평가 결과 출력
		 90 ~ 100 : A
		 80 ~ 89 : B
		 70 ~ 79 : C
		 60 ~ 69 : D
		 0 ~ 59 : F
		 ----------- */
		System.out.println("--- 성적처리 ---");
		//input 입력---------------
		String name = "홍길동";
		int score = 90;
		
		
		
		//처리(process)----------------
		String result1 = "평가 안됨";
		if (score >=90 ) {
			result1=("A");
			// 비교처리시 90미만의 값만 존재
		}
		else if (score >=80)  {
				
			result1=("B");
		}
		else if (score >=70) {
		
			result1=("C");
		}
		else if (score >=60 ) {
			result1=("D");
		}
		else {
			result1=("F");
		}
		
		//출력(output)--------------
		System.out.println("이름 :" + name);
		System.out.println("점수 : "+ score);
		System.out.println( "결과 :" + result1);

		//===============
		/*
		if () {
		   if () {
		 } else {
		 }
		 }else if (){
		 }else if (){
		 }else if (){
		 }
	}	 
		 */
		
	
	}	
	
}









