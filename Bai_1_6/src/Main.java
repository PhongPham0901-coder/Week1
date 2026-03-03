package Bai_1_6.src;

public class Main {
    public static void main(String[] args) {
        Solution test = new Solution();

        System.out.println(test.isPrime(-100));
        System.out.println(test.isPrime(0));
        System.out.println(test.isPrime(1));
        System.out.println(test.isPrime(2));
        System.out.println(test.isPrime(19));
        System.out.println(test.isPrime(18));
        System.out.println(test.isPrime(42891341));
    }
}