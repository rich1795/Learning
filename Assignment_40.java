package practice;

public class Assignment_40 {

	public static void main(String[] args) {
		// swap with 2 variables
		
				int d=10;
				int e=20;
				
				System.out.println("Value of d before swap" + d);
				System.out.println("Value of e before swap" + e);
				
				d=d+e;// d=30
				e=d-e;// e=30-20= 10
				d=d-e;// d=30-10= 20
				
				System.out.println("Value of d after swap" + d);
				System.out.println("Value of e after swap" + e);
				

	}

}
