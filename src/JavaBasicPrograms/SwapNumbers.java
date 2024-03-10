package JavaBasicPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwapNumbers sn= new SwapNumbers();
		
		sn.swap();
	}
	public void swap() {
		
		int num1 =10;
		int num2 =20;
		
System.out.println("Before Swap:");
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2+"\n");
		
		num1 = num1+num2;
		
		num2 = num1-num2;
		
		num1 =num1-num2;
		
		System.out.println("After Swap:");
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
	}
	

}
