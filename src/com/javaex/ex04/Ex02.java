package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요.");
		System.out.print("단: ");
		int x = sc.nextInt();
		
		int no = 1; // 초기값
		
		while (no<=9) { // 조건식
			System.out.println( x +" * "+ no +" = "+ x*no);
			no++; // 증강식
		}
		
			
			
			
		sc.close();	
	}

}
