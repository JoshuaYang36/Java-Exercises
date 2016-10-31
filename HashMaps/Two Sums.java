/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Given an array of integers and a target integer value, return two indices in the array where their     /
/            values add up to the target. Assume there is always ONE correct answer.								/
/   Solution: Create a hashmap<Integer, Integer>. Iterate through given array, and check if the complement          /    
/			  (target - currentValue) is already in the hashmap. If so, return the indices of the current value, 	/
/			  and its complement. Else, add current value and its indice to the hashmap. 	                        /    
/																													/                                                                      
/   Test Case 1: [1,2,3,4,5], target = 4                                                                            /
/   Returns: [0,2]                                                                                                  /
/                                                                                                                   /
/   Test Case 2: 1 [4,5], target = 7                                                                                /
/   Returns: Return "Invalid input"			                                                                        /
/   ---------------------------------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> set = new HashMap<Integer, Integer>();
        int len = nums.length;
        int[] answer = new int[2];
        /*
        if(len <= 1){
        	System.out.println("Invalid length of array");
        	return answer;
        }*/

        //Iterate through given array
        for(int i = 0; i < len; i++){
        	int complement = target - nums[i];

        	//Checks if complement of current value is already in hashmap
        	if(set.containsKey(complement)){
        		answer[0] = set.get(complement);
        		answer[1] = i;
        		return answer;
        	}else{ // adds current valu enad its indice to hashmap
        		set.put(nums[i], i);
        	}


        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int a[] = new int[n];

        for(int a_i=0; a_i < target; a_i++){
            a[a_i] = in.nextInt();
        }
    
       	return twoSum(a);
        }
    }
}