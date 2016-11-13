package edu.pratiksanglikar.hackerrank;

import java.util.Stack;

/*Given a list of integers and write a function that returns the sum of the contiguous subsequence with maximum sum. */
class ABC {
    
    public static void main(String[] args) {
       int[] array = {2,4,6,7,34,44,99,3,23,1,45,69,36,21,0,5}; 
       int sum = getMaxSum(array);
       String rpn = "12+4*5+3-";
       System.out.println(calculateReversePolishNotation(rpn));
    }
    
    
    private static double calculateReversePolishNotation(String notation) {
        char[] array = notation.toCharArray();
        Stack<Integer> operandStack = new Stack<Integer>();
        for(int i = 0 ; i < array.length ; i++) {
            if(Character.isDigit(array[i])) {
                operandStack.push(Character.digit(array[i], 10));
            } else {
                 int a, b;
                 if(!operandStack.isEmpty()) {
                     a = operandStack.pop();
                 } else {
                     throw new MalformedExpressionException("Expression not valid");
                 }
                 if(!operandStack.isEmpty()) {
                     b = operandStack.pop();
                 } else {
                     throw new MalformedExpressionException("Expression not valid");
                 }
                 int result = performOperation(array[i], a, b);
                 operandStack.push(result);
            }        
        }
        double result = operandStack.pop();
        if(!operandStack.isEmpty()) {
            throw new MalformedExpressionException("Expression not valid");
        }
        return result;
    }
    
    private static int performOperation(char operation, int a, int b) {
        switch(operation) {
            case '+':
                return b + a;
            case '-':
                return b - a;
            case '*':
                return b * a;
            case '/':
                return b / a;
            default:
                throw new UnsupportedOperationException("Operation not supported");
        }
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private static int getMaxSum(int[] array) {
        int currentSum = 0, maxSum = 0;
        for(int i = 0 ; i < array.length; i++) {
            currentSum = Math.max(currentSum, currentSum + array[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
    
    private static double getMedian(int[] array1, int[] array2, int start_a, int start_b, int end_a, int end_b)     {
        // The first base case. where the arrays are reduced to the size of 2.
        if(end_a - start_a == 1 && end_b - start_b == 1) {
            return (double) (Math.max(array1[start_a], array2[start_b]) + Math.min(array1[end_a], array2[end_b]))/2;
        }
        int m1 = array1[(start_a + end_a) /2];
        int m2 = array2[(start_b + end_b) /2];
        if(m1 == m2) {
            return m1;
        }
        if(m1 < m2) {
            start_a = (start_a + end_a)/ 2;
            end_b = (start_b + end_b) / 2;
        } else {
            start_b = (start_b + end_b) / 2;
            end_a =  (start_a + end_a)/ 2;
        }
        return getMedian(array1, array2, start_a, start_b, end_a, end_b);
    }
}


