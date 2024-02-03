package JavaBasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class StringCharCount {

	    public static void main(String[] args) {
	        
	       countCharacters();
	    }

		public static void countCharacters() {
			
			String str = " find the chars count,Print"
					;
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        char[] charArray = str.toCharArray();

	        for (char ch : charArray) {
	            // Checking if the character is already present in the map
	            if (charCountMap.containsKey(ch)) {
	                // If present, increment the count
	                charCountMap.put(ch, charCountMap.get(ch) + 1);
	            } else {
	                // If not present, add the character to the map with count 1
	                charCountMap.put(ch, 1);
	            }
	        }
int count=0;
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	        	
	            System.out.print("("+entry.getKey() + ": " + entry.getValue()+"), ");
	            count = count+entry.getValue();
	        }
	        System.out.println("\n"+count);
	    }
	

}
