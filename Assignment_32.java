package practice;



	interface intf5{
		void method1();
	}

	interface intf4{
		void method2();
	}

	interface intf3{
		void method3();
	}

	interface intf2{
		void method4();
	}

	interface intf{
		void method5();
	}

		public class Assignment_32 implements intf, intf2, intf3, intf4, intf5 {

		public static void main(String[] args) 
		{
			 Assignment_32 a1= new Assignment_32();
			 a1.method1();
			 a1.method2();
			 a1.method3();
			 a1.method4();
			 a1.method4();
			 
			 
		}

		
		public void method1() {
			System.out.println("method1");
			
		}


		public void method2() {
			System.out.println("method2");
		}

		public void method3() {
			System.out.println("method3");
		}


		public void method4() {
			System.out.println("method4");
			
		}

		public void method5() {
			System.out.println("method5");
			
		}

	}
