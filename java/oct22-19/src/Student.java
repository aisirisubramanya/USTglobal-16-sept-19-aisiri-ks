
public class Student {
	String name;
	int usn;
	String branch;
	int age;
	String cname;
	public Student(String name,int usn,String branch,int age,String cname) {
		this.name=name;
		this.usn=usn;
		this.branch=branch;
		this.age=age;
		this.cname=cname;
	}
	void display() {
		System.out.println("name:"+name);
		System.out.println("usn:"+usn);
		System.out.println("branch:"+branch);
		System.out.println("age:"+age);
		System.out.println("cname:"+cname);
		System.out.println("******************************");

	}
	public static void main(String[] args) {
		Student s1=new Student("megha", 1, "cs", 21, "aiet");
		Student s2=new Student("akshatha", 2, "cs", 21, "ait");
		Student s3=new Student("nanda",3, "ec", 24, "sit");
		Student s4=new Student("likith", 4, "civil", 21, "ait");
		Student s5=new Student("prajwal",5, "mech", 21, "ait");
		Student s6=new Student("supritha", 6, "is", 21, "ait");
		Student s7=new Student("sandhya",7, "civil", 21, "ait");
		Student s8=new Student("harshitha", 8, "ec", 21, "east-west");
		Student s9=new Student("pooja", 9, "cs", 21, "mit");
		Student s10=new Student("rizwan", 10, "cs", 21, "ait");
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		s6.display();
		s7.display();
		s8.display();
		s9.display();
		s10.display();
	}
}
