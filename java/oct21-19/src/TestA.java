
public class TestA {
	public static void main(String[] args) {
		Pen p=new Pen();

		p.cost=100;
		p.color="blue";
		p.brand="parker";

		System.out.println("cost is "+p.cost);
		System.out.println("color is "+p.color);
		System.out.println("brand is "+p.brand);

		p.write();

		System.out.println("**************************************");

		Van v=new Van();

		v.cost=100000;
		v.color="white";

		System.out.println("cost is "+v.cost);
		System.out.println("color is "+v.color);
		v.move();

		System.out.println("**************************************");

		Van v1=new Van();

		v1.cost=200000;
		v1.color="gray";

		System.out.println("cost is "+v1.cost);
		System.out.println("color is "+v1.color);
		v1.move();
			
	}

}
