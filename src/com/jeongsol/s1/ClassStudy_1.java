package com.jeongsol.s1;

public class ClassStudy_1 {

	public static void main(String[] args) {
		// 메인 메서드의 용도는 프로그램을 시작하는 용도
		// 또는 메서드 테스트 용도
		
		System.out.println("Study1 Start");
		// 학생 1명 생성
		// 클래스명(데이터타입) 변수명(참조변수명) = new 클래스명();
		Student st = new Student();
		
		Student st2 = new Student();
		
		System.out.println(st);
		System.out.println(st2);
		
		System.out.println(st==st2);
		
		// 멤버의 접근 (사용)
		// 참조변수명.멤버변수명
		st.name = "iu";
		st.num = 1;
		st.kor = 30;
		st.eng = 40;
		st.math = 45;
		
		// st의 총점을 게산해서 입력하고 출력
		st.total = st.kor+st.eng+st.math;
		// st의 평균을 계산해서 대입하고 출력
		st.avg = st.total/3.0;
		
		System.out.println(st.name);	
		System.out.println(st.total);
		System.out.println(st.avg);
		
		st2.num = 1;
		System.out.println(st.num == st2.num);
		
		st2 = st;
		
		System.out.println("Study1 Finish");
	}

}
