/**
 * 
 */
package edu.psanglikar.codechef.beginner;

/**
 * @author Pratik Sanglikar
 *
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
