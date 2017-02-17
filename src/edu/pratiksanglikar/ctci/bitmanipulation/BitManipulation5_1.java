/**
 * 
 */
package edu.pratiksanglikar.ctci.bitmanipulation;

/**
 * @author Pratik Sanglikar
 *
 */
public class BitManipulation5_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		manipulate(128, 7, 3, 5);
	}

	public static int manipulate(int n, int m, int i, int j) {
		char[] nBinary = Integer.toBinaryString(n).toCharArray();
		char[] mBinary = Integer.toBinaryString(m).toCharArray();
		System.out.println(nBinary);
		System.out.println(mBinary);
		int rIndex = nBinary.length - i - 1;
		for (int it = mBinary.length - 1; it >= 0; it--) {
			nBinary[rIndex--] = mBinary[it];
		}
		System.out.println(nBinary);
		return Integer.parseInt(new String(nBinary), 2);
	}
}
