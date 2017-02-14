/**
 * 
 */
package edu.pratiksanglikar.leetcode.easy;

/**
 * @author Pratik Sanglikar
 *
 */
public class AddBinaryNumbers {

	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
	}
	
	public static String addBinary(String a, String b) {
		char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        char sum = '0', carry = '0';
        int i = a1.length - 1;
        int j = b1.length - 1;
        StringBuffer sb = new StringBuffer();
        while(i >= 0 && j >= 0) {
            if(carry == '0') {
                if((a1[i] == '1' && b1[j] == '0') || (a1[i] == '0' && b1[j] == '1')) {
                    sum = '1';
                    carry = '0';
                } else if(a1[i] == '0' && b1[j] == '0') {
                    sum = '0';
                    carry = '0';
                } else if(a1[i] == '1' && b1[j] == '1') {
                    sum = '0';
                    carry = '1';
                }
            } else {
                if((a1[i] == '1' && b1[j] == '0') || (a1[i] == '0' && b1[j] == '1')) {
                    sum = '0';
                    carry = '1';
                } else if(a1[i] == '0' && b1[j] == '0') {
                    sum = '1';
                    carry = '0';
                } else if(a1[i] == '1' && b1[j] == '1') {
                    sum = '1';
                    carry = '1';
                }
            }
            sb.insert(0, sum + "");
            i--;
            j--;
        }
        while(i >= 0) {
            if(carry == '0') {
                sb.insert(0, a1[i] + "");
            } else {
                if(a1[i] == '0') {
                    carry = '0';
                    sb.insert(0, "1");
                } else {
                    carry = '1';
                    sb.insert(0, "0");
                }
            }
            i--;
        }
        
        while(j >= 0) {
            if(carry == '0') {
                sb.insert(0, b1[j] + "");
            } else {
                if(b1[j] == '0') {
                    carry = '0';
                    sb.insert(0, "1");
                } else {
                    carry = '1';
                    sb.insert(0, "0");
                }
            }
            j--;
        }
        if(carry == '1') {
            sb.insert(0,"1");
        }
        return sb.toString();
	}
}
