/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Given a string return the min length of string if we had to delete one character and all its occurances/
/            from the string.                                                                                       /
/                                                                                                                   /
/   Solution: Use HashMap to keep track of characters that have been since and their count. Subtract highest count  /
/             from length of original string.                                                                       /      
/                                                                                                                   /                                                                                         
/   Test Case 1: ABEAVDD                                                                                            /
/   Returns: 5                                                                                                      /
/                                                                                                                   /
/   Test Case 2: A                                                                                                  /
/   Returns: 0                                                                                                      /
/                                                                                                                   /
/   Test Case 3: AAABACDKLBB                                                                                        /
/   Returns: 7                                                                                                      /
/   ---------------------------------------------------------------------------------------------------------------*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Map.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        removeDuplicate(s, len);
    }
    
    public static void removeDuplicate(String s, int len){
        
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        int max = 0;
        
        for(int i = 0; i < len; i++){
            if(count.containsKey(s.charAt(i))){
                count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
            }else{
                count.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
             }
        }
        System.out.println(len - max);              
        return;          
    }
}
