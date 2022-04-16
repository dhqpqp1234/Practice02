package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		age = sc.nextInt();
		
		if(age>20) { // age가 20미만일경우 1번그룹 20초과일경우 2번그룹
			System.out.print("\"1번그룹\"");	
		}else {
			System.out.print("\'2번그룹\'");
		}
		System.out.print("입니다.");
		// int age가 Scanner안에 들어와야하고
		//\"1번그룹\" 는 글자 양옆으로 큰따옴표를 입력
		//\'1번그룹\' 는 글자 양옆으로 작은따옴표를 입력
		// 1번그룹과 2번그룹을 print 로써서 입니다와 붙엿음
		sc.close();
	}

}
