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

	@Test
	public void deleteNodeTest() {
		deleteHeadFromEmptyListTest();
		deleteHeadFromNonEmptyListTest();
	}

	private void deleteHeadFromNonEmptyListTest() {
		SinglyLinkedList s1 = new SinglyLinkedList(new Node(34));
		s1.insertAtBeginning(new Node(5));
		assertEquals("It should delete head node in non empty list.", 5, s1.decapitateHead().getData());
	}

	private void deleteHeadFromEmptyListTest() {
		SinglyLinkedList s1 = new SinglyLinkedList();
		assertEquals("It should return null if delete head node is called on an empty list", null, s1.decapitateHead());
	}

	@Test
	public void deleteFromEndTest() {
		deleteFromEndEmptyTest();
		deleteFromEndSingleElementTest();
		deleteFromEndNonEmptyTest();
	}

	private void deleteFromEndNonEmptyTest() {
		SinglyLinkedList s1 = new SinglyLinkedList(new Node(34));
		s1.insertAtBeginning(new Node(32));
		s1.insertAtBeginning(new Node(12));
		s1.insertAtBeginning(new Node(2));
		assertEquals("It should delete the last element from singly linked list", 34, s1.deleteFromEnd().getData());
	}

	private void deleteFromEndSingleElementTest() {
		SinglyLinkedList s1 = new SinglyLinkedList(new Node(12));
		assertEquals("It should delete the only element present in the SLL ", 12, s1.deleteFromEnd().getData());
	}

	private void deleteFromEndEmptyTest() {
		SinglyLinkedList s1 = new SinglyLinkedList();
		assertEquals("It should return null when deleting an element from empty SLL", null, s1.deleteFromEnd());
	}
	
	@Test
	public void deleteFromPosition() {
		deletePositionOutOfBoundTest();
		deletePositionExtremeTest();
		deletePositionRandomTest();
	}

	private void deletePositionRandomTest() {
		SinglyLinkedList s1 = new SinglyLinkedList(new Node(10));
		s1.insertAtTheEnd(new Node(20));
		s1.insertAtTheEnd(new Node(30));
		s1.insertAtTheEnd(new Node(40));
		s1.insertAtTheEnd(new Node(50));
		s1.deleteFromPosition(3);
		assertEquals("It should delete the element at position specified ","10-->20-->40-->50", s1.toString());
	}

	private void deletePositionExtremeTest() {
		SinglyLinkedList s1 = new SinglyLinkedList(new Node(11));
		s1.insertAtTheEnd(new Node(22));
		s1.insertAtTheEnd(new Node(33));
		s1.insertAtTheEnd(new Node(44));
		s1.insertAtTheEnd(new Node(55));
		assertEquals("Node should be deleted for boundry conditions", 55, s1.deleteFromPosition(5).getData());
	}

	private void deletePositionOutOfBoundTest() {
		SinglyLinkedList s1 = new SinglyLinkedList(new Node(12));
		s1.insertAtTheEnd(new Node(24));
		s1.insertAtTheEnd(new Node(36));
		s1.insertAtTheEnd(new Node(48));
		s1.insertAtTheEnd(new Node(60));
		assertEquals("Node should be deleted for out of bound positions", 12, s1.deleteFromPosition(-43).getData());
	}
}
