
public class Ex02_char {

	public static void main(String[] args) {
		// 문자형(char) : 2 byte 사용, 문자 1글자 저장(0~65535)
		// 자바 문자처리 방식은 유니코드(Unicode) 형태 - 2byte 사용(UTF-16)
		//-------
		// UTF-16 : 모든 문자를 2byte로 표현 (고정길이)
		// UTF-8 : 가장 많이 사용되는 가변 길이 유니코드 방식
		// 가변길이 : 1, A = 1byte 사용, 한글 = 3 byte 사용 
		char char1 ='A'; //"A" 문자열(String), 'A'는 문자(char)
		System.out.println("char1 : " + char1);
		System.out.println("char1 다음문자 : " +(char1 + 1));
	//	System.out.println("char1 다음문자 : " +(char)(char + 1)); // 65+1 -> 66 char 변환
		
	//	char char2 = "한"
	//	System.out.println("char2 : " + char2);
		
	//	char char3 = '역슬래시ACC00'; //유니코드값으로 설정
	//	System.out.println("char3 : " + char3); //가
		
		
				
		
	} //main 의 끝

} //class의 끝
