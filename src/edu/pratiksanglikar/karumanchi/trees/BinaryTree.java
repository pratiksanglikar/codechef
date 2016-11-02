/**
 * 
 */
package edu.pratiksanglikar.karumanchi.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Pratik Sanglikar
 *
 */
public class BinaryTree {
	
	private Node root;
	
	/**
	 * Creates an empty tree
	 */
	public BinaryTree() {
		this.root = null;
	}

	/**
	 * creates a tree with given root node;
	 * @param root
	 */
	public BinaryTree(Node root) {
		this.root = root;
	}
	
	/**
	 * Creates a tree with given data in root node. 
	 * @param data
	 */
	public BinaryTree(int data) {
		this.root = new Node(data);
	}
	
	/**
	 * returns the root of the tree.
	 * @return
	 */
	public Node getRoot() {
		return this.root;
	}
	
	/**
	 * preorder traversal recursive function.
	 */
	public void preOrderRecursive() {
		preOrderRecursive(this.root);
	}
	
	private void preOrderRecursive(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(" " + root.getData());
		preOrderRecursive(root.getLeft());
		preOrderRecursive(root.getRight());
	}
	
	/**
	 * inorder traversal recursive function.
	 */
	public void inOrderRecursive() {
		inOrderRecursive(this.root);
	}
	
	private void inOrderRecursive(Node root) { 
		if(root == null) {
			return;
		}
		inOrderRecursive(root.getLeft());
		System.out.print(" " + root.getData());
		inOrderRecursive(root.getRight());
	}
	
	/**
	 * postorder traversal recursive function.
	 */
	public void postOrderRecursive() {
		postOrderRecursive(this.root);
	}
	
	private void postOrderRecursive(Node root) {
		if(root == null) {
			return;
		}
		postOrderRecursive(root.getLeft());
		postOrderRecursive(root.getRight());
		System.out.print(" " + root.getData());
	}
	
	/**
	 * performs pre-order traversal of the tree in a non-recursive manner using stacks.
	 */
	public void nonRecursivePreOrder() {
		if(this.root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		Node currentNode = null;
		stack.push(this.root);
		while(!stack.isEmpty()) {
			currentNode = stack.pop();
			System.out.print(" " + currentNode.getData());
			if(currentNode.getRight() != null) {
				stack.push(currentNode.getRight());
			}
			if(currentNode.getLeft() != null) {
				stack.push(currentNode.getLeft());
			}
		}
	}
	
	/**
	 * performs in-order traversal of the tree in a non-recursive manner using stacks.
	 */
	public void nonRecursiveInOrder() {
		if(this.root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		Node currentNode = this.root;
		boolean done = false;
		while(!done) {
			if(currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				if(stack.isEmpty()) {
					done = true;
				} else {
					currentNode = stack.pop();
					System.out.print(" " + currentNode.getData());
					currentNode = currentNode.getRight();
				}
			}
		}
	}
	
	/**
	 * traverses the tree non-recursively using two stacks.
	 */
	public void nonRecursivePostOrder() {
		if(this.root == null) {
			return;
		}
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		stack1.push(this.root);
		while(!stack1.isEmpty()) {
			Node node = stack1.pop();
			stack2.push(node);
			if(node.getLeft() != null) 
				stack1.push(node.getLeft());
			if(node.getRight() != null) 
				stack1.push(node.getRight());
		}
		while(!stack2.isEmpty()) {
			System.out.print(" " + stack2.pop().getData());
		}
	}
	
	/**
	 * prints the level order traversal of the binary tree.
	 */
	public void levelOrderTraversal() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(this.root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(" " + node.getData());
			if(node.getLeft() != null) {
				queue.offer(node.getLeft());
			}
			if(node.getRight() != null) {
				queue.offer(node.getRight());
			}
		}
	}
	
	/**
	 * finds the maximum element from the tree.
	 * @return maximum element.
	 */
	public int findMaximum() {
		return findMaximum(this.root);
	}
	
	/**
	 * finds the maximum element in the tree.
	 * @param root
	 * @return maximum element.
	 */
	private int findMaximum(Node root) {
		int leftMax = Integer.MIN_VALUE;
		int rightMax = Integer.MIN_VALUE;
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		if(root.getLeft() == null && root.getRight() == null) {
			return root.getData();
		}
		if(root.getLeft() != null) {
			leftMax = findMaximum(root.getLeft());
		}
		if(root.getRight() != null) {
			rightMax = findMaximum(root.getRight());
		}
		return Math.max(leftMax, rightMax);
	}
	
	/**
	 * returns the maximum value from the tree.
	 * non-recursive algorithm using level-order traversal.
	 * 
	 * @return maximum from the tree.
	 */
	public int findMaxNonRecursive() {
		int maxValue = Integer.MIN_VALUE;
		if(this.root == null) {
			return maxValue;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(this.root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			maxValue = Math.max(node.getData(), maxValue);
			if(node.getLeft() != null) {
				queue.offer(node.getLeft());
			}
			if(node.getRight() != null) {
				queue.offer(node.getRight());
			}
		}
		return maxValue;
	}
	
	/**
	 * checks if the specified element is present in the binary tree or not.
	 * 
	 * @param data to be searched.
	 * @return whether the data is present in the binary tree.
	 */
	public boolean search(int data) {
		boolean found = false;
		if(root == null) {
			return found;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			if(node.getData() == data) {
				found = true;
				break;
			}
			if(node.getLeft() != null) {
				queue.offer(node.getLeft());
			}
			if(node.getRight() != null) {
				queue.offer(node.getRight());
			}
		}
		return found;
	}
	
	/**
	 * inserts the data in the binary tree using level order traversal
	 * non recursively.
	 * 
	 * @param data to be inserted.
	 */
	public void insert(int data) {
		Node node = new Node(data);
		if(this.root == null) {
			root = node;
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(this.root);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			if(temp.getLeft() == null && temp.getRight() == null) {
				temp.setLeft(node);
				break;
			} else if(temp.getLeft() != null) {
				queue.offer(temp.getLeft());
			} if(temp.getRight() != null) {
				queue.offer(temp.getRight());
			}
		}
	}
}
