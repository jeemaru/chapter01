package com.javaex.ex01;

public class Ex10 {

	public static void main(String[]args) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리연산자 기본 '&&&'
		System.out.println("&& 연산자");
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false 
		//<--해당코드에 경고뜨는이유: 이미 결과를 알기때문에 뒤에오는 계산은 안해도 됨
		
		System.out.println("응용");
		System.out.println( (a>b)&&(a<b) ); // false (f) && (t) --> f
		System.out.println( (a>b)&&(a>b) ); // false (f) && (f) --> f
		
		//논리연산자 기본 '|||'
		System.out.println("|| 연산자");
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		//해당식도 마친가지, 공식에따라 계산해볼 필요없음
		System.out.println(false || true); //true
		System.out.println(false || false); //false
		
		
		System.out.println("응용");
		System.out.println( (a>b)||(a<b) ); // false (f) && (t) --> t
		System.out.println( (a>b)||(a>b) ); // false (f) && (f) --> f
		
		//논리연산자 기본 '!'
		System.out.println("! 연산자");
		System.out.println( !(a>b) ); //false -->true
		System.out.println( (a<b) ); //true -->false
		//<-- 도출된 답에 대해 반대되는 대답이 나옴
	}
	
	
}
