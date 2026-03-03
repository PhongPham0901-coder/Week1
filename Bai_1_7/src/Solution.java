package Bai_1_7.src;

public class Solution {
    public static int reverse(int i) {
        if (i==0) {
            return 0;
        }

        StringBuilder res = new StringBuilder();
        boolean flag = i < 0;
        i = Math.abs(i);

        while (i!=0) {
            String digit = "";
            digit = Integer.toString(i%10);
            res.append(digit);
            i/=10;
        }
        long check = Long.parseLong(res.toString());

        if (flag) {
            check = -check;
        }

        if (check > Integer.MAX_VALUE || check < Integer.MIN_VALUE) {
            System.out.print("Output too large ");
            return 0;
        } else {
            return (int) check;
        }
    }
}
