/**
 * 
 */
package edu.pratiksanglikar.leetcode.easy;

/**
 * @author Pratik Sanglikar
 *
 */
public class LongestPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strings = {"a","b"};
		System.out.println(longestPrefix(strings));
		

	}
	
	public static String longestPrefix(String[] strs) {
		if(strs == null || strs.length == 0) {
            return "";
        }
        int maxLen = strs[0].length();
        for(int i=0; i < maxLen; i++) {
            char current = strs[0].charAt(i);
            for(int j=0;j<strs.length;j++) {
                if(strs[j].length() <= i || strs[j].charAt(i) != current) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
	}
}
