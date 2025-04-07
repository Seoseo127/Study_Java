package array1;

import java.util.Arrays;

public class Ex05_arry_lotto {

	public static void main(String[] args) {
		// 난수 (랜덤값) 생성 - Math.random()
		//0 <= Math.random() < 1 : 0 부터 1미만의 실수값 생성
		// (int)(
		System.out.println("----- Math.random() -----");
		for (int i = 1; i <= 10; i++) {
			double ran = Math.random();
			//System.out.println(ran + " : " + (int)(ran * 2)); //정수부에는 0,1 만 나옴
			//System.out.println(ran + " : " + (int)(ran * 3)); //정수부에는 0,1,2 만 나옴
			//System.out.println((int(ran * 5)); //정수부 : 0,1,2,3,4, 만 나옴
			System.out.println((int)(Math.random() * 45) + " "); // //정수부 : 0 ~ 44
			
			
			
		}
		

		//==============
		//로또 번호 생성기
		//1. int 타입의 숫자 45개를 저장할 수 있는 배열 선언 (balls)
		//2. 초기화 : 1 ~ 45 까지의 숫자(번호)를 입력 
		//3. 충분히 많이 섞고 
		//3-1. : 0~44 임의의 숫자 생성 (Math.random()사용
		//3-2 : 0번 인덱스 위치값 랜덤인덱스 (0~44) 위치값을 서로 맞교환 
		//   0번 인덱스 위치값과 임의의 index번호 위치 서로 맞교환 사용(임의의 index번호 사용)
		//4. 6개 번호를 추출(앞에서부터 6개)
		//--------------------------------------------
		
		
		int[] balls = new int[45];
		System.out.println("balls.length: " +balls.length);
		
		
		for(int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		

		//2. 초기화 : 1 ~ 45 까지의 숫자(번호)를 입력 -> 여기 다시
		System.out.println("---초기화 작업---");
		
		balls[0] =1;
		balls[1] =2;
		balls[2] =3;
		balls[2] =4;


		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}

		
		for(int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();

		System.out.println("--- 충분히 많이 섞고 ----");
		//3. 충분히 많이 섞고
	        //   3-1 : 0~44 임의의 숫자 생성(Math.random() 사용)
			int ran = (int)(Math.random() * 45);
			//ran = 44;
			System.out.println("ran : " + ran);
			
			//   3-2 : 0번 인덱스 위치값과 랜덤인덱스(0~44) 위치값을 서로 맞교환
			int temp = balls[0];
			balls[0] = balls[ran];
			balls[ran] = temp;
			
			for (int i = 0; i < balls.length; i++) {
				System.out.print(balls[i] + " ");
			}
			System.out.println();
			
			
			//4. 6개 번호를 추출(앞에서 부터 6개)
			for (int i = 0; i < 6; i++) {
				System.out.print(balls[i] + " ");
			}
			System.out.println();
			
			System.out.println("------당첨번호 별도 저장하기 ------");
			int[] lottoNums = new int[6];
			for (int i = 0; i < 6; i++) {
				lottoNums[i] = balls[i];
			}
			System.out.println("로또번호 : " + Arrays.toString(lottoNums));
		
		
		
		
		
	}

}
