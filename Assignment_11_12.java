package practice;

public class Assignment_11_12 {

		public static void main(String[] args) {

			areaOftriangle(10,20);
			areaOfrectangle(10, 8);
			parameterOfrectangle(10, 8);
			parameterOfsquare(10);
			areaOfSquare(12);
			areaOfCircle(8);
			circumfrenceOfCircle(9);

		}

		static void areaOftriangle(int b, int h) 
		{
			System.out.println(0.5*(b * h));
		}
		
		static void areaOfrectangle(int l, int w) 
		{
			System.out.println(l * w);
		}
		
		static void parameterOfrectangle(int l, int w) 
		{
			System.out.println(l+l+w+w);
		}
		
		static void parameterOfsquare(int s) 
		{
			System.out.println(s*4);
		}
		
		static void areaOfSquare(int s) 
		{
			System.out.println(s*s);
		}
		
		static void areaOfCircle(int r) 
		{
			System.out.println(3.14*(r*r));
		}
		
		static void circumfrenceOfCircle(int r) 
		{
			System.out.println(2*3.14*r);
		}


	}