package practice;

public class Assignment_22 {

	public static void main(String[] args) {

		for (int i = 1; i <= 500; i++) {
			if (i % 3 == 0 && i % 5 == 0) 
			{
				System.out.println("Computer and mouse"+i);
			}

			else if (i % 3 == 0) 
			{
				System.out.println("Computer" + i);
			}
			
			else if (i % 5 == 0) 
			{
				System.out.println("Mouse" + i);
			}

		}
	}

}