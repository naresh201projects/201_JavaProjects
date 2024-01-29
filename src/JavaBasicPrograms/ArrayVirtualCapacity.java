package JavaBasicPrograms;

import java.util.ArrayList;

public class ArrayVirtualCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main");
		
		//Static array------------------
		Integer []val = new Integer[10];
		int [] a= {10,20,30};
		
		int x[] = new int[10];
		
		System.out.println(x[9]);
		System.out.println(a[2]);
	
		// Dynamic Array---------------------
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println(list.size()); //Physical Capacity (PC) =0
		list.add("one");
		System.out.println(list.size()); //Physical Capacity (PC) =1
		list.add("two");
		list.add("three");
		System.out.println(list.size()); //Physical Capacity (PC) =3
		
		/*Note: Initially Virtual capacity will be align as 10 for Arrays. Ex: ("ArrayList<String> list = new ArrayList<String>();")
		 * To Increase VC then we have to pass the vc limit as in below example 
		 * 
		 */
		ArrayList<Integer> ar = new ArrayList<Integer>(2);
				
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		System.out.println(ar);
	}
}
