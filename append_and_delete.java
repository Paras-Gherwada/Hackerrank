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
    public static String appendAndDelete(String s, String t, int k) {
       if (s.length() + t.length() <= k)
            return "Yes";
    
        int idx = 0;
        while(idx < s.length() && idx < t.length()) {
            if (s.charAt(idx) != t.charAt(idx)) 
                break;
            ++idx;
        }
        int opCount = s.length() + t.length() - (2 * idx);
        return (k >= opCount && (k - opCount) % 2 == 0) ? "Yes" : "No";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
