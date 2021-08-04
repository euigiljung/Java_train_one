package ex;

import java.io.*;

import java.util.Scanner;

public class Ggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
	        while(true){
	            System.out.print("구구셈 몇단:");
	            int dan = scan.nextInt();
	            if(!(dan==0)||(dan==1)){
	            System.out.print(dan+"단출력");
	            for (int j=1; j<=9; j++)
	            System.out.print(dan+"*"+"="+dan*j+"\n");

	            }
	        
	        else
	        {
	                      System.out.print("프로그램을 종료합니다.");
	        break;
	              
	        }      
	}
}
}
