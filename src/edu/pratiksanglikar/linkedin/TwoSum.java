/**
 * 
 */
package edu.pratiksanglikar.linkedin;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pratik Sanglikar
 *
 */
public class TwoSum {
	
	public static void main(String[] args) {
		int sum = 315;
		boolean isPresent = false;
		int[] array = {234,34,7,3,6,8,9,24,67,87,81,38,67};
		Set<Integer> set = new HashSet<Integer>();
		for (int i : array) {
			set.add(i);
		}
		for(int i: array) {
			if(set.contains(sum - i)) {
				isPresent = true;
				break;
			}
		}
		if(isPresent) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
