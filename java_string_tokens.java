import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] str_array = s.split("['!?,._@ ]+");
            System.out.println(str_array.length);
            for(String temp : str_array)
                System.out.println(temp);
        }
        
        scan.close();
    }
}

