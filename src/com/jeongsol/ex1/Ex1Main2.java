package com.jeongsol.ex1;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("Main2 Start");
		Pet pet1 = new Pet();
		pet1.name = "지효";
		
		Pet pet2 = new Pet();
		pet2.name = "수비";
		
		Character c1 = new Character();
		c1.p1 = pet1;
		c1.p2 = pet2;
		
		// 베열
		// 배열은 같은 데이터타입만 묶음
		// pet을 담을 수 있는 배열을 선언
		// 모을려고하는 데이터타입 [] 변수명 = new 모으려고하는 데이터타입 [개수];
		Pet [] pets = new Pet[2];
		pets[0] = pet1;
		pets[1] = new Pet();
		pets[1].name = "수비";
		
		for (int i=0;i<pets.length;i++) {
			System.out.println(pets[i].name);
		}
		
		// System.out.println(pets[0].name);
		// System.out.println(pets[1].name);
		
		System.out.println("Main2 Finish");
	}

}
