
public class MobileMain {
public static void main(String[] args) {
	FirstMobile f=new FirstMobile();
	f.call();
	f.msg();
	System.out.println("*****************************");
	SecondMobile s=new SecondMobile();
	s.call();
	s.msg();
	s.game();
	System.out.println("*****************************");
	ThirdMobile t=new ThirdMobile();
	t.call();
	t.msg();
	t.game();
	t.cam();
}
}
