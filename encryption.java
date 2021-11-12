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
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
        // Write your code here
        
        s = s.replaceAll("\\s", "");
        int r = (int)Math.floor(Math.sqrt(s.length()));
        int c = (int)Math.ceil(Math.sqrt(s.length()));
        
        if(r * c < s.length())
            r = c = Math.max(r, c);
        
        int s_idx = 0;
        char[][] c_arr = new char[r][c];
        for(int r_idx = 0; r_idx < r; ++r_idx)
            for(int c_idx = 0; c_idx < c && s_idx < s.length(); ++c_idx)
                c_arr[r_idx][c_idx] = s.charAt(s_idx++);
        
        String result = "";
        for(int c_idx = 0; c_idx < c; ++c_idx) {
            for(int r_idx = 0; r_idx < r; ++r_idx)
                if(c_arr[r_idx][c_idx] >= 'a' && c_arr[r_idx][c_idx] <= 'z')
                    result += c_arr[r_idx][c_idx];
            result += ' ';
        }
        
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
