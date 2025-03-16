package Basics;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 88;
        System.out.println(((n & 1) == 1) ? "Odd" : "Even");
    }
}
