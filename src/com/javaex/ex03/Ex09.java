package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.c 3.c++ 4.파이썬)");
		System.out.print("과목번호:");
		int cl = sc.nextInt();
		
		if(cl==1) {
			System.out.print("R101호");
		}else if (cl==2){
			System.out.print("R202호");
		}else if (cl==3) {
			System.out.print("R303호");
		}else if (cl==4) {
			System.out.print("R404호");
		}else {
			System.out.print("상담원에게 문의하세요");
		}
		


		
		sc.close();

	}

}
