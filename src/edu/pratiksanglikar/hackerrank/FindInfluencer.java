/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

/**
 * @author Pratik Sanglikar
 *
 */
public class FindInfluencer {
	public static void main(String[] args) {
        boolean[][] matrix = new boolean[10][10];
        
        System.out.println(findInfluencer(matrix));
    }
    
    public static int findInfluencer(boolean[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int potentialInfluencer = -1;
        boolean follows = false;
        for(int i=0;i<rows;i++) {
            follows = false;
            for(int j=0;j<columns;j++) {
                if(matrix[i][j] && i != j) {
                    follows = true;
                    break;
                }
            }
            if(!follows) {
                potentialInfluencer = i;
                if(isInfluencer(matrix, potentialInfluencer)) {
                    return potentialInfluencer;
                }
            }    
        }
        return potentialInfluencer;
    }
    
    private static boolean isInfluencer(boolean[][] matrix, int influencer) {
        for(int j=0;j<matrix.length;j++) {
            if(j != influencer && !matrix[j][influencer]) {
                return false;
            }
        }
        return true;
    }
}
