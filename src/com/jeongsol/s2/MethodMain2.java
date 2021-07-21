package com.jeongsol.s2;

import java.util.Random;

public class MethodMain2 {

	public static void main(String[] args) {
		Method2 m2 = new Method2();
		m2.t1(); //void
		String name = m2.t2(); //""
		System.out.println(name);
		
		int num = m2.t3(1234567, 7894534); //int
		System.out.println(num);
		
		int [] ar = m2.t4();
		
		Random random = new Random();
		int r = random.nextInt();
		System.out.println(r);
	}

}
