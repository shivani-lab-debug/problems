package coderpad_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BST {
	
	
	 // your code
	  /**
	   * Given two fractions passed in as int arrays,
	   * returns the fraction which is result of adding the two input fractions.
	   */
	  static class Binary  {

	    private Node root;

	    public Binary() {
	      this.root = new Node();
	    }

	    public void put(int value) {
	      // your code
	      put(value,root);
	      
	    }
	    
	    
	    
	    private void put(int value,Node node)
	    {
	      if(node.value ==null)
	      {  
	        
	        node.value = value;
	      }
	      else if(value<node.value)
	      {  if(node.left ==null)
	        {
	          node.left = new Node();
	        }
	      put(value,node.left);
	      }
	      else{
	          if(node.right == null)
	          {
	              node.right =new Node();
	          }
	           put(value,node.right);
	      }
	    }
	      
	  

	    public boolean contains(int value) {
	      // your code
	      return contains(value,root);
	      
	    }
	    
	    private boolean contains(int value,Node node)
	    {
	      if(node==null || node.value ==null)
	        return false;
	      if(node.value == value)
	        return true;
	      else if(value<node.value)
	        return contains (value,node.left);
	      else
	        return contains (value,node.right);
	    }
	    
	    public List<Integer> inOrderTraversal() {
	      final ArrayList<Integer> acc = new ArrayList<>();
	      inOrderTraversal(root, acc);
	      return acc;
	    }

	    private void inOrderTraversal(Node node, List<Integer> acc) {
	      if (node == null) {
	        return;
	      }
	      inOrderTraversal(node.left, acc);
	      acc.add(node.value);
	      inOrderTraversal(node.right, acc);
	      
	    }

	    private static class Node {
	      Integer value;
	      Node left;
	      Node right;
	    }
	  }


	   public static void main(String[] args) {
	    
	    Binary  searchTree  = new Binary();

	      searchTree.put(3);
	      searchTree.put(1);
	      searchTree.put(2);
	      searchTree.put(5);
	      
	      if(Arrays.asList(1,2,3,5).equals(searchTree.inOrderTraversal())
	          && !searchTree.contains(0) 
	          && searchTree.contains(1)
	          && searchTree.contains(2)
	          && searchTree.contains(3)
	          && !searchTree.contains(4)
	          && searchTree.contains(5)
	          && !searchTree.contains(6)){
	        System.out.println("Pass");
	      }else {
	        System.out.println("Fail");
	      }
	          
	  }


}
