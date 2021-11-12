import java.util.*;

public class Solution {

    public static int fibonacci(int n) {
        // Complete the function.
        if(n < 2)
            return n;
        
        int n1 = 0, n2 = 1, sum = 0;
        while(n - 2 >= 0) {;
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            --n;
        }
        
        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
