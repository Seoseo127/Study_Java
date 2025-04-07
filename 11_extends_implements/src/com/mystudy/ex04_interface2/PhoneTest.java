package com.mystudy.ex04_interface2;

class PhoneTest {

	public static void main(String[] args) {
		// Phone 객체(인스턴스) 생성 후 기능 테스트
		System.out.println("==== Phone =====");
		Phone ph1 = new Phone("010-1111-1111");
		ph1.view();  
		ph1.call();  
		ph1.receiveCall(); 
		ph1.sendMsg();
		ph1.receiveMsg();
		
		System.out.println("=== Mp3Phone ====");
		Mp3Phone ph2 = new Mp3Phone("삼성갤럭시", "010-2222-2222");
		ph2.view(); //phone 기능
		ph2.call();//phone 기능
		ph2.receiveCall();//phone 기능
		
		ph2.playMusic(); //mp3phone 기능
		
		System.out.println("=== WebPhone ====");
		WebPhone webPhone = new WebPhone("Webphone");
		webPhone.view(); // Phone 기능
		webPhone.call(); // Phone 기능
		webPhone.receiveCall(); // Phone 기능
		webPhone.sendMsg();
		webPhone.receiveMsg();
		
		//I_mp3Phone
		webPhone.playMusic();
		
		//I_WebPhone
		webPhone.searchWeb();


	}

}







