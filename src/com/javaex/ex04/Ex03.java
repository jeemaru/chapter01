package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("단을 입력해주세요.");
			System.out.print("단: ");
			int x = sc.nextInt();
			
			for (int no=1; no<=9; no++) {
				System.out.println(x+" * "+no+" = "+x*no);
			}
			
			sc.close();
			
	}

}
