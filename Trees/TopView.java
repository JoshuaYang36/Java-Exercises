/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Print all left nodes from bottom up, followed by all right node from top down                          /
/                                                                                                                   /
/   Node is defined as:                                                                                             /
/           class Node {                                                                                            /
/             int data;                                                                                             /
/             Node left;                                                                                            /
/             Node right;                                                                                           /
/           }                                                                                                       /
/   ---------------------------------------------------------------------------------------------------------------*/

void top_view(Node root)
{

    if(root != null) {

        top_view(root.left, true);

        System.out.print(root.data + " ");

        top_view(root.right, false);

    }

}

void top_view(Node node, boolean goLeft) {

    if(node != null) {
        if(goLeft) {
            top_view(node.left, goLeft);
            System.out.print(node.data + " ");
        } else {
            System.out.print(node.data + " ");
            top_view(node.right, goLeft);
        }
    } 

}
