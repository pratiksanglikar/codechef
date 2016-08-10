/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * <pre>
 * The chef has a recipe he wishes to use for his guests, 
 * but the recipe will make far more food than he can 
 * serve to the guests. The chef therefore would like 
 * to make a reduced version of the recipe which has 
 * the same ratios of ingredients, but makes less food. 
 * The chef, however, does not like fractions. 
 * The original recipe contains only whole numbers of 
 * ingredients, and the chef wants the reduced recipe 
 * to only contain whole numbers of ingredients as well. 
 * Help the chef determine how much of each ingredient 
 * to use in order to make as little food as possible.
 * 
 * <b>Input</b>
 * Input will begin with an integer T, the number of 
 * test cases. Each test case consists of a single line. 
 * The line begins with a positive integer N, the number 
 * of ingredients. N integers follow, each indicating 
 * the quantity of a particular ingredient that is used.
 * 
 * <b>Output</b>
 * For each test case, output exactly N space-separated 
 * integers on a line, giving the quantity of each 
 * ingredient that the chef should use in order to make 
 * as little food as possible.
 * 
 * <b>Sample Input</b>
 * 3
 * 2 4 4
 * 3 2 3 4
 * 4 3 15 9 6
 * 
 * <b>Sample Output</b>
 * 1 1
 * 2 3 4
 * 1 5 3 2
 * 
 * <b>Constraints</b>
 * T ≤ 100
 * 2 ≤ N ≤ 50
 * All ingredient quantities are between 1 and 1000, inclusive.
 * </pre>
 * @author Pratik Sanglikar
 */
public class RECIPE {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt();
		int[] ingredients;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			int numberOfIngredients = scanner.nextInt();
			ingredients = new int[numberOfIngredients];
			for (int i = 0; i < ingredients.length; i++) {
				ingredients[i] = scanner.nextInt();
			}
			int gcd = calculateGCD(ingredients);
			for (int i = 0; i < ingredients.length; i++) {
				sb.append((ingredients[i] / gcd) + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	/**
	 * @param ingredients
	 * @return
	 */
	private static int calculateGCD(int[] ingredients) {
		int result = ingredients[0];
		for (int i = 1; i < ingredients.length; i++) {
			result = calculateGCD(ingredients[i], result);
		}
		return result;
	}

	/**
	 * @param i
	 * @param result
	 * @return
	 */
	private static int calculateGCD(int p, int q) {
		if (q == 0) {
			return p;
		} else {
			return calculateGCD(q, p % q);
		}
	}
}
