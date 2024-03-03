package practice;

import java.util.Scanner;

public class Assignment_31 extends SuperC {
	
	

	public static void main(String[] args) {
		
		Assignment_31 a1= new Assignment_31();
		a1.n1= a1.s1.nextInt();
		a1.n2= a1.s1.nextInt();
		add();
		sub();
		a();
		b();
	}
	static void add()
	{
		System.out.println(n1+n2);
	}

	static void sub()
	{
		System.out.println(n1-n2);
	}

}
