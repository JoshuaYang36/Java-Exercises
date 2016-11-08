/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Print all nodes level by level from top-down                                                           /
/                                                                                                                   /
/   Node is defined as:                                                                                             /
/           class Node {                                                                                            /
/               int data;                                                                                           /
/               Node left;                                                                                          /
/               Node right;                                                                                         /
/           }                                                                                                       /
/   ---------------------------------------------------------------------------------------------------------------*/

void LevelOrder(Node root){
  java.util.LinkedList<Node> q = new java.util.LinkedList<Node>();
    if(root!=null)
      q.add(root);
    while(q.peekFirst() != null ){
      Node current = q.poll();
      System.out.print(current.data + " ");
      if(current.left!=null)
        q.add(current.left);
      if(current.right!=null)
        q.add(current.right);    
    }
}
