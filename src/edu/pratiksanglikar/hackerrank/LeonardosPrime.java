/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeonardosPrime {

    static long[] array = new long[16];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine().trim());
        long number = 0;
        StringBuffer sb = new StringBuffer();
        fillArray();
        while(testcases-- > 0) {
            number = Long.parseLong(br.readLine().trim());
            sb.append(getUniquePrimeFactors(number) + "\n");
        }
        System.out.println(sb.toString());
    }
    
    static void fillArray() {
        long multiplication = 6;
        array[2] = 6;
        int primeCount = 3;
        for(int i = 4 ; i < 50 ; i++) {
            boolean isPrime = isPrime(i);
            
            if(isPrime) {
                multiplication *= i;
                array[primeCount] = multiplication;
                primeCount++;
            }
        }
    }
    
    static int getUniquePrimeFactors(Long number) {
        if(number < 2) {
            return 0;
        }
        if(number == 2 || number == 3) {
            return 1;
        }
        int primeCount = 2;
        while(array[primeCount] < number && primeCount < 16) primeCount++;
       if(array[primeCount] == number) {
    	   return primeCount;
       }
        return primeCount - 1;
    }
    
    static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        if(n == 2 || n == 3) {
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0) {
        	return false;
        }
        for(int j = 5; j < Math.sqrt(n) + 1; j += 2) {
            if(n % j == 0) {
                return false;
            }
        }
        return true;
    }
}