package animal;
import java.lang.Class;
import java.lang.reflect.*;


class Test{
	String s;
	public Test(){
		s="Programming languages";
	}
	public void method1() {
		System.out.println(s);
	}
	 public void method2(int n){
			System.out.println(n);
		}
	 private void method3() {
		 System.out.println("Private method is invoked");
	 }
}


public class Main 
{

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchFieldException 
	{
	
		Test test = new Test();
		
		Class cls = test.getClass();
		System.out.println("The name of the class is " + cls.getName());
			
		Constructor constructor;
		try {
			constructor = cls.getConstructor();
			System.out.println("The name of the constructor is " + constructor.getName());
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Method[] methods = cls.getMethods();
		for (int i=0;i<methods.length;i++) 
		{
			System.out.println("Method Name: " + methods[i].getName());
			
		}
		System.out.println("Result of method 1: " );
		Method methodCall1 =cls.getDeclaredMethod("method1");
		methodCall1.invoke(test);
		Method methodCall2=cls.getDeclaredMethod("method2", int.class);
		methodCall2.invoke(test, 15);
		Field field = cls.getDeclaredField("s");
		field.setAccessible(true);
		System.out.println(field.get(test));
		field.set(test, "JAVA");
		methodCall1.invoke(test);
		
		
		
		
		
	

	}

}
