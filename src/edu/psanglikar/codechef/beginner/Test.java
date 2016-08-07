/**
 * 
 */
package edu.psanglikar.codechef.beginner;

/**
 * <pre>
 * Your program is to use the brute-force approach in order to 
 * find the Answer to Life, the Universe, and Everything. 
 * More precisely... 
 * rewrite small numbers from input to output. 
 * Stop processing input after reading in the number 42.
 * All numbers at input are integers of one or two digits.
 * 
 * Example Input:
 * 1
 * 2
 * 88
 * 42
 * 99
 * 
 * Output:
 * 1
 * 2
 * 88
 * @author Pratik Sanglikar
 * </pre>
 */
public class Test {
	public static void main(String args[]) {
		java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		while(true) {
			try {
				int latestInput = Integer.parseInt(reader.readLine());
				if(latestInput != 42) {
					System.out.println(latestInput);
				} else {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
