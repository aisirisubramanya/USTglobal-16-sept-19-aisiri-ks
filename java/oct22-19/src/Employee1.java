
public class Employee1 {
	String name;
	int eid;
	
	Employee1(String name,int eid){
		this.name=name;
		this.eid=eid;
		
	}
	
	void printDetails() {
		
		System.out.println("employee name is "+name);
		System.out.println("employee id is "+eid);
		this.sayHello();
		
	}
	
	void sayHello() {
		
		System.out.println("Hello "+name+" welcome to UST global company");
		
	}
	
	public static void main(String[] args) {
		
		Employee1 e=new Employee1("beena",101);
		e.printDetails();
		
		Employee1 e1=new Employee1("pavan",102);
		e1.printDetails();
		
		Employee1 e2=new Employee1("pradhan",103);
		e2.printDetails();
	}



}
