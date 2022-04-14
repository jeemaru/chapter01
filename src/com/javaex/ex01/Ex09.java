package com.javaex.ex01;

public class Ex09 {

	public static void main(String[]args) {
		
		//관계연산자 일반적인 형식
		int n1 = 5;
		int n2 = 3;
		System.out.println(n1<n2); // 5<3 false
		System.out.println(n1>n2); // 5>3 true
		
		//관계연산자 추가적인 형식
		System.out.println(n1<=n2); // 같거나 큰지
		System.out.println(n1<n2); // 다른지
		System.out.println(n1>=n2); // 같거나 큰지
		System.out.println(n1==n2); //같냐
		System.out.println(n1!=n2); //둘이 다른지, 부동호는 항상 뒤에 옴
		
		boolean result = n1>n2;
		System.out.println(result);
	}
}
