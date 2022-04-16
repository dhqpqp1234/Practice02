package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int age = 15;
		
		if(0<age && age<18){
			System.out.println("청소년 입니다.");
		}
		
		sc.close();
		
		//if () 괄호안에는 true/false 값만 나와야 하므로 수식을 여러개 쓰면안됨.
		// Scanner 을 입력안햇음
	}

}
