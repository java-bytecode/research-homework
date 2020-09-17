/**
 * 
 */
package javaOops;

/**
 * @author CyberxNuke
 *
 */
public interface Car {
		public static final String carID = "AX123";
		public static final int saleStatus = 0;
		public static final int wheelDrive = 4; // 2-wheel or 4-wheel drive
		
//		static {
//			carID = "AX123";
//		}
		
		// Check if car is brought or not.
		void carStatus();
		
}
