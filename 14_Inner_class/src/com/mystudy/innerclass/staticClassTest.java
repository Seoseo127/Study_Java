package com.mystudy.innerclass;

public class staticClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
}
	int a = 100;
	private int b = 10;
	static int c = 200;
	
	static int sum = 0;
	static int sNum2 = 0;
	
	static void sum() {
		sum = Inner.d + sNum2;
	}
	
	// 스태틱 내부 클래스
	static class Inner {
		static int d = 1000;
		int e = 2000; //non-static
		
		void printData() { //non-static 메소드
			//System.out.println("외부 int a : " + a); //non-static
			//System.out.println("외부 int b : " + b); //non-static
			System.out.println("외부 static int c : " + c);
			
			System.out.println("내부 static int d : " + d);
			System.out.println("내부 Inner int e : " + e);
			
			sum();
		}
	}
}