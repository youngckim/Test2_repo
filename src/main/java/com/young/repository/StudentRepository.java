package com.young.repository;

import com.young.pk1.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
	
	List<Student> sList = new ArrayList<Student>();
	
	public List<Student> getStudentList(int nCount) {
		for (int i=1; i <= nCount; i++) {
			sList.add(new Student(i, "Student" + i));
		}
		return sList;
	}

}
