/*  ----------------------------------------------------------------------------------------------------------------/                                
/   Problem: Insert element to end of linked list.                                                                  /                                                                                                   /
/                                                                                                                   /
/   Node is defined as:                                                                                             /
/       class Node{                                                                                                 /
/           int data;                                                                                               /
/           Node next;                                                                                              /
/       }                                                                                                           /
/   ---------------------------------------------------------------------------------------------------------------*/


Node Insert(Node head,int data) {
    Node temp = head;
    Node header; 
    if(head == null){
        header = new Node();
        header.next = null;
        header.data = data;
        return header;
    }
    while(head.next != null){
        head = head.next;
    }
    
    head.next = new Node();
    head.next.data = data;
    return temp;
}