import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalindrome = false;
        /* Enter your code here. Print output to STDOUT. */
        for(int idx = 0; idx < A.length(); ++idx) {
            if(A.charAt(idx) == A.charAt(A.length() - idx - 1)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println((isPalindrome) ? "Yes" : "No");
    }
}



