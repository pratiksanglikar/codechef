/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Pratik Sanglikar
 *
 */
public class IsInteger {
	public static boolean isInteger(String string) {
        string = string.trim();
        char[] array = string.toCharArray();
        int i = 0;
        if(array[0] == '+' || array[0] == '-') {
            i++;
        }
        for(; i < array.length; i++) {
            if(!Character.isDigit(array[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isIntegerRegex(String string) {
        string = string.trim();
        return Pattern.matches("^[+-]?[0-9]+$", string);
    }
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String input = scanner.nextLine();
    	while(!input.equals("exit")) {
    		System.out.println("Enter input: ");
    		input = scanner.nextLine();
    		System.out.println("isInteger oldschool: " + isInteger(input));
    		System.out.println("isInteger regexexpr: " + isIntegerRegex(input));
    	}
    	scanner.close();
    }
}
