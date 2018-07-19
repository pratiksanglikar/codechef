class ShortestSubArrayKSum {
	
	public int shortestSubArrayKSum(int[] array, int k) {
		if(array == null || array.length == 0) {
			return -1;
		}
		int shortestLen = -1;
		for(int a = 0; a < array.length; a++) {
			int sum = 0;
			for(int b = a; b < array.length; b++) {
				sum += array[b];
				if(sum >= k && (b - a) < shortestLen) {
					shortestLen = b - a;
				}
			}
		}
		return shortestLen;
	}
}
