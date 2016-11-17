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

  
}
