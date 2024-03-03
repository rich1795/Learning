package practice;

import java.util.Arrays;

public class Assignment_36 {

	public static void main(String[] args) {

		int a[] = new int[5];
		int b[] = new int[6];

		a[0] = 2;
		a[1] = 3;
		a[2] = 1;
		a[3] = 4;
		a[4] = 8;

		b[0] = 2;
		b[1] = 3;
		b[2] = 1;
		b[3] = 4;
		b[4] = 8;
		b[5] = 10;

		if (a.length == b.length) 
		{

			if (Arrays.equals(a, b)) {
				System.out.println("Both Arrays are equal");
			}

			else {
				System.out.println("Not equal");
			}

		} 
		else 
		{
			System.out.println("Not equal");

		}

	}
}
