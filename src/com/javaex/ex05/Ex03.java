package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] nums = new int[8];
		/*
		nums[0] = (int)(Math.random()*45)+1;
		nums[1] = (int)(Math.random()*45)+1;
		nums[2] = (int)(Math.random()*45)+1;
		nums[3] = (int)(Math.random()*45)+1;
		nums[4] = (int)(Math.random()*45)+1;
		nums[5] = (int)(Math.random()*45)+1;
		*/
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*45)+1;; //출력은 되지만 규칙이 다르면 해당식은 사용하기 힘들다
		}
		System.out.println("===========");
		
		
		System.out.println(nums[4]);
		System.out.println(nums[7]);
		System.out.println("========");
		
		
		for(int i=0; i<nums.length; i++) {
			System.out.print("   "+nums[i]);
		}
		

	}

}
