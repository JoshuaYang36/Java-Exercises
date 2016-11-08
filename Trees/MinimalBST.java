/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Given a sorted array of integers, create a BST with minimal height			                            /
/                                                                                                                   /
/   Node is defined as:                                                                                               /
/           class Node {                                                                                            /
/             int data;                                                                                             /
/             Node left;                                                                                            /
/             Node right;                                                                                           /
/           }                                                                                                       /
/   ---------------------------------------------------------------------------------------------------------------*/

// Create a BST with minimal height
public TreeNode createMinimalBST(int[] array){
	return createMinimalBST(array, 0, array.length - 1);
}

public TreeNode createMinimalBST(int[] array, start, end){
	if(end < start){
		return null;
	}

	int mid = (end + start)/2;
	TreeNode n = new TreeNode(array[mid]);
	n.left = createMinimalBST(array, start, mid - 1);
	n.right = createMinimalBST(array, mid + 1, end);

	return n;
}