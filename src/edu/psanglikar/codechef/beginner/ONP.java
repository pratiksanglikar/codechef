/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;
import java.util.Stack;

/**
 * <pre>
 * Reverse Polish Notation (RPN) is a mathematical 
 * notation where every operator follows all of its 
 * operands. For instance, to add three and four, 
 * one would write "3 4 +" rather than "3 + 4". 
 * If there are multiple operations, the operator 
 * is given immediately after its second operand; 
 * so the expression written "3 − 4 + 5" would be 
 * written "3 4 − 5 +" first subtract 4 from 3, 
 * then add 5 to that.
 * 
 * Transform the algebraic expression with brackets 
 * into RPN form.
 * 
 * You can assume that for the test cases below only 
 * single letters will be used, brackets [] will not 
 * be used and each expression has only one RPN 
 * form (no expressions like a*b*c)
 * 
 * <b>Input</b>
 * The first line contains t, the number of 
 * test cases (less then 100).
 * 
 * Followed by t lines, containing an expression 
 * to be translated to RPN form, where the length 
 * of the expression is less then 400.
 * 
 * <b>Output</b>
 * The expressions in RPN form, one per line.
 * 
 * <b>Example</b>
 * Input:
 * 3
 * (a+(b*c))
 * ((a+b)*(z+x))
 * ((a+t)*((b+(a+c))^(c+d)))
 * 
 * Output:
 * abc*+
 * ab+zx+*
 * at+bac++cd+^*
 * </pre>
 * @author Pratik Sanglikar
 */
public class ONP {

	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		while(numberOfTestCases-- > 0) {
			String expression = scanner.next();
			sb.append(convertToPostFix(expression) + "\n");
		}
		System.out.println(sb.toString());
	}

	/**
	 * @param expression
	 * @return
	 */
	private static String convertToPostFix(String expression) {
		Stack<String> operandStack = new Stack<String>();
		Stack<Character> operatorStack = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if(ch == '(') {
				// Do nothing.
			}
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '~') {
				operatorStack.push(ch);
			}
			if(Character.isLetter(ch)) {
				operandStack.push(String.valueOf(ch));
			}
			if(ch == ')') {
				char operator = operatorStack.pop();
				String secondOperand = operandStack.pop();
				String firstOperand = operandStack.pop();
				String newOperand = firstOperand + secondOperand + operator;
				operandStack.push(newOperand);
			}
		}
		return operandStack.pop();
	}

}
