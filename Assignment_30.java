package practice;

import java.util.Scanner;


public class Assignment_30 {

	 Scanner input= new Scanner(System.in);
	 int num1;
	 int num2;
	
	
	public static void main(String[] args) {
		
		
		Assignment_30 n= new Assignment_30(); 
		n.num1= n.input.nextInt();
		n.num2= n.input.nextInt();
		n.add();
		n.sub();
		n.mult();
		n.div();
		}
		
		 void add() 
		{
			
			System.out.println(num1+num2);
		}
		

		 void sub() 
		{
			
			System.out.println(num1-num2);
		}
		 
		 void div() 
		{
				
			System.out.println(num1/num2);
		}
		 void mult() 
		{
					
				System.out.println(num1*num2);
		}
		 

	}
