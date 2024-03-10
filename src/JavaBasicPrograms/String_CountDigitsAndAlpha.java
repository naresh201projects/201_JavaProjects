package JavaBasicPrograms;

public class String_CountDigitsAndAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String_CountDigitsAndAlpha s = new String_CountDigitsAndAlpha();

		s.digitCount();
	}

	public void digitCount() {

		String value = "abced efgh 123@ 66#";
		int digitCount = 0;
		int alphaCount = 0;
		int splCharCount = 0;
		int spaceCount = 0;

		String digits = "";
		String alpha = "";
		String space = "";
		String splCharacters = "";
		for (int i = 0; i < value.length(); i++) {

			if (Character.isDigit(value.charAt(i))) {
				digits = digits + value.charAt(i);
				digitCount++;
			}
			else if (Character.isLetter(value.charAt(i))) {
				alpha = alpha + value.charAt(i);
				alphaCount++;
			}

			else if (value.charAt(i) == ' ') {
				space = space + value.charAt(i);
				spaceCount++;

			} else {
				splCharacters = splCharacters + value.charAt(i);
				splCharCount++;
			}

		}

		System.out.println("Total String Length: " + value.length() + " ==== Expected Sum of Length: "
				+ (digitCount+ alphaCount + splCharCount + spaceCount));

		System.out.println("Digits Count: " + digitCount + " -- " + digits);
		System.out.println("alpha Count: " + alphaCount + " -- " + alpha);
		System.out.println("spl character Count: " + splCharCount + " -- " + splCharacters);
		System.out.println("Space Count: " + spaceCount + " -- " + space);

	}

	public void alphaCount() {

	}

}
