package Bai_1_6.src;

public class Solution {
    public static boolean isPrime(int n) {

        if (n<0) {
            System.out.print("Negative input! ");
            return false;
        } else if (n<=1) {
            return false;
        }

        if (n==2) {
            return true;
        } else if (n%2==0) {
            return false;
        }

        int ref = (int) Math.sqrt(n);
        boolean flag =true;

        for (int i = 3; i<=ref; i+=2) {
            if (n%i==0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
