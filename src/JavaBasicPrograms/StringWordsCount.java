package JavaBasicPrograms;

public class StringWordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="Test value test";
		
		int count=0;
		
		for(int i=0; i<word.length();i++) {
			
			if((word.charAt(i)!=' ')) {
				count++;
			}
		}
		
		System.out.println("String Words Count: "+count);
	}

}
