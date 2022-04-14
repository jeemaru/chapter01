package com.javaex.ex01;

public class Ex06 {

	public static void main(String[]args) {
		
		
		//자동형변환
		System.out.println(2+3.5);
		
		double var01 = 2+3.5;//<-- 숫자2가 내부에서 2.0으로 자동변환,계산됨
		System.out.println(var01);
		
		//자동형변환
		long var02 = 12345l;
		float var03 = 1.1f;
		System.out.println(var02+var03);
		
		float result = var02 + var03; //<-- 정수형+실수형 값이 더해지면 실수형으로 담겨짐
		System.out.println(result);
		
		//강제형변환
		float var04 = 1112.6345f; //<-- 소수점을 버리는 결과값이 나옴
		int var05 = (int)var04;// 사용되는 바이트수에따라 축소시켜 표현할경우 해당 자료가 손실된가능성이 있음
		System.out.println(var05);// 하지만 바이트수를 확대시켜 사용할 경우는 상관없음...!
		
		//축소변환 - 정상출력		
		int v01 = 10;// <-- 자료손실 우려 있음
		byte v02 = (byte)v01;
		System.out.println(v02);
		
		//축소변환 - 비정상출력
		int v03 = 203029770;// <-- 자료손실 됨
		byte v04 = (byte)v03;
		System.out.println(v04);
		
		//확대변환
		byte v05 = 20;
		int v06 = (int)v05;
		System.out.println(v06);
		
		byte v07 = 127;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//실수 --> 정수
		double v09 = 5.57; // <-- 정수값 적용시 소수점은 버려져서 나옴
		int v10 = (int)v09;
		System.out.println(v10);
		
		//정수 --> 실수
		int v11 = 7; // <-- 실수값 적용시 소수점자리를 표기해줌
		double v12 = (double)v11;
		System.out.println(v12);
		
		// System.out.println(); sysout입력후 컨트롤 스페이스 자동완성 - 이클립스용
		//ctrl+d 한줄 지우기
		
	}
}
