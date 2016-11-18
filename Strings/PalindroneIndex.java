/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Given two strings, write a function to check if they are one or less edits apart                       /
/                                                                                                                   /
/   Solution: First, check if the difference in length is at most 1. If not, return false. Next check if we are     /       
/             inserting/removing a character or just replacing one.                                                 /      
/                                                                                                                   /                                                                                         
/   Test Case 1: Pale, Bale                                                                                         /
/   Returns: true                                                                                                   /
/                                                                                                                   /
/   Test Case 2: Mail, Mil                                                                                          /
/   Returns: true                                                                                                   /
/                                                                                                                   /
/   Test Case 3: Rake, Tape                                                                                         /
/   Returns: false                                                                                                  /
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