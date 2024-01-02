package JavaBasicPrograms;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Year:- ");
		int year = sc.nextInt();

		int n = 0;

		while (n == 0) {

			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

				System.out.println(year + " is Leap Year");

				break;

			} else {
				System.out.println(year + " is not Leap Year Enter Again: ");
				
				year = sc.nextInt();
			}
		}
	}
}
