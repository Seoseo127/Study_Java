package com.mystudy.scanner2_cafe;

import java.util.Scanner;

public class Scanner_Cafe {

	public static void main(String[] args) {
		// 카페 음료 주문처리
		// 음료의 종류
		// 1.아메리카노(3000)  2.카페라떼(3500)   3.카페모카(4000)  4. 과일주스(5000)
		//-------------------------
		// 입력값 : 메뉴번호, 주문수량, 입금액(고객이 낸 돈)
		// 처리 : 판매액(단가 * 수량), 잔액(입금액 - 판매액)
		// 출력 : 입금액, 판매액, 잔액
		//------------------------------
		/*
		1.아메리카노(3000)  2.카페라떼(3500)   3.카페모카(4000)  4.과일주스(5000)  0.종료
		> 메뉴선택(1~4) : 1
		> 주문수량 : 3
		> 입금액 : 10000
		----------------
		입금액 : 10000
		판매액 : 9000
		잔액 : 1000
		=================== */
		Scanner scan = new Scanner(System.in);
		
		final int AMERICANO = 3000;
		final int CAFE_LATTE = 3500;
		final int CAFE_MOCA = 4000;
		final int JUICE = 5000;
		int todayIncome = 0;
		
		while (true) {
			System.out.println("1.아메리카노(3000)  2.카페라떼(3500)   3.카페모카(4000)  4.과일주스(5000)  0.종료");
			System.out.print("> 메뉴선택(1~4) : ");
			int select = scan.nextInt();
			//System.out.println("select : " + select);
			
			if (select == 0) {
				System.out.println(">> 영업종료~~~");
				System.out.println(":: 오늘 판매총액 : " + todayIncome);
				break;
			}
			
			System.out.print("> 주문수량 : ");
			int count = scan.nextInt();
			//System.out.println("count : " + count);
			
			System.out.print("> 입금액 : ");
			int inMoney = scan.nextInt();
			//System.out.println("입금액(inMoney) : " + inMoney);
			
			//계산처리(판매액, 잔액)  ----------
			int totMoney = 0;		
	//		if (select == 1) {
	//			totMoney = AMERICANO * count;
	//		} else if (select == 2) {
	//			totMoney = CAFE_LATTE * count;
	//		}
			switch (select) {
			case 1: totMoney = AMERICANO * count; break;
			case 2: totMoney = CAFE_LATTE * count; break;
			case 3: totMoney = CAFE_MOCA * count; break;
			case 4: totMoney = JUICE * count; break;
			}
			//System.out.println("판매액(totMoney) : " + totMoney);
			
			int change = inMoney - totMoney;
			//System.out.println("잔액(change) : " + change);
			
			//일매출 기록
			todayIncome += totMoney;
			
			//계산결과 출력 ----------------
			System.out.println("---------");
			System.out.println("입금액 : " + inMoney);
			System.out.println("판매액 : " + totMoney);
			System.out.println("잔액 : " + change);
			System.out.println();
			System.out.println(":: 오늘 판매총액 : " + todayIncome);
			System.out.println();
			
			
		}
		
		
	}

}






