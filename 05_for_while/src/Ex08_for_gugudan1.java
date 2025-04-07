
public class Ex08_for_gugudan1 {

	public static void main(String[] args) {
		/* 화면에 구구단 출력 (for문 사용)
		 2*1=2
		 2*2 = 4  :: 4 =2*2 의 결과값
		 2*3 = 6
		 ...
		 2*9 = 18
		 */

//	me	int starCnt = 1;
//		for (line = 1; line <= 9; line++) {
//			for ( int star = 1; star <= starCnt; star++) {
//				System.out.println("2*" + num  );
//				}
		
		
		System.out.println("2*" + 1 + "=" + (2 * 1));
		System.out.println("2*" + 2 + "=" + (2 * 2));
		System.out.println("2*" + 3 + "=" + (2 * 3));
		System.out.println("2*" + 4 + "=" + (2 * 4));
		System.out.println("--------");
		
		int dan = 2;
		System.out.println("---" + dan +"단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
		System.out.println("==========");
		
		System.out.println("---- 2 ~ 9 단까지 출력(세로) ----");
		
		
		dan = 2;
		System.out.println("---" + dan +"단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
		System.out.println("==========");
		
		dan = 3;
		System.out.println("---" + dan +"단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println( dan +"*" + i + "=" + (dan*i));
		}
		System.out.println("==========");
		
		dan = 4;
		System.out.println("---" + dan +"단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println( dan +"*" + i + "=" + (dan*i));
		}
		System.out.println("==========");
		
		dan = 5;
		System.out.println("---" + dan +"단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println( dan +"*" + i + "=" + (dan*i));
		}
		System.out.println("==========");
		
		dan = 6;
		System.out.println("---" + dan +"단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println( dan +"*" + i + "=" + (dan*i));
		}
		System.out.println("==========");
		
		dan = 7;
		System.out.println("---" + dan +"단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println( dan +"*" + i + "=" + (dan*i));
		}
		System.out.println("==========");
		
		dan = 8;
		System.out.println("---" + dan +"단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println( dan +"*" + i + "=" + (dan*i));
		}
		System.out.println("==========");
		
		dan = 9;
		System.out.println("---" + dan +"단 출력---");
		for (int i = 1; i <= 9; i++) {
			System.out.println( dan +"*" + i + "=" + (dan*i));
		}
		
		
		System.out.println("======2 ~ 9단 출력(중첩반복문)");
		
		// 내가한거
		dan = 2;
		for (int line = 1; line <= 9; line++) {
			for (int gop = 1; gop <= 9; gop++) {
				System.out.println(dan +"*" + gop + "=" + (dan*gop));
			}
			dan++;
		}
			
		
		for (dan = 2; dan <= 9; dan++) {
			System.out.println("\n- " + dan + "단 -");
			for (int gop = 1; gop <= 9; gop++) {
				System.out.println(dan + "*" + gop + "=" + (dan * gop));
		} 
			}
		
			
		
		
		
		
		
		}
	}


