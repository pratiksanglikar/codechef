/**
 * 
 */
package edu.pratiksanglikar.leetcode.medium;

/**
 * @author Pratik Sanglikar
 *
 */
class ListNode {
	int val;
	ListNode next;
	
	ListNode(int x) {
		this.val = x;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		ListNode temp = this;
		while(temp != null) {
			sb.append(temp.val + " --> ");
			temp = temp.next;
		}
		return sb.toString();
	}
}


public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
        ListNode resultRoot = null;
        ListNode prev = null;
        ListNode temp = resultRoot;
        while(l1 != null || l2 != null) {
        	int firstNum = 0;
        	int secondNum = 0;
        	if(l1 != null) {
        		firstNum = l1.val;
        		l1 = l1.next;
        	}
        	if(l2 != null) {
        		secondNum = l2.val;
        		l2 = l2.next;
        	}
            int result = firstNum + secondNum + carry;
            carry = result / 10;
            result = result % 10;
            temp = new ListNode(result);
            if(resultRoot == null) {
                resultRoot = temp;
            } else {
                prev.next = temp;
            }
            prev = temp;
            temp = temp.next;
        }
        if(l1 == null && l2 == null && carry > 0) {
        	temp = new ListNode(carry);
        	prev.next = temp;
        }
        return resultRoot;
    }
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(8);
		//node1.next.next = new ListNode(3);
		
		ListNode node2 = new ListNode(0);
		//node2.next = new ListNode(6);
		//node2.next.next = new ListNode(4);
		System.out.println(node1);
		System.out.println(node2);
		System.out.println(addTwoNumbers(node1, node2));
	}
}
