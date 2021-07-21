package com.jeongsol.s2.ex1;

public class PhoneView {
	public void view(Phone phone) {
		// Phone의 정보를 출력하는 메서드
		System.out.println("제조사 : "+phone.company);
		System.out.println("브랜드: "+phone.brand);
		System.out.println("색깔 : "+phone.color);
		System.out.println("크기 : "+phone.size);
		System.out.println("기격 : "+phone.price);
	}
	
	// 핸드폰의 합계 금액을 계산해서 출력 매개변수는 하나만 선언
	public void sumPrice(Phone [] phones) {
		int sum = 0;
		for (int i=0;i<phones.length;i++) {
			sum += phones[i].price;
		}
		System.out.println("최종 가격 : "+sum);
	}
}
