/**
 * 
 */
package edu.pratiksanglikar.ctci.bitmanipulation;

/**
 * @author Pratik Sanglikar
 *
 */
public class ConvertToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(convertToBinary("5.625"));
	}

	public static String convertToBinary(String num) {
		double number = convertToDouble(num);
		return convertToBinary(number);
	}

	/**
	 * @param number
	 * @return
	 */
	private static String convertToBinary(double number) {
		int beforeDec = (int) number;
		double afterDec =  number % 1;
		StringBuffer sb = new StringBuffer();
		while(beforeDec > 0) {
			sb.insert(0, beforeDec % 2);
			beforeDec /= 2;
		}
		if(afterDec > 0) {
			sb.append(".");
		}
		while(afterDec != 0) {
			afterDec *= 2;
			if(afterDec > 1) {
				sb.append("1");
			} else {
				sb.append("0");
			}
			afterDec = afterDec % 1;
		}
		return sb.toString(); 
	}

	/**
	 * @param num
	 * @return
	 */
	private static double convertToDouble(String num) {
		char[] array = num.toCharArray();
		double result = 0;
		double factor = 10;
		boolean dec = false;
		for (char c : array) {
			if (c == '.') {
				dec = true;
			} else if (!Character.isDigit(c)) {
				return Double.MIN_VALUE;
			} else if (Character.isDigit(c)) {
				if (!dec) {
					result *= 10;
					result += Integer.parseInt(c + "");
				} else {
					result += (Integer.parseInt(c + "") / factor);
					factor *= 10;
				}
			}
		}
		return result;
	}
}
