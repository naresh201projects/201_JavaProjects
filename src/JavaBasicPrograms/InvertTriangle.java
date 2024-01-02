package JavaBasicPrograms;

public class InvertTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InvertTriangle triangle = new InvertTriangle();
		
		triangle.Triangle_Reverse();
		triangle.Triangle();
		
	}

	public void Triangle_Reverse() {

		int num = 6;

		for (int i = 1; i <= num; i++) {

			for (int j = num; j > i; j--) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}

	}

	public void Triangle() {

		int num = 6;

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}

	}
}
