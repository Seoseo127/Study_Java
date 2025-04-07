package edu.class2.car;

import java.awt.CardLayout;

public class CarMain {

	public static void main(String[] args) {
		System.out.println("======= CarMain =========");
		// Car 클래스 이용해서 Car타입의 객체 (인스턴스) 생성
		Car car1 = new Car();
		car1.color = "검정";
		car1.color = "빨강";
		car1.CAR_LENGTH = 500;
		
		System.out.println("car1 : " + car1);
		System.out.println("차량명:" + car1.name); 
		System.out.println("모델명:" + car1.model); 
		System.out.println("차량색:" + car1.color); 
		System.out.println("에어백:" + car1.hasAirbag); 
		System.out.println("길이:" + car1.CAR_LENGTH); 
		System.out.println("폭:" + car1.CAR_WIDTH); 
		System.out.println("-----기능테스트-----");
		car1.run();
		car1.stop();
		car1.back();
		
		
		System.out.println("====== car2 사용 =====");
		//Car car2 = new car();
		Car car2 = new Car("패밀리카", "제네시스", "파랑");

		
		System.out.println("car1 : " + car1);
		System.out.println("차량명:" + car1.name); 
		System.out.println("모델명:" + car1.model); 
		System.out.println("차량색:" + car1.color); 
	}

}
