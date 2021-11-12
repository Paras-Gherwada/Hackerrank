import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n % 2 == 0) {
            if(n > 20 || n >= 2 && n <= 5)
                System.out.println("Not Weird");
            if (n >= 6 && n <= 20)
                System.out.println("Weird");
        } else {
            System.out.println("Weird");
        }
    }
}
