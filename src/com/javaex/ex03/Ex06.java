package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int x3 = sc.nextInt();
		int point = x3%3;
		
		if(point==0) {
			System.out.println(point+"은(는) 3의 배수 입니다.");
		}else{
			System.out.println(x3+"은(는) 3의 배수가 아닙니다.");
		}
		//3의배수의 나머지값이 0인것만 추려서 값을 도출해냄..
		
		sc.close();
		
	}

}
