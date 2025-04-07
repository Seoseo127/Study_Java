package array1;

public class Ex03_arry3_star {

	public static void main(String[] args) {
		/* *별찍기
		*
		**
		***
		****
		*****
		---------------*/
		
		//char 타입의 데이터를 5개 저장할 수 있는 배열을 만들고 
		//배열 데이터를 위의 모양으로 출력하자.
		char[] ch = {'0', '1', '2', '3', '4'};
		//ch = {'!', '@', '#', '$', '%'};
		
		
	   // 순서 1.
//		for (int j = 1; j <= 5; j++) {
//			for (int i = 0; i <= ch.length; i++) {
//				System.out.print(ch[i]);
//			} 
//			System.out.println();
//		}
		
		int num = 1;
		for (int j = 1; j <= ch.length; j++) {
			for (int i = 0; i < num; i++) {
				System.out.print(ch[i]);
			} 
			System.out.println();
			num++;
		}
		
		
		System.out.println("----우연찮게 같기에 line 으로 써도 됨----");
	
		for (int line = 1; line <= 5; line++) {
			for (int i = 0; i < line; i++) {
				System.out.print(ch[i]);
			} 
			System.out.println();
			num++;
		}

		

		
	}
}