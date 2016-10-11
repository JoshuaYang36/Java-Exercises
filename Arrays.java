/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Given an array of n integers and a d number, perform d left rotations on the array. Then print the     /
/    updated array as a single line of space-separated integers.                                                    /
/                                                                                                                   /
/   Solution: Create a new empty array. Set elements [d, n] in original array as [0, d] in new empty array. Then    /                                                                        
/             set elements [0, d] of original array to [d, n] of new array. Return new array.                       /                                                                                                      
/   Test Case 1: 123456 Rotate: 3                                                                                   /
/   Returns: 456123                                                                                                 /
/                                                                                                                   /
/   Test Case 2: 1 Rotate 3                                                                                         /
/   Returns: Rotation exceeds array length                                                                          /
/                                                                                                                   /
/   Test Case 3: 222 Rotate 3                                                                                       /
/   Returns: 222                                                                                                    /
/   ---------------------------------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int[] rotateLeft(int[] originalArray, int length, int rotations){
        // Init empty array to be filled
        int[] rotatedArray = new int[length];
        // Keep track of where we are in new array
        int index = 0;
        // Add original array[rotations, length] to new array[0, rotations]
        for(int i = rotations; i < length; i++){
            rotatedArray[index] = originalArray[i];
            index++;
        }
        // Add original array[0,rotations] to new array[rotations, lenght]
        for(int j = 0; j < rotations; j++){
            rotatedArray[index] = originalArray[j];
            index++;
        }
        return rotatedArray;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        if(k > n){
            System.out.println("Rotation exceeds array length");
            return;
        }
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
    
        for(int e : rotateLeft(a, n, k)){
            System.out.print(e + " ");
        }
    }
}