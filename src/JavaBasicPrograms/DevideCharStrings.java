package JavaBasicPrograms;

public class DevideCharStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Hello44tocheckD1234";
		
		StringBuilder charSB = new StringBuilder(str);
		StringBuilder digitSB = new StringBuilder(str);
		
		char [] ch = str.toCharArray();
		
		for (char c : ch) {
			
			if(Character.isLetter(c)) {
				charSB.append(c);
			}
			else if(Character.isDigit(c)) {
				charSB.append(c);
			}
		}
		
		System.out.println("Chars: "+charSB.toString());

		System.out.println("Digits: "+digitSB.toString());
		
	}

}
