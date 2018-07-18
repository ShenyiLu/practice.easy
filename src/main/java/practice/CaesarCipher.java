package practice;

/**
 * Encrypt a message using the Caesar Cipher.
 * @author srollins
 *
 */
public class CaesarCipher {


	/**
	 * Returns the message encrypted using the given shift
	 * amount.
	 *
	 * If the shift is greater than 26 the method returns null.
	 * If the message contains any characters that are not upper
	 * or lower case letters the method returns null.
	 *
	 * Example: (abc, 2) -> cde
	 *
	 * @param message
	 * @param shift
	 * @return
	 */
    public String encrypt(String message, int shift) {
        if (shift > 26) {
            return null;
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < message.length(); i++) {
            char tempChar = message.charAt(i);
            if (!(tempChar >= 'a' && tempChar <= 'z') && !(tempChar >= 'A' && tempChar <= 'Z')) {
                return null;
            }
            int value = (int) tempChar;
            if (tempChar >= 'a' && tempChar <= 'z') {
                int lower = (int) 'a';
                value = (value - lower + shift) % 26 + lower;
            } else {
                int upper = (int) 'A';
                value = (value - upper + shift) % 26 + upper;
            }
            result.append((char) value);
        }
        return result.toString();
    }


	public static void main(String[] args) {
	}

}
