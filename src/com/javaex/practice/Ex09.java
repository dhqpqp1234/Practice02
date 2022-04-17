package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num1 = sc.nextInt();
		
		if (num%num1<1 && num1<num) {
			System.out.println(num1+"는(은)"+ num+"의 약수입니다.");
		}else if(num%num1>=1 && num1<num) {
			System.out.println(num1+"는(은)"+ num+"의 약수가아닙니다.");
		}else if (num1%num<1 && num<num1) {
			System.out.println(num+"는(은)"+ num1+"의 약수입니니다.");
		}else {
			System.out.println(num+"는(은)"+ num1+"의 약수가아닙니다.");
		}
		sc.close();
	}

}
