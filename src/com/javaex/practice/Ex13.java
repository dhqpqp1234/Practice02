package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.println("숫자: ");
		int num =sc.nextInt();
		
		int num2;
		
		if(num<=0) {
			num2 = (num*num*num)-(num*9)+2;
			System.out.println("계산결과는 "+(double)num2+" 입니다.");
		}else{
			num2 = (num*7)+2;
			System.out.println("계산결과는 "+(double)num2+" 입니다.");
			}
		sc.close();
	}

}
