package aaa;



public class aaa {
public static void main(String[] args)
{
	MyNumber a = new MyNumber();
	a.setNum(10);
	a.description();
	System.out.println(a.average());
	
	MyNumber b = new MyNumber(10,20);
	b.description();
}
}
