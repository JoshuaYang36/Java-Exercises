/*  ----------------------------------------------------------------------------------------------------------------/                                
/   Problem: Insert element to head of linked list.                                                                 /                                                                                                   /
/                                                                                                                   /
/   Node is defined as:                                                                                             /
/       class Node{                                                                                                 /
/           int data;                                                                                               /
/           Node next;                                                                                              /
/       }                                                                                                           /
/   ---------------------------------------------------------------------------------------------------------------*/


Node Insert(Node head,int data) {
    Node newHead = new Node();
    newHead.data = data;
    newHead.next = head;

    return newHead;
}