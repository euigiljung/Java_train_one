package chap04;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금| 2. 출근 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
	
			//작성 위치
		}
		
		int inNum = scanner.nextInt();
		int myMoney = 0;
		
		
		switch(inNum) {
			
			case 1:
				 System.out.println("예금액>");
				 myMoney = scanner.nextInt();
				 balance+= myMoney;
				break;
			case 2:
				 System.out.println("출금액>");
				 balance-= myMoney;

				break;
			case 3:
				 System.out.println("잔금액>+ balance");
				break;
			case 4:
				 run=false;
				//break;
				
		}
		
		
		
		System.out.println("프로그램 종료");
		scanner.close();
		
		}
	}


