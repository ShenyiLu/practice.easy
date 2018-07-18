package practice;

/**
 * A class to help translate an alphanumeric 
 * "phone number" to the appropriate digits.
 * 
 *  Example:
 *   - input: CSROCKS 
 *   - output: 2776257
 * 
 * @author srollins
 *
 */
public class PhoneNumberTranslation {

	/**
	 * Translates the String alpha to a String
	 * containing the digit representation of
	 * each character in alpha.
	 * 
	 * alpha must contain exactly seven characters and the
	 * method returns null if alpha is of incorrect length.
	 * 
	 * Letters may be upper or lower case.
	 * A digit in alpha will be translated to the 
	 * same digit in the result.
	 * 
	 * The translation is as follows.	 
	 * 1 -> 1
	 * 'ABC' -> 2 
	 * 'DEF' -> 3
	 * 'GHI' -> 4
	 * 'JKL' -> 5
	 * 'MNO' -> 6
	 * 'PQRS' -> 7
	 * 'TUV' -> 8
	 * 'WXYZ' -> 9
	 * 0 -> 0
	 * 
	 * Any other characters in alpha are considered invalid
	 * and will cause the method to return null.
	 * 
	 * @param alpha
	 * @return
	 */
	public String alphaToNumber(String alpha) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < alpha.length(); i++) {
			char tempChar = alpha.charAt(i);
			if (!(tempChar == '0') && !(tempChar == '1') && !(tempChar >= 'A' && tempChar <= 'Z')) {
				return null;
			}
			buffer.append(switchTable(tempChar));
		}

		return buffer.toString();
	}

	private int switchTable(char alpha) {
		int number;
		switch (alpha) {
			case '1':
				number = 1;
				break;
			case 'A':
			case 'B':
			case 'C':
				number = 2;
				break;
			case 'D':
			case 'E':
			case 'F':
				number = 3;
				break;
			case 'G':
			case 'H':
			case 'I':
				number = 4;
				break;
			case 'J':
			case 'K':
			case 'L':
				number = 5;
				break;
			case 'M':
			case 'N':
			case 'O':
				number = 6;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				number = 7;
				break;
			case 'T':
			case 'U':
			case 'V':
				number = 8;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				number = 9;
				break;
			case '0':
				number = 0;
				break;
			default:
				System.out.println("invalid input");
				number = -1;
				break;
		}
		return number;
	}
	
}
