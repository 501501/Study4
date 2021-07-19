package com.jeongsol.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("Ex1 Start");
		
		// 캐릭터 생성
		Character ch = new Character();
		ch.name = "꽃전사";
		ch.level = 1;
		ch.hp = 200;
		ch.mp = 50;		
		System.out.println(ch.weapon);
		
		// 무기 생성
		Weapon weapon = new Weapon();
		weapon.name = "낡은검";
		weapon.damage = 10;
		weapon.critical = 0.4;
		weapon.upgrade = 1;
		
		ch.weapon = weapon;
		// ch가 가지고 있는 무기의 이름을 출력
		System.out.println(ch.weapon.name);
		
		// ch가 가지고 있는 무기의 이름을 변경하고 출력
		ch.weapon.name = "지팡이";
		System.out.println(ch.weapon.name);
		
		weapon.name = "도끼";
		System.out.println(ch.weapon.name);
		
		// 몬스터 생성
		Monster monster = new Monster();
		monster.name = "오크";
		monster.level = 2;
		monster.hp = 300;
		monster.mp = 100;
		monster.gold = 30;
		monster.weapon = new Weapon();
		monster.weapon.name = "몽둥이";
		monster.weapon.damage = 500;
		monster.weapon.critical = 0.8;
		monster.weapon.upgrade = 3;
		
		// ch = monster;	타입이 달라서 에러
		ch.gold = ch.gold + monster.gold;
		
		ch.weapon = monster.weapon;
		
		// 몬스터 무기를 내 무기로 바꾸기
		System.out.println("Name : "+ch.name);
		System.out.println("Level : "+ch.level);
		System.out.println("Hp : "+ch.hp);
		System.out.println("Mp : "+ch.mp);
		System.out.println("Gold : "+ch.gold);
		System.out.println("Weapon : "+ch.weapon.name);
		System.out.println("Weapon.damage : "+ch.weapon.damage);
		
		// monster = null;
		monster = new Monster();
		System.out.println(monster.level);
		
		
		System.out.println("Ex2 Finish");
	}

}
