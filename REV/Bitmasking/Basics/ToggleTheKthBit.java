package Basics;

public class ToggleTheKthBit {
    public static void main(String[] args) {
        int n = 4;
        int k = 1;
        int newNum = n ^ (1 << k);
        System.out.println(newNum);
    }
}
