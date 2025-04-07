package com.mystudy.generic;

class Box {
	Object obj; //필드(멤버) 변수의 타입
	void setObj(Object obj) {
		this.obj = obj;
	}
	Object getObj() {//리턴타입
		return obj;
	}
}

//제너릭 적용된 클래스
class BoxG<T> {
	T obj; //필드(멤버) 변수의 타입
	void setObj(T obj) {
		this.obj = obj;
	}
	T getObj() {//리턴타입
		return obj;
	}
}

public class GenericExam {

	public static void main(String[] args) {
		//제네릭 없이 사용하는 경우 
		Box box = new Box();
		box.setObj("문자열 String");
		box.setObj(100);
		box.setObj(new Box());
		box.setObj(new Integer(10000));
		
		Object obj = box.getObj();
		System.out.println("obj : " + obj);
		
		Integer integer = (Integer)box.getObj();
		System.out.println(integer.MAX_VALUE);
		
		System.out.println("==== 제네릭 적용 ====");
		String str = "Hello Java";
		Integer num = 999;
		
		
		BoxG<String> boxg = new BoxG<String>();
		boxg.setObj("문자열 String");
		boxg.setObj(str);
		//boxg.setObj(str2);
		
		String obj2 = boxg.getObj();
		System.out.println("boxg.getobj()" + boxg.getObj());

	}

}
