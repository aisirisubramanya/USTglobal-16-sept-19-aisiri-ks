package com.ustglobal.assignment1;

public class Teacher {
	int id;
	String name;
	String sub;
	
	public Teacher(int id, String name, String sub) {
		super();
		this.id = id;
		this.name = name;
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", sub=" + sub + "]";
	}
	
}
