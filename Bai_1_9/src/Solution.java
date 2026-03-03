package Bai_1_9.src;

public class Solution {
    public static int sumOfDigits(int n) {
        n = Math.abs(n);

        if (n<10) {
            return n;
        }

        String ref = String.valueOf(n);
        int ans = 0;

        for (char c : ref.toCharArray()) {
            int digit = c - '0';
            ans+=digit;
        }
        return ans;
    }
}
