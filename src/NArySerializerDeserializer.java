import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class NArySerializerDeserializer {

	static class Node {
		int data;
		List<Node> children;

		public Node(int data) {
			this.data = data;
			this.children = new ArrayList<Node>();
		}

		public void addChild(Node n) {
			this.children.add(n);
		}
	}

	public static void main(String[] args) {
		Node root1 = new Node(1);
		Node root2 = new Node(2);
		Node root3 = new Node(3);
		Node root4 = new Node(4);
		Node root5 = new Node(5);
		Node root6 = new Node(6);
		Node root7 = new Node(7);
		Node root8 = new Node(8);
		Node root9 = new Node(9);
		Node root10 = new Node(10);
		Node root11 = new Node(11);
		Node root12 = new Node(12);
		Node root13 = new Node(13);
		Node root14 = new Node(14);
		Node root15 = new Node(15);
		Node root16 = new Node(16);

		root1.addChild(root2);
		root1.addChild(root3);
		root1.addChild(root4);
		root1.addChild(root5);

		root2.addChild(root6);
		root2.addChild(root7);
		root2.addChild(root8);

		root3.addChild(root9);
		root3.addChild(root10);

		root4.addChild(root14);

		root7.addChild(root12);
		root7.addChild(root13);
		root7.addChild(root11);

		root10.addChild(root15);
		root10.addChild(root16);

		String tree = serialize(root1);
		System.out.println(tree);
		
		System.out.println(serialize(deserialize(tree)));
	}

	static StringBuffer sb = null;

	public static String serialize(Node root) {
		if (root == null) {
			return sb.toString();
		}
		sb = new StringBuffer();
		serializeRec(root);
		return sb.toString();
	}

	private static void serializeRec(Node root) {
		if (root != null) {
			sb.append(" " + root.data);
			for (Node n : root.children) {
				serializeRec(n);
			}
			sb.append(" )");
		}
	}
	static int index;
	static Stack<Node> stack = new Stack<Node>();
	
	public static Node deserialize(String tree) {
		//  1 2 6 ) 7 12 ) 13 ) 11 ) ) 8 ) ) 3 9 ) 10 15 ) 16 ) ) ) 4 14 ) ) 5 ) )
		if(tree == null || tree.length() == 0) {
			return null;
		}
		String[] array = tree.split(" ");
		Node root = new Node(Integer.parseInt(array[1]));
		stack.push(root);
		index = 2;
		deserializeRec(array);
		return root;
	}
	
	
	private static void deserializeRec(String[] array) {
		if(index >= array.length) {
			return;
		}
		if(!array[index].equals(")")) {
			Node child = new Node(Integer.parseInt(array[index]));
			stack.peek().addChild(child);
			stack.push(child);
			index++;
			deserializeRec(array);
		} else {
			index++;
			stack.pop();
			deserializeRec(array);
		}
	}
}
