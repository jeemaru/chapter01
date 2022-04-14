package com.javaex.ex01;

public class Ex05 {

	public static void main (String[] arhs) {
		
		//일반적 형식
		final double pi = 3.14;
		double result01 = pi*5*5; //<--자바에서의 제곱은 *로 표기됨
				
		System.out.println(result01);
		
		//pi값이 변경되는 경우
		
		/*
		 * pi = 3.1415926; result01 = pi*5*5; System.out.println(result01);
		 */
		
		//상수로 정의할 경우
		final double PI = 3.14; //<--상수를 정의하면 암묵적으로 해당 선언값 대문자 사용
		double result03 = PI*5*5;
		System.out.println(result03);
		
		//*상수의 값을 변경할려고 할떄
		/*
		PI = 3.1415926; // PI가 상수로 선언되어 변경되지않음
		double result03 = PI*5*5;
		System.out.println(result03);
		 */
		
	}
}
