package PracticePrograms;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.management.ValueExp;
import javax.management.openmbean.InvalidOpenTypeException;

public class PracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner scanner = new Scanner(System.in);
		// scanner.nextInt();

		PracticeClass c=new PracticeClass();
		
		c.WordsCount("the Check the words count in the string and count a count");
		
	}
	
	public void WordsCount(String value) {
		
		Map <String,Integer> map= new HashMap<>();
		
		String [] arr= value.split(" ");
		
		
		int total=0;
		
		for (int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				int count =map.get(arr[i]);
				map.put(arr[i], count+1);
			}
			else {
				map.put(arr[i],1);
			}
		}
		System.out.println("Total Words count: "+arr.length);
		System.out.println(map);
	}
}
