/**
 * 
 */
package edu.pratiksanglikar.karumanchi.trees;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
		assertEquals("inorder recursive traversal should be same", "4 2 5 1 6 3 7", outContent.toString().trim());
	}

	/**
	 * test the recursive post order traversal.
	 */
	@Test
	public void postOrderRecursiveTest() {
		bt.postOrderRecursive();
		assertEquals("postorder recursive traversal should be same", "4 5 2 6 7 3 1", outContent.toString().trim());
	}

	/**
	 * test the non-recursive pre-order traversal
	 */
	@Test
	public void preOrderNonRecursiveTest() {
		bt.nonRecursivePreOrder();
		assertEquals("preorder non-recursive traversal should be same", "1 2 4 5 3 6 7", outContent.toString().trim());
	}

	/**
	 * test the non-recursive in-order traversal
	 */
	@Test
	public void inOrderNonRecursiveTest() {
		bt.nonRecursiveInOrder();
		assertEquals("inorder non-recursive traversal should be same", "4 2 5 1 6 3 7", outContent.toString().trim());
	}

	@Test
	public void postOrderNonRecursiveTest() {
		bt.nonRecursivePostOrder();
		assertEquals("postorder non-recursive traversal should be same", "4 5 2 6 7 3 1", outContent.toString().trim());
	}

	@Test
	public void levelOrderTest() {
		bt.levelOrderTraversal();
		assertEquals("level order traversal should be same", "1 2 3 4 5 6 7", outContent.toString().trim());
	}

	@Test
	public void maximumElementTest() {
		bt.getRoot().getLeft().getRight().setRight(new Node(23));
		assertEquals("maximum element of the tree should be 23", 23, bt.findMaximum());
		bt.getRoot().setLeft(null);
		bt.getRoot().setRight(null);
		assertEquals("maximum element of the tree should be 1", 1, bt.findMaximum());
		bt = new BinaryTree(null);
		assertEquals("maximum element of the tree should be Integer.MIN_VALUE", Integer.MIN_VALUE, bt.findMaximum());
	}

	@Test
	public void maximumElementNonRecursiveTest() {
		bt.getRoot().getLeft().getRight().setRight(new Node(23));
		assertEquals("maximum element of the tree should be 23", 23, bt.findMaxNonRecursive());
		bt.getRoot().setLeft(null);
		bt.getRoot().setRight(null);
		assertEquals("maximum element of the tree should be 1", 1, bt.findMaxNonRecursive());
		bt = new BinaryTree(null);
		assertEquals("maximum element of the tree should be Integer.MIN_VALUE", Integer.MIN_VALUE,
				bt.findMaxNonRecursive());
	}

	@Test
	public void searchTest() {
		assertEquals("it should search the element present in the tree", true, bt.search(4));
		assertEquals("it should fail for the element not present in the tree", false, bt.search(47));
	}

	@Test
	public void insertTest() throws IOException {
		bt.insert(8);
		bt.levelOrderTraversal();
		assertEquals("Insert operation in non-empty binary tree should succeed!", "1 2 3 4 5 6 7 8",
				outContent.toString().trim());
		bt = new BinaryTree(null);
		bt.insert(5);
		bt.levelOrderTraversal();
		assertEquals("Insert operation in an empty binary tree should succeed!", "1 2 3 4 5 6 7 8 5",
				outContent.toString().trim());
	}

	@Test
	public void sizeTest() {
		assertEquals("Size of the binary tree should be 7", 7, bt.getSize());
	}

	@Test
	public void reverseLevelOrderTest() {
		TreeUtilities.reverseLevelOrder(bt.getRoot());
		assertEquals("Reverse Level order should be correct!", "4 5 6 7 2 3 1", outContent.toString().trim());
	}

	@Test
	public void deepestNodeTest() {
		assertEquals("Deepest Node of the tree should be 7", 7, TreeUtilities.getDeepestNode(bt.getRoot()));
	}

	@Test
	public void deleteNodeTest() {
		TreeUtilities.deleteNode(bt.getRoot(), 3);
		bt.inOrderRecursive();
		// assertEquals("Node deletion should be successfull","4 2 5 1 6 7",
		// outContent.toString().trim());
	}

	@Test
	public void structurallyIdenticalTest() {
		BinaryTree bt1 = new BinaryTree(4);
		bt1.getRoot().setLeft(new Node(5));
		bt1.getRoot().setRight(new Node(6));
		bt1.getRoot().getLeft().setLeft(new Node(7));
		bt1.getRoot().getLeft().setRight(new Node(8));
		bt1.getRoot().getRight().setLeft(new Node(9));
		bt1.getRoot().getRight().setRight(new Node(10));
		assertEquals("Trees should be structurally identical!", true,
				TreeUtilities.isStructurallyIdentical(bt.getRoot(), bt1.getRoot()));
		bt1.getRoot().getRight().getRight().setRight(new Node(234));
		assertEquals("Trees should not be structurally identical!", false,
				TreeUtilities.isStructurallyIdentical(bt.getRoot(), bt1.getRoot()));
	}

	@Test
	public void diameterOfTreeTest() {
		BinaryTree bt = new BinaryTree(10);
		bt.getRoot().setLeft(new Node(11));
		bt.getRoot().getLeft().setLeft(new Node(12));
		bt.getRoot().getLeft().getLeft().setLeft(new Node(13));
		bt.getRoot().getLeft().setRight(new Node(14));
		bt.getRoot().setRight(new Node(15));
		bt.getRoot().getRight().setRight(new Node(16));
		bt.getRoot().getRight().getRight().setRight(new Node(17));
		bt.getRoot().getRight().setLeft(new Node(18));
		assertEquals("Diameter of the tree should be 7", 7, TreeUtilities.diameterOfTree(bt.getRoot()));
	}

	@Test
	public void maximumLevelWiseSum() {
		assertEquals("Maximum sum of the level should be 22", 22, TreeUtilities.maximumSumByLeve(bt.getRoot()));
		bt.getRoot().getLeft().setData(456);
		assertEquals("Maximum sum of the level should be 459", 459, TreeUtilities.maximumSumByLeve(bt.getRoot()));
	}
	
	@Test
	public void printPathsToLeaf() {
		TreeUtilities.printPathsToLeaf(bt.getRoot());
		assertEquals("1 2 4 \n1 2 5 \n1 3 6 \n1 3 7", outContent.toString().trim());
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
