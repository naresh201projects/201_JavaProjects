package JavaBasicPrograms;

public class LeastAndLargest_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeastAndLargest_PrimeNumber prime = new LeastAndLargest_PrimeNumber();

		int leastNum = 7;
		int largesrnum = 50;
		int leastPrim = prime.findLeastPrime(leastNum, largesrnum);
		int largestPrime = prime.findLargestPrime(leastNum, largesrnum);

		System.out.println("Least Prime num between " + leastNum + " and " + largesrnum + " is: " + leastPrim);

		System.out.println("Largest Prime num between " + leastNum + " and " + largesrnum + " is: " + largestPrime);

	}

	public int findLeastPrime(int start, int end) {

		for (int i = start; i <= end; i++) {

			if (IsPrime(i)) {

				return i;
			}
		}

		return -1;
	}

	public int findLargestPrime(int start, int end) {

		for(int i=end;i>start;i--) {
			if (IsPrime(i)) {

				return i;
			}
		}
		return 1;
	}

	public boolean IsPrime(int num) {
		if(num<=1) {
			return false;
		}

		for(int i=2;i<=Math.sqrt(num);i++) {
			
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}
}


