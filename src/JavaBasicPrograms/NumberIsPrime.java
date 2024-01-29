package JavaBasicPrograms;

import java.util.Scanner;

public class NumberIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num =scanner.nextInt();
		
	int flag =0;
	
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
			
			System.out.println(num +" Is not Prime Number");
				
				flag= 1;
				break;
			}
		}
		if (flag== 0) {

			System.out.println(num +" Is Prime Number");
		}
	}

}
