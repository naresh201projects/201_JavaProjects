package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIterationTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main");
		
		//Static array------------------
		Integer val = new Integer(10);
		int [] a= {10,20,30};
		
		int x[] = new int[10];
		
		System.out.println(x[9]);
		System.out.println(a[2]);
		
		// Dynamic Array---------------------
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println(list);
		
		String v ="";
		
		//By for loop--------------------------
		for(int i=0;i<list.size();i++) {
			 v= v+list.get(i)+" ";
		}
		System.out.println(v);
		
		//By Foreach loop---------------------
		for (String s : list) {
			
			System.out.print(s+", ");
		}	
		System.out.println();
		
		// By Streams lamda function - JDK 8 -----------------------------
		list.stream().forEach(variable->System.out.print(variable+" & "));
		
		
		System.out.println();
		System.out.println("=================================");
		
		//Iterator --------------------------------
		Iterator<String> it = list.iterator();
		
		Iterator iterator = list.iterator();
	
		while(it.hasNext()) {
			
			System.out.print(it.next()+" : ");
		}
			System.out.println();
		
		//list with other collection
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10,20,30,33));
		
		System.out.println(arrayList);
		
	}
}
