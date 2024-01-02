package JavaBasicPrograms;

public class Armstrong {

	public static void main(String[] args) {
		// Note: Armstrong number is a number that is equal to the sum of cubes of its digits.

		Armstrong am= new Armstrong();
		am.ArmstrongNum();
	}
	
	public void ArmstrongNum() {
		
		int num = 153;
		
		int val=num; int r; int check=0;
		
		while(val>0) {
			
			r = val%10;
			
		   check = check+((int)Math.pow(r, 3));
		   
		   val=val/10;
			
		}
		
		if(num==check) {
			System.out.println(num+" is Armstrong Number "+check);
		}else {
			System.out.println(num+" is Not Armstrong Number "+check);
		}
	}

}
