package com.mystudy.innerclass;

public class instanceClassTest {
	int a = 100;
	private int b = 10;
	static int c = 200;
	int sum = 0;
	
	void sum() {
		sum = a + b;
	}
	
	// 내부클래스 : 인스턴스 클래스
	class Inner {
		int in = 100;
		void printData() {
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);
			System.out.println("static int c : " + c);
			sum();
			System.out.println("sum : " + sum);
			
			System.out.println("내부클래스 필드 in : " + in);
		}
	}

	public static void main(String[] args) {
		instanceClassTest outer = new instanceClassTest();
		System.out.println("필드변수 a : " + outer.a);
		
		System.out.println("--- 인스턴스 클래스 사용 ---");
		instanceClassTest.Inner inner = new instanceClassTest().new Inner();
		//InstanceClassTest.Inner inner = outer.new Inner();
		System.out.println("inner : " + inner);
		
		inner.printData();


	}

}
