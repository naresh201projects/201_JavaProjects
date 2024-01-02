package JavaBasicPrograms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringReverse rev= new StringReverse();
		
		String val="test for Reverse__  1";
		
		StringBuilder R=new StringBuilder(val);
		
		String revString="";
		
		for(int i=val.length()-1; i>=0;i--) {
			
			
			revString = revString+val.charAt(i);
			
		}
		
		System.out.println(revString);
		
		System.out.println("With SB Reverse Method: "+R.reverse());
		
		System.out.println( rev.strReverse());
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

}
