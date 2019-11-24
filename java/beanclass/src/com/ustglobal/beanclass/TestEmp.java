package com.ustglobal.beanclass;

public class TestEmp {
	public static void main(String[] args) {
		Employee s=new Employee();
		s.setId(12);
		s.setName("kull's");
		s.setSalary(15000);
		s.setDept("development");
		s.setDesignation("developer");
		
		EmpDB d=new EmpDB();
		d.receive(s);
	}
}
