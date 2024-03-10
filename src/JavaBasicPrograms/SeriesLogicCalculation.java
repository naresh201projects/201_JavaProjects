package JavaBasicPrograms;

import java.util.Scanner;

public class SeriesLogicCalculation {

	static{ // Requirement
		
		/*
		a 3-digit width. The loop continues until there are no more lines of input.

	User
	We use the integers a,b , and  n to create the following series:

	(a+2^0 *b),(a+2^0 *b+2^1 *b)....,(a+2^0 *b+2^1 *b+ .....+2^n-1 *b)

	The first line contains an integer, q, denoting the number of queries.
	Each line  i,of the q,  subsequent lines contains three space-separated integers describing the respective a,b,n and  values for that query.

	Constraints

	Output Format

	For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

	Sample Input

	2
	0 2 10
	5 3 5 
	 */
		
	}
	
	public static void main(String []argh){
		
		
		
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            seriesLogic(a, b, n);
            System.out.println();
        }
        in.close();
    }
    
    public static void seriesLogic(int a, int b, int n){
        
        int result=a;
        for(int i=0;i<n;i++){
            
           result =result+(int) Math.pow(2, i) * b;
            System.out.print(result + " ");      
            
            System.out.println("print");
         }
    }
        
        public void test() {
        	
        }

}
