/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

/**
 * @author Pratik Sanglikar
 *
 */
public class LocationLabs2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	private static boolean isReachable(int a, int b, int x, int y) {
		if(a == x && b == y) {
			return true;
		}
		if((a + b == x && b == y) || (a == x && (a + b) == y)) {
			return true;
		}
		boolean condition1 = false, condition2 = false;
		if(x >= a + b) {
			condition1 = isReachable(a + b, b, x, y);
		}
		if(y >= a + b) {
			condition2 = isReachable(a, a + b, x, y);
		}
		return condition1 || condition2;
	}
}
