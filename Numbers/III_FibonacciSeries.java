//Java program to print Fibonacci series using recursion.
public class IX_FibonacciSeries {

	public static void main(String[] args) {
		int count = 12;
		int a=0, b=1, c=1;
		
		for(int i=0; i<=count; i++) {
			System.out.println(a);
			a = b;
			b = c;
			c = a + b;
		}

	}

}
