package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근무시간:");
		int time = sc.nextInt();
		int pay = time*10000;
	
		if(8>=pay) {
			System.out.println("임금은 "+pay+"원 입니다." );
		}else{
			int over = 8*10000+(time-8)*15000;
			System.out.println("임금은 "+over+"원 입니다." );
				
			}
		
	
		sc.close();
	}

}
