package com.javaex.ex02;

public class Ex01 {

	public static void main(String[]args) {
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		String s ="한";
		String str = "굿모닝";
		String 김지수 = "김지수";
		
		System.out.println("안녕하세요");
		
		System.out.println(str); // <--문자열 표현
		
		System.out.print("안녕");
		System.out.println("하세요"); // <--ln은 줄을 바꾸나 안바꾸냐 차이
		
		System.out.println(str + str); // +기호로 문장 추가 가능
		System.out.println(str + "안녕하세요"); // 해당 문장도 쌉가능
		
		System.out.println(str + i);
		
		String var01 =str+i; // <--해당값 적용시  String값으로 변형
		
		System.out.println(var01); 
		
		System.out.println(str + " 랑 " + i); //<-- ""가 있으면 내부에있는 공백도 문자로 포함됢ㅁㅁㅁㅁㅁㅁ
		
		System.out.println(str + d);
		
		System.out.println(i + i); 
		System.out.println(d + d); // 같은 정수는 계산이 됩니다요
		
		System.out.println(d + i); // re 정수가 실수로 바뀜 
		
		System.out.println(c);
		System.out.println(c + c);// 해당값은 코드값으로 글자 이미지가 지정되있으므로 숫자로 연산값이 나와버림
		
		System.out.println(s);
		System.out.println(s + s);// 해당값은 코드값이 아니므로 같은 글자가나옴
		
		System.out.print("제이름은 ");
		System.out.print("김지수");
		System.out.println(" 입니다.");
		
		System.out.println("제이름은 "+김지수+" 입니다");
		
		System.out.println("===========");
		
		System.out.println("안녕\n하세요"); // <-- '\n' 줄바꿈 기호
		System.out.println("안녕\t하세요"); // <-- '\t' 일정한 간격으로 띄어써줌
		
		System.out.println("안녕\"하\"세요"); // <-- '\"' 해당 문자열의 따옴표 표시
		System.out.println("안녕\\하\\세요"); // <-- '\\' 해당 부호 표시방법
	}
	
}
