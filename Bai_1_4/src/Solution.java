package Bai_1_4.src;

public class Solution {
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        if (n > 100) {
            return Long.MAX_VALUE;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}