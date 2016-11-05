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
public class TreeUtilities {
	
	/**
	 * prints the tree in reverse level order.
	 * 
	 * @param root root of the binary tree.
	 */
	public static void reverseLevelOrder(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		Stack<Node> stack = new Stack<Node>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			if(temp.getRight() != null) {
				queue.offer(temp.getRight());
			}
			if(temp.getLeft() != null) {
				queue.offer(temp.getLeft());
			}
			stack.push(temp);
		}
		while(!stack.isEmpty()) {
			System.out.print(" " + stack.pop().getData());
		}
	}
	
	/**
	 * returns the deepest node of the binary tree.
	 * 
	 * @param root root of the binary tree.
	 * @return deepest node of the binary tree.
	 */
	public static int getDeepestNode(Node root) {
		if(root == null) {
			return -1;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		Node temp = null;
		while(!queue.isEmpty()) {
			temp = queue.poll();
			if(temp.getLeft() != null) {
				queue.offer(temp.getLeft());
			}
			if(temp.getRight() != null) {
				queue.offer(temp.getRight());
			}
		}
		return temp.getData();
	}
	
	/**
	 * deletes the node from the tree.
	 * 
	 * @param root root of the binary tree.
	 * @param data data to be deleted from the tree.
	 */
	public static void deleteNode(Node root, int data) {
		if(root == null) {
			return;
		}
		Node nodeToBeDeleted = null;
		Node lastNode = null;
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			lastNode = queue.poll();
			if(lastNode.getData() == data) {
				nodeToBeDeleted = lastNode;
			}
			if(lastNode.getLeft() != null) {
				queue.offer(lastNode.getLeft());
			}
			if(lastNode.getRight() != null) {
				queue.offer(lastNode.getRight());
			}
		}
		if(nodeToBeDeleted == null) {
			System.out.println("Node not found!");
			return;
		}
		int tempdata = nodeToBeDeleted.getData();
		nodeToBeDeleted.setData(lastNode.getData());
		lastNode.setData(tempdata);
		lastNode = null;
	}
}
