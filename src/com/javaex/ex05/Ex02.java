package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];// int[] intArray<-- 스택영역에 이름과 공간을 만듦// new int[5];<--힙 영역에 공간 만듦
		
		intArray[0] =3;		//데이터 값을 지정해좀
		intArray[1] =6;
		intArray[2] =9;
		intArray[3] =12;
		intArray[4] =55;
		
		
		/*
		System.out.println(intArray[0]); //해당 값을 불러옴
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		*/
		
		for (int i=0; i<5; i++) {
			System.out.println(intArray[i]);
		}

	}

}
