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
	 * @param root
	 *            root of the binary tree.
	 */
	public static void reverseLevelOrder(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		Stack<Node> stack = new Stack<Node>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			if (temp.getRight() != null) {
				queue.offer(temp.getRight());
			}
			if (temp.getLeft() != null) {
				queue.offer(temp.getLeft());
			}
			stack.push(temp);
		}
		while (!stack.isEmpty()) {
			System.out.print(" " + stack.pop().getData());
		}
	}

	/**
	 * returns the deepest node of the binary tree.
	 * 
	 * @param root
	 *            root of the binary tree.
	 * @return deepest node of the binary tree.
	 */
	public static int getDeepestNode(Node root) {
		if (root == null) {
			return -1;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		Node temp = null;
		while (!queue.isEmpty()) {
			temp = queue.poll();
			if (temp.getLeft() != null) {
				queue.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				queue.offer(temp.getRight());
			}
		}
		return temp.getData();
	}

	/**
	 * deletes the node from the tree.
	 * 
	 * @param root
	 *            root of the binary tree.
	 * @param data
	 *            data to be deleted from the tree.
	 */
	public static void deleteNode(Node root, int data) {
		if (root == null) {
			return;
		}
		Node nodeToBeDeleted = null;
		Node lastNode = null;
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			lastNode = queue.poll();
			if (lastNode.getData() == data) {
				nodeToBeDeleted = lastNode;
			}
			if (lastNode.getLeft() != null) {
				queue.offer(lastNode.getLeft());
			}
			if (lastNode.getRight() != null) {
				queue.offer(lastNode.getRight());
			}
		}
		if (nodeToBeDeleted == null) {
			System.out.println("Node not found!");
			return;
		}
		int tempdata = nodeToBeDeleted.getData();
		nodeToBeDeleted.setData(lastNode.getData());
		lastNode.setData(tempdata);
		lastNode = null;
	}

	/**
	 * returns if given two trees are structurally identical
	 * 
	 * @param root1
	 * @param root2
	 * @return
	 */
	public static boolean isStructurallyIdentical(Node root1, Node root2) {
		boolean isLeftIdentical = false, isRightIdentical = false;
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		isLeftIdentical = isStructurallyIdentical(root1.getLeft(), root2.getLeft());
		isRightIdentical = isStructurallyIdentical(root1.getRight(), root2.getRight());
		return isLeftIdentical && isRightIdentical;
	}
	
	/**
	 * returns the diameter of the tree.
	 * 
	 * @param root
	 * @return
	 */
	public static int diameterOfTree(Node root) {
		if(root == null) {
			return 0;
		}
		int ldia = 0, rdia = 0, lheight = 0, rheight = 0;
		lheight = heightOfTree(root.getLeft());
		rheight = heightOfTree(root.getRight());
		ldia = diameterOfTree(root.getLeft());
		rdia = diameterOfTree(root.getRight());
		return Math.max(ldia, Math.max(rdia, lheight + rheight + 1));
	} 
	
	/**
	 * returns the height of the tree.
	 * 
	 * @param root
	 * @return the height of the tree.
	 */
	public static int heightOfTree(Node root) {
		if(root == null) {
			return 0;
		}
		return Math.max(heightOfTree(root.getLeft()), heightOfTree(root.getRight())) + 1;
	}
	
	/**
	 * returns the sum of level where the level's sum is maximum.
	 * 
	 * @param root
	 * @return
	 */
	public static int maximumSumByLeve(Node root) {
		int maximumSum = 0, currentLevelSum = 0;
		if(root == null) {
			return 0;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		queue.offer(null); // null to indicate the end of the level.
		Node temp = null;
		while(!queue.isEmpty()) {
			temp = queue.poll();
			if(temp != null) {
				currentLevelSum += temp.getData();
				if(temp.getLeft() != null) {
					queue.offer(temp.getLeft());
				}
				if(temp.getRight() != null) {
					queue.offer(temp.getRight());
				}
			} else {
				maximumSum = Math.max(maximumSum, currentLevelSum);
				currentLevelSum = 0;
				if(!queue.isEmpty()) {
					queue.offer(null);
				}
			}
		}
		return maximumSum;
	}
	
	/**
	 * prints the paths to leaf from root node.
	 * 
	 * @param root the root of the binary tree.
	 */
	public static void printPathsToLeaf(Node root) {
		int[] path  = new int[1000];
		int pathlen = 0;
		printPaths(root, path, pathlen);
	}
	
	/**
	 * prints paths to the leaf nodes recursively.
	 * 
	 * @param root the root of the binary tree.
	 * @param path the path trversed so far.
	 * @param pathLen length of the path.
	 */
	private static void printPaths(Node root, int[] path, int pathLen) {
		if(root == null) {
			return;
		}
		path[pathLen++] = root.getData();
		if(root.getLeft() == null && root.getRight() == null) {
			printArray(path, pathLen);
		} else {
			printPaths(root.getLeft(), path, pathLen);
			printPaths(root.getRight(), path, pathLen);
		}
	}
	
	/**
	 * prints the array.
	 * 
	 * @param array array to be printed.
	 * @param length length of the the array.
	 */
	private static void printArray(int[] array, int length) {
		System.out.println();
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	/**
	 * creates a new mirror tree of the given tree and returns it's root node.
	 * 
	 * @param root the root of the binary tree which is to be mirrored.
	 * @return root of the resulting mirror binary tree.
	 */
	public static Node createMirror(Node root) {
		Node mirror = null;
		if(root == null) {
			return mirror;
		}
		mirror = new Node(root.getData());
		if(root.getLeft() != null) {
			mirror.setRight(createMirror(root.getLeft()));
		}
		if(root.getRight() != null) {
			mirror.setLeft(createMirror(root.getRight()));
		}
		return mirror;
	}
}
