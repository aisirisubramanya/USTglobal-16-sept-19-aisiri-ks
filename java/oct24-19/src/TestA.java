
public class TestA {
	static int a;
	static {
		a=10;
		System.out.println("static block 1");
	}
	TestA(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		TestA t=new TestA();
		TestA t1=new TestA();
		System.out.println("a="+a);
	}
	static {
		a=20;
		System.out.println("static block 2");
	}
	static {
		a=40;
		System.out.println("static block 3");
	}
}
