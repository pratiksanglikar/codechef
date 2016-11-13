/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

/**
 * @author Pratik Sanglikar
 *
 */
public class Power {
	
	
	public static double power(double number, double power) {
		double answer = 1;
		double absPow = Math.abs(power);
		if(number == 0) {
			return 0;
		}
		if(number == 1) {
			return 1;
		}
		if(power == 0) {
			return 1;
		}
		while(absPow-- > 0) {
			answer *= number;
		}
		if(power < 0) {
			return (1.0 / answer);
		}
		return answer;
	}
	
	public static double pow(double number, int power) {
		if (power == 0) {
			return 1;
		}
		if (number == 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		}
		if (power < 0) {
			return pow(1 / number, -power);
		}
		if (power % 2 == 0) {
			return pow(number * number, power / 2);
		} else {
			return number * pow(number * number, (power - 1) / 2);
		}
	}

	public static void main(String[] args) {
		for (int i = -5; i < 6; i++) {
			System.out.println("8 ^ " + i + " = " + power(8, i));
			System.out.println("8 ^ " + i + " = " + pow(8, i));
		}
	}
}
