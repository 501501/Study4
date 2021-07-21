package com.jeongsol.s2.ex2;

public class StudentSort {
	// sortByAvg
	public Student [] sortByAvg(Student [] students) {
		// 정렬
		// 4 
		// 1. 0 - 1, 2, 3
		// 2. 1 - 2, 3
		// 3. 2 - 3
		for (int i=0; i<students.length-1; i++) {
			for (int j=i+1;j<students.length;j++) {
				if (students[i].avg < students[j].avg) {
					Student tmp = students[j];
					students[j] = students[i];
					students[i] = tmp;
				}
			}
		}
		return students;
	}
}
