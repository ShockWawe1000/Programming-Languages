package aaa;

public class MyNumber {
	
	private int num;
	public int num2;
	
	public MyNumber() {
		num=0;
		num2=100;
	}
	
	int getNum() {
		return num;
		
	}
	
	void setNum(int i) {
		num=i;
		num2=10*i;
	}
	
}
