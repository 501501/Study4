package com.jeongsol.s2;

import java.util.Scanner;

public class MethodMain1 {

	public static void main(String[] args) {
		System.out.println("Method1 Start");
		Scanner sc = new Scanner(System.in);
		
		Method1 mth1 = new Method1();
		
		// 참조변수명.메서드명();
		// 메서드 호출
		mth1.prn();
		
		// prn2 호출
		int count = sc.nextInt();
		mth1.prn4(count); // 인자값
		
		System.out.println("Method1 Finish");
	}

}
