package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근무시간: ");
		int time = sc.nextInt();

		if(8>=time) {
			long pay = time*10000;
			System.out.println("임금은 "+pay+"원 입니다." );
		}else{
			long pay = 8*10000+(time-8)*12000;
			System.out.println("임금은 "+pay+"원 입니다." );
		}
		
		
		
		sc.close();
		

	}

}
