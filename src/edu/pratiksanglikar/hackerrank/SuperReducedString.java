package edu.pratiksanglikar.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuperReducedString {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();
        String reducedString = reduce(input);
        if(reducedString.length()==0) {
            System.out.println("Empty String");
        } else {
            System.out.println(reducedString);
        }
        
    }
    
    private static String reduce(String input) {
        char[] array = input.toCharArray();
        String recursiveString;
        for(int i = 0; i < input.length() - 1; i++) {
            if(array[i] == array[i + 1]) {
                recursiveString = getRecursiveString(i, input);
                return reduce(recursiveString);
            }
        }
        return input;
    }
    
    private static String getRecursiveString(int i, String input) {
        String recursive = "";
        if(i != 0) {
            recursive += input.substring(0, i);
        }
        if(i+2 < input.length()) {
            recursive += input.substring(i+2, input.length());
        }
        System.out.println(recursive);
        return recursive;
    }
}