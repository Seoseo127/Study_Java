package com.mystudy.ex03_interface;

// 인터페이스는 static final 속성값, 추상(abstract)메소드가 있다
interface I_Phone { // public 있고, 없고
	
	// {} 없음 : 추상메소드(abstract method)
	// 인터페이스에 정의된 추상메소드는 모두 public abstract 메소드
	public abstract void view(); //전화정보 확인
	public void call(); //전화걸기 - abstract 생략됨
	void receiveCall(); //전화받기 - public abstract 생략됨
	void sendMsg(); //메시지 보내기 - public abstract 생략됨
	void receiveMsg(); //메시지 받기 - public abstract 생략됨
	
}
