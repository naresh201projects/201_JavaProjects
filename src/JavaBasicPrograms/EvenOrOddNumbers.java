package JavaBasicPrograms;

import java.util.Scanner;

public class EvenOrOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,remaider;
		System.out.println("pls enter an integer number ");
        Scanner scan=new Scanner( System.in);
        number=scan.nextInt();
        scan.close();
        remaider=number%2;
        
        if(remaider==0)
        	System.out.println(number+" is an even number");
        else {
			System.out.println(number+" is an odd number");
		}
        
	}

}
