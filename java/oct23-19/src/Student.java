
public class Student {
	String name;
	int rollno;
	final String cname="Jspiders";
	final int cid;
	
	Student(){
		this.cid=111;
	}
	
	Student(String name,int rollno,int cid){
		this.name=name;
		this.rollno=rollno;
		this.cid=cid;
	}
	
	final void printDetails() {
		System.out.println("hi "+name+" welcome to "+cname);
	}
	
	final void printDetails(String name) {
		System.out.println("hi "+name+" welcome to "+cname);
	}
}
