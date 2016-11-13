/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

/**
 * @author Pratik Sanglikar
 *
 */
public class URLShortner {
	
	private static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
	private static final int BASE = ALPHABET.length();
	
	public static String encode(long number) {
		StringBuilder sb = new StringBuilder();
		while(number > 0) {
			sb.insert(0, ALPHABET.charAt((int) (number % BASE)));
			number /= BASE;
		}
		return sb.toString();
	}
	
	public static long decode(String shortUrl) {
		long value = 1;
		for (char ch : shortUrl.toCharArray()) {
			value *= ALPHABET.indexOf(ch);
		}
		return value;
	}
	
	public static void main(String[] args) {
		long value = 298234563;
		String shortURL = encode(value);
		System.out.println("ShortURL for value = " + value + " is " + shortURL);
		System.out.println("Value for shortURL = " + shortURL + " is " + value);
	}
	
}
