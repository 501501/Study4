package com.jeongsol.s2.ex2;

public class StudentSort {
	// sortByAvg
	public Student [] sortByAvg(Student [] students) {
		
		Student [] copy = new Student [students.length];
		for (int i=0; i<students.length; i++) {
			copy[i] = students[i];
		}
		// 정렬
		// 4 
		// 1. 0 - 1, 2, 3
		// 2. 1 - 2, 3
		// 3. 2 - 3
		for (int i=0; i<copy.length-1; i++) {
			for (int j=i+1;j<copy.length;j++) {
				if (copy[i].avg < copy[j].avg) {
					Student tmp = copy[j];
					copy[j] = copy[i];
					copy[i] = tmp;
				}
			}
		}
		return copy;
	}
}
