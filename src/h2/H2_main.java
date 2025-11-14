package h2;

public class H2_main {

	boolean x = true;
	boolean y = true;
	boolean a = true;
	boolean b = true;
	boolean c = true;
	
	int input = 10;
	
	public static void main(String[] args) {
		H2_main testfall = new H2_main();
		testfall.test();
//		testfall.test(1);
//		testfall.test(10);
//		testfall.test(11);
	}
	
	
		public void test() {
		
		//input = weAreChecking;
			
		if(input == 10 || input == 11) {
			x = true;
		}
		else {
			x = false;
		}
		if(input == 1 || input == 11) {
			y = true;
		}
		else {
			y = false;
		}
		
		boolean E1;
		boolean E2;
		boolean E3;
		
//		E1
		if(x) {
			E1 = true;
		}
		else {
			E1 = false;
		}
		
//		E2
		if(y) {
			E2 = true;
		}
		else {
			E2 = false;
		}
		
//		E3
		if(x ^ y) {
			E3 = true;
		}
		else{
			E3 = false;
		}
		
		if(E1 && E2) {
			a = true;
		}
		else {
			a = false;
		}
		
		if(E1 || E3) {
			b = true;
		}
		else {
			b = false;
		}
		
		if(E3) {
			c = true;
		}
		else {
			c = false;
		}
		
		
//		System.out.println("Fall: " + input);
//		System.out.println("A: " + a);
//		System.out.println("B: " + b);
//		System.out.println("C: " + c);
//		System.out.println("X: " + x);
//		System.out.println("Y: " + y);
//		System.out.println("-------------------");
	}
}
