package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
		StringReverse rev= new StringReverse();

		String input = "today@is@The@DAY";
	    String reversedString = reverseWords(input);

	    System.out.println("Original String: " + input);
	    System.out.println("Reversed String: " + reversedString);
	
	}
	
	public void strReverseByCharAt() {
	String val="test for Reverse__  1";
		
		StringBuilder R=new StringBuilder(val);
		
		String revString="";
		
		System.out.println(val);
		
		for(int i=val.length()-1; i>=0;i--) {
			
			
			revString = revString+val.charAt(i);
			
		}
		
		System.out.println(revString);
		
		System.out.println("With SB Reverse Method: "+R.reverse());
		
		System.out.println( revString);
		
	}
	
	public String strReverse() {
		String str = "test for Reverse__  1";
		
		char []ch = str.toCharArray();
		
		String reverse="";
		
		for(int i=ch.length-1;i>=0;i--) {
			
			reverse=reverse+ch[i];
		}
		
		return reverse;
	}

	    private static String reverseWords(String input) {
	    	
	        String[] words = input.split("@");
	        StringBuilder reversedString = new StringBuilder();

	        System.out.println(Arrays.asList(words));
	        
	        for (String word : words) {
	            String reversedWord = reverseString(word);
	            reversedString.append(reversedWord).append(" ");
	        }

	        return reversedString.toString().trim();
	    }

	    private static String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

}
