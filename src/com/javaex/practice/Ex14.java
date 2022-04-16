package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		int won = sc.nextInt();
		double tax = 0.09*won;
		double tax1 = (1000*0.09)+0.18*(won-1000);
		double tax2 = (1000*0.09)+(3000*0.18)+0.27*(won-4000);
		double tax3 = (1000*0.09)+(3000*0.18)+(4000*0.27)+0.36*(won-8000);
		
		
		if(won>=0 && won<=1000) {
			System.out.println("소득세는 "+tax+" 입니다.");
		}else if(won>1000 && won<=2000) {
			System.out.println("소득세는 "+tax1+ " 입니다.");
		}else if(won>4000 && won<8000) {
			System.out.println("소득세는 "+tax2+" 입니다.");
		}else if(won>=8000) {
			System.out.println("소득세는 "+tax3+" 입니다.");
		}else if (won<0) {
			System.out.println("잘못 입력했습니다.");
		}
		sc.close();
	}
}
