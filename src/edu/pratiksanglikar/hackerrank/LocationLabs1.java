/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author Pratik Sanglikar
 *
 */
public class LocationLabs1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "xyz";
		ArrayList<String> operations = new ArrayList<String>(0);
		operations.add("0 2 R");
		operations.add("2 2 L");
		operations.add("0 2 R");
		System.out.println(doOperations(input, operations));
	}

	/**
	 * @param input
	 * @param operations
	 * @return
	 */
	private static char[] doOperations(String input, ArrayList<String> operations) {
		StringTokenizer st;
		int i, j;
		char array[] = input.toCharArray();
		for (String string : operations) {
			st = new StringTokenizer(string, " ");
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			if(st.nextToken().charAt(0) == 'L') {
				for(int k = i; k <= j; k++) {
					if(array[k] == 'a') {
						array[k] = 'z';
					} else {
						array[k]--;
					}
				}
			} else {
				for(int k = i; k <= j; k++) {
					if(array[k] == 'z') {
						array[k] = 'a';
					} else {
						array[k]++;
					}
				}
			}
		}
		return array;
	}
}
