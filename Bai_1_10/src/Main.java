package Bai_1_10.src;

public class Main {
    public static void main(String[] args) {
        Solution test = new Solution();

        int[] test_1 = {};
        int[] test_2 = {1};
        int[] test_3 = {2,1};
        int[] test_4 = {3,3,3,3};
        int[] test_5 = {1,5,3,6,9,3,2,1,9};
        int[] test_6 = {1,3,5,2,9,4,2,1,7,8};

        System.out.println(test.secondLargest(test_1));
        System.out.println(test.secondLargest(test_2));
        System.out.println(test.secondLargest(test_3));
        System.out.println(test.secondLargest(test_4));
        System.out.println(test.secondLargest(test_5));
        System.out.println(test.secondLargest(test_6));
    }
}
