
class SearchFirstIndex {
	public static void main(String[] args) {
		int[] array = {1,1,1,1,2,2,2,3,3,3,3,5,5,5,7,7,7,9,9,10};
		SearchFirstIndex s = new SearchFirstIndex();
		System.out.println(s.getFirstIndex(array, 5));
	}
	public int getFirstIndex(int[] array, int k) {
		if(array == null || array.length == 0) 
			return -1;
		int l = 0, r = array.length - 1;
		while(l <= r) {
			int m = l + (r - l) / 2;
			if(array[m] == k && (m == 0 || array[m-1] != k)) 
				return m;
			if(array[m] < k) 
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}
}
