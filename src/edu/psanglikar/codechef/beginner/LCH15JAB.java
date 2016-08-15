/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author Pratik Sanglikar
 *
 */
public class LCH15JAB {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int numberOfTestCases = Integer.parseInt(br.readLine().trim());
		char[] array;
		Character temp;
		ArrayList<Integer> tempList;
		HashMap<Character, Integer> hashmap;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			array = br.readLine().trim().toCharArray();
			hashmap = new HashMap<Character, Integer>();
			for (int i = 0; i < array.length; i++) {
				temp = Character.valueOf(array[i]);
				if (hashmap.containsKey(temp)) {
					hashmap.put(temp, hashmap.get(temp) + 1);
				} else {
					hashmap.put(temp, 1);
				}
			}
			tempList = new ArrayList<Integer>(hashmap.values());
			Collections.sort(tempList, Collections.reverseOrder());
			if (tempList.get(0) == (array.length - tempList.get(0))) {
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb.toString());
	}
}