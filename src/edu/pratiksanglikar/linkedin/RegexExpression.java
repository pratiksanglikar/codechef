/**
 * 
 */
package edu.pratiksanglikar.linkedin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * @author Pratik Sanglikar
 *
 */
public class RegexExpression {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String regex = null;
		String expression = null;
		while(true) {
			System.out.println("Enter regex");
			regex = br.readLine();
			if(regex.equals("exit")) {
				break;
			}
			expression = br.readLine();
			System.out.println(Pattern.matches(regex, expression));
		}
	}
}
