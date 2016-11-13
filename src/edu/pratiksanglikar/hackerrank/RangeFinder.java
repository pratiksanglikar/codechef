package edu.pratiksanglikar.hackerrank;

/*
 * Given a sorted array with duplicates and a number, find the range in the form
 * of (startIndex, endIndex) of that number. For example, find_range({0 2 3 3 3
 * 10 10}, 3) should return (2,4). find_range({0 2 3 3 3 10 10}, 6) should
 * return (-1,-1). The array and the number of duplicates can be large.
 */

class RangeFinder {
	public static void main(String[] args) {
		int[] array = { 0, 0, 0, 0, 0, 2, 3, 3, 3, 3, 3, 3, 3, 10, 10 };
		int key = 0;
		printRange(array, key);
	}

	private static void printRange(int[] array, int key) {
		int leftIndex = binarySearch(array, key, true, 0, array.length - 1);
		int rightIndex = binarySearch(array, key, false, 0, array.length - 1);
		System.out.println("[" + leftIndex + "," + rightIndex + "]");
	}

	private static int binarySearch(int[] array, int key, boolean toLeft, int start, int end) {
		if(start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		int inc = 1;
		if (toLeft) {
			inc = -1;
		}
		int i = mid;
		if (array[mid] == key) {
			for (i = mid; (i >= 0 && i < array.length); i += inc) {
				if (array[i] != key) {
					break;
				}
			}
			return i - inc;
		} else if (array[mid] > key) {
			return binarySearch(array, key, toLeft, start, mid - 1);
		} else if (array[mid] < key) {
			return binarySearch(array, key, toLeft, mid + 1, end);
		} else {
			return -1;
		}
	}
}