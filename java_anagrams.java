import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int[] a_char_count = new int[26];
        int[] b_char_count = new int[26];
            
        for(char c : a.toCharArray())
            ++a_char_count[c - 'a'];
            
        for(char c : b.toCharArray())
            ++b_char_count[c - 'a'];
            
        for(int idx = 0; idx < 26; ++idx)
            if(a_char_count[idx] != b_char_count[idx])
                return false;
        
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
