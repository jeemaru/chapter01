package com.javaex.ex01;

public class Ex08 {

	public static void main(String[]args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		
		
		//산술연산자
		System.out.println(a+b); // 9
		System.out.println(a-b); // 5
		System.out.println(a*b); // 14
		System.out.println(a/b); // 3 정수/정수-->정수(몫)
		System.out.println(a%b); // 1 나머지값 
		
		//산술연산자 -자세히-
		System.out.println(7/2); //3
		System.out.println(7.0/2.0); //3.5
		System.out.println(7%2); // 1
		System.out.println(7.0%2.0); // 1.0
		
		//부호 연산자
		System.out.println("===========");
		int var = -3; //같은 부호표시 적용시 양수로 적용 수학이랑 같음
		int pvar = +var; 
		int mvar = -var;
		System.out.println(pvar); //-3
		System.out.println(mvar); //+3
		System.out.println("===========");
		
		//증감연산자
		System.out.println("증감연산자");
		System.out.println(a);
		System.out.println(++a); //저장된 값+1 적용
		System.out.println(a); //도출결과 실제로 1이 증가됨
		
		System.out.println(b);
		System.out.println(--b);//저장된 값 -1 적용
		System.out.println(b);//도출경과 실제로 -1이 적용
		
		System.out.println("==========="); // ++값을 뒤에 적용할경우 해당값을 가장 마지막에 적용함, 값출력>값적용 
		System.out.println(a); //현재 8
		System.out.println(a++);//뒤에 ++값 적용
		System.out.println(a);//9값이 나옴, 값 +1 적용됨 
		
		System.out.println("===========");
		System.out.println(b); //현재1
		System.out.println(b--); //--값 현재1(출력을 하지않아 1로 나타내고, 계산은 된 상태)
		System.out.println(b); //현재0
		//--나 ++값을 뒤에 적용할경우 해당 값이 적용은되나 시각적으로 나타내지 않으며, 다음 해당 값을 출력해야 적용된값이 나옴
		
	} 
}
