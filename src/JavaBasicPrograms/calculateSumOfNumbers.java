package JavaBasicPrograms;

public class calculateSumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 20, 33, 40 };
		char[] c = { '1', '2', '0', 'a' };
		int asum = 0;
		int csum = 0;
		
		for (int arr : a) {

			asum = asum + arr;
		}
		for (int crr : c) {

			csum = csum + crr;
		}
		System.out.println("sum of int array numbers: " + asum);
		System.out.println("sum of Char array numbers: " + csum);

	}

}
