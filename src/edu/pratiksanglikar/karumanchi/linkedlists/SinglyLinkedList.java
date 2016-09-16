/**
 * 
 */
package edu.pratiksanglikar.karumanchi.linkedlists;

/**
 * This class represents the SinglyLinkedList and possible operations on it.
 * 
 * @author Pratik Sanglikar
 */
public class SinglyLinkedList {

	/**
	 * This class represents the Node of the SinglyLinkedList.
	 * 
	 * @author Pratik Sanglikar
	 */
	public static class Node {

		private Node next;
		private int data;

		/**
		 * default constructor - initialize the empty Node.
		 */
		public Node() {
			setNext(null);
			setData(0);
		}

		/**
		 * initialize the Node with data.
		 * 
		 * @param data
		 */
		public Node(int data) {
			this.setData(data);
		}

		/**
		 * returns the data present in the Node.
		 * 
		 * @return the data
		 */
		public int getData() {
			return data;
		}

		/**
		 * Sets the data in the Node.
		 * 
		 * @param data
		 *            the data to set
		 */
		public void setData(int data) {
			this.data = data;
		}

		/**
		 * returns the pointer to the next node. null if it has no next pointer.
		 * 
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * sets the next node of present node.
		 * 
		 * @param next
		 *            the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}
	}

	private int length = 0;
	private Node head;

	/**
	 * initialize an empty SinglyLinkedList.
	 */
	public SinglyLinkedList() {
		head = null;
		length = 0;
	}

	/**
	 * initiliaze the SinglyLinkedList with head.
	 * 
	 * @param head
	 *            head of the SinglyLinkedList.
	 */
	public SinglyLinkedList(Node head) {
		this.head = head;
		length = 1;
	}

	/**
	 * returns the length of the SinglyLinkedList.
	 * 
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(head.getData());
		for (Node iteratorNode = head.getNext(); iteratorNode != null; iteratorNode = iteratorNode.getNext()) {
			sb.append("-->" + iteratorNode.getData());
		}
		return sb.toString();
	}

	/**
	 * returns the head of the SinglyLinkedList.
	 * 
	 * @return the head
	 */
	public synchronized Node getHead() {
		return head;
	}

	/**
	 * inserts the new node at the beginning of the SinglyLinkedList.
	 * 
	 * @param node
	 *            node to insert
	 */
	public synchronized void insertAtBeginning(Node node) {
		node.setNext(head);
		head = node;
		length++;
	}

	/**
	 * inserts the new node at the end of the SinglyLinkedList.
	 * 
	 * @param node
	 *            node to insert
	 */
	public synchronized void insertAtTheEnd(Node node) {
		if (head == null) {
			insertAtBeginning(node);
			return;
		}
		Node iteratorNode = null;
		for (iteratorNode = head; iteratorNode.getNext() != null; iteratorNode = iteratorNode.getNext())
			;
		iteratorNode.setNext(node);
		node.setNext(null);
		length++;
	}

	/**
	 * inserts a node at the specified position in the Singly Linked List
	 * 
	 * @param node
	 *            node to insert
	 * @param position
	 *            position at which the node to insert
	 */
	public void insertAtPosition(Node node, int position) {
		if (position <= 0) {
			insertAtBeginning(node);
			return;
		}
		if (position > length) {
			insertAtTheEnd(node);
			return;
		}
		Node iterator = head;
		for (int i = 2; i < position; i++, iterator = iterator.getNext())
			;
		node.setNext(iterator.getNext());
		iterator.setNext(node);
		length++;
	}

	/**
	 * Deletes the head node from the Singly Linked List and returns it.
	 * 
	 * @return node deleted head node.
	 */
	public Node decapitateHead() {
		if (head == null) {
			return null;
		}
		Node deletedHead = head;
		head = head.getNext();
		return deletedHead;
	}

	/**
	 * Deletes the node from the end of the Singly Linked List.
	 * 
	 * @return deletedNode. deleted node.
	 */
	public Node deleteFromEnd() {
		if (head == null) {
			return null;
		}
		Node nodeToBeDeleted = null;
		if (head.getNext() == null) {
			nodeToBeDeleted = head;
			head = null;
			length--;
			return nodeToBeDeleted;
		}
		Node iterator;
		for (iterator = head; iterator.getNext().getNext() != null; iterator = iterator.getNext())
			;
		nodeToBeDeleted = iterator.getNext();
		iterator.setNext(null);
		length--;
		return nodeToBeDeleted;
	}

	/**
	 * deletes the node from the position specified.
	 * 
	 * @param position 
	 * 			position of the node to be deleted.
	 * @return deleted node.
	 */
	public Node deleteFromPosition(int position) {
		Node nodeToBeDeleted = null;
		if(position <= 0) {
			return decapitateHead();
		}
		if(position > length) {
			return deleteFromEnd();
		}
		if (head == null) {
			return nodeToBeDeleted;
		} else {
			if (head.getNext() == null) {
				nodeToBeDeleted = head;
				head = null;
				length--;
			} else {
				Node iterator = head;
				for (int i = 2; i < position; i++, iterator = iterator.getNext());
				nodeToBeDeleted = iterator.getNext();
				iterator.setNext(iterator.getNext().getNext());
				length--;
			}
		}
		return nodeToBeDeleted;
	}
	
	/**
	 * Returns position of the specified node in given Linked List.
	 * 
	 * @param node node to be searched.
	 * @return position of the node.
	 */
	public int getPosition(Node node) {
		if(head == null) {
			return -1;
		}
		Node iterator = head;
		for(int i = 1 ; i <= length; i++, iterator = iterator.getNext()) {
			if(iterator.getData() == node.getData()) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * clears the values in Singly Linked List.
	 */
	public void clearList() {
		head = null;
		length = 0;
	}
}
