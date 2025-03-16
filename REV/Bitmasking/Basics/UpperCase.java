package Basics;

public class UpperCase {
    public static void main(String[] args) {
        char ch = 'c';
        char upperCh = (char) (ch & '_'); // Convert to uppercase
        System.out.println(upperCh); // Output: C
    }
}
// package Basics;
// public class LowerCase {
// public static void main(String[] args) {
// char ch = 'C';
// char lowerCh = (char) (ch | ' '); // Convert to lowercase
// System.out.println(lowerCh); // Output: c
// }
// }
