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