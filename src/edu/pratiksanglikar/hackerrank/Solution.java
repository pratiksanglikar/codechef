package edu.pratiksanglikar.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		int testCases = Integer.parseInt(br.readLine().trim());
		String input;
		while (testCases-- > 0) {
			input = br.readLine().trim();
			calculate(input);
		}
		System.out.println(sb.toString());
	}

	static void calculate(String input) {
		Stack<String> operands = new Stack<String>();
		Stack<String> operators = new Stack<String>();
		if (input.startsWith("*") || input.endsWith("*")) {
			sb.append("Syntax Error\n");
			return;
		}
		char[] array = input.toCharArray();
		for (int i = 0; i < array.length;) {
			if (Character.isDigit(array[i])) {
				long number = 0;
				while (i < array.length && Character.isDigit(array[i])) {
					number *= 10;
					number += Long.parseLong("" + array[i]);
					i++;
				}
				operands.push("" + number);
			} if (i < array.length && array[i] == '*') {
				if (array[i + 1] == '*') {
					/*if(!operators.isEmpty()) {
						if(operators.peek().equals("^")) {
							operators.pop();
							long operand1 = Long.parseLong(operands.pop());
							long operand2 = Long.parseLong(operands.pop());
							operands.push("" + (int) Math.pow(operand1, operand2));
						}
					}*/
					i++;
					operators.push("^");
				} else {
					if (operators.isEmpty()) {
						operators.push("*");
					} else {
						while (!operators.isEmpty()) {
							String operator = operators.pop();
							if(operands.size() < 2) {
								sb.append("Syntax Error\n");
								return;
							}
							long operand1 = Long.parseLong(operands.pop());
							long operand2 = Long.parseLong(operands.pop());
							if (operator.equals("*")) {
								operands.push("" + (int) operand1 * operand2);
							} else {
								operands.push("" + (int) Math.pow(operand1, operand2));
							}
						}
						operators.push("*");
					}
				}
			}/* else {
				sb.append("Syntax Error 2\n");
				return;
			}*/
			i++;
		}
		while (!operators.isEmpty()) {
			String operator = operators.pop();
			if(operands.size() < 2) {
				sb.append("Syntax Error\n");
				return;
			}
			long operand1 = Long.parseLong(operands.pop());
			long operand2 = Long.parseLong(operands.pop());
			if (operator.equals("*")) {
				operands.push("" + operand1 * operand2);
			} else {
				operands.push("" + Math.pow(operand1, operand2));
			}
		}
		if (operands.size() >= 2) {
			sb.append("Syntax Error\n");
		} else {
			long answer = Long.parseLong(operands.pop());
			sb.append(answer % 1000000007 + "\n");
		}
	}
}