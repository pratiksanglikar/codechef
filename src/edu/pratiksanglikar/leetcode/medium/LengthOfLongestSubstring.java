/**
 * 
 */
package edu.pratiksanglikar.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pratik Sanglikar
 *
 */
public class LengthOfLongestSubstring {
	
	public static void main(String[] args) {
		System.out.println(getLength("q"));
	}
	
	public static int getLength(String s) {
		/*if(s.length() == 1) {
			return 1;
		}*/
		char[] array = s.toCharArray();
        int longest = 0;
        Set<Character> set = new HashSet<Character>();
        for(int startIndex = 0; startIndex < array.length; startIndex++) {
        	set = new HashSet<Character>();
              set.add(array[startIndex]);
              for(int j=startIndex+1;j<array.length;j++) {
                if(set.contains(array[j])) {
                    break;
				} else {
                    set.add(array[j]);
                }
             }
             if(longest < set.size()) {
            	 longest = set.size();
             } 
        }
        return longest;
	}
}
