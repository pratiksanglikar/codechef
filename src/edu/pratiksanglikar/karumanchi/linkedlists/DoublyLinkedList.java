/**
 * 
 */
package edu.pratiksanglikar.karumanchi.linkedlists;

/**
 * Doubly Linked List and operations on it.
 * 
 * @author Pratik Sanglikar
 */
public class DoublyLinkedList {
	
	/**
	 * Node definition for Doubly Linked List
	 * 
	 * @author Pratik Sanglikar
	 */
	static class DLLNode {
		
		private DLLNode prev;
		private DLLNode next;
		private int data;
		
		/**
		 * initialize an empty DLLNode
		 */
		public DLLNode() {
			prev = null;
			next = null;
			data = 0;
		}
		
		/**
		 * initialize a DLLNode with data.
		 * @param data to set in DLLNode
		 */
		public DLLNode(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
		
		/**
		 * initialize the DLLNode with data and pointers to previous and 
		 * next nodes.
		 * 
		 * @param data to set in DLLNode.
		 * @param previous reference to previous node
		 * @param next reference to next node.
		 */
		public DLLNode(int data, DLLNode previous, DLLNode next) {
			this.data = data;
			this.prev = previous;
			this.next = next;
		}
		
		/**
		 * returns reference to previous node.
		 * @return the reference to the previous node.
		 */
		public DLLNode getPrev() {
			return prev;
		}
		
		/**
		 * sets the reference of previous node.
		 * @param previous the reference of previous node to set.
		 */
		
		public void setPrev(DLLNode previous) {
			this.prev = previous;
		}
		
		/**
		 * returns the reference of next node.
		 * @return the reference of next node.
		 */
		public DLLNode getNext() {
			return next;
		}
		
		/**
		 * sets the reference of next node.
		 * @param next the reference of next node to set
		 */
		public void setNext(DLLNode next) {
			this.next = next;
		}
		
		/**
		 * returns the data present in the node.
		 * @return the data present in the node.
		 */
		public int getData() {
			return data;
		}
		
		/**
		 * sets the data in the node.
		 * @param data the data to set in the node.
		 */
		public void setData(int data) {
			this.data = data;
		}
	}
}
