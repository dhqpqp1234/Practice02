package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		String sign = "";
		
		Scanner sc = new Scanner(System.in);
			System.out.println("출력되는 내용을 입력하세요");
			System.out.print("기호: ");
		sign = sc.nextLine();
			System.out.println("숫자1: ");
		num1 = sc.nextInt();
			System.out.println("숫자2: ");
		num2 = sc.nextInt();
		
		if(sign.equals("+")) {
			System.out.println("결과는: "+(double)(num1+num2));	
		}else if(sign.equals("-")) {
			System.out.println("결과는: "+(double)(num1-num2));	
		}else if(sign.equals("*")) {
			System.out.println("결과는: "+(double)(num1*num2));
		}else if(sign.equals("/")) {
			System.out.println("결과는: "+(double)num1/num2);
		}else if(sign.equals("%")) {
			System.out.println("계싼할 수 없는 기호입니다.");
		}else if(num1%num2==0){
			System.out.println("계산할 수 없습니다.");
		}
		
		// 다시해볼 예정입니다.
		sc.close();
		
			}

}
