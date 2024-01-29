package PracticePrograms;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Armstrong num - sum of each digit qubes should equals to actual number.
		
		int Actnum = 153; int temp=Actnum;
		int ArmNum=0; int R=0;
		
		System.out.println("Actual Num: "+Actnum);
		while(temp>0) {
			
			R = temp%10;
			
			ArmNum =ArmNum+((int)Math.pow(R, 3));
			
			temp = temp/10;
		}
		
		if(Actnum==ArmNum)
		System.out.println(Actnum+" is Armstrong Num: "+ArmNum);
	}

}
