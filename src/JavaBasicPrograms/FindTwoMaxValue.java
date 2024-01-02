package JavaBasicPrograms;

public class FindTwoMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindTwoMaxValue maxValue= new FindTwoMaxValue();
		
		maxValue.TwoMaxValuesArray();
	}
	
	public void TwoMaxValuesArray() {
		
		int []array = {162,10,452,190,20,11,90,15,44,44};
		int count=0;
		
		int max1=0; int max2=0;
		
		for (int i : array) {
			
			if(i>max1) {
				max2=max1;
				max1=i;
			}else if(i>max2) {
				max2=i;
			}
			
		}
		
		System.out.println("Max1: "+max1);
		System.out.println("Max2: "+max2);
	}

}
