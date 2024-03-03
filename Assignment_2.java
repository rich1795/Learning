package practice;

public class Assignment_2 {

	public static void main(String[] args) {

		
			new Assignment_2();
			new Assignment_2(10);
			new Assignment_2(20,30);
			new Assignment_2(50,50.5);

		}
		
		Assignment_2() 
		{
			System.out.println("constructor overloading");
		}
		
		Assignment_2(int a)
		{
			System.out.println("constructor with 1 par");
			
		}
		
		Assignment_2(int a, int b)
		{
			System.out.println("constructor with 2 par");
		}
		
		Assignment_2(int a, double b)
		
		{
			System.out.println("constructor with differnt dt par");
		}

	}
