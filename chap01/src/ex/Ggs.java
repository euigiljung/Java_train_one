package ex;

import java.io.*;

import java.util.Scanner;

public class Ggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
	        while(true){
	            System.out.print("������ ���:");
	            int dan = scan.nextInt();
	            if(!(dan==0)||(dan==1)){
	            System.out.print(dan+"�����");
	            for (int j=1; j<=9; j++)
	            System.out.print(dan+"*"+"="+dan*j+"\n");

	            }
	        
	        else
	        {
	                      System.out.print("���α׷��� �����մϴ�.");
	        break;
	              
	        }      
	}
}
}
