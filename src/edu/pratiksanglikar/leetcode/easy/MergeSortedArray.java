/**
 * 
 */
package edu.pratiksanglikar.leetcode.easy;

/**
 * @author Pratik Sanglikar
 *
 */
public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = { 1, 0 };
		int[] nums2 = { 2 };
		merge(nums1, 1, nums2, 1);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i]);
		}
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] finalArray = new int[m + n];
		int k = m + n - 1;
		m--;
		n--;
		while (m >= 0 || n >= 0) {
			if (m >= 0 && n >= 0) {
				if (nums1[m] > nums2[n]) {
					finalArray[k--] = nums2[n--];
				} else {
					finalArray[k--] = nums1[m--];
				}
			} else if (m >= 0) {
				finalArray[k--] = nums1[m--];
			} else if (n >= 0) {
				finalArray[k--] = nums2[n--];
			}
		}
		for (int i = 0; i < finalArray.length; i++) {
			nums1[i] = finalArray[i];
		}
	}
}
