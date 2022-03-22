// How to swap two numbers without using a third variable?
		
public class II_Swap2Numbers {

	public static void main(String[] args) {
		int a = 55, b = 30;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = "+a+" b = "+b);
	}

}
