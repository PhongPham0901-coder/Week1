package Bai_1_8.src;

public class Main {
    public static void main(String[] args){
        Solution test = new Solution();

        System.out.println(test.isPalindrome(0));
        System.out.println(test.isPalindrome(1));
        System.out.println(test.isPalindrome(01210));
        System.out.println(test.isPalindrome(-12321));
        System.out.println(test.isPalindrome(343));
        System.out.println(test.isPalindrome(123210));
        System.out.println(test.isPalindrome(123));
    }
}