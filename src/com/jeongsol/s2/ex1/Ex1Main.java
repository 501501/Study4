package com.jeongsol.s2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("Ex1 Start");		
		
		PhoneView phoneView = new PhoneView();

		Phone phone = new Phone();
		phone.company = "SAMSUNG";
		phone.brand = "Galaxy 20";
		phone.color = "Pink";
		phone.size = 15;
		phone.price = 970000;
		
		Phone phone2 = new Phone();
		phone2.company = "Apple";
		phone2.brand = "iphone13";
		phone2.color = "silver";
		phone2.size = 5;
		phone2.price = 2000000;
		
		phoneView.view(phone);

		Phone [] phones = new Phone[2];
		phones[0] = phone;
		phones[1] = phone2;
		
		phoneView.sumPrice(phones);
		
		System.out.println("Ex2 Finish");
	}

}
