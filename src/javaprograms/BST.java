package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;



public class BST {
	
	static class Binary_Tree
	{
		private Node root;
		
		public  Binary_Tree()
		{
			this.root = new Node();
			
		}
		
		public void put (int val)
		{
			put(val,root);
			
		}
		
		private void put(int val,Node node)
		{
			if(node.val==null){
				node.val = val;
			}
			else
			{
			    if(val<node.val)
			    {
			        if(node.left==null)
			        {
			           node.left = new Node();
			        }
			        put(val,node.left);
			    }
			    else
			    {
				    if(node.right==null)
			        {
			            node.right = new Node();
			        }
			        put(val,node.right);
			    }
			}
		}
		
		boolean  contains(int val)
		{
			return contains(val, root);
			
		}
		
		boolean contains(int val, Node node)
		{
		   if(node==null||node.val == null)
		   {
			   return false;
		   }
		   else
		   {
			   if(node.val==val)
				   return true;
			   if(val<node.val)
			       return contains(val, node.left);
			   if(val>node.val)
				   return contains(val, node.right);
		  }
				   
		  return false;
		}
		
		public ArrayList<Integer> InorderTraversal()
		{
			ArrayList<Integer> node_list = new ArrayList<Integer>();
			InorderTraversal(root,node_list);
			return node_list;
		}
		
		private void  InorderTraversal(Node node,ArrayList<Integer> li)
		{
			if(node==null||node.val==null)
				return;
			else
				InorderTraversal(node.left, li);
			    li.add(node.val);
			    InorderTraversal(node.right, li);
			    
		}
		
		private static class Node{
			Integer val;
			Node left;
			Node right;
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Binary_Tree searchTree = new  Binary_Tree();

	    searchTree.put(3);
	    searchTree.put(1);
	    searchTree.put(2);
	    searchTree.put(5);
	    
	    if(Arrays.asList(1,2,3,5).equals(searchTree.InorderTraversal())
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
