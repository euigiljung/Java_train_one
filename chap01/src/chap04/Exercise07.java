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
			System.out.println("1. ����| 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("--------------------------------");
			System.out.print("����>");
	
			//�ۼ� ��ġ
		}
		
		int inNum = scanner.nextInt();
		int myMoney = 0;
		
		
		switch(inNum) {
			
			case 1:
				 System.out.println("���ݾ�>");
				 myMoney = scanner.nextInt();
				 balance+= myMoney;
				break;
			case 2:
				 System.out.println("��ݾ�>");
				 balance-= myMoney;

				break;
			case 3:
				 System.out.println("�ܱݾ�>+ balance");
				break;
			case 4:
				 run=false;
				//break;
				
		}
		
		
		
		System.out.println("���α׷� ����");
		scanner.close();
		
		}
	}


