/* package 선언문 : java 파일의 맨 첫줄에 위치하며 한 번만 작성
	 * 자바 (class) 파일의 위치를 나타냄
	 * 일반적으로 회사의 도메인명을 반대로 사용
	 * 작성예 ) com.naver.project, com.itwill.myproject
	 */
package edu.class1.basic;

//import 선언문 : 선택항목이지만 일반적으로 사용 
//  (java.lang 패키지 이외의 패키지에 있는 타입 사용시 적용
// import java.uitl.Scanner;
import java.util.Scanner;
import java.util.*; //대표문자(wild card) " * "사용 가능하나 명시적으로 쓰는게 좋음.

//class 선언문 : 필수 항목
public class Ex01_package_import_class {

	public static void main(String[] args) {
		System.out.println("-----package, import, class 에 대해 알아보기-----");
		//java.util.Scanner scan = new java.util.Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.print(" >> 인사말 : ");
		String hello = scan.nextLine();
		System.out.println("인사말출력 : " + hello);
		
		
	}

}
