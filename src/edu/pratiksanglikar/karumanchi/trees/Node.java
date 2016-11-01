/**
 * 
 */
package edu.pratiksanglikar.karumanchi.trees;

/**
 * This class represents the Node of a binary tree.
 * 
 * @author Pratik Sanglikar
 *
 */
public class Node {
	
	private int data;
	private Node left;
	private Node right;
	
	/**
	 * initializes an empty node.
	 */
	public Node() {
		this.data = 0;
		this.left = null;
		this.right = null;
	}
	
	/**
	 * initializes the node with provided data.
	 * @param data
	 */
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	/**
	 * sets the data in the node.
	 * @param data to be set in the node.
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	/**
	 * returns the data stored in the node.
	 * @return the data.
	 */
	public int getData() {
		return this.data;
	}
	
	/**
	 * returns the left child of the node.
	 * @return left child of the node.
	 */
	public Node getLeft() {
		return this.left;
	}
	
	/**
	 * sets the left child of the node.
	 * @param node to be set as left child.
	 */
	public void setLeft(Node node) {
		this.left = node;
	}
	
	/**
	 * sets the right child of the node.
	 * @param node to be set as right child.
	 */
	public void setRight(Node node) {
		this.right = node;
	}
	
	/**
	 * returns the right child of the node.
	 * @return right child
	 */
	public Node getRight() {
		return this.right;
	}
}
