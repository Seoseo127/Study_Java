
public class Ex04_break_continue {

	public static void main(String[] args) {
		// 반복제어문 : break, continue
		// break : 중단하고 빠져나간다(반복을 중단하고 현재 실행중인 반복문 빠져나감)
		// continue : 이어서 다음 반복 처리
		//--------------
		
		
		//1~10까지 출력하되 8은 출력하지 않는다
		System.out.println("------continue 문 사용 안한경우-------");
		for (int i = 1; i<=10; i++) {
			if (i != 8) {
				System.out.print(i + " ");	// print : 가로로 쭉나오게함	
			} 
		}
		System.out.println("-----continue문 사용----"); //단순 줄바꿈처리 기능
		for (int i = 1; i <= 10; i++ ) {
			if( i == 8 ) continue; //다음 반복으로 건너 뜀.
			System.out.println(i + " ");
		}
		
			// \n: 줄바꿈 처리 (new line)
			System.out.println("\n=========");
			
			System.out.println("---break 사용 ---");
			// 1~10 출력중 8을 만나면 처리 중단	
			for (int i = 1; i <=10; i++) {
				if (i == 8) break; //현재 반복문 중단하고 빠져나감.
				System.out.print(i + " ");
			}
		
			
			
			
			
		}
	
}