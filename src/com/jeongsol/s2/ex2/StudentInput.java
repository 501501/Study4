package com.jeongsol.s2.ex2;

import java.util.Scanner;

public class StudentInput {
	
	// addArray
	// 1. 새로운 배열 생성, 길이는 기존 배열보다 1칸 많게
	// 2. 기존 배열의 값을 복사
	public Student [] addArray(Student [] students) {
		Student [] new_students = new Student[students.length+1];
		for (int i=0;i<students.length;i++) {
			new_students[i] = students[i];
		}
		return new_students;
	}
	
	
	// makeStudent
	// 학생 한 명 생성
	// 이름, 번호, 국어, 영어, 수학 입력받고
	// 총점, 평균
	public Student makeStudent() {	
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("이름을 입력하세요.");
		student.name = sc.next();
		System.out.println("번호를 입력하세요.");
		student.num = sc.nextInt();
		System.out.println("국어 점수를 입력하세요.");
		student.kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		student.eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		student.math = sc.nextInt();
		student.total = student.kor+student.eng+student.math;
		student.avg = student.total/3.0;
		
		return student;
	}
}
