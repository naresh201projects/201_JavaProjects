package JavaBasicPrograms;

import java.util.StringTokenizer;

public class StringWordsExmaples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		StringWordsExmaples words = new StringWordsExmaples();
		
		words.StringReverseWords();
		words.StringCharCount();
	}
	public void StringCharCount() {
		String word="Test value test";
		
		int count=0;
		
		for(int i=0; i<word.length();i++) {
			
			if((word.charAt(i)!=' ')) {
				count++;
			}
		}
		
		System.out.println("String Words Count: "+count);
	}
	
	public void StringReverseWords() {
		
		String input= "Reverse the String";
		System.out.println("Before Reverse: "+input);
		
		String reverseWords = "";
		
		String [] wordS = input.split(" ");
		
		for (String string : wordS) {
			
			reverseWords += new StringBuilder(string).reverse().append(" ").toString();
		}
		
		System.out.println("After Reverse: "+reverseWords);
	
	}
	
}
