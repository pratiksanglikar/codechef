import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Pratik Sanglikar
 *
 */
public class InfixToPostfix {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String args[]) throws IOException {
		String input = br.readLine().trim();
		System.out.println(getFirstRepeating(input));
	}


	/**
	 * @param input
	 * @return
	 */
	private static char getFirstRepeating(String input) {
		char[] array = input.toCharArray();
		boolean[] hasOccured = new boolean[57];
		for (char c : array) {
			if(!hasOccured[((int) c) - 65]) {
				hasOccured[((int) c) - 65] = true;
			}
		}
		for (int i = 0; i < 57; i++) {
			if(hasOccured[i]) {
				return ((char) (i + 65));
			}
		}
		return '\0';
	}
}

