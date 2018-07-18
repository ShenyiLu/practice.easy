package practice;

/**
 * A class to help with several common conversions.
 * @author srollins
 *
 */
public class ConversionsHelper {

	/**
	 * Converts ounces to gallons.
	 * One gallon is 128 ounces.
	 * 
	 * @param ounces
	 * @return
	 */
	public double ouncesToGallons(int ounces) {
		return ounces / 128.00;
	}
	
	/**
	 * Converts centimeters to feet.
	 * One foot is 30.48 cm.
	 * 
	 * @param cm
	 * @return
	 */
	public double cmToFeet(int cm) {
		return cm / 30.48;
	}
	
}
