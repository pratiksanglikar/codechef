/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * <pre>
 * The Chef likes to stay in touch with his staff. 
 * So, the Chef, the head server, and the sous-chef all carry 
 * two-way transceivers so they can stay in constant contact. 
 * Of course, these transceivers have a limited range so if 
 * two are too far apart, they cannot communicate directly.
 * 
 * The Chef invested in top-of-the-line transceivers which 
 * have a few advanced features. One is that even if two 
 * people cannot talk directly because they are out of range, 
 * if there is another transceiver that is close enough to both, 
 * then the two transceivers can still communicate with each 
 * other using the third transceiver as an intermediate device.
 * 
 * There has been a minor emergency in the Chef's restaurant and 
 * he needs to communicate with both the head server and the 
 * sous-chef right away. Help the Chef determine if it is possible 
 * for all three people to communicate with each other, 
 * even if two must communicate through the third 
 * because they are too far apart.
 * 
 * <b>Input</b>
 * The first line contains a single positive integer T ≤ 100 
 * indicating the number of test cases to follow. 
 * The first line of each test case contains a positive 
 * integer R ≤ 1,000 indicating that two transceivers can 
 * communicate directly without an intermediate transceiver 
 * if they are at most R meters away from each other. 
 * The remaining three lines of the test case describe the 
 * current locations of the Chef, the head server, 
 * and the sous-chef, respectively. Each such line contains two 
 * integers X,Y (at most 10,000 in absolute value) indicating 
 * that the respective person is located at position X,Y.
 * 
 * <b>Output</b>
 * For each test case you are to output a single line containing 
 * a single string. If it is possible for all three to communicate 
 * then you should output "yes". Otherwise, you should output "no".
 * 
 * To be clear, we say that two transceivers are close enough to 
 * communicate directly if the length of the straight line connecting 
 * their X,Y coordinates is at most R.
 * 
 * <b>Example</b>
 * Input:
 * 3
 * 1
 * 0 1
 * 0 0
 * 1 0
 * 2
 * 0 1
 * 0 0
 * 1 0
 * 2
 * 0 0
 * 0 2
 * 2 1
 * 
 * Output:
 * yes
 * yes
 * no
 * </pre>
 * @author Pratik Sanglikar
 *
 */
public class COMM3 {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt();
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			double maxDistance = scanner.nextInt();
			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();
			x3 = scanner.nextInt();
			y3 = scanner.nextInt();
			sb.append(calculatePossibility(x1, y1, x2, y2, x3, y3, maxDistance) + "\n");
		}
		System.out.println(sb.toString());
	}

	/**
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @param maxDistance
	 * @return
	 */
	private static String calculatePossibility(int x1, int y1, int x2, int y2, int x3, int y3, double maxDistance) {
		double distance1 = 0.0, distance2 = 0.0, distance3 = 0.0;
		int greaterDistanceCount = 0;
		distance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		distance2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		distance3 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		if(distance1 > maxDistance) {
			greaterDistanceCount++;
		}
		if(distance2 > maxDistance) {
			greaterDistanceCount++;
		}
		if(distance3 > maxDistance) {
			greaterDistanceCount++;
		}
		if(greaterDistanceCount > 1) {
			return "no";
		}
		return "yes";
	}
}
