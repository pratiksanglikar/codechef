/**
 * 
 */
package edu.pratiksanglikar.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Pratik Sanglikar
 *
 */
public class KeyboardRow {

	public static void main(String[] args) {
		String[] array = { "Hello", "Alaska", "Dad", "Peace" };
		for (String string : getWords(array)) {
			System.out.println(string);
		}
	}

	public static String[] getWords(String[] words) {
		List<String> wordss = new ArrayList<String>(0);
		Character[] line1a = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I',
				'O', 'P' };
		Character[] line2a = { 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'l', 'k', 'j', 'h', 'g', 'f', 'd', 's',
				'a' };
		Character[] line3a = { 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'M', 'N', 'B', 'V', 'C', 'X', 'Z' };
		Set<Character> line1 = new HashSet<Character>(Arrays.asList(line1a));
		Set<Character> line2 = new HashSet<Character>(Arrays.asList(line2a));
		Set<Character> line3 = new HashSet<Character>(Arrays.asList(line3a));
		for (String word : words) {
			boolean shouldAdd = true;
			Set<Character> currentLine = null;
			if(line1.contains(word.charAt(0))) {
				currentLine = line1;
			} else if(line2.contains(word.charAt(0))) {
				currentLine = line2;
			} else if(line3.contains(word.charAt(0))) {
				currentLine = line3;
			}
			for (int i = 1; i < word.length(); i++) {
				if(!currentLine.contains(word.charAt(i))) {
					shouldAdd = false;
				}
			}
			if(shouldAdd) {
				wordss.add(word);
			}
		}
		String[] array = new String[wordss.size()];
		return wordss.toArray(array);
	}
}
