/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * <pre>
 * Chef is now a corporate person. He has to attend office regularly. 
 * But chef does not want to go to office, rather he wants to stay home 
 * and discover different recipes and cook them.
 * 
 * In the office where chef works, has two guards who count how many times 
 * a person enters into the office building. Though the duty of a guard is 
 * 24 hour in a day, but sometimes they fall asleep during their duty and 
 * could not track the entry of a person in the office building. But one 
 * better thing is that they never fall asleep at the same time. At least 
 * one of them remains awake and counts who enters into the office.
 * 
 * Now boss of Chef wants to calculate how many times Chef has entered into 
 * the building. He asked to the guard and they give him two integers A and B, 
 * count of first guard and second guard respectively.
 * 
 * Help the boss to count the minimum and maximum number of times Chef could 
 * have entered into the office building.
 * 
 * <b>Input</b>
 * The first line of the input contains an integer T denoting the number of 
 * test cases. The description of the T test cases follows.
 * 
 * Each test case consists of a line containing two space separated integers A and B.
 * 
 * <b>Output</b>
 * For each test case, output a single line containing two space separated integers, 
 * the minimum and maximum number of times Chef could have entered into the office 
 * building.
 * 
 * <b>Constraints</b>
 * 1 ≤ T ≤ 100
 * 0 ≤ A, B ≤ 1000000
 * 
 * Example
 * Input:
 * 1
 * 19 17
 * 
 * Output:
 * 19 36
 * </pre>
 * @author Pratik Sanglikar
 */
public class REMISS {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			int count1 = scanner.nextInt(), count2 = scanner.nextInt();
			int minimum, maximum = 0;
			minimum = count1 > count2 ? count1 : count2;
			maximum = count1 + count2;
			sb.append(minimum + " " + maximum + "\n");
		}
		System.out.println(sb.toString());
	}
}
