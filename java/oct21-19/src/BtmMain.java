
public class BtmMain {
	public static void main(String[] args) {
		Btm b=new Btm();
		b.swipe();
		Btm b1=new Btm();
		b1.swipe();
		System.out.println(b.getCount());
		System.out.println("total count="+b.getTotalCount());
	}
}
