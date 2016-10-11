import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /* 
    /   Problem: Check if given brackets within given expression are all closed properly
    /   
    /   Solution: Iterate through each character in expression and check if the character is an open bracket. If so,
    /             add character to stack. If the character is a closed bracket, pop last character off stack to check
    /             if the brackets match. 
    /
    /   Test Case 1: {[[()[[({}{})]]]]}
    /   Returns: true
    /
    /   Test Case 2: {[}]
    /   Returns: false
    / 
    /   Test Case 3: {
    /   Returns: false  
    */
    
    public static char[][] TOKENS = {{'{', '}'}, {'(', ')'}, {'[', ']'}};
     
    //Return true if character within expression is an open bracket; false otherwise
    public static boolean isOpen(char c){
         for(char array[] : TOKENS){
             if(array[0] == c){
                 return true;
             }
         }
         return false; 
     }
    
    //Return true if closing bracket within expression matches open bracket; false otherwise
    public static boolean matches(char openTerm, char closeTerm){
        
        for(char array[] : TOKENS){
             if(array[0] == openTerm && array[1] == closeTerm){
                 return true;
             }
        }return false;
    }
    
    //Returns true if expression is balanced; false otherwise
     public static boolean isBalanced(String expression) {
         int len = expression.length();
         if(len == 1){
             return false;
         }
         //Stack used to hold open brackets in order        
         Stack<Character> openStack = new Stack<Character>();
         
         /*
         /   Iterates through expression, checking if each character is an open bracket. If so, then push onto stack.
         /   Else, check if the top of the stack matches with the current character.
         */
         for(int i = 0; i < len; i++){
             char c = expression.charAt(i);
             if(isOpen(c)){
                 openStack.push(c);
             }else{
                 if(openStack.isEmpty()){
                     return false;
                 }
                 if(!matches(openStack.pop(), c)){
                       return false;
                 }
                         
             }
         }
         return openStack.isEmpty();
         
     }
        
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int t = in.nextInt();
         for(int a0 = 0; a0 < t; a0++){
             String expression = in.next();
             boolean answer = isBalanced(expression);
             if(answer){
                System.out.println("YES");
             }else{
                System.out.println("NO");
             }
        }
        in.close();
    }
}
