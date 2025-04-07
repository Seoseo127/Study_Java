
public class Ex09_for_gugudan2 {

	public static void main(String[] args) {
		// 가로방향 구구단 출력
		/* 실습 : 구구단 2~9딘 출력(가로방향)
		2*1=2   3*1=3   ...  9*1=9
		2*2=4   3*2=6   ...  9*2=18
		2*3=6   3*3=9   ...  9*3=27
		...
		2*9=18  3*9=27  ...  9*9=81
		
		---------------*/
		
		System.out.println("*" + " " + "*" + " " + "*");
		// \t : 탭(tab) 간격 위치
		System.out.println("*" + "\t" + "*" + "\t" + "*"); // \t 은 8칸 떨어짐
		System.out.println("2*1=2" + "\t" +"3*1=3" + "\t" + "4*1=4");
		System.out.print("2*1=2" + "\t");
		System.out.print("3*1=3" + "\t");
		System.out.println();
		System.out.println("--------------");
		
		
		for (int gop = 1; gop <= 9; gop++) {     // 한줄을 별 하나로 본것
			System.out.println("2*" +gop+ "="+ (2 * gop) + "\t" +"3*" +gop+ "=" +(3*gop) + "\t" + "4*" +gop+ "="+ (4*gop));
		}
		
		System.out.println("-----------------");
		
		for (int gob = 1; gob <=9; gob++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan+"*"+ gob +"=" +(dan*gob) + "\t");
			} 
		}
		System.out.println();
			
			
		System.out.println("---------"); //선생님설명
		
		System.out.print(2 +"*"+ 1 + "=" + (2 * 1) + "\t");
		System.out.print(3 +"*"+ 1 + "=" + (3 * 1) + "\t");
		System.out.print(4 +"*"+ 1 + "=" + (4 * 1) + "\t");
		System.out.println();
		System.out.println("----------");
		
		for (int gob = 1; gob<=9; gob++) {
			for (int dan = 2; dan <=9; dan++ ) {
			System.out.print( dan +"*"+ gob + "=" + (dan * gob) + "\t");
		}
			System.out.println();
		}
	
		System.out.println("---------");
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}
