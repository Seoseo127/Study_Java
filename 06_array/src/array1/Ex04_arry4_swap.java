package array1;

public class Ex04_arry4_swap {

	public static void main(String[] args) {
		// 변수값 서로 교환하기
		
		int a = 100;
		int b = 200;
		System.out.println("교환 전 a :" + a);
		System.out.println("교환 전 b :" + b);
		System.out.println("-----------");
		// 실습문제 1.  a와 b의 값을 서로 교환하기
		
//		a = b;
//		b = a;
//		이 방법은 안됨 
		
		int temp; // 백업할 저장공간
		temp = a;
		a = b;
		b = temp;
		
		
		System.out.println("교환 후 a :" + a);
		System.out.println("교환 후 b :" + b);
		System.out.println("백업 temp : " + temp);
		
		// -------------
		
//		int[] num = {'a','b'};
//		
//		num [0] = num[0] + num[1];
//		num [1] = num[0] - num[1];
//		num [0] = num[0] - num[1];
//		System.out.println();
		
		int[] nums = {100, 200, 300, 400, 500};
		System.out.println("배열의 크기 : " + nums.length);
		
		//개인적인 실습1. 위치 맞교환 하기 (500, 400, 300, 200, 100)  반복문써서 작성
		
		
	
		
		
//	
		

	}

}
