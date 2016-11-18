/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Given a string, return the index of the character, which if removed, will leave a palindrone. Return   /
/            -1 if the string is already a palindrone.                                                              /
/                                                                                                                   /
/   Solution: Iteration the given string from both sides, checking if each character is the same. If so move on to  /      
/             next character. Else, check if it is right or left charcter that needs to be removed. Return index    /
/                                                                                                                   /                                                                                         
/   Test Case 1: abab                                                                                               /
/   Returns: 0                                                                                                      /
/                                                                                                                   /
/   Test Case 2: bbba                                                                                               /
/   Returns: 3                                                                                                      /
/                                                                                                                   /
/   Test Case 3: a                                                                                                  /
/   Returns: -1                                                                                                      /
/   ---------------------------------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < cases; i++){
            String s = sc.nextLine();
            int len = s.length();
            int start; int end = len - 1;
            int index;
            for(start = 0; start < len; start++){
                if(s.charAt(start) == s.charAt(end)){
                    if(start == end){
                        System.out.println("-1");
                        break;
                    }
                    start++;
                    end--;
                }else{
                    if(s.charAt(start + 1) == s.charAt(end)){
                        System.out.println(start);
                        break;
                    }else{
                        System.out.println(end);
                        break;
                    }
                }
                
            }
            
        }
        System.out.println("-1");
    }
}