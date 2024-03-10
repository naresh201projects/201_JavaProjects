package JavaBasicPrograms;

import java.util.List;
import java.util.StringTokenizer;

public class removeExtraSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = " Try       to remove @       ExtraSpaces ";
		
		StringTokenizer substr = new StringTokenizer(input," ");
		
		StringBuffer sb = new StringBuffer();
		
		while(substr.hasMoreElements()) {
			sb.append(substr.nextElement()).append(" ");
		}
	    System.out.println("Actual string: " + input);
	    System.out.println("Processed string: " + sb.toString().trim());
		
	    removeExtraSpaces spaces = new removeExtraSpaces();
	    
	    spaces.removeSpacesM1();

	}
	public void removeSpacesM1() {
		
		String inputString="Test     to remove     spaces another           method  ... ";
		
		String oupuString = inputString.replaceAll("\s+", " ");
		
		
		System.out.println(oupuString);
	}

}
