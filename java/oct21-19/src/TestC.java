
public class TestC {
	public static void main(String[] args) {
		Person p=new Person();

		p.name="megha";
		Person.color="pink";
		p.age=21;

		System.out.println("name is "+p.name);
		System.out.println("color is "+Person.color);
		System.out.println("age is "+p.age);

		p.eat();
		p.walk();
		Person.sleep();

		System.out.println("**************************************");

		Person p1=new Person();

		p1.name="pooja";
		Person.color="red";
		p1.age=21;

		System.out.println("name is "+p1.name);
		System.out.println("color is "+Person.color);
		System.out.println("age is "+p1.age);

		p1.eat();
		p1.walk();
		Person.sleep();



	}
}
