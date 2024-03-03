package practice;

public class Assignment_24 {

public static void main(String[] args) {
		
		int day = 91;
		
		if((day>=1) && (day<=31))
		{
			System.out.println("Jan");
		}
		
		else if((day>=32) && (day<=59))
		{
			System.out.println("Feb");
		}
		
		else if((day>=60) && (day<=90))
		{
			System.out.println("Mar");
		}
		
		else if((day>=91) && (day<=120))
		{
			System.out.println("Apr");
		}
		
		else if((day>=121) && (day<=151))
		{
			System.out.println("May");
		}
		
		else if((day>=152) && (day<=181))
		{
			System.out.println("June");
		}
		
		else if((day>=182) && (day<=212))
		{
			System.out.println("July");
		}
		
		else if((day>=213) && (day<=243))
		{
			System.out.println("Aug");
		}
		
		else if((day>=244) && (day<=273))
		{
			System.out.println("Sept");
		}
		
		else if((day>=274) && (day<=304))
		{
			System.out.println("Oct");
		}
		
		else if((day>=305) && (day<=334))
		{
			System.out.println("Nov");
		}
		
		else if((day>=335) && (day<=365))
		{
			System.out.println("Dec");
		}
		
		else 
		{
			System.out.println("Invalid");
		}
		
	}

}

