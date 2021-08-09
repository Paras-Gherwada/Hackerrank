import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        // String spaces, pattern;
        // spaces = pattern = "";
        // int size = n;
        // while(n > 0){
        //     while(spaces.length() < n-1) spaces += " ";
        //     while(pattern.length() < size-spaces.length()) pattern += "#";
        //     System.out.println(spaces + pattern);
        //     spaces = pattern = "";
        //     --n;
        // }
        int row_size = n;
        int row_idx;
        while(n > 0){
            row_idx = 0;
            while(row_idx < row_size)
                System.out.print((row_idx++ < n-1)? " ": "#");
            System.out.println();
            --n;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
