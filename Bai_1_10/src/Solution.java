package Bai_1_10.src;

public class Solution {
    public static int secondLargest(int[] arr) {
        if (arr.length <2){
            return -1;
        } else if (arr.length==2) {
            if (arr[0]==arr[1]){
                return -1;
            } else {
                return Math.min(arr[0],arr[1]);
            }
        }

        int max_n = arr[0];
        int sec_n = arr[1];

        for (int i : arr) {
            if (i>max_n) {
                sec_n = max_n;
                max_n = i;
            } else if (i>sec_n) {
                sec_n=i;
            }
        }

        if (max_n==sec_n) {
            return -1;
        } else {
            return sec_n;
        }
    }
}
