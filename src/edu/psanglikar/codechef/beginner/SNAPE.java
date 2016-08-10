/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <pre>
 * Professor Snape has lots of potions. 
 * Bottles containing all types of 
 * potions are stacked on shelves which 
 * cover the entire wall from floor to ceiling. 
 * Professor Snape has broken his bones 
 * several times while climbing the top 
 * shelf for retrieving a potion. 
 * He decided to get a ladder for him. 
 * But he has no time to visit Diagon Alley. 
 * So he instructed Ron Weasley to make a 
 * ladder for him. Professor Snape 
 * specifically wants a step ladder 
 * which looks like an inverted 
 * 'V' from side view.
 * 
 * 	ls	/\ rs
 * 	   /__\
 * 		b
 * 
 * Professor just mentioned two things 
 * before vanishing-
 * 
 * * B - separation between left side 
 * (LS) and right side (RS) on the ground
 * * LS - the length of left side
 * 
 * What should be the length of RS? 
 * At one extreme LS can be vertical 
 * and at other RS can be vertical. 
 * Ron is angry and confused. 
 * Since Harry is busy battling Voldemort, 
 * its your duty to help him find the 
 * minimum and maximum length of RS.
 * 
 * Input
 * 
 * First line contains single integer T, 
 * the number of test cases. 
 * Then T lines follow each containing 
 * 2 integers - B and LS.
 * 
 * Output
 * Output T lines, each containing minimum 
 * value of RS and maximum value of RS, 
 * separated by space. The answer (RS) 
 * will be considered correct if it 
 * has relative and absolute error 
 * less than 10-2.
 * 
 * Constraints
 * 
 * 1 ≤ T ≤ 1000
 * 1 ≤ B < LS ≤ 1000
 * 
 * Example
 * 
 * Input:
 * 3
 * 4 5
 * 10 12
 * 10 20
 * 
 * Output:
 * 3.0 6.40312
 * 6.63325 15.6205
 * 17.3205 22.3607
 * </pre>
 * @author Pratik Sanglikar
 */
public class SNAPE {

	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		DecimalFormat df = new DecimalFormat("##.00##");
		while(numberOfTestCases-- > 0) {
			int b, ls;
			b = scanner.nextInt();
			ls = scanner.nextInt();
			double minRS = getMinimumRS(b, ls);
			double maxRS = getMaximumRs(b, ls);
			sb.append(df.format(minRS) + " " + df.format(maxRS) + "\n");
		}
		System.out.println(sb.toString());
	}

	/**
	 * @param b
	 * @param ls
	 * @return
	 */
	private static double getMaximumRs(int b, int ls) {
		return Math.sqrt(ls * ls + b * b);
	}

	/**
	 * @param b
	 * @param ls
	 * @return
	 */
	private static double getMinimumRS(int b, int ls) {
		return Math.sqrt(ls * ls - b * b);
	}
}
