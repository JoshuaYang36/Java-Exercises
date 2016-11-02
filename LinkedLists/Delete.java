/*  ----------------------------------------------------------------------------------------------------------------/                                
/   Problem: Delete element to specified location of linked list.                                            		/                                                                                                   /
/                                                                                                                   /
/   Node is defined as:                                                                                             /
/       class Node{                                                                                                 /
/           int data;                                                                                               /
/           Node next;                                                                                              /
/       }                                                                                                           /
/   ---------------------------------------------------------------------------------------------------------------*/


NNode Delete(Node head, int position) {
    if (position == 0){ 
        return head.next; 
    }
    head.next = Delete(head.next, position-1);
    return head;
}