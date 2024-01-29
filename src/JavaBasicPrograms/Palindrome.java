package JavaBasicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome p= new Palindrome();
		
		p.PalindromeNum();
		
		p.NumReverse();
		
	}

	public void PalindromeNum() {

		int ActualNum = 121;		
		int expectedNum=0;
		int r;
		
		int temp =ActualNum;
		
		while (temp >0) {
			
			r = temp%10;
			
			expectedNum = (expectedNum*10)+r;
			
			temp = temp/10;
			
		}
		if (ActualNum == expectedNum) {
			System.out.println(ActualNum+" Number is Palindrome: "+expectedNum);
		}
		else {
			System.out.println(ActualNum+" This Number is not Palindrome: "+expectedNum);
		}
	}
	
	public void NumReverse() {
		
		int num  = 201;
		
		int val =num; int rev=0;int r=0;
		
		while(val>0) {
			
			r = val%10;
			
		  rev=(rev*10)+r;
			
		  val=val/10;
		}
		
		System.out.println(num+" reverse val is: "+rev);
		
	}
}
