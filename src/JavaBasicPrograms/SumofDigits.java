package JavaBasicPrograms;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val =2044;
		
		int digitSum =0;
		
		while(val>0) {
			
			int r = val%10;
			
			val=val/10;
			
			digitSum =digitSum+r;
		}
		
		System.out.println("Sum of Digits: "+digitSum);
		
	}

}
