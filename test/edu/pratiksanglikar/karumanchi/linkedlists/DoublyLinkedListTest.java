/**
 * 
 */
package edu.pratiksanglikar.karumanchi.linkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pratiksanglikar.karumanchi.linkedlists.DoublyLinkedList.DLLNode;

/**
 * This class is for testing purposes of Doubly Linked List and 
 * operations on it.
 * 
 * @author Pratik Sanglikar
 */
public class DoublyLinkedListTest {

	@Test
	public void insertionAtBeginningTest() {
		insertAtBeginningEmptyListTest();
		insertAtBeginningNonEmptyListTest();
	}

	private void insertAtBeginningNonEmptyListTest() {
		DoublyLinkedList dl = new DoublyLinkedList(new DLLNode(34));
		dl.insertAtBeginning(new DLLNode(12));
		assertEquals("It should add a node to a non empty list at beginning of the list", 12, dl.getHead().getData());
	}

	private void insertAtBeginningEmptyListTest() {
		DoublyLinkedList dl = new DoublyLinkedList(new DLLNode(34));
		assertEquals("It should add a node to a non empty list at beginning of the list", 34, dl.getHead().getData());
	}
	
	@Test
	public void insertAtTheEndTest() {
		insertAtTheEndEmptyListTest();
		insertAtTheEndNonEmptyListTest();
	}

	private void insertAtTheEndNonEmptyListTest() {
		DoublyLinkedList dl = new DoublyLinkedList(new DLLNode(12));
		dl.insertAtBeginning(new DLLNode(10));
		dl.insertAtBeginning(new DLLNode(5));
		dl.insertAtTheEnd(new DLLNode(99));
		assertEquals("It should add a node to the end of non empty list ", "5<==>10<==>12<==>99", dl.toString());
	}

	private void insertAtTheEndEmptyListTest() {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insertAtTheEnd(new DLLNode(55));
		assertEquals("It should add a node to the end of an empty list ", 55, dl.getHead().getData());
	}
}
