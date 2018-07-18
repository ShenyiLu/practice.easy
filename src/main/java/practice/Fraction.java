package practice;

/**
 * A class that maintains a single fraction.
 * @author srollins
 *
 */
public class Fraction {

	private int numerator;
	private int denominator;
	
	/**
	 * Constructor
	 */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	/**
	 * Return the numerator.
	 * @return
	 */
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * Return the denominator.
	 * @return
	 */
	public int getDenominator() {
		return denominator;
	}
	
	/**
	 * Returns the floating point value of this 
	 * fraction.
	 * @return
	 */
	public double getDoubleValue() {
		return (double) numerator / denominator;
	}

	/**
	 * Returns a string representation of this fraction
	 * of the form <numerator>/<denominator>
	 * 
	 * Examples: 1/3 or 9/2
	 */
	public String toString() {
		return numerator + "/" + denominator;
	}
	
}
