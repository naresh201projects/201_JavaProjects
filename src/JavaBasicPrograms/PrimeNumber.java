package JavaBasicPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		PrimeNumber prim=new PrimeNumber();
		
		Scanner scanner = new Scanner(System.in);
		
        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        prim.generatePrimeNum(number);
    }

    // Function to check whether a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If there is a factor, the number is not prime
            }
        }

        return true; // If no factors are found, the number is prime
    }
    
    public void generatePrimeNum(int EnterNum) {
    	
    	boolean isPrime;
		
    	System.err.println("Prime numbers upto.."+EnterNum);
		for (int i=2; i<=EnterNum;i++) {
			
			isPrime = true;
			for (int k =2; k<i;k++) {
				
				if(i%k ==0) {
					isPrime = false;
					break;
				}
				
			}
			
			if (isPrime) {
			//	System.out.println("Prime numbers :");
				System.out.print(i+",");
			}
			
		}
		System.out.println();
    }
}