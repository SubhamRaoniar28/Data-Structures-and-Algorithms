package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Fibonacci of " + 7 + " is: " + fibonacci(7));
	}
	
	static int fibonacci(int n) {
		if (n < 1)
			System.out.println("n should be greater than or equal to 1");
		else if (n == 1 || n == 2)
			return n - 1;

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
