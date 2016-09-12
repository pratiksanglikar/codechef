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
	
	private DLLNode head = null;
	private DLLNode tail = null;
	private int length = 0;
	
	/**
	 * initialize empty Doubly Linked List.
	 */
	public DoublyLinkedList() {
		this.tail = null;
		this.head = null;
		this.length = 0;
	}
	
	/**
	 * initialize the Doubly Linked List with head node.
	 * @param head
	 */
	public DoublyLinkedList(DLLNode head) {
		this.head = head;
		this.tail = null;
		this.length = 1;
	}

	/**
	 * returns the head of the Doubly Linked List.
	 * @return the head
	 */
	public DLLNode getHead() {
		return head;
	}

	/**
	 * returns the length of the Doubly Linked List.
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * returns the tail of the Doubly Linked List.
	 * @return the tail of the linked List
	 */
	public DLLNode getTail() {
		return tail;
	}

	/**
	 * sets the tail of the DLL.
	 * @param tail the tail to set
	 */
	public void setTail(DLLNode tail) {
		this.tail = tail;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(head == null) {
			return "";
		}
		sb.append(head.getData());
		for(DLLNode iterator = head.getNext(); iterator != null; iterator = iterator.getNext()) {
			sb.append("<==>" + iterator.getData());
		}
		return sb.toString();
	}

	/**
	 * inserts a DLLNode at the beginning of the Doubly Linked List.
	 * 
	 * @param node to be inserted in DLL
	 */
	public void insertAtBeginning(DLLNode node) {
		if(head == null) {
			head = node;
			tail = node;
			length++;
			return;
		}
		node.setNext(head);
		head.setPrev(node);
		head = node;
		length++;
	}
	
	/**
	 * inserts a node at the end of the Doubly Linked List
	 * 
	 * @param node to be inserted in DLL.
	 */
	public void insertAtTheEnd(DLLNode node) {
		if(head == null) {
			head = node;
			tail = node;
			length++;
			return;
		}
		tail.setNext(node);
		node.setPrev(tail);
		tail = node;
		length++;
	}
}