package com.jeongsol.s1;

import java.util.Scanner;

public class ClassStudy_2 {

	public static void main(String[] args) {
		System.out.println("Study2 Start");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		boolean flag = false;
		
		// 학생의 수 만큼 정보를 입력 - 이름, 번호, 국어, 영어, 수학
		// 총점, 평균
		Student [] students = new Student[count];
		
		for (int i=0;i<students.length;i++) {
			students[i] = new Student();
			//Student student = new Student();
			
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
		
		// 1. 전체 정보 출력
		// 2. 학생 번호 검색
		// 3. 학생 정보 추가 - 학생 한 명을 배열에 추가
		// 4. 성적 순서 출력
		// 5. 프로그램 종료
		
		while (true) {
			System.out.println("1. 전체 정보 출력");
			System.out.println("2. 학생 번호 검색");
			System.out.println("3. 학생 정보 추가");
			System.out.println("4. 성적 순서 출력");
			System.out.println("5. 프로그램 종료");		
			int select = sc.nextInt();
			
			if (select == 1) {
				// 모든 학생의 정보 출력
				for (int i = 0; i < students.length; i++) {
					System.out.println(i + 1 + "번째 학생의 정보");
					System.out.println("이름 : " + students[i].name);
					System.out.println("번호 : " + students[i].num);
					System.out.println("국어 : " + students[i].kor);
					System.out.println("영어 : " + students[i].eng);
					System.out.println("수학 : " + students[i].math);
					System.out.println("총점 : " + students[i].total);
					System.out.println("평균 : " + students[i].avg);
				}
			}
			else if (select ==2) {
				// 선택한 학생의 정보 출력
				System.out.println("선택할 학생의 번호를 입력하세요.");
				int num = sc.nextInt();
				
				for (int i=0; i<students.length; i++) {
					if (num == students[i].num) {
						System.out.println(i + 1 + "번째 학생의 정보");
						System.out.println("이름 : " + students[i].name);
						System.out.println("번호 : " + students[i].num);
						System.out.println("국어 : " + students[i].kor);
						System.out.println("영어 : " + students[i].eng);
						System.out.println("수학 : " + students[i].math);
						System.out.println("총점 : " + students[i].total);
						System.out.println("평균 : " + students[i].avg);
						flag = true;
					}
				}
				if (flag == false) {
					System.out.println("선택한 번호의 학생이 없습니다.");
				}
				flag = false;
			}
			else if (select == 3) {
				// 학생 정보 추가
				Student student = new Student();
				System.out.println("학생의 이름을 입력하세요.");
				student.name = sc.next();
				System.out.println("학생의 번호를 입력하세요.");
				student.num = sc.nextInt();
				System.out.println("학생의 국어 점수를 입력하세요.");
				student.kor = sc.nextInt();
				System.out.println("학생의 영어 점수를 입력하세요.");
				student.eng = sc.nextInt();
				System.out.println("학생의 수학 점수를 입력하세요.");
				student.math = sc.nextInt();
				
				student.total = student.kor+student.eng+student.math;
				student.avg = student.total/3.0;
				
				Student [] new_students = new Student[students.length+1];
				for (int i=0;i<students.length;i++) {
					new_students[i] = students[i];
				}
				new_students[new_students.length-1] = student;
				students = new_students;
			}
			
			else if (select == 4) {
				// 성적 순서 출력
				Student [] new_students1 = new Student[students.length];
				
				// 깊은 복사
				for (int i=0; i<new_students1.length; i++) {
					new_students1[i] = new Student();
					new_students1[i].name = students[i].name;
					new_students1[i].num = students[i].num;
					new_students1[i].kor = students[i].kor;
					new_students1[i].eng = students[i].eng;
					new_students1[i].math = students[i].math;
					new_students1[i].total = students[i].total;
					new_students1[i].avg = students[i].avg;
				}
				
				// 정렬
				for (int idx=0; idx<new_students1.length-1; idx++) {
					for (int i=idx+1;i<new_students1.length;i++) {
						if (new_students1[idx].avg < new_students1[i].avg) {
							double tmp1 = new_students1[i].avg;
							new_students1[i].avg = new_students1[idx].avg;
							new_students1[idx].avg = tmp1;
							
							String tmp2 = new_students1[i].name;
							new_students1[i].name = new_students1[idx].name;
							new_students1[idx].name = tmp2;
							
							int tmp3 = new_students1[i].num;
							new_students1[i].num = new_students1[idx].num;
							new_students1[idx].num = tmp3;
							
							int tmp4 = new_students1[i].kor;
							new_students1[i].kor = new_students1[idx].kor;
							new_students1[idx].kor = tmp4;
							
							int tmp5 = new_students1[i].eng;
							new_students1[i].eng = new_students1[idx].eng;
							new_students1[idx].eng = tmp5;
							
							int tmp6 = new_students1[i].math;
							new_students1[i].math = new_students1[idx].math;
							new_students1[idx].math = tmp6;
							
							int tmp7 = new_students1[i].total;
							new_students1[i].total = new_students1[idx].total;
							new_students1[idx].total = tmp7;
						}
					}
				}
				
				// 출력
				for (int i = 0; i < new_students1.length; i++) {
					System.out.println(i + 1 + "번째 학생의 정보");
					System.out.println("이름 : " + new_students1[i].name);
					System.out.println("번호 : " + new_students1[i].num);
					System.out.println("국어 : " + new_students1[i].kor);
					System.out.println("영어 : " + new_students1[i].eng);
					System.out.println("수학 : " + new_students1[i].math);
					System.out.println("총점 : " + new_students1[i].total);
					System.out.println("평균 : " + new_students1[i].avg);
				}
			}
			
			else {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
