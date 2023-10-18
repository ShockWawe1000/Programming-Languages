package aaa;

public class MyNumber {
	
	private int num;
	public int num2;
	
	public MyNumber() {
		num=0;
		num2=100;
	}
	public MyNumber(int num1,int num2) {
		this.num=num1;
		this.num2=num2;
	}
	
	int getNum1() {
		return num;
		
	}
	
	int getNum2() {
		return num2;
	}
	
	void description()
	{
		System.out.println(this.getNum1());
		System.out.println(this.getNum2());
	}
	
	float average() {
		return (this.num+this.num2)/2;
	}
	
	void setNum(int i) {
		num=i;
		num2=10*i;
	}
	
}
