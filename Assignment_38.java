package practice;

import java.util.Scanner;

public class Assignment_38 {

	public static void main(String[] args) {


		Scanner c= new Scanner(System.in);
		int input= c.nextInt();
		int fact=1;
		
		for(int i=1; i<=input; i++) 
		{
			 fact= fact * i;
		}
		
		System.out.println(fact);

	}

}
