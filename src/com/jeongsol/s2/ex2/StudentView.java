package com.jeongsol.s2.ex2;

public class StudentView {
	
	// 메서드명 viewOne
	// menu에서 2번 선택 시 실행하는 메서드
	// 학생 한 명 정보 출력
	public void viewOne(Student student) {
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("================================================================");
		System.out.print(student.name+"\t");
		System.out.print(student.num+"\t");
		System.out.print(student.kor+"\t");
		System.out.print(student.eng+"\t");
		System.out.print(student.math+"\t");
		System.out.print(student.total+"\t");
		System.out.println(student.avg);
		System.out.println("================================================================");
	}
	
	
	// 메서드명이 viewAll 
	// menu에서 1번 선택 시 실행하는 메서드
	// 전체 학생 정보 출력
	public void viewAll(Student [] students) {
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("================================================================");
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].name+"\t");
			System.out.print(students[i].num+"\t");
			System.out.print(students[i].kor+"\t");
			System.out.print(students[i].eng+"\t");
			System.out.print(students[i].math+"\t");
			System.out.print(students[i].total+"\t");
			System.out.println(students[i].avg);
			System.out.println("================================================================");
		}
	}
}
