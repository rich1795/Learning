package practice;

public class Assgnment_19 {

	public static void main(String[] args) {


		int a= 10;
		int b= 20;
		
		if(a<b && b>a) 
		{
			System.out.println("Both true");
		}
		if(a<b && b==a) 
		{
			System.out.println("One true one false");
		}
		if(a==b && b>a) 
		{
			System.out.println("One false one true");
		}
		if(a==b && b<a)  
		{
			System.out.println("both false");
		}
		

	}

}
