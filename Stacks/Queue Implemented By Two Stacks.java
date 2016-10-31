/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Implement a queue using two stacks                                                                     /
/                                                                                                                   /
/   Solution: Use an in Stack for enqueue(). When peek() or dequeue() is used, check if Out stack is empty. If it   /
/             is, then pop all elements from the In stack and push onto Out stack, efficiently flipping the order   /
/             of the elements from FILO, to FIFO. If the Out stack is not empty, pop/peek top element in Out Stack  / 
/                                                                                                                   /
/   Test Case 1: 509834539085 peek()                                                                                /
/   Returns: 5                                                                                                      /
/                                                                                                                   /
/   Test Case 2: 3 pop()                                                                                            /
/   Returns: 3                                                                                                      /
/                                                                                                                   /
/   Test Case 3: peek()                                                                                             /
/   Returns:                                                                                                        /
/   ---------------------------------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static Stack<Integer> inStack = new Stack<Integer>();
    public static Stack<Integer> outStack = new Stack<Integer>();
    
    public static void peek(){
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        System.out.println(outStack.peek()); 
    }
    public static void enqueue(int n){
        inStack.push(n);
    }
    public static void dequeue(){
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        outStack.pop();   
    }
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            
            if (operation == 1) { // enqueue
                enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                dequeue();
            } else if (operation == 3) { // peek
                peek();
            }
        }
        scan.close();
        return;
    }
}
