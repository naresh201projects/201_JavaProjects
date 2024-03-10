package JavaBasicPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Ex: 5! = 5*4*3*2*1 =120

		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter Factorial number:");
		int num = scanner.nextInt(); 
		long factorial=num;
		
		for(int i=(num-1);i>1;i--) {
			
			factorial=factorial*i;
		}
		
		System.out.println(num+" Factorial value: "+factorial);
	}

}
