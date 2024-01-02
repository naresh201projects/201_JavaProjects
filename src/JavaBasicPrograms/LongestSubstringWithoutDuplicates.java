package JavaBasicPrograms;
import java.util.HashMap;

public class LongestSubstringWithoutDuplicates {
    public static void main(String[] args) {
        String input = "abcabcbbDup TestforDup";
        String longestSubstring = findLongestSubstring(input);

        System.out.println("Input String: " + input);
        System.out.println("Input String Length: " + input.length());
        System.out.println("Longest Substring Without Duplicates: " + longestSubstring);
    }
    
    private static String findLongestSubstring(String s) {
        int length = s.length();
        int start = 0;
        int maxLength = 0;
        int startIndex = 0;

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);

            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= start) {
                start = charMap.get(currentChar) + 1;
            }
            int currentLength = i - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                startIndex = start;
            }
            charMap.put(currentChar, i);
        }
        
        System.out.println("StartIndex: "+startIndex);
        System.out.println("maxLength: "+maxLength);
        return s.substring(startIndex, startIndex + maxLength);
        
    }
}