/**
 * 
 */
package edu.pratiksanglikar.leetcode.easy;

/**
 * @author Pratik Sanglikar
 *
 */
public class RemoveElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		head = removeNodes(head, 2);
		System.out.println(head);
	}
	
	public static ListNode removeNodes(ListNode head, int val) {
		if(head == null) {
            return null;
        }
        ListNode temp = head;
        if(temp.val == val) {
            temp = temp.next;
            head = head.next;
        }
        while(temp != null && temp.next != null) {
            if(temp.next.val == val) {
            	while(temp != null && temp.val == val) {
            		temp = temp.next;
            	}
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        if(head != null && head.val == val) {
            head = head.next;
        }
        return head;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		ListNode temp = this;
		while(temp.next != null) {
			sb.append(temp.val + " --> ");
			temp = temp.next;
		}
		sb.append(" " + temp.val);
		return sb.toString();
	}
}
