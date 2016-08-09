/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * <pre>
 * Tomya is a girl. She loves Chef Ciel very much.
 * 
 * Tomya like a positive integer p, and now she wants 
 * to get a receipt of Ciel's restaurant whose total 
 * price is exactly p. The current menus of Ciel's 
 * restaurant are shown the following table.
 * 
 * 	<b>Name of Menu								price</b>
 * eel flavored water							1
 * deep-fried eel bones							2
 * clear soup made with eel livers				4
 * grilled eel livers served with grated radish	8
 * savory egg custard with eel					16
 * eel fried rice (S)							32
 * eel fried rice (L)							64
 * grilled eel wrapped in cooked egg			128
 * eel curry rice								256
 * grilled eel over rice						512
 * deluxe grilled eel over rice					1024
 * eel full-course								2048
 * 
 * Note that the i-th menu has the price 
 * 2i-1 (1 ≤ i ≤ 12).
 * 
 * Since Tomya is a pretty girl, she cannot eat a lot. 
 * So please find the minimum number of menus whose 
 * total price is exactly p. Note that if she orders 
 * the same menu twice, then it is considered as two 
 * menus are ordered. (See Explanations for details)
 * 
 * <b>Input</b>
 * The first line contains an integer T, the number 
 * of test cases. Then T test cases follow. 
 * Each test case contains an integer p.
 * 
 * <b>Output</b>
 * For each test case, print the minimum number of 
 * menus whose total price is exactly p.
 * 
 * <b>Constraints </b>
 * 1 ≤ T ≤ 5
 * 1 ≤ p ≤ 100000 (105)
 * There exists combinations of menus whose total 
 * price is exactly p.
 * 
 * <b>Sample Input </b>
 * 4
 * 10
 * 256
 * 255
 * 4096
 * 
 * <b>Sample Output </b>
 * 2
 * 1
 * 8
 * 2
 * 
 * <b>Explanations</b>
 * In the first sample, examples of the menus whose 
 * total price is 10 are the following:
 * 1+1+1+1+1+1+1+1+1+1 = 10 (10 menus)
 * 1+1+1+1+1+1+1+1+2 = 10 (9 menus)
 * 2+2+2+2+2 = 10 (5 menus)
 * 2+4+4 = 10 (3 menus)
 * 2+8 = 10 (2 menus)
 * Here the minimum number of menus is 2.
 * 
 * In the last sample, the optimal way is 
 * 2048+2048=4096 (2 menus). 
 * Note that there is no menu whose price is 4096.
 * </pre>
 * @author Pratik Sanglikar
 */
public class CIELRCPT {

	private static Scanner scanner = new Scanner(System.in);
	private static final int[] menu = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), p;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			p = scanner.nextInt();
			sb.append(getMinimumMenus(p) + "\n");
		}
		System.out.println(sb.toString());
	}

	/**
	 * for given value of P, determines the minimum number 
	 * of menus.
	 * @param p
	 * @return menuCount number of menus required to fulfil the request.
	 */
	private static int getMinimumMenus(int p) {
		int remaining_p = p, menuCount = 0;
		for (int i = menu.length - 1; i >= 0; i--) {
			while (remaining_p >= 0) {
				if (menu[i] <= remaining_p) {
					remaining_p -= menu[i];
					menuCount++;
				} else {
					break;
				}
			}
		}
		return menuCount;
	}
}
