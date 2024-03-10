package JavaBasicPrograms;

public class FindTwoMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindTwoMaxValue value= new FindTwoMaxValue();
		
		value.TwoMaxValuesArray();
	//	value.TwoMinValuesArray();
	}
	
	public void TwoMaxValuesArray() {
		
		int []array = {162,10,452,190,20,11,90,15,44,44,0};
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
	
	//Have to update
public void TwoMinValuesArray() {
		
		int []array = {162,10,452,190,20,11,90,15,44,44};
		int count=0;
		
		int min1=0; int min2=0;
		
		for (int i : array) {
			
			if(i>min2) {
				min1=i;
				min2=min1;
			}else if(i>min1) {
				min2=i;
			}
		}
		System.out.println("Min1: "+min1);
		System.out.println("Min2: "+min2);
	}

}
