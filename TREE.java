package DATASTRUCT;

public class TREE {
	Node tree = null;
	static class Node {    
	    int value; //data stored as type int
	    
	        Node left, right; //reference to left and right pointer
	          
	        Node(int value){ //constructor
	            this.value = value; 
	            // store null value for left and right child
	            left = null; 
	            right = null; 
	        }
	}
	
	public int height(Node tree) {
		if (tree== null) {
			return 0;
		}
		return 1+((height(tree.left))>(height(tree.right))?(height(tree.left)):(height(tree.right)));
		
	}
	public int size(Node tree)
	{
		if(tree == null ) {
			return 0;
		}
		return 1+size(tree.left)+size(tree.right);
	}
	
	public void Inorder(Node tree) {
		if (tree == null)
			return;
		Inorder(tree.left);
		System.out.println(tree.value);
		Inorder(tree.right);
	}
	
	public void preorder(Node tree) {
		if (tree == null)
			return;
		System.out.println(tree.value);
		preorder(tree.left);		
		preorder(tree.right);
	}
	
	public void postorder(Node tree) {
		if(tree == null)
			return;
		postorder(tree.left);		
		postorder(tree.right);
		System.out.println(tree.value);
	}
	
	
	
		
	
	
	
	public static void main(String [] args) {
		 TREE t1 = new TREE();
		 Node n = new Node(100);
		 t1.tree = n;
		 Node n1 = new Node(1);
		 Node n2 = new Node(2);
		 Node n3 = new Node(3);
		 Node n4 = new Node(4);
		 Node n5 = new Node(5);
		 Node n6 = new Node(6);
		 //Node n7 = new Node(7);
		 n.left = n1;
		 n.right = n2;
		 n.left.left = n3;
		 n.left.right = n4;
		 n.right.left = n5;
		 n.right.right = n6;
		 int k = t1.size(n);
		 int l = t1.height(n);
		 System.out.println(k+" "+ l);
		 System.out.println();
		 t1.preorder(n);
		 System.out.println();
		 t1.postorder(n);
		 System.out.println();
		 
		 t1.Inorder(n);
		 
	}

}
