package edu.pratiksanglikar.hackerrank;


class Solution1 {

	public static void main(String[] args) {
		int[] array = { 2, 4, 6, 7, 34, 44, 99, 3, 23, 1, 45, 69, 36, 21, 0, 5 };
		int[] array1 = { 1, 3, 6, 9, 13, 17 };
		int[] array2 = { 2, 4, 5, 10, 19, 20 };
		System.out.println(getMedian(array1, array2, 0, 0, array1.length - 1, array2.length - 1));
		// int sum = getMaxSum(array);
		// System.out.println(sum);
	}

	private static int getMaxSum(int[] array) {
		int currentSum = 0, maxSum = 0;
		for (int i = 0; i < array.length; i++) {
			currentSum = Math.max(currentSum, currentSum + array[i]);
			maxSum = Math.max(currentSum, maxSum);
		}
		return maxSum;
	}

	private static double getMedian(int[] array1, int[] array2, int start_a, int start_b, int end_a, int end_b) {
		if(end_a - start_a == 1 && end_b - start_b == 1) {
            return (double) (Math.max(array1[start_a], array2[start_b]) + Math.min(array1[end_a], array2[end_b]))/2;
        }
        int m1 = array1[(start_a + end_a) /2];
        int m2 = array2[(start_b + end_b) /2];
        if(m1 == m2) {
            return m1;
        }
        if(m1 < m2) {
            start_a = (start_a + end_a)/ 2;
            end_b = (start_b + end_b) / 2;
        } else {
            start_b = (start_b + end_b) / 2;
            end_a =  (start_a + end_a)/ 2;
        }
        return getMedian(array1, array2, start_a, start_b, end_a, end_b);
	}
}