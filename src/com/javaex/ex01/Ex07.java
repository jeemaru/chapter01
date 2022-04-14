package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[]args) {
		
		double v01 = 5/4; // <--정수는 실수값을 표현 안하니 1로 계산된값이 더블로 처리됨
		System.out.println(v01); 
		//1.25
		double v02 = (double)5 / 4 ; 
		System.out.println(v02);
		//1.25
		double v03 = 5 / (double)4 ; //<-- 더블값이 한곳이라도 있으면 어쩃든 실수를 표현해줘야하므로 실수값으로 나옴
		System.out.println(v03);
		//1.25
		double v04 = (double)5 / (double)4 ; 
		System.out.println(v04);
		//1.25
		int v05 = (int)1.3 + (int)1.8 ; //<-- int는 소수 점을 빼고 툴력하므로 1+1로 계산됨
		System.out.println(v05);
		//2
		
	}

}
