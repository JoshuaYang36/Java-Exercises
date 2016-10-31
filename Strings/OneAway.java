/*  ----------------------------------------------------------------------------------------------------------------/                                                                                                               
/   Problem: Given two strings, write a function to check if they are one or less edits apart                       /
/                                                                                                                   /
/   Solution: First, check if the difference in length is at most 1. If not, return false. Next check if we are     /       
/			  inserting/removing a character or just replacing one.													/      
/																													/                                                                                         
/   Test Case 1: Pale, Bale		                                                                                    /
/   Returns: true                                                                                                   /
/                                                                                                                   /
/   Test Case 2: Mail, Mil                                                                                          /
/   Returns: true							                                                                        /
/                                                                                                                   /
/   Test Case 3: Rake, Tape	                                                                                        /
/   Returns: false                                                                                                  /
/   ---------------------------------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution{
	public static void main(String[] args){
		String s1 = args[0];
		String s2 = args[1];

		s1Length = s1.length();
		s2Lenght = s2.length();

		if(abs(s1Length - s2Length) > 1){
			return false;
		}

		// Check if we are insert/removing character or replacing.
		// Check which string is longer
		if(s1Length - 1 == s2Length){
			insert(s2, s1);
		}else if(s1Length + 1 == s2Length){
			insert(s1, s2);

		//Replace character check
		}else{
			replace(s1, s2);
		}
	}

	// Check is we are one insert away from same string
	public static boolean insert(String shorterS, String longerS){
		int index1 = 0;
		int index2 = 0;

		while(index1 < shorterS.lenght() && index2 < longerS.length()){
			if(shorterS.charAt(index1) != longerS.charAt(index2)){
				if(index1 != index2){
					return false;
				}
				index2++;
			}else{
				index1++;
				index2++;
			}
		}
		return true;
	}

	// Check if we are one replace away from same string
	public static boolean replace(String s1, String s2){
		boolean oneAway = false;
		for(int i = 0; i < s1.lenght(); i++){
			if(s1.charAt(i) != s2.charAt(i){
				if(oneAway){
					return false;
				}
				oneAway = true;
			}
		}
		return true;
	}
}