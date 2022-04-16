package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num = sc.nextInt();
		System.out.println("두번째 숫자: ");
		int num2 = sc.nextInt();
	
		if(num>num2) {
			System.out.println("몫: "+num/num2+"나머지: "+num%num2);
		}else if(num<num2) {
			System.out.println("몫: "+num2/num+"나머지: "+num2%num);
		}else {
			System.out.println("몫: "+ num/num2+"나머지: "+num2%num);
		}
		
		sc.close();
	}

}
