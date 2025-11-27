package com.assignment;

import com.assignment.BST.Node;

public class Tester {

	public static void main(String[] args) {

		BST bst = new BST();

		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(2);
		bst.addNode(15);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);

		bst.preOrder();
		bst.inOrder();
		bst.postOrder();


		Node ret = bst.binarySearch(4);
		System.out.println(ret);



		bst.inOrder();
		bst.deleteNode(8);
		bst.inOrder();


		System.out.println(bst.deptFinder());
//		bst.DFSTraversal();
//		bst.BFSTraversal();
//
		System.out.println("Height = " + bst.height());

	}

}














