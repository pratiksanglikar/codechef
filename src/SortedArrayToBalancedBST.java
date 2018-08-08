public class SortedArrayToBalancedBST {

	public static void main(String[] args) {
		SortedArrayToBalancedBST sbt = new SortedArrayToBalancedBST();
		int[] array = {5,6,7,8,9};
		Node root = sbt.convertToBST(array);
		sbt.prettyPrintBST(root, 0);
	}
	
	class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	public Node convertToBST(int[] array) {
		if(array == null || array.length == 0) {
			return null;
		}
		return convertToBST(array, 0, array.length - 1);
	}
	
	private Node convertToBST(int[] array, int low, int high) {
		if(low > high) {
			return null;
		}
		if(low == high) {
			return new Node(array[low]);
		}
		int mid = low + (high - low) / 2;
		Node root = new Node(array[mid]);
		root.left = convertToBST(array, low, mid - 1);
		root.right = convertToBST(array, mid + 1, high);
		return root;
	}
	
	private void prettyPrintBST(Node root, int space)
	{
	    if (root == null)
	        return;
	 
	    space += 5;

	    prettyPrintBST(root.right, space);
      
      System.out.println();
	    for (int i = 5; i < space; i++)
	        System.out.print(" ");
	    System.out.print( root.data + "\n");
	 
	    prettyPrintBST(root.left, space);
	}

}
