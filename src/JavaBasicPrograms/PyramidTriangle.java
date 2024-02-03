package JavaBasicPrograms;

import PracticePrograms.PracticeClass;

public class PyramidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner scanner = new Scanner(System.in);
		// scanner.nextInt();

		PyramidTriangle c=new PyramidTriangle();
		
		c.Triangle(6);
		
	}
	
	public void Triangle(int num) {
		
		for (int i=1;i<=num;i++ ) {
			
			for(int j=i;j<=num;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}
			for(int m=1;m<=i;m++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		for (int i=1;i<=num;i++ ) {
			
			for(int j=1;j<=i;j++) {
				 System.out.print(" ");
			}
			for(int k=num;k>=i;k--) {
				System.out.print("*");
			}
			for(int m=i; m<num;m++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
			
		}
		
	}
}
