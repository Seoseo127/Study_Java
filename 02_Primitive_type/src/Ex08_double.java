
public class Ex08_double {

	public static void main(String[] args) {
		// 실수형 double : 8 byte
		// 표시형식 : 숫자.숫자 또는 숫자.숫자 + D 또는 d
		// 참고: 소수점 이하 15자리 까지만 정확도 유지됨
		
		double d1 = 1.1;
		double d2 = 1.12345678901234567890d; //d 안붙여도됨.
		System.out.println("double d1 : " + d1);
		System.out.println("double d2 : " + d2); // 16자리에서 반올림된것임

		
		double sum = d1 + d2;
		System.out.println("d1 + d2 : " + sum);
		System.out.println("3.4d + 3.2d : " + (3.4d + 3.2d));
		System.out.println("double 최소값 : " + Double.MIN_VALUE);
		System.out.println("double 최대값 : " + Double.MAX_VALUE);
		
	}

}
