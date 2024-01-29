package JavaBasicPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Note: The Fibonacci sequence is a set of numbers that starts with a one or a zero, followed by a one, and proceeds based on the rule that each number (called a Fibonacci number) is equal to the sum of the preceding two numbers. … F (0) = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…
		
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Enter number: ");
		
		int num =scanner.nextInt();
		
		String fibSeries = "";
		
		int t1=0; int t2 =1; int sum;
		
		for (int i=1;i<=num;i++) {
			
			fibSeries = fibSeries+t1+" , ";
			sum = t1+t2;
			t1 =t2;
			t2= sum;
			
		}
		System.out.println("Numbers "+num+" terms: "+fibSeries);
	}

}
