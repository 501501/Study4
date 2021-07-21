package com.jeongsol.s2.ex2;

import java.util.Scanner;

public class StudentController {
	// 메서드명 start
	// 1. 전체 정보 출력
	// 2. 학생 번호 검색
	// 3. 학생 정보 추가 - 학생 한 명을 배열에 추가
	// 4. 성적 순서 출력
	// 5. 프로그램 종료

	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentView sv = new StudentView();
		StudentInput si = new StudentInput();
		StudentSort ss = new StudentSort();
		
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();

		// 학생의 수 만큼 정보를 입력 - 이름, 번호, 국어, 영어, 수학
		// 총점, 평균
		Student[] students = new Student[count];

		for (int i = 0; i < students.length; i++) {
			// Student student = si.makeStudent();
			// students[i] = student;
			students[i] = si.makeStudent();
		}

		boolean flag = true;

		while (flag) {
			System.out.println("1. 전체 정보 출력");
			System.out.println("2. 학생 번호 검색");
			System.out.println("3. 학생 정보 추가");
			System.out.println("4. 성적 순서 출력");
			System.out.println("5. 프로그램 종료");
			int select = sc.nextInt();

			switch (select) {

			case 1:
				// 전체 정보 출력
				sv.viewAll(students);
				break;

			case 2:
				// 학생 번호 검색
				System.out.println("선택할 학생의 번호를 입력하세요.");
				int num = sc.nextInt();

				Student student = null;
				for (int i = 0; i < students.length; i++) {
					if (students[i].num == num) {
						student = students[i];
						break;
					}
				}
				if (student != null) {
					sv.viewOne(student);
				}
				break;

			case 3:
				// 학생 정보 추가
				// 마지막 칸에 st를 대입
				Student st = si.makeStudent(); // 새로 생성한 배열
				
				// 기존 배열에 덮어씌우는 경우
				students = si.addArray(students);
				students[students.length-1] = st;
				
				// 새로운 배열을 반드는 경우
//				Student [] new_students = si.addArray(students);
//				new_students[new_students.length - 1] = st;
//				students = new_students;
				break;

			case 4:
				// 성적 순서 출력
				Student [] sort = ss.sortByAvg(students);
				sv.viewAll(sort);
				break;

			case 5:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			}
		}
	}
}
