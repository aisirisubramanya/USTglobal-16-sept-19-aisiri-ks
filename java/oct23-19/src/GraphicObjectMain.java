
public class GraphicObjectMain {
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.shape();
		t.move();
		System.out.println("*************************************");
		Rectangle r=new Rectangle();
		r.shape();
		r.move();
		System.out.println("*************************************");
		Circle c=new Circle();
		c.shape();
		c.move();
		System.out.println("*************************************");
	}
}
