package practice;	

public class Assignment_26 {

public static void main(String[] args) {
		
		System.out.println("Main method");
		new Assignment_26(2);
		new Assignment_26(1);

	}
	
	{
		System.out.println("IIB");
	}
	
	static
	{
		System.out.println("SIB");
	}
	
	Assignment_26(int a) 
    {
		System.out.println("Constructor"+a);
	}

}
