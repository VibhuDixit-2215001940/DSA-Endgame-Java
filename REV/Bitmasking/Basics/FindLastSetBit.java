package Basics;

import java.util.*;

public class FindLastSetBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n & -n); // Extracts the last set bit
        sc.close();
    }
}
