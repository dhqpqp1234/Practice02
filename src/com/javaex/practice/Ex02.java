package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		if(x==0) {
			System.out.println("x는 0이다.");
		}
		
		sc.close();  // if괄호안에 x=0는 0을 x로 대입하란뜻이므로 틀렷음
	}				// (x==0)을 써주는게 맞음  , Scanner 입력

}
