/**
 * 
 */
package edu.pratiksanglikar.karumanchi.linkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pratiksanglikar.karumanchi.linkedlists.SinglyLinkedList.Node;

/**
 * @author Pratik Sanglikar
 *
 */
public class SinglyLinkedListTest {

	@Test
	public void insertAtBeginningTest() {
		insertAtBeginingNonEmptyListTest();
		insertAtBeginingEmptyListTest();
	}

	private void insertAtBeginingNonEmptyListTest() {
		SinglyLinkedList sl = new SinglyLinkedList(new Node(6));
		sl.insertAtBeginning(new Node(2));
		assertEquals("Insertion at beginning in a non empty Singly Linked List should work fine.", "2-->6",
				sl.toString());
	}

	private void insertAtBeginingEmptyListTest() {
		SinglyLinkedList sl2 = new SinglyLinkedList();
		sl2.insertAtBeginning(new Node(10));
		assertEquals("Insertion at beginning in an empty Singly Linked List should work fine.", "10", sl2.toString());
	}

	@Test
	public void insertAtTheEndTest() {
		insertAtTheEndNonEmptyListTest();
		insertAtTheEndEmptyListTest();
	}

	private void insertAtTheEndNonEmptyListTest() {
		SinglyLinkedList sl1 = new SinglyLinkedList(new Node(5));
		sl1.insertAtTheEnd(new Node(23));
		assertEquals("Insertion at the end in a non empty Singly Linked List should work fine.", "5-->23",
				sl1.toString());
	}

	private void insertAtTheEndEmptyListTest() {
		SinglyLinkedList sl2 = new SinglyLinkedList();
		sl2.insertAtTheEnd(new Node(50));
		assertEquals("Insertion at the end in an empty Singly Linked List should work fine.", "50", sl2.toString());
	}

	@Test
	public void insertAtPositionTest() {
		insertAtNegativePositionTest();
		insertAtOutOfBoundPositionTest();
		insertAtFixedPositionTest();
	}

	private void insertAtFixedPositionTest() {
		SinglyLinkedList s1 = new SinglyLinkedList(new Node(9));
		s1.insertAtBeginning(new Node(5));
		s1.insertAtTheEnd(new Node(13));
		s1.insertAtTheEnd(new Node(19));
		s1.insertAtTheEnd(new Node(21));
		s1.insertAtPosition(new Node(17), 4);
		assertEquals("Insertion at position should insert the node at that position", "5-->9-->13-->17-->19-->21",
				s1.toString());
	}

	private void insertAtOutOfBoundPositionTest() {
		SinglyLinkedList s1 = new SinglyLinkedList(new Node(45));
		s1.insertAtTheEnd(new Node(234));
		s1.insertAtBeginning(new Node(12));
		s1.insertAtPosition(new Node(765), 345);
		assertEquals("Insertion at out of bound position should insert the node at the end", "12-->45-->234-->765",
				s1.toString());
		s1.insertAtPosition(new Node(999), 5);
		assertEquals("Insertion at boundry position should insert the node at the end", "12-->45-->234-->765-->999",
				s1.toString());
	}

	private void insertAtNegativePositionTest() {
		SinglyLinkedList s1 = new SinglyLinkedList(new Node(13));
		s1.insertAtPosition(new Node(5), -7);
		assertEquals("Insertion at negative position should insert the node at beginning", "5-->13", s1.toString());
	}
}
