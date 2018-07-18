import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class WordLadder2 {
	
	public static void main(String[] args) {
		String beginWord = "hit";
		String endWord = "cog";
		Set<String> dict = new HashSet<String>(Arrays.asList("hot","dot","dog","lot","log","cog"));
		findPath(beginWord, endWord, dict);
	}

	public static List<String> findPath(String beginWord, String endWord, Set<String> dict) {
		
		if(null == beginWord || null == endWord || beginWord.length() == 0 || endWord.length() == 0 || dict.size() == 0) {
			return null;
		}
		
		List<String> path = findPathRec(beginWord, endWord, dict, new ArrayList<String>(0));
		if(path == null) {
			System.out.println("null");
		} else {
			for(String s: path) {
				System.out.print(s + " ");
			}
		}
		return path;
	}
	
	private static List<String> findPathRec(String beginWord, String endWord, Set<String> dict, List<String> currentPath) {
		char[] bWord = beginWord.toCharArray();
		for(int i = bWord.length - 1 ; i >= 0; i--) {
			for(int j = (int) 'a'; j <= (int) 'z'; j++) {
				char[] arr = Arrays.copyOf(bWord, bWord.length);
				arr[i] = (char) j;
				String newWord = new String(arr);
				if(newWord.equals(endWord)) {
					return currentPath;
				} else if(!currentPath.contains(newWord) && dict.contains(newWord)) {
					currentPath.add(newWord);
					List<String> nextPath = findPathRec(newWord, endWord, dict, currentPath);
					if(nextPath == null) {
						currentPath.remove(newWord);
					} else {
						return nextPath;
					}
				}
			}
		}
		return null;
	}
}
