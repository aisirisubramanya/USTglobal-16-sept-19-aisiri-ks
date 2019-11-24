
public class StudentMain {
public static void main(String[] args) {
	Student s =new Student();
	Student.cname="jspiders";
	s.name="aisiri";
	s.usn=1;
	System.out.println("college name is "+Student.cname);
	System.out.println("name is "+s.name);
	System.out.println("ID is "+s.usn);
}
}
