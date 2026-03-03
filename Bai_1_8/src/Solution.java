package Bai_1_8.src;

public class Solution {
    public static boolean isPalindrome(int n) {
        if (n<0) {
            return false;
        } else if (n<10) {
            return true;
        }

        n = Math.abs(n);
        String ref = String.valueOf(n);

        int left = 0;
        int right = ref.length()-1;

        while (left<=right){
            if (ref.charAt(left) != ref.charAt(right)) {
                return false;
            }
            left+=1;
            right-=1;
        }
        return true;
    }

}
