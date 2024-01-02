package JavaBasicPrograms;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int TableLimit =10;
		
		int MultiplicationLimit = 10;
		
		for(int i=1;i<=MultiplicationLimit;i++) {
			
			System.out.print(i+" Table: ");
			for(int j=1;j<=TableLimit;j++) {
				
				int tab = i*j;
				
				System.out.print(tab+" ");
			}
			System.out.print("\n");
		}
	}

}
