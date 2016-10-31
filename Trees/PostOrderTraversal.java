/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Traverse given tree using post order traversal 	                                                    /
/                                                                                                                   /
/	Node is defined as:  																							/
/						class Node {                                                                                /
/							int data;																				/
/							Node left;																				/
/							Node right;																				/
/						}																							/
/   ---------------------------------------------------------------------------------------------------------------*/


void postOrder(Node root) {
    if(root == null){
        return;
    }

    Postorder(root.left);
    Postorder(root.right);
    System.out.print(root.data + " ");
    
}