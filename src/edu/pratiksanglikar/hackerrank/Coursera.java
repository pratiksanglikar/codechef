/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

import java.util.Arrays;

/**
 * @author Pratik Sanglikar
 *
 */
public class Coursera {
	static int[]  array = {5,6,8,8,5};
	// 7
	
	public static void main(String[] args) {
		/*int count = 0;
		while(!isArraySame(array)) {
			Arrays.sort(array);
			for(int i = array.length - 2; i >= 0; i--) {
				array[i]++;
			}
			count++;
		}
		System.out.println(count);*/
		System.out.println(numberOfSteps(array));
		
	}

	public static int numberOfSteps(int[] a) {
	    if( a.length==0 ) return 0;

	    int min= a[0];
	    int total = a[0];
	    for(int i=1;i<a.length;i++) {
	        if( a[i] < min ) min = a[i];
	        total += a[i];
	    }

	    return total - a.length * min;
	}
	
	
	public static boolean isArraySame(int[] array) {
		for(int i = 0;i < array.length - 1; i++) {
			if(array[i] != array[i+1]) {
				return false;
			}
		}
		return true;
	}
}
