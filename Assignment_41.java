package practice;

class c4{
	
	void method4() 
	{
		System.out.println("method4");
		
	}
	
}

class c3 extends c4{
	void method3() 
	{
		System.out.println("method3");
		
	}
}

class c2 extends c3{
	void method2() 
	{
		System.out.println("method2");
		
	}
}

public class Assignment_41 extends c2{
	
	void method1() 
	{
		System.out.println("method1");
		
	}

	public static void main(String[] args) {

        
		c4 o1= new c3();
		o1.method4();// C3 is Upcasted to C4
		// need to upcast C2 to C3 to downcast C3 to C2
		
		c3 o2= new c2();
		o2.method3();// C2 is upcasted to C3
		
		c2 o3=(c2) o2;
		o3.method2();// C3 is downcasted to c2
		

	}

}
