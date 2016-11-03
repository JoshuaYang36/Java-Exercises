/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Given a list of integers, return true if there exists an element in the array where all the elements   /
/            on the left add up to equal the sum of all the elements on the right.                                  /
/                                                                                                                   /
/   Solution: Built a cache to keep track of the different sums on the right to reduce arithmetic redundency. Built /
/             another cache to keep track of left side sums and compared the two.                                   / 
/                                                                                                                   /
/   Runtime : O(n)                                                                                                  /
/                                                                                                                   /                                                                                         
/   Test Case 1: 1 2 3                                                                                              /
/   Returns: NO                                                                                                     /
/                                                                                                                   /
/   Test Case 2: 1 2 3 5 5 1                                                                                        /
/   Returns: Yes                                                                                                    /
/                                                                                                                   /
/   Test Case 3: 6                                                                                                  /
/   Returns: Yes                                                                                                    /
/   ---------------------------------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        for(int i = 0; i < cases; i++){
            int numberOfInts = sc.nextInt();
            int[] arrayOfNumbers = new int[numberOfInts];
            
            for(int j = 0; j < numberOfInts; j++){
                arrayOfNumbers[j] = sc.nextInt();
            }
            
            balanceChecker(arrayOfNumbers);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    
    public static void balanceChecker(int[] arrayOfNumbers){
        int length = arrayOfNumbers.length;
        int[] rightCache = new int[length];
        int[] leftCache = new int[length];
        
        if(length == 1){
            System.out.println("YES");
            return;
        }
        if(length == 0 || length == 2){
            System.out.println("NO");
            return;
        }
        
        
        rightCache[length - 1] = arrayOfNumbers[length - 1];
        leftCache[0] = arrayOfNumbers[0];
        // Filling array with the different sums of the ints right of the pivot to reduce 
        // number of arithmetic operations. 
        for(int i = length - 2; i > 1; i--){
            rightCache[i] = rightCache[i + 1] + arrayOfNumbers[i];
        }    
         
        // Check if left cached sum equals right cached sum. 
        for(int h = 1; h < length - 1; h++){
            if(leftCache[h - 1] == rightCache[h + 1]){
                System.out.println("YES");
                return;
            }else{
                leftCache[h] = leftCache[h - 1] + arrayOfNumbers[h];
            }
            
        }
        System.out.println("NO");
        return;
             
    }
}