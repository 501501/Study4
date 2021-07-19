package com.jeongsol.s1;

import java.util.Scanner;

public class ClassStudy_2 {

	public static void main(String[] args) {
		System.out.println("Study2 Start");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		
		// 학생의 수 만큼 정보를 입력 - 이름, 번호, 국어, 영어, 수학
		// 총점, 평균
		Student [] students = new Student[count];
		
		for (int i=0;i<students.length;i++) {
			students[i] = new Student();
			Student student = new Student();
			
			System.out.println("이름을 입력하세요.");
			students[i].name = sc.next();
			System.out.println("번호를 입력하세요.");
			students[i].num = sc.nextInt();
			System.out.println("국어 점수를 입력하세요.");
			students[i].kor = sc.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			students[i].eng = sc.nextInt();
			System.out.println("수학 점수를 입력하세요.");
			students[i].math = sc.nextInt();
			
			students[i].total = students[i].kor+students[i].eng+students[i].math;
			students[i].avg = students[i].total/3.0;
			
			//students[i] = student;
		}
		
		// 모든 학생의 정보 출력
		for (int i=0;i<students.length;i++) {
			System.out.println(i+1+"번째 학생의 정보");
			System.out.println("이름 : " + students[i].name);
			System.out.println("번호 : " + students[i].num);
			System.out.println("국어 : " + students[i].kor);
			System.out.println("영어 : " + students[i].eng);
			System.out.println("수학 : " + students[i].math);
			System.out.println("총점 : " + students[i].total);
			System.out.println("평균 : " + students[i].avg);
		}
		
		System.out.println("Study2 Finish");
	}

}
