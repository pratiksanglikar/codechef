//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
// Also, sorry that the "Paste" feature no longer works! GitHub broke
// this (so we'll switch to a new provider): https://blog.github.com\
// /2018-02-18-deprecation-notice-removing-anonymous-gist-creation/
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class
import java.util.Arrays;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    int[] array = {9,11,2,7,3};
    OptimalMin min = new OptimalMin(array);
    System.out.println(min.getMin(0,4));
        System.out.println(min.getMin(2,3));
        System.out.println(min.getMin(3,3));
  }
}

// you can add other public classes to this editor in any order
public class OptimalMin
{
  private int[][] data;
  
  public OptimalMin(int[] array) {
    int n = array.length;
    data = new int[n][n];
    
    for (int[] row: data)
	    Arrays.fill(row, 999);

    //data[0][0] = array[0];
    for(int j = 0; j < n; j++) {
      for(int i = j; i < n; i++) {
        if(i == j) {
        	data[i][j] = array[j];
        } else {
        	data[i][j] = Math.min(data[i-1][j], array[i]);
          	data[j][i] = data[i][j];
        }
      }
    }
    
    for (int[] row: data)
	    System.out.println(Arrays.toString(row));
    
  }
  
  public int getMin(int i, int j) {
    if(this.data != null)
	  	return this.data[i][j];
    return Integer.MAX_VALUE;
  }
}
