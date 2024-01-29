package JavaBasicPrograms;

public class PyramidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PyramidTriangle pt = new PyramidTriangle();

	//	pt.RightAngleTriangle();
	//	pt.ReverseTriangle();
		
		pt.OppRightAngleTriangle();
	}

	public void RightAngleTriangle() {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public void ReverseTriangle() {

		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {

				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public void OppRightAngleTriangle() {

		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {

				System.out.print("  ");
			}
			System.out.print(" * ");
			System.out.println();
		}

	}
}
