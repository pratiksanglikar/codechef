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
}
