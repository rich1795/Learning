package practice;

import java.util.Scanner;

public class Assignment_27 {

public static void main(String[] args) {
		
		add();
		sub();
		mult();
		div();
	}
	
	static void add() 
	{
		Scanner input= new Scanner(System.in);
		int num1= input.nextInt();
		int num2= input.nextInt();
		System.out.println(num1+num2);
	}
	
	static void sub()
	{
		Scanner input= new Scanner(System.in);
		int num1= input.nextInt();
		int num2= input.nextInt();
		System.out.println(num1-num2);
	}
	
	static void mult()
	{
		Scanner input= new Scanner(System.in);
		int num1= input.nextInt();
		int num2= input.nextInt();
		System.out.println(num1*num2);
	}
	
	static void div()
	{
		Scanner input= new Scanner(System.in);
		int num1= input.nextInt();
		int num2= input.nextInt();
		System.out.println(num1/num2);
	}

}
