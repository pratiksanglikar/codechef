/**
 * 
 */
package edu.pratiksanglikar.leetcode.easy;

/**
 * @author Pratik Sanglikar
 *
 */
public class ComplementNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Complemented" + complementNumber(4));
	}
	
	public static int complementNumber(int n) {
		return ((Integer.highestOneBit(n) << 1) - 1) ^ n;
	}
}
