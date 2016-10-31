/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Traverse given tree using in order traversal 	                                                    /
/                                                                                                                   /
/	Node is defined as:  																							/
/						class Node {                                                                                /
/							int data;																				/
/							Node left;																				/
/							Node right;																				/
/						}																							/
/   ---------------------------------------------------------------------------------------------------------------*/

void inOrder(Node root) {
    if(root == null){
        return;
    }
    
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
}
