package practice;

public class Assignment_37 {

	public static void main(String[] args) 
	{
		String a="Rishab  1975&%";
		int num_of_digit=0;
		int num_of_alphabet=0;
		int num_of_space=0;
		int num_of_Sp_C=0;
		
		for(int i=0; i<a.length(); i++) 
		{
			char c= a.charAt(i);
			if(Character.isDigit(c)) 
			{
				num_of_digit++;
			}
			else if(Character.isAlphabetic(c)) 
			{
				num_of_alphabet++;
			}
			else if(Character.isWhitespace(c)) 
			{
				num_of_space++;
			}
			else 
			{
				num_of_Sp_C++;
				
			}
		}
		
		System.out.println("Alphabets" + num_of_alphabet);
		System.out.println("Numbers" + num_of_digit);
		System.out.println("Spaces" + num_of_space);
		System.out.println("Special Characters" + num_of_Sp_C);
		
		if(num_of_digit>0) 
		{
			if(num_of_alphabet<=0 && num_of_space<=0 && num_of_Sp_C<=0) 
			{
				System.out.println("Only digits");
			}
			else 
			{
				System.out.println("Does not contains ony digit");
			}
		}
		else 
		{
			System.out.println("Does not contain digits");
		}
		
		
	}

}
