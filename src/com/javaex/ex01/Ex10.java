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
		//System.out.println(false && true); //false
		//System.out.println(false && false); //false 
		//<--해당코드에 경고뜨는이유: 이미 결과를 알기때문에 뒤에오는 계산은 필요없다고 인식하기떄문 
		
		System.out.println("응용");
		System.out.println( (a>b)&&(a<b) ); // false (f) && (t) --> f
		System.out.println( (a>b)&&(a>b) ); // false (f) && (f) --> f
		
		//논리연산자 기본 '|||'
		System.out.println("|| 연산자");
		//System.out.println(true || true); //true
		//System.out.println(true || false); //true
		//해당식도 마친가지, 공식에따라 계산해볼 필요없음
		System.out.println(false || true); //true
		System.out.println(false || false); //false
		
		
		System.out.println("응용");
		System.out.println( (a>b)||(a<b) ); // false (f) && (t) --> t
		System.out.println( (a>b)||(a>b) ); // false (f) && (f) --> f
		
		//논리연산자 기본 '!'
		System.out.println("! 연산자");
		System.out.println( !(a>b) ); //false -->true
		System.out.println( !(a<b) ); //true -->false
		//<-- 도출된 답에 대해 반대되는 대답이 나옴
		
		/* 예제
		
		1) result = x * y % z – a / b = 5,1,2,4,3
		
				2) m = x + y + z / 3 = 4, 2, 3, 1
				
				3) result = x % y * z = 3, 1, 2
				
				4) x=y=w=z; 오른쪽에서 왼쪽으로 =3, 2, 1 
				
				5) x = y = 3 / 5 * 2 % 6; = 5, 4, 1, 2, 3
				
				6) y = a * x * x + b * x +c = 6, 1, 2, 4, 3, 5
		
		*/
		
	}
	
	
}
