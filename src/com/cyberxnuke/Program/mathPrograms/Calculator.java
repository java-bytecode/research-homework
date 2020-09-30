/**
 * 
 */
package com.cyberxnuke.Program.mathPrograms;

import com.cyberxnuke.Program.loginSystem.UserLogin;

/**
 * @author CyberxNuke
 *
 */
public class Calculator implements CalculatorInterface {
	
	UserLogin loginObj;
	
	public Calculator(UserLogin loginObj){
		this.loginObj = loginObj;
	}

	// Static Polymorphism, Compile Time Polymorphism
	
	@Override
	public int sum(int number1, int number2){
		
		if(loginObj.checkLoginStatus()) {
			return number1 + number2;
		}
		return -1;
	}

	@Override
	public double sum(double number1, double number2) {
		if(loginObj.checkLoginStatus()) {
			return number1 + number2;
		}
		return -1;
	}

	@Override
	public int division(int number1, int number2) {
		if(loginObj.checkLoginStatus()) {
			try {
				return number1 / number2;
			} catch(ArithmeticException e) {
				System.out.println(e.fillInStackTrace());
			}
			
		}
		return -1;
	}

	@Override
	public double division(double number1, double number2) {
		if(loginObj.checkLoginStatus()) {
			return number1 / number2;
		}
		return -1;
	}

}
