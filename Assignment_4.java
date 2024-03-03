package practice;

public class Assignment_4 {


		public static void main(String[] args) {


			add(10,20);
			Assignment_4 a1= new Assignment_4('a');
			a1.sub(10.5, 20);

		}
		
		static void add(int a)
		{
			System.out.println("Static Method Called with 1 para");
		}
		
		static void add(int a, int b)
		{
			System.out.println("Static Method Called with 2 para");
		}
		
		static void add(int a, double b)
		{
			System.out.println("Static Method Called with 2 para but different data type");
		}
		
		void sub(int a)
		{
			System.out.println("Non-Static Method Called with 1 para");
		}
		
		void sub(int a, int b)
		{
			System.out.println("Non-Static Method Called with 2 para");
		}
		
		void sub(double b,int a)
		{
			System.out.println("Non-Static Method Called with 2 para but different data type");
		}
		
		Assignment_4(char a) 
		{
			System.out.println("Constructor Called with 1 para");
		}
		
		Assignment_4(char a, String b) 
		{
			System.out.println("Constructor Called with 2 para");
			
		}
		
		Assignment_4(String a, char b) 
		{
			System.out.println("Constructor called with 2 para but different data type");
			
		}

	}
