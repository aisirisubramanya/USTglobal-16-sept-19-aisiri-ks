package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	void display(ArrayList<Student> al) {

		Iterator<Student> it=al.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s);
		}
	}

	void displayFailedStudents(ArrayList<Student> al) {
		List<Student> l=al.stream().filter(student->student.percentage<40).collect(Collectors.toList());
		System.out.println(l);
	}
	
	void displayPassedStudents(ArrayList<Student> al) {
		List<Student> l=al.stream().filter(student->student.percentage>=40).collect(Collectors.toList());
		System.out.println(l);
	}
	
	Comparator<Student> cmp=(stu1,stu2)->{
		if(stu1.percentage>stu2.percentage) {
			return 1;
		}
		else if(stu1.percentage<stu2.percentage) {
			return -1;
		}
		else {
			return 0;
		}	
		};
	
	void topper(ArrayList<Student> al) {
		Student s=al.stream().max(cmp).get();
		System.out.println(s);

	}

}
