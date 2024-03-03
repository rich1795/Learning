package practice;

public class Assignment_3 {

	public static void main(String[] args) {
		Assignment_3 x= new Assignment_3();
		x.add(10, 20, 20.5);
		x.add(20.2, 20, 30);
		sub(30,10.5,50);
		sub("Test",'R');
		sub('S',"Test2");

	}
	
	void add(int a, int b, double c)
	{
		System.out.println("Print value of" + a);
		System.out.println("Print value of" + b);
		System.out.println("Print value of" + c);
	}
	
	void add(double a, int b, double c)
	{
		System.out.println("Print value of" + a);
		System.out.println("Print value of" + b);
		System.out.println("Print value of" + c);
	}
	
	static void sub(int a, double b, int c)
	{
		System.out.println("Print value of" + a);
		System.out.println("Print value of" + b);
		System.out.println("Print value of" + c);
	}
	
	static void sub(String a, char b)
	{
		System.out.println("Print value of" + a);
		System.out.println("Print value of" + b);
	}
	
	static void sub(char a, String b)
	{
		System.out.println("Print value of" + a);
		System.out.println("Print value of" + b);
	}

}
