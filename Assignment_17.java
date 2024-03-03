package practice;

public class Assignment_17 {

	public static void main(String[] args) {

		int age=35;
		char g='f';
		if(g=='m')
		{
			if(age<=18) 
			{
				System.out.println("Free ride");
			}
			
			else
			{
				System.out.println("10 rs per km");
			}
		
		}
		else
		{
			if(age<=18)
			{
				System.out.println("Free ride");
			}
			else if(age>18 && age<=40) 
			{
				System.out.println("5 rs per km");
			}
			else
			{
				System.out.println("2 rs ker km");
			}
		}

	}

}
