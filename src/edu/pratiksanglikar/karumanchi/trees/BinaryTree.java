/**
 * 
 */
package edu.pratiksanglikar.karumanchi.trees;

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
}
