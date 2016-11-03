/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Given a string consisting of only the character a and b, return the number of deletions need to be     /
/            sure that the resultign string alternates between a and b each character.                              /
/                                                                                                                   /
/   Solution: Keep track of previous character as we iterate through string, adding 1 to the count each time        /
/             previous matches with current.                                                                        /      
/                                                                                                                   /                                                                                         
/   Test Case 1: AAABBB                                                                                             /
/   Returns: 4                                                                                                      /
/                                                                                                                   /
/   Test Case 2: A                                                                                                  /
/   Returns: 0                                                                                                      /
/                                                                                                                   /
/   Test Case 3: AABBAAB                                                                                            /
/   Returns: 3                                                                                                      /
/   ---------------------------------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int inputs = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < inputs; i++){
            beautifulString(sc.nextLine());
        }
    }
    public static void beautifulString(String s){
        int deletions = 0;
        int length = s.length();
        Character previous = s.charAt(0);
        
        // Checks if input is length 1 or 0. 
        if(length < 2){
            System.out.println(s);
            return;
        }
        
        // Checks if current character in string is the same as previous. Adds 1 to count if so. 
        for(int i = 1; i < length; i++){
            if(s.charAt(i) == previous){
                deletions++;
                previous = s.charAt(i);
            }else{
                previous = s.charAt(i);
            }
        }
        System.out.println(deletions);
        
    }
}