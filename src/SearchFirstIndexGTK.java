
/**
* Search first index greater than k in a given sorted array.
*
*/
class SearchFirstIndexGTK {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 5, 7, 9, 10 };
		SearchFirstIndexGTK s = new SearchFirstIndexGTK();
		System.out.println(s.getFirstIndexGTK(array, 8));
	}

	private int getFirstIndexGTK(int[] array, int k) {
		int result = 0;
		int l = 0, r = array.length - 1;
		while(l <= r) {
			int m = l + (r - l) / 2;
			if(array[m] == k) {
				return m + 1;
			}
			if((m == 0 || array[m - 1] < k) && array[m] > k) {
				return m;
			}
			if(m == array.length - 1 && array[m] < k) {
				return m + 1;
			}
			if(k > array[m]) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return result;
	}
	
}
