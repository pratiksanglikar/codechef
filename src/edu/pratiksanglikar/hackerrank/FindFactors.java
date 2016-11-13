/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

/**
 * @author Pratik Sanglikar
 *
 */
public class FindFactors {

    public static void main(String[] args) {
        System.out.println(printFactors(234));        
    }
    
    private static String printFactors(int nmb) {
    	int number = nmb;
        StringBuilder sb = new StringBuilder();
        if(number <= 1) {
            sb.append(1 + "");
            return sb.toString();
        }
        if(number <= 3) {
            sb.append(1 + " " + number);
            return sb.toString();
        }
        while(number % 2 == 0) {
            sb.append(2 + " ");
            number /= 2;
        }
        while(number % 3 == 0) {
            sb.append(3 + " ");
            number /= 3;
        }
        for(int i = 5; i <= Math.sqrt(nmb) ; i+=2) {
            while(number % i == 0) {
                sb.append(i + " ");
                number /= i;
            }
        }
        return sb.toString();
    }    
}
