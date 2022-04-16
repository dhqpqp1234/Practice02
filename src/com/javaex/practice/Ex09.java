package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		if (num%num2<1) {
			System.out.println(num2+"는(은)"+num+" 의 약수입니다.");
		}else if (num2%num<1){
			System.out.println(num+"는(은)"+num2+" 의 약수입니다.");
		}else if(num%num2>1) {
			System.out.println(num2+"는(은)"+num+" 의 약수가 아닙니다.");
		}else {
			System.out.println(num+"는(은)"+num2+" 의 약수가 아닙니다.");
		}
		sc.close();
	}

}
