/**
 * 
 */
package basics;

/**
 * @author CyberxNuke
 *
 */
public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number = 10;
			int anotherNumber = 20;
			
			double decimalNumber = 10.5;
			
			boolean conditionOne = true;
			boolean conditionTwo = false;
			
			System.out.println(number * anotherNumber);
			System.out.println(number * decimalNumber);
			System.out.println(decimalNumber * decimalNumber * number);
			
			System.out.println(number + anotherNumber);
			System.out.println(number + decimalNumber);
			System.out.println(decimalNumber + decimalNumber + number);
			
			System.out.println(number - anotherNumber);
			System.out.println(number - decimalNumber);
			// Left to Right
			System.out.println(decimalNumber - decimalNumber - number);
			
			System.out.println(number / anotherNumber);
			System.out.println(number / decimalNumber);
			System.out.println(decimalNumber / number);
			
			System.out.println(decimalNumber / decimalNumber);
			// Left to Right
			System.out.println(decimalNumber * decimalNumber / number);
			
			System.out.println(number > anotherNumber ? "TRUE":"FALSE");
			
			// If Else
			
			if(number < anotherNumber) {
				System.out.println("Number is less than anotherNumber");
			} else if (number > anotherNumber){
				System.out.println("Number is greater than anotherNumber");
			} else if (number >= anotherNumber) {
				System.out.println("Number is greater than or equal to anotherNumber");
			} else if (number <= anotherNumber) {
				System.out.println("Number is less than or equal to anotherNumber");
			} else if (number == anotherNumber) {
				System.out.println("Number is equal to anotherNumber");
			}
			
			if(number != anotherNumber) {
				System.out.println("Number is not equal to anotherNumber");
			}
			
			System.out.println(conditionOne && conditionTwo);
			System.out.println(conditionOne || conditionTwo);
			System.out.println(!conditionTwo);
			
			if ((conditionOne && conditionTwo) || !(conditionTwo)) {
				System.out.println("The condition check was successful");
			} 
			
			if(conditionOne == conditionTwo) {
				System.out.println("The two conditions are same");
			} else { 
				System.out.println("The two conditions are not same");
			}
			
			// Switch Case
			switch(number) {
			case 10:
				System.out.println("The number selected is 10");
				break;
			case 20:
				System.out.println("The number selected is something different");
				break;
			default:
				System.out.println("Default Statement");
				break;
			}
			
			System.out.println();
			
			number+=1;
			System.out.println(number);
			anotherNumber-=1;
			System.out.println(anotherNumber);
			number+=number;
			System.out.println(number);
			number/=decimalNumber;
			System.out.println(number);
			decimalNumber/= number;
			System.out.println(decimalNumber);
			number*=decimalNumber;
			System.out.println(number);
			number%=decimalNumber;
			System.out.println(number);
			
			
			
	}

}
