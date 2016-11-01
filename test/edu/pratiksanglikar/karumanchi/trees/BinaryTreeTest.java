/**
 * 
 */
package edu.pratiksanglikar.karumanchi.trees;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Pratik Sanglikar
 *
 */
public class BinaryTreeTest {

	BinaryTree bt = null;

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	/**
	 * setup the output streams to compare stdout.
	 */
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	/**
	 * setup the binary tree as follows -
	 * 
	 * <pre>
	 *  
	 * 		1
	 * 	   / \
	 *    2   3
	 *   /\   /\
	 *  4  5 6  7
	 * </pre>
	 */
	@Before
	public void setupTree() {
		bt = new BinaryTree(1);
		bt.getRoot().setLeft(new Node(2));
		bt.getRoot().setRight(new Node(3));
		bt.getRoot().getLeft().setLeft(new Node(4));
		bt.getRoot().getLeft().setRight(new Node(5));
		bt.getRoot().getRight().setLeft(new Node(6));
		bt.getRoot().getRight().setRight(new Node(7));
	}

	/**
	 * test the recursive pre-order traversal
	 */
	@Test
	public void preOrderRecursiveTest() {
		bt.preOrderRecursive();
		assertEquals("preorder recursive traversal should be same", "1 2 4 5 3 6 7", outContent.toString().trim());
	}
	
	/**
	 * test the recursive in-order traversal
	 */
	@Test
	public void inOrderRecursiveTest() {
		bt.inOrderRecursive();
		assertEquals("preorder recursive traversal should be same", "4 2 5 1 6 3 7", outContent.toString().trim());
	}
	
	/**
	 * test the recursive post order traversal. 
	 */
	@Test
	public void postOrderRecursiveTest() {
		bt.postOrderRecursive();
		assertEquals("preorder recursive traversal should be same", "4 5 2 6 7 3 1", outContent.toString().trim());
	}

	/**
	 * cleanup the streams after using it.
	 */
	@After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}
}
