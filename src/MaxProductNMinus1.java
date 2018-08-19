import java.util.Arrays;

public class MaxProductNMinus1 {
	
	public static void main(String[] args) {
		int[] array = {3,2,5,4};
		MaxProductNMinus1 mn = new MaxProductNMinus1();
		System.out.println(mn.maxProductNMinus1(array));
	}
	
	public int maxProductNMinus1(int[] array) {
		int[] tmp = new int[array.length];
		Arrays.fill(tmp, 1);
		int f = 1;
		int b = 1;
		for(int i = 0; i < array.length; i++) {
			int j = array.length - 1 - i;
			tmp[i] *= f;
			tmp[j] *= b;
			f *= array[i];
			b *= array[j];
		}
		int maxProd = Integer.MIN_VALUE;
		for(int i: tmp) {
			if(i > maxProd) {
				maxProd = i;
			}
		}
		System.out.println(Arrays.toString(tmp));
		return maxProd;
	}

}
