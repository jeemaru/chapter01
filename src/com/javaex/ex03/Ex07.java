package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		
		if(point>=90) {
			System.out.println("A등급");
		}else if(point>=80) {
			System.out.println("B등급");
		}else if(point>=70) {
			System.out.println("c등급");
		}else if(point>=60) {
			System.out.println("D등급");
		}else{
			System.out.println("F등급");
		}
		
		sc.close();

	}

}
