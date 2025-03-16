package Basics;

public class AdditionAndSubtraction {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println((a ^ b) + 2 * (a & b));// 30
        System.out.println((a | b) + (a & b));// 30
    }
}
