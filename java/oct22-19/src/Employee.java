
public class Employee {
	
	String name;
	int eid;
	
	Employee(String empname,int empeid){
		name=empname;
		eid=empeid;
	}
	
	void printDetails() {
		
		System.out.println("employee name is "+name);
		System.out.println("employee id is "+eid);

	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee("megha",101);
		e.printDetails();
		
		Employee e1=new Employee("pooja",102);
		e1.printDetails();
		
		Employee e2=new Employee("likith gowda",111);
		e2.printDetails();
	}
}
