package edu.exam.phone;

public class PhoneMain {

		public static void main(String[] args) {
			phone ph1 = new phone();
			System.out.println("ph1 : " + ph1);
			System.out.println("ph1.model : " + ph1.model);
			ph1.model = "테스트폰";
			
			//기능 테스트
			ph1.call();
			ph1.receiveCall();
			ph1.sendMsg("안녕!!!");
			String returnMsg = ph1.receiveMsg("반가워요");
			System.out.println("returnMsg : " + returnMsg);
			
			ph1.view();
			
			System.out.println("============");
			phone ph2 = new phone("갤럭시S21", "스마트폰");
			System.out.println("ph2 : " + ph2);
			System.out.println("ph2.model : " + ph2.model);
			ph2.hsize = 10;
			ph2.vsize = 20;
			
			ph2.view();
			
			System.out.println("--------------");
			ph1.view();

	}
	
	
}
