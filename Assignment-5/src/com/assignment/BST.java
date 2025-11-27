package com.assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	private Node root;
	public BST() {
		this.root = null;
	}
	public Node binarySearch(int key) {
		return binarySearch(key,root);
	}

	public Node binarySearch(int key,Node root) {
		if(root==null)return root;
		if(key==root.data)return root;
		else if(key<root.data) {
			return binarySearch(key, root.left);
		}
		else {
			return binarySearch(key, root.right);
		}
	}

	public Node successorFinder(int key) {
		Node root = binarySearch(key);
		if(root==null)return root;
		Node succ = root.right;
		while(succ.left!=null) {
			succ= succ.left;
		}
		return succ;
	}

	public int deptFinder(Node trav) {
		if(trav == null)return 0;
		int ld = deptFinder(trav.left);
		int rd = deptFinder(trav.right);
		int maxD = Math.max(ld, rd)+1;
		return maxD;
	}

	public int deptFinder() {
		return deptFinder(root);
	}
		public boolean isEmpty() {
			return root == null;
		}

		public void deleteAll() {
			root = null;
		}

		public void addNode(int value) {
			//1. create a newnode with given data
			Node newnode = new Node(value);
			//2. if BST is empty
			if(root == null)
				// add newnode into root itself
				root = newnode;
			//3. if BST is not empty
			else {
				//3.1 create a trav reference and start at root
				Node trav = root;
				while(true) {
					//3.2 if value is less than current node data
					if(value < trav.data) {
						//3.2.1 if left of current node is empty
						if(trav.left == null) {
							// add newnode into left of current
							trav.left = newnode;
							break;
						}
						//3.2.2 if left of current node is not empty
						else
							// go into one left of current
							trav = trav.left;
					}
					//3.3 if value is greater or equal than current node data
					else {
						//3.3.1 if right of current node is empty
						if(trav.right == null) {
							// add newnode into right of current
							trav.right = newnode;
							break;
						}
						//3.2.2 if right of current node is not empty
						else
							// go into one right of current
							trav = trav.right;
					}
				}//3.4 repeat above two steps till node is not added into BST
			}
		}

		private void preOrder(Node trav) {
			//1. stop if tree is absent
			if(trav == null)
				return;
			System.out.print(" " + trav.data);	//2. V
			preOrder(trav.left); 				//3. L
			preOrder(trav.right);  				//4. R
		}

		// wrapper method
		public void preOrder() {
			System.out.print("PreOrder : ");
			preOrder(root);
			System.out.println("");
		}

		private void inOrder(Node trav) {
			//1. stop if tree is absent
			if(trav == null)
				return;
			inOrder(trav.left); 				//2. L
			System.out.print(" " + trav.data);	//3. V
			inOrder(trav.right);  				//4. R
		}

		// wrapper method
		public void inOrder() {
			System.out.print("InOrder : ");
			inOrder(root);
			System.out.println("");
		}

		private void postOrder(Node trav) {
			//1. stop if tree is absent
			if(trav == null)
				return;
			postOrder(trav.left); 				//2. L
			postOrder(trav.right);  			//3. R
			System.out.print(" " + trav.data);	//4. V
		}

		// wrapper method
		public void postOrder() {
			System.out.print("PostOrder : ");
			postOrder(root);
			System.out.println("");
		}


		public void deleteNode(int key) {
			//1. search for a key along with its parent
			Node trav = root, parent = null;
			while(trav != null) {
				if(key == trav.data)
					break;
				parent = trav;
				if(key < trav.data)
					trav = trav.left;
				else
					trav = trav.right;
			}
			//2. if node is not found then return
			if(trav == null)
				return;
			//3. if node is found then delete it
			//3.1 if node has 2 childs
			if(trav.left != null && trav.right != null) {
				//a. find predecessor along with its parent
				Node pred = trav.left;
				parent = trav;
				while(pred.right != null) {
					parent = pred;
					pred = pred.right;
				}
				//b. replace node data by predecessor data
				trav.data = pred.data;
				//c. delete/release predecessor
				trav = pred;
			}
			//3.2 if node has single child (right child)
			if(trav.left == null) {
				if(trav == root)				// root node
					root = trav.right;
				else if(trav == parent.left)	// parent's left
					parent.left = trav.right;
				else if(trav == parent.right)	// parent's right
					parent.right = trav.right;
			}
			//3.3 if node has single child (left child)
			else {	//if(trav.right == null) {
				if(trav == root)
					root = trav.left;
				else if(trav == parent.left)
					parent.left = trav.left;
				else if(trav == parent.right)
					parent.right = trav.left;
			}
		}

		public void DFSTraversal() {
			//0. create stack to push nodes
			Stack<Node> st = new Stack<Node>();
			//1. push root node on stack
			st.push(root);
			System.out.print("DFS Traversal : ");
			while(!st.isEmpty()) {
				//2. pop node from stack
				Node curr = st.pop();
				//3. visit popped node
				System.out.print(" " + curr.data);
				//4. if right exist push it on stack
				if(curr.right != null)
					st.push(curr.right);
				//5. if left exist push it on stack
				if(curr.left != null)
					st.push(curr.left);
			}//6. repeat step 2 to 5 till stack is not empty
			System.out.println("");
		}

		public void BFSTraversal() {
			//0. create queue to push nodes
			Queue<Node> q = new LinkedList<Node>();
			//1. push root node on queue
			q.offer(root);
			System.out.print("BFS Traversal : ");
			while(!q.isEmpty()) {
				//2. pop node from queue
				Node curr = q.poll();
				//3. visit popped node
				System.out.print(" " + curr.data);
				//4. if left exist push it on queue
				if(curr.left != null)
					q.offer(curr.left);
				//5. if right exist push it on queue
				if(curr.right != null)
					q.offer(curr.right);
			}//6. repeat step 2 to 5 till stack is not empty
			System.out.println("");
		}

		private int height(Node trav) {
			//1. if tree is empty return -1
			if(trav == null)
				return -1;
			//2. find height of left sub tree
			int hl = height(trav.left);
			//3. find height of right sub tree
			int hr = height(trav.right);
			//4. find max height
			int max = hl > hr ? hl : hr;
			//5. return max height + 1
			return max + 1;
		}

		public int height() {
			return height(root);
		}

	}
